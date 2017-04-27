/**
 * 
 */
app.controller('ResourceCtrl', ['$scope','$location','$state','ResourceService','mask','sysCode',function($scope,$location,$state,ResourceService,mask,sysCode) {
	console.log('请求进入resource');
	$scope.conditions=[]; //查询条件
	$scope.keyword=[];
	$scope.keyword['appId']=0;
	$scope.flag=false;
	$scope.modelAdd=false; //新增标志
	$scope.modelEdit=false; //修改标志
	$scope.setBusiFlag=false;
	$scope.app={};
	$scope.resource={};
	$scope.resInterface=[];
	//得到代码
    //被选中条件：ng-checked的结果为true
    $scope.isSelected = function(id){          
        return $scope.resInterface.indexOf(id)!=-1; 
    };
	
  //用于存储选中的值
    $scope.selected = [];
   
//更新事件
    var updateSelected = function(action,id,name){
        if(action == 'add' && $scope.selected.indexOf(id) == -1){
            $scope.selected.push(id);
           
        }
        if(action == 'remove' && $scope.selected.indexOf(id)!=-1){
            var idx = $scope.selected.indexOf(id);
            $scope.selected.splice(idx,1);

        }
    }
//用于监控点击事件，checkbox选择了就更新
    $scope.updateSelection = function($event, id){
        var checkbox = $event.target;
        var action = (checkbox.checked?'add':'remove');
        updateSelected(action,id,checkbox.name);
    }
    
    
	$scope.ResTypeList=sysCode.getList('ResourceType');
	$scope.ResTypeCode=sysCode.getMap('ResourceType');	
	//sysCode.convertList2Map($scope.appIfTypeList);  不知为啥不好用，等待调试
	
	//得到应用列表
	ResourceService.queryAppList(function(res){
		$scope.appList=res.data;
			
	});
	
		
	
	
	
    
	 
	 /*监控分页工具选择页码的变化，若变更则执行后台调用*/
	  $scope.$watch('page',function(val1,val2){
		  if(val1==undefined||val2==undefined){			  
			  return;
		  }
		  if(val1.pageNum!=val2.pageNum||angular.toJson(val1.conditions)!= angular.toJson(val2.conditions)){
			 // alert('page')  
			  $scope.queryList($scope.page);
		  }

	  },true);
	  //选择项目
	  $scope.selectApp=function(app){
		  console.log(app.wid);
		  $scope.app=angular.copy(app);
		  $scope.keyword['appId']=app.wid;
		  //$scope.queryList($scope.page);
		  $scope.search();
		  ResourceService.queryMenuList({appId:app.wid},function(res){
			  $scope.TopMenuList=res.data;
		  });
		  ResourceService.queryBusiList({appId:app.wid},function(res){
			  $scope.BusiList=res.data;
		  });
	  }
	  
	  $scope.queryList = function(page) {
			mask.showLoading();
			//page.numPerPage=5;
			ResourceService.queryList(page,function(res) {
				$scope.list = res.data;// 学生基本信息
				if($scope.page==undefined){
					$scope.page=res.page;
					$scope.page.conditions={};
				}else{
					var pageCon=angular.copy($scope.page.conditions);
					$scope.page=res.page;
					$scope.page.conditions=pageCon;
				}
				//$scope.page.
				mask.hideLoading();
			})
			
		}
	 

		//添加业务
		 $scope.listBusi=function(item){
			
			 $scope.resource=angular.copy(item);
			 ResourceService.getInterface({resId:item.wid}, function(res){
				 $scope.resInterface=res.data;
				 $scope.selected = $scope.resInterface;
			}),
			  $scope.setBusiFlag=true;
		  } 
		 $scope.saveBusi=function(){

			var data="appId=" + $scope.app.wid + "&resId=" + $scope.resource.wid + "&ids=" + $scope.selected
			 ResourceService.saveResInterface(data);
			 $scope.setBusiFlag=false;
		 } 
	//添加新的业务
	$scope.newRes=function(){
		$scope.model={};
		$scope.model.appId=$scope.app.wid;
		$scope.modelAdd = true;
		$scope.modelEdit = false;
		$scope.flag=true;
	}
	//编辑应用
	$scope.edit=function(item){
		$scope.model=angular.copy(item);
		$scope.modelEdit = true;
		$scope.modelAdd = false;
		$scope.flag=true;
	}
	//编辑应用
	$scope.del=function(item){
		ResourceService.del(item,function(){
			$scope.queryList($scope.page);
		})
	}
	  //手动查询
	$scope.search=function(){
		//if ($scope.page.conditions==undefined)$scope.page.conditions={}
		for(var key in $scope.keyword){
			console.log($scope.keyword[key]);
			   $scope.page.conditions[key]=$scope.keyword[key]
		}
	}
	//显示
	$scope.isDisplay=function(item){
		//item=tfst(item);
		item.isDisplay=item.isDisplay=='01'?'02':'01';
		//item.isUseable="02";
		ResourceService.update(item,function(){
			$scope.queryList($scope.page);
		});
	};
	$scope.isUseable=function(item){
		//item=tfst(item);
		item.isUseable=item.isUseable=='01'?'02':'01';
		//item.isUseable="02";
		ResourceService.update(item,function(){
			$scope.queryList($scope.page);
		});
	};
	//处理表单
	
	$scope.saveEntity = function() {
		//alert($.param($scope.app));
		if($scope.modelEdit){
			ResourceService.update($scope.model,function(){
				$scope.queryList($scope.page);
			});
			$scope.modelEdit=false;
			$scope.flag=false;
		}else{
			ResourceService.add($scope.model,function(){
				$scope.queryList($scope.page); 
			});
			$scope.modelAdd=false;
			$scope.flag=false;
			
		}
		
		return false;
	}
	 $scope.queryList();
}]);


app.service('ResourceService', ['http','mask','timeAlert','dialog', function(http,mask,timeAlert,dialog) {
	return {
		// 查询应用列表
		queryAppList : function(callback) {
			
			  http.callService('application/list',null,callback)
		
		},
		//
		saveResInterface : function(param) {
			  mask.showLoading();
			  http.callService('resource/saveResInterface',param,function(data){
					if(data.statusCode=='200'){
						timeAlert.success("保存成功");
						
					}else{
						timeAlert.error(data.message);
						
					}
					 mask.hideLoading();
				  });
		},
		getInterface : function(param,callback ) {
			  http.callService('resource/getResInterface',param,callback)
		
		},
		// 查询应用列表
		queryBusiList : function(param,callback) {
			
			  http.callService('business/listByAppId',param,callback)
		
		},
		// 查询应用列表
		queryMenuList : function(param,callback) {
			
			  http.callService('resource/menuList',param,callback)
		
		},
		// 查询busi列表
		queryList : function(param,callback) {
			 // mask.showLoading();
			  http.callService('resource/list',param,callback)
		
			//mask.hideLoading();
		},
		//应用
		update:function(item,callback){
		
			  mask.showLoading();
			 
			  http.callService('resource/update',item,function(data){
				if(data.statusCode=='200'){
					timeAlert.success("修改成功");
					if(angular.isFunction(callback)) callback();
					
				}else{
					timeAlert.error(data.message);
					
				}
				 mask.hideLoading();
			  });
		},
		//add
		add:function(item,callback){
			
			  mask.showLoading();
			 
			  http.callService('resource/add',item,function(data){
				if(data.statusCode=='200'){
					timeAlert.success("添加成功");
					callback();
				}else{
					timeAlert.error(data.message);
					
				}
				 mask.hideLoading();
			  });
		},
		del:function(item,callback){
			 
			dialog.confirm("确定要删除"+item.resName+"的资源吗?",function(){
	    		mask.showLoading();
				  http.callService('resource/del',item,function(data){
					if(data.statusCode=='200'){
						timeAlert.success("删除成功");
						callback();
					}else{
						dialog.error(data.message);
						
					}
					 mask.hideLoading();	
				  });

	        },function(){});
 
		}
	}
}]);