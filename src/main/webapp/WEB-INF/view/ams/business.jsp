<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<section>
	<!--左侧导航结束-->
	<!--右侧内容开始-->
	<div class="shuju-con-right">
		<!--右侧头部开始-->
		<div class="shuju-right-title clearfix">
			<div class="shuju-title-left">
				<h3>应用管理</h3>
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

							<button type="button" class="btn btn-primary" ng-show="keyword['appId']>0" ng-click="newBusi()" style="text-shadow: black 5px 3px 3px;">
								新增 <span class="glyphicon glyphicon-plus"></span>
							</button>
						</div>
						<div class="col-lg-3 col-md-4 col-sm-5 col-xs-6 pull-right">
							<div class="input-group">
								<input type="hidden" ng-model="keyword['appId']"> <input type="text" class="form-control" placeholder="业务class 模糊匹配" ng-model="keyword['busiClass']"> <span class="input-group-btn">
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
									<th class="per28">业务class</th>
									<th class="per12">业务类所在包</th>
									<th class="per8">classType</th>
									<th class="per28">业务介绍</th>
									<th class="per6 text-center">方法</th>
									<th class="per6 text-center">授权</th>
									<th class="per6 text-center">编辑</th>
									<th class="per6 text-center">删除</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="item in list">
									<td>{{item.busiClass}}</td>
									<td>{{item.busiPackage}}</td>
									<td>{{classTypeCode[item.classType]}}</td>
									<td>{{item.busiDes}}</td>
									<td class="text-center">
										<button type="button" ng-click="listInterface(item)" class="btn btn-default" title="接口">
											<span class="glyphicon glyphicon-cog"></span>
										</button>

									</td>
									<td ng-if="item.isAuth=='01'" class="text-center">
										<button type="button" ng-click="isUseable(item)" class="btn btn-default" title="需要授权">
											<span class="glyphicon glyphicon-ok"></span>
										</button>
									</td>
									<td ng-if="item.isAuth!='01'" class="text-center">
										<button type="button" ng-click="isUseable(item)" class="btn btn-default" title="不需要授权">
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
		</div>
	</div>
	<!--右侧内容结束-->
	<!-- 添加应用 -->
	<div cs-window show="flag" autoCenter="true" offset="offset" style="width: 450px" title="'应用'">
		<div>
			<form class="form-horizontal group-border w5c-form hover-stripped" role="form" w5c-form-validate="validateOptions" novalidate name="form">
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">应用名称</label>
					<div class="col-lg-9 col-md-9">
						<label class="control-label">{{app.projectName}}</label> <input type="hidden" ng-model="model.appWid"> <input type="hidden" ng-model="model.wid">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">业务所在包</label>
					<div class="col-lg-9 col-md-9">
						<input type="text" class="form-control" name="busiPackage" placeholder="请输入业务所在包" required ng-model="model.busiPackage">

					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">业务类</label>
					<div class="col-lg-9 col-md-9">
						<input type="text" class="form-control" name="buisClass" placeholder="请输入业务类" required ng-model="model.busiClass">

					</div>

				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">class类型</label>
					<div class="col-lg-9 col-md-9">

						<select name="classType" class="form-control" ng-model="model.classType">
							<option ng-repeat="x in classTypeList" value="{{x.id}}">{{x.mc}}</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">需要验证</label>
					<div class="col-lg-9 col-md-9">


						<div class="btn-group">
							<label class="btn btn-primary" name="isAuth" ng-model="model.isAuth" uib-btn-radio="'01'">是</label> <label class="btn btn-primary" name="isAuth" ng-model="model.isAuth" uib-btn-radio="'02'">否</label>

						</div>
						<!-- <label class="radio-inline">
                           <input type="radio"  name="isUseable" ng-model="app.isUseable" value="'01'">启用
                     </label>
                     <label class="radio-inline">
                           <input type="radio"  name="isUseable" ng-model="app.isUseable" value="'02'" >停止
                     </label>
                           -->
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">业务描述</label>
					<div class="col-lg-9 col-md-9">
						<input type="text" class="form-control" name="busiDes" placeholder="请输入业务描述" ng-model="model.busiDes">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">访问路径</label>
					<div class="col-lg-9 col-md-9">
						<input type="url" class="form-control" name="busiUrl" placeholder="请输入应用的访问地址" ng-model="model.busiUrl">
					</div>
				</div>


				<div class="form-group">
					<label class="col-lg-3 col-md-3 col-sm-12 control-label">是否可用</label>
					<div class="col-lg-9 col-md-9">



						<label class="radio-inline"> <input type="radio" name="isAvailable" ng-model="model.isAvailable" value="01">是
						</label> <label class="radio-inline"> <input type="radio" name="isAvailable" ng-model="model.isAvailable" value="02">否
						</label>

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