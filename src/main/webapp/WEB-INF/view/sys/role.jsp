<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<section>
	<!--左侧导航结束-->
	<!--右侧内容开始-->
	<div class="shuju-con-right">
		<!--右侧头部开始-->
		<div class="shuju-right-title clearfix">
			<div class="shuju-title-left">
				<h3>角色管理</h3>
			</div>
		</div>
		<hr class="quanxian-hr">
		<div class="row">
			<div class="col-lg-3 col-md-4">
				<div class="list-group">
					<div class="list-group-item active">
						<h4 class="list-group-item-heading">应用系统</h4>
					</div>

					<a ng-repeat="item in appList" ng-class="'list-group-item'" ng-click="selectApp(item)">{{item.projectName}}</a>


				</div>
			</div>
			<div class="col-lg-9 col-md-8">
				<!--右侧头部结束-->

				<div class="panel-body" style="padding: 0 15px 15px 15px">
					<div class="row">
						<div class="pull-left">

							<button type="button" class="btn btn-primary" ng-show="keyword['appId']>0" ng-click="newItem()" style="text-shadow: black 5px 3px 3px;">
								新增 <span class="glyphicon glyphicon-plus"></span>
							</button>
						</div>
						<div class="col-lg-3 col-md-4 col-sm-5 col-xs-6 pull-right">
							<div class="input-group">
								<input type="hidden" ng-model="keyword['appId']"> <input type="text" class="form-control" placeholder="角色名称 模糊匹配" ng-model="keyword['roleName']"> <span class="input-group-btn">
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
									<th class="per28">角色名称</th>
									<th class="per12">角色描述</th>
								
									<th class="per6 text-center">状态</th>
									
									<th class="per6 text-center">编辑</th>
									<th class="per6 text-center">权限</th>
									<th class="per6 text-center">删除</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="item in list">
									<td>{{item.roleName}}</td>
									<td>{{item.roleDes}}</td>
									
									
									<td ng-if="item.isUseable=='01'" class="text-center">
										<button type="button" ng-click="isUseable(item)" class="btn btn-default" title="可用">
											<span class="glyphicon glyphicon-ok"></span>
										</button>
									</td>
									<td ng-if="item.isUseable!='01'" class="text-center">
										<button type="button" ng-click="isUseable(item)" class="btn btn-default" title="不可用">
											<span class="glyphicon glyphicon-remove"></span>
										</button>

									</td>
									<td class="text-center">
										<button type="button" ng-click="edit(item)" class="btn btn-default" title="编辑">
											<span class="glyphicon glyphicon-edit"></span>
										</button>

									</td>
									<td class="text-center">
										<button type="button" ng-click="listRes(item)" class="btn btn-default" title="编辑">
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
		</div>
	</div>
	<!--右侧内容结束-->
	<!-- 添加应用 -->
	<div cs-window show="flag" autoCenter="true" offset="offset" style="width: 450px" title="'角色'">
		<div>
			<form class="form-horizontal group-border w5c-form hover-stripped" role="form" w5c-form-validate="validateOptions" novalidate name="form">
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">应用名称</label>
					<div class="col-lg-9 col-md-9">
						<label class="control-label">{{app.projectName}}</label> 
						<input type="hidden" ng-model="model.appId"> 
						<input type="hidden" ng-model="model.wid">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">角色名称</label>
					<div class="col-lg-9 col-md-9">
						<input type="text" class="form-control" name="roleName" placeholder="请输入角色名称" required ng-model="model.roleName">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">角色描述</label>
					<div class="col-lg-9 col-md-9">
						<input type="text" class="form-control" name="roleDes" placeholder="请输入角色描述" required ng-model="model.roleDes">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">是否可用</label>
					<div class="col-lg-9 col-md-9">
						<label class="radio-inline"> <input type="radio" name="isUseable" ng-model="model.isUseable" value="01">是</label> 
						<label class="radio-inline"> <input type="radio" name="isUseable" ng-model="model.isUseable" value="02">否</label>
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