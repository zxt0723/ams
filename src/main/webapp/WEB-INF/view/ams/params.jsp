<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<section>
	<!--左侧导航结束-->
	<!--右侧内容开始-->
	<div class="shuju-con-right">
		<!--右侧头部开始-->
		<div class=" clearfix">
			<div class="pull-left">
				<h3>接口管理({{IF.business.busiPackage}}.{{IF.business.busiClass}}.{{IF.functionName}}())</h3>
			</div>
			<div class="pull-right">
				<h3>返回</h3>
			</div>
		</div>
		<!--右侧头部结束-->
		<div cg-mul-query-comm source="mutiSource" result="conditions" noborder="true" class="quanxian-content"></div>

		<div class="panel-body">
			<div class="row">
				<div class="pull-left">

					<button type="button" class="btn btn-primary" ng-click="newModel()" style="text-shadow: black 5px 3px 3px;">
						新增 <span class="glyphicon glyphicon-plus"></span>
					</button>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-5 col-xs-6 pull-right">
					<div class="input-group">
						<input type="hidden" ng-model="keyword['busiId']"> <input type="text" class="form-control" placeholder="接口名称 模糊匹配" ng-model="keyword['functionName']"> <span class="input-group-btn">
							<button class="btn btn-default" type="button" ng-click="search();">
								<span class="glyphicon glyphicon-search" style="color: rgb(255, 140, 60);"></span>
							</button>
						</span>
					</div>
					<!-- /input-group -->
				</div>

			</div>
		</div>


		<div class="content">
			<div class="table-responsive">

				<!--表格 -->
				<table class="table   table-hover">
					<thead>
						<tr class="success">
							<th class="per12">参数名称</th>
							<th class="per12">参数类型</th>					
							<th class="per8">是否必须</th>

							<th class="per6 text-center">验证</th>
							<th class="per7 text-center">编辑</th>
							<th class="per7 text-center">删除</th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="item in list" class="quanxian-bg-hover">
							<td>{{item.paramName}}</td>
							<td>{{item.paramType}}</td>

							<td>{{YesOrNoCode[item.required]}}</td>

							
							<td ng-if="item.isValidate=='01'" class="text-center">
								<button type="button" ng-click="isUseable(item)" class="btn btn-default" title="当前 验证 状态，点击取消">
									<span class="glyphicon glyphicon-ok"></span>
								</button>
							</td>
							<td ng-if="item.isValidate!='01'" class="text-center">
								<button type="button" ng-click="isUseable(item)" class="btn btn-default" title="当前 非验证状态，点击开启">
									<span class="glyphicon glyphicon-remove"></span>
								</button>

							</td>
							<td class="text-center">
								<button type="button" ng-click="edit(item)" class="btn btn-default" title="编辑">
									<span class="glyphicon glyphicon-edit"></span>
								</button>

							</td>
							<td class="text-center">
								<button type="button" ng-click="del(item)" class="btn btn-default" title="删除">
									<span class="glyphicon glyphicon-trash"></span>
								</button>

							</td>
						</tr>
					</tbody>
				</table>
				<!--表格-->
			</div>
			<!-- pagination start -->
			<div class="panel-body">
				<div class="row">
					<div class="pull-left pagination">一共{{page.totalCount}}条结果，当前第{{page.pageNum}}页，共{{page.totalPage}}页</div>
					<div class="pull-right">
						<ul uib-pagination class="pagination-sm" total-items="page.totalCount" items-per-page="page.numPerPage" previous-text="上一页" next-text="下一页" ng-model="page.pageNum" max-size="page.pageNumShown" boundary-link="true" boundary-link-numbers="true" rotate="true"></ul>
					</div>
				</div>

			</div>
			<!-- pagination end -->

		</div>
	</div>
	<!--右侧内容结束-->
	<!-- 添加应用 -->
	<div cs-window show="flag" autoCenter="true" offset="offset" style="width: 500px" title="'接口'">
		<div>
			<form class="form-horizontal group-border w5c-form hover-stripped" role="form" w5c-form-validate="validateOptions" novalidate name="form">
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">参数名称</label>
					<div class="col-lg-9 col-md-9">
						<input type="hidden" name="model.wid" ng-model="model.wid"> 
						<input type="hidden" name="model.funcId" ng-model="model.funcId">
						<input type="text" class="form-control" required="required" name="model.paramName" ng-model="model.paramName" placeholder="请输入参数名称" ng-maxlength="20" autofocus="autofocus">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">参数类型</label>
					<div class="col-lg-9 col-md-9">
						<input type="text" class="form-control" required="required" name="model.paramType" ng-model="model.paramType" placeholder="请输入参数类型" ng-maxlength="20">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">是否必须</label>
					<div class="col-lg-9 col-md-9">


						<div class="btn-group">
							<label class="btn btn-info" name="model.required" ng-model="model.required" uib-btn-radio="'01'">是</label> 
							<label class="btn btn-info" name="model.required" ng-model="model.required" uib-btn-radio="'02'">否</label>

						</div>
					
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">是否需要验证</label>
					<div class="col-lg-9 col-md-9">
						<div class="btn-group">
							<label class="btn btn-info" name="model.isValidate" ng-model="model.isValidate" uib-btn-radio="'01'">需要</label> 
							<label class="btn btn-info" name="model.isValidate" ng-model="model.isValidate" uib-btn-radio="'02'">不需要</label>

						</div>
					</div>
				</div>
				
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary" w5c-form-submit="saveEntity()" ng-show="modelAdd">添加</button>
					<button type="submit" class="btn btn-primary" w5c-form-submit="saveEntity()" ng-show="modelEdit">确定</button>
				</div>
			</form>
		</div>

	</div>

</section>