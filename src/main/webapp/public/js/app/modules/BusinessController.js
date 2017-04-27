/**
 * 
 */
app.controller('BusinessCtrl', ['$scope','$location','$state','BusinessService','mask','sysCode',function($scope,$location,$state,BusinessService,mask,sysCode) {
	console.log('请求进入business');
	$scope.conditions=[]; //查询条件
	$scope.keyword=[];
	$scope.keyword['appId']=0;
	$scope.flag=false;
	$scope.modelAdd=false; //新增标志
	$scope.modelEdit=false; //修改标志
	$scope.app={};
	//得到代码
	
	$scope.classTypeList=sysCode.getList('ClassType');
	$scope.classTypeCode=sysCode.getMap('ClassType');	
	//sysCode.convertList2Map($scope.appIfTypeList);  不知为啥不好用，等待调试
	
	
		BusinessService.queryAppList(function(res){
			$scope.appList=res.data;
			console.log($scope.appList[1].projectName);
		});
	
	
	
	
	//每个表单验证配置，如果不设置，默认和全局配置相同
     $scope.validateOptions = {
         blurTrig: true
     };
    
	 
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
		  console.log(app.wid);
		  $scope.app=angular.copy(app);
		  $scope.keyword['appId']=app.wid;
		  //$scope.queryList($scope.page);
		  $scope.search();
	  }
	  
	  $scope.queryList = function(page) {
			mask.showLoading();
			//page.numPerPage=5;
			BusinessService.queryList(page,function(res) {
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
		$scope.listInterface=function(item){
			//alert(item.wid);
			$location.path("/interface/"+item.wid);
			//  $state.go('interface', {busiId: item.wid});
			
		}
	  
	//添加新的业务
	$scope.newBusi=function(){
		$scope.model={};
		$scope.model.appWid=$scope.app.wid;
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
		BusinessService.del(item,function(){
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
		item.isAuth=item.isAuth=='01'?'02':'01';
		//item.isUseable="02";
		BusinessService.update(item,function(){
			$scope.queryList($scope.page);
		});
	};
	//处理表单
	
	$scope.saveEntity = function() {
		//alert($.param($scope.app));
		if($scope.modelEdit){
			BusinessService.update($scope.model,function(){
				$scope.queryList($scope.page);
			});
			$scope.modelEdit=false;
			$scope.flag=false;
		}else{
			BusinessService.add($scope.model,function(){
				$scope.queryList($scope.page); 
			});
			$scope.modelAdd=false;
			$scope.flag=false;
			
		}
		
		return false;
	}
	 $scope.queryList();
}]);


app.service('BusinessService', ['http','mask','timeAlert','dialog', function(http,mask,timeAlert,dialog) {
	return {
		// 查询应用列表
		queryAppList : function(callback) {
			
			  http.callService('application/list',null,callback)
		
		},
		// 查询busi列表
		queryList : function(param,callback) {
			 // mask.showLoading();
			  http.callService('business/list',param,callback)
		
			//mask.hideLoading();
		},
		//应用
		update:function(item,callback){
		
			  mask.showLoading();
			 
			  http.callService('business/update',item,function(data){
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
			 
			  http.callService('business/add',item,function(data){
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
				  http.callService('business/del',item,function(data){
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