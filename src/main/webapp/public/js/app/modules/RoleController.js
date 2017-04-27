/**
 * 
 */
app.controller('RoleCtrl', ['$scope','$location','$state','RoleService','mask','sysCode',function($scope,$location,$state,RoleService,mask,sysCode) {
	console.log('请求进入role');
	$scope.conditions=[]; //查询条件
	$scope.keyword=[];
	$scope.keyword['appId']=0;
	$scope.flag=false;
	$scope.modelAdd=false; //新增标志
	$scope.modelEdit=false; //修改标志
	$scope.app={};
	$scope.roleRes=[];
	//得到代码
	
	
	
	
		RoleService.queryAppList(function(res){
			$scope.appList=res.data;
			console.log($scope.appList[1].projectName);
		});
	
	
	
	
		  $scope.isSelected = function(id){          
		        return $scope.roleRes.indexOf(id)!=-1; 
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
	  
	  $scope.selectApp=function(app){
		
		  $scope.app=angular.copy(app);
		  $scope.keyword['appId']=app.wid;
		  //$scope.queryList($scope.page);
		  $scope.search();
		  RoleService.queryBusiList({appId:app.wid},function(res){
			  $scope.BusiList=res.data;
		  });
	  }
	//添加权限
		 $scope.listRes=function(item){
			
			 //得到当前角色的权限
			 RoleService.getRoleRes({roleId:item.wid}, function(res){
				 $scope.roleRes=res.data;
				 $scope.selected = $scope.roleRes;
			}),
			  $scope.setBusiFlag=true;
		  } 
		 $scope.saveRes=function(){

			var data="appId=" + $scope.app.wid + "&resId=" + $scope.resource.wid + "&ids=" + $scope.selected
			 ResourceService.saveResInterface(data);
			 $scope.setBusiFlag=false;
		 } 
		 
	  $scope.queryList = function(page) {
			mask.showLoading();
			//page.numPerPage=5;
			RoleService.queryList(page,function(res) {
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

	  
	//添加新的业务
	$scope.newItem=function(){
		$scope.model={};
		$scope.model.appId=$scope.app.wid;
		console.log($scope.model.appWid);
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
		RoleService.del(item,function(){
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
	//启停应用
	$scope.isUseable=function(item){
		//item=tfst(item);
		item.isUseable=item.isUseable=='01'?'02':'01';
		//item.isUseable="02";
		RoleService.update(item,function(){
			$scope.queryList($scope.page);
		});
	};
	//处理表单
	
	$scope.saveEntity = function() {
		//alert($.param($scope.app));
		if($scope.modelEdit){
			RoleService.update($scope.model,function(){
				$scope.queryList($scope.page);
			});
			$scope.modelEdit=false;
			$scope.flag=false;
		}else{
			RoleService.add($scope.model,function(){
				$scope.queryList($scope.page); 
			});
			$scope.modelAdd=false;
			$scope.flag=false;
			
		}
		
		return false;
	}
	 $scope.queryList();
}]);


app.service('RoleService', ['http','mask','timeAlert','dialog', function(http,mask,timeAlert,dialog) {
	return {
		// 查询应用列表
		queryAppList : function(callback) {
			
			  http.callService('application/list',null,callback)
		
		},
		// 查询busi列表
		queryList : function(param,callback) {
			 // mask.showLoading();
			  http.callService('role/list',param,callback)
		
			//mask.hideLoading();
		},
		//应用
		update:function(item,callback){
		
			  mask.showLoading();
			 
			  http.callService('role/update',item,function(data){
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
			 
			  http.callService('role/add',item,function(data){
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
			 
			dialog.confirm("确定要删除"+item.busiClass+"的业务吗?",function(){
	    		mask.showLoading();
				  http.callService('role/del',item,function(data){
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