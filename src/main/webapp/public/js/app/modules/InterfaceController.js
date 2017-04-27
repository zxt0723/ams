/**
 * 
 */
app.controller('InterfaceCtrl', ['$scope','InterfaceService','$location','mask','sysCode','$stateParams',function($scope,InterfaceService,$location,mask,sysCode,$stateParams) {
	
	$scope.conditions=[]; //查询条件
	$scope.keyword={};
	$scope.flag=false;
	$scope.modelAdd=false; //新增标志
	$scope.modelEdit=false; //修改标志
	$scope.page={};
	//得到代码
	//alert($stateParams.id)
	
	$scope.keyword['busiId']=$stateParams.id;
	$scope.page.conditions={};
	$scope.page.conditions['busiId']=$stateParams.id;
	//$scope.appIfTypeList=sysCode.getList('AppIFType');
	$scope.YesOrNoCode=sysCode.getMap('YesOrNo');	
	$scope.MethodCode=sysCode.getMap('AccessMethod');
	$scope.MethodList=sysCode.getList('AccessMethod');
	
	//sysCode.convertList2Map($scope.appIfTypeList);  不知为啥不好用，等待调试
	
	
	
	InterfaceService.getBusi({busiId:$stateParams.id},function(res){
		$scope.busi=res.data;
	});

	//alert($scope.busi.busiClass);
	//每个表单验证配置，如果不设置，默认和全局配置相同
     $scope.validateOptions = {
         blurTrig: true
     };
    
	 $scope.$watch('conditions',function(val1,val2){
		 
		 if(angular.toJson(val1) != angular.toJson(val2)){
			 var cons={};
			 for(var i=0;i<val1.length;i++){
				 cons[val1[i].queryCode]=val1[i].id
			 }
			 //扫描查询条件
			 for(var key in $scope.keyword){
				console.log($scope.keyword[key]);
				cons[key]=$scope.keyword[key]
			}
			$scope.page.conditions=cons;
		 }
	 },true);
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
	  
	  $scope.queryList = function(page) {
			mask.showLoading();
			//page.numPerPage=5;
			InterfaceService.queryList(page,function(res) {
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
	  $scope.listParams=function(item){
			//alert(item.wid);
			$location.path("/params/"+item.wid);
			//  $state.go('interface', {busiId: item.wid});	
	 }
	//添加新的应用
	$scope.newModel=function(){
		$scope.model={};
		$scope.model.busiWid=$scope.busi.wid
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
		InterfaceService.del(item,function(){
			$scope.queryList($scope.page);
		})
	}
	  //手动查询
	$scope.search=function(){
		//if($scope.page==undefined){ $scope.page={} ; $scope.page.conditions={};}
		for(var key in $scope.keyword){
			console.log($scope.keyword[key]);
			   $scope.page.conditions[key]=$scope.keyword[key]
		}
	}
	//启停应用
	$scope.isUseable=function(item){
		//item=tfst(item);
		item.isValidate=item.isValidate=='01'?'02':'01';
		//item.isUseable="02";
		InterfaceService.update(item,function(){
			$scope.queryList($scope.page);
		});
	};
	//处理表单

	$scope.saveEntity = function() {
		
		if($scope.modelEdit){
			InterfaceService.update($scope.model,function(){
				$scope.queryList($scope.page);
			});
			$scope.modelEdit=false;
			$scope.flag=false;
		}else{
			InterfaceService.add($scope.model,function(){
				$scope.queryList($scope.page); 
			});
			$scope.modelAdd=false;
			$scope.flag=false;
			
		}
		
		return false;
	}
	$scope.queryList($scope.page);
	//$scope.search();
}]);


app.service('InterfaceService', ['http','mask','timeAlert','dialog', function(http,mask,timeAlert,dialog) {
	return {
		
		// 得到业务
		getBusi : function(param,callback) {
			 // mask.showLoading();
			  http.callService('business/get',param,callback)
		
			//mask.hideLoading();
		},
		// 查询应用列表
		queryList : function(param,callback) {
			 // mask.showLoading();
			  http.callService('iFace/list',param,callback)
		
			//mask.hideLoading();
		},
		//应用
		update:function(item,callback){
		
			  mask.showLoading();
			 
			  http.callService('iFace/update',item,function(data){
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
			 
			  http.callService('iFace/add',item,function(data){
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
			 
			dialog.confirm("确定要删除"+item.projectName+"的应用吗?",function(){
	    		mask.showLoading();
				  http.callService('iFace/del',item,function(data){
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