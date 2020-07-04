<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itheima.com/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() 
	                   + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>人事管理系统</title>
	<!-- 引入css样式文件 -->
	<!-- Bootstrap Core CSS -->
	<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" />
	<!-- MetisMenu CSS -->
	<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet" />
	<!-- DataTables CSS -->
	<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet" />
	<!-- Custom CSS -->
	<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet" />
	<!-- Custom Fonts -->
	<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="wrapper">
  <!-- 导航栏部分 -->
  <nav class="navbar navbar-default navbar-static-top" role="navigation"
		 style="margin-bottom: 0">
	<div class="navbar-header">
		<a class="navbar-brand" href="<%=basePath%>employee/list.action">人事管理系统</a>
	</div>
	<!-- 导航栏右侧图标部分 -->
	<ul class="nav navbar-top-links navbar-right">
	    <!-- 邮件通知 start -->
		<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
				<i class="fa fa-envelope fa-fw"></i>
				<i class="fa fa-caret-down"></i>
			</a>
			<ul class="dropdown-menu dropdown-messages">
				<li>
				    <a href="#">
						<div>
							<strong>张经理</strong> <span class="pull-right text-muted">
								<em>昨天</em>
							</span>
						</div>
						<div>今天晚上开会，讨论一下下个月工作的事...</div>
				    </a>
				</li>
				<li class="divider"></li>
				<li>
				    <a class="text-center" href="#">
				        <strong>查看全部消息</strong>
						<i class="fa fa-angle-right"></i>
				    </a>
				</li>
			</ul>
		</li>
		<!-- 邮件通知 end -->
		<!-- 任务通知 start -->
		<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
			    <i class="fa fa-tasks fa-fw"></i>
				<i class="fa fa-caret-down"></i>
			</a>
			<ul class="dropdown-menu dropdown-tasks">
				<li>
				    <a href="#">
						<div>
							<p>
								<strong>任务 1</strong> 
								<span class="pull-right text-muted">完成40%</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-success"
									role="progressbar" aria-valuenow="40" aria-valuemin="0"
									aria-valuemax="100" style="width: 40%">
									<span class="sr-only">完成40%</span>
								</div>
							</div>
						</div>
				    </a>
				</li>
				<li class="divider"></li>
				<li>
				    <a href="#">
						<div>
							<p>
								<strong>任务 2</strong> 
								<span class="pull-right text-muted">完成20%</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-info" role="progressbar"
									aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
									style="width: 20%">
									<span class="sr-only">完成20%</span>
								</div>
							</div>
						</div>
				    </a>
				</li>
				<li class="divider"></li>
				<li>
				    <a class="text-center" href="#"> 
				        <strong>查看所有任务</strong>
						<i class="fa fa-angle-right"></i>
				    </a>
				</li>
			</ul> 
		</li>
		<!-- 任务通知 end -->
		<!-- 消息通知 start -->
		<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
				<i class="fa fa-bell fa-fw"></i>
				<i class="fa fa-caret-down"></i>
			</a>
			<ul class="dropdown-menu dropdown-alerts">
				<li>
				    <a href="#">
						<div>
							<i class="fa fa-comment fa-fw"></i> 新回复 
							<span class="pull-right text-muted small">4分钟之前</span>
						</div>
				    </a>
				</li>
				<li class="divider"></li>
				<li>
				    <a href="#">
						<div>
							<i class="fa fa-envelope fa-fw"></i> 新消息 
							<span class="pull-right text-muted small">4分钟之前</span>
						</div>
				    </a>
				</li>
				<li class="divider"></li>
				<li>
				    <a href="#">
						<div>
							<i class="fa fa-tasks fa-fw"></i> 新任务 
							<span class="pull-right text-muted small">4分钟之前</span>
						</div>
				    </a>
				</li>
				<li class="divider"></li>
				<li>
				    <a href="#">
						<div>
							<i class="fa fa-upload fa-fw"></i> 服务器重启 
							<span class="pull-right text-muted small">4分钟之前</span>
						</div>
				    </a>
				</li>
				<li class="divider"></li>
				<li>
				    <a class="text-center" href="#"> 
				        <strong>查看所有提醒</strong>
						<i class="fa fa-angle-right"></i>
				    </a>
				</li>
			</ul> 
		</li>
		<!-- 消息通知 end -->
		<!-- 用户信息和系统设置 start -->
		<li class="dropdown">
			<a class="dropdown-toggle" data-toggle="dropdown" href="#"> 
				<i class="fa fa-user fa-fw"></i>
				<i class="fa fa-caret-down"></i>
			</a>
			<ul class="dropdown-menu dropdown-user">
				<li><a href="#"><i class="fa fa-user fa-fw"></i>
				               用户：${USER_SESSION.user_name}
				    </a>
				</li>
				<li><a href="#"><i class="fa fa-gear fa-fw"></i> 系统设置</a></li>
				<li class="divider"></li>
				<li>
					<a href="${pageContext.request.contextPath }/logout.action">
					<i class="fa fa-sign-out fa-fw"></i>退出登录
					</a>
				</li>
			</ul> 
		</li>
		<!-- 用户信息和系统设置结束 -->
	</ul>
	<!-- 左侧显示列表部分 start-->
	<div class="navbar-default sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<li class="sidebar-search">
					<div class="input-group custom-search-form">
						<input type="text" class="form-control" placeholder="查询内容...">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">
								<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
							</button>
						</span>
					</div> 
				</li>
				<li>
				    <a href="${pageContext.request.contextPath }/employee/list.action" class="active">
				      <i class="fa fa-edit fa-fw"></i> 员工信息管理
				    </a>
				</li>
				<li>
				    <a href="${pageContext.request.contextPath }/department/list.action" class="active">
				      <i class="fa fa-dashboard fa-fw" ></i> 部门信息管理
				    </a>
				</li>
				<li>
				    <a href="${pageContext.request.contextPath }/item/list.action" class="active">
				      <i class="fa fa-dashboard fa-fw" ></i> 项目信息管理
				    </a>
				</li>
			</ul>
		</div>
	</div>
	<!-- 左侧显示列表部分 end--> 
  </nav>
    <!-- 客户列表查询部分  start-->
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">员工信息管理</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="panel panel-default">
			<div class="panel-body">
				<form class="form-inline" method="get" 
				      action="${pageContext.request.contextPath }/employee/list.action">
					<div class="form-group">
						<label for="employeeName">姓名</label> 
						<input type="text" class="form-control" id="employeeName" 
						                   value="${emplName}" name="emplName" />
					</div>
					<div class="form-group">
						<label for="emplDepartment">所属部门</label> 
						<select	class="form-control" id="emplDepartment"  name="emplDepartment">
							<option value="">--请选择--</option>
							<c:forEach items="${departmentType}" var="item">
								<option value="${item.dict_id}"
								        <c:if test="${item.dict_id == emplDepartment}"> selected</c:if>>
								    ${item.dict_item_name }
								</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<label for="itemName">项目名称</label>
						<select	class="form-control" id="itemName" name="itemName">
							<option value="">--请选择--</option>
							<c:forEach items="${itemType}" var="item">
								<option value="${item.dict_id}"
								        <c:if test="${item.dict_id == emplItem}"> selected</c:if>>
								    ${item.dict_item_name }
								</option>
							</c:forEach>
						</select>
					</div>
					<button type="submit" class="btn btn-primary">查询</button>
				</form>
			</div>
		</div>
		<a href="#" class="btn btn-primary" data-toggle="modal" 
		           data-target="#newEmployeeDialog" onclick="clearEmployee()">新建</a>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">员工信息列表</div>
					<!-- /.panel-heading -->
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>编号</th>
								<th>姓名</th>
								<th>性别</th>
								<th>所属部门</th>
								<th>所做项目</th>
								<th>固定电话</th>
								<th>手机</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${page.rows}" var="row">
								<tr>
									<td>${row.empl_id}</td>
									<td>${row.empl_name}</td>
									<td>${row.empl_sex}</td>
									<td>${row.empl_department}</td>
									<td>${row.empl_item}</td>
									<td>${row.empl_phone}</td>
								    <td>${row.empl_mobile}</td>
									<td>
										<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#employeeEditDialog" onclick= "editEmployee(${row.empl_id})">修改</a>
										<a href="#" class="btn btn-danger btn-xs" onclick="deleteEmployee(${row.empl_id})">删除</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="col-md-12 text-right">
						<itheima:page url="${pageContext.request.contextPath }/employee/list.action" />
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
	</div>
	<!-- 客户列表查询部分  end-->
</div>
<!-- 创建客户模态框 -->
<div class="modal fade" id="newEmployeeDialog" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">新建员工信息</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal" id="new_employee_form">
					<div class="form-group">
						<label for="new_employeeName" class="col-sm-2 control-label">
						    姓名
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_employeeName" placeholder="姓名" name="empl_name" />
						</div>
					</div>
					<div class="form-group">
						<label for="new_emplSex" class="col-sm-2 control-label">
						    性别
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_emplSex" placeholder="性别" name="empl_sex" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="new_emplDepartment" style="float:left;padding:7px 15px 0 27px;">所属部门</label>
						<div class="col-sm-10"> 
							<select	class="form-control" id="new_emplDepartment"  name="empl_department">
								<option value="">--请选择--</option>
								<c:forEach items="${departmentType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == emplDepartment}"> selected</c:if>>
									${item.dict_item_name }
									</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="new_emplItem" style="float:left;padding:7px 15px 0 27px;">项目名称</label>
						<div class="col-sm-10">
							<select	class="form-control" id="new_emplItem" name="empl_item">
								<option value="">--请选择--</option>
								<c:forEach items="${itemType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == emplItem}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="new_linkMan" class="col-sm-2 control-label">联系人</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_linkMan" placeholder="联系人" name="empl_linkman" />
						</div>
					</div>
					<div class="form-group">
						<label for="new_salary" class="col-sm-2 control-label">薪水</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_salary" placeholder="薪水" name="empl_salary" />
						</div>
					</div>
					<div class="form-group">
						<label for="new_phone" class="col-sm-2 control-label">固定电话</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_phone" placeholder="固定电话" name="empl_phone" />
						</div>
					</div>
					<div class="form-group">
						<label for="new_mobile" class="col-sm-2 control-label">移动电话</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_mobile" placeholder="移动电话" name="empl_mobile" />
						</div>
					</div>
					<div class="form-group">
						<label for="new_email" class="col-sm-2 control-label">E-mail</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_email" placeholder="E-mail" name="empl_email" />
						</div>
					</div>
					<div class="form-group">
						<label for="new_address" class="col-sm-2 control-label">联系地址</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_address" placeholder="联系地址" name="empl_address" />
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" onclick="createEmployee()">添加员工</button>
			</div>
		</div>
	</div>
</div>
<!-- 修改客户模态框 -->
<div class="modal fade" id="employeeEditDialog" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">修改员工信息</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal" id="edit_employee_form">
					<input type="hidden" id="edit_empl_id" name="empl_id"/>
					<div class="form-group">
						<label for="edit_employeeName" class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_employeeName" placeholder="姓名" name="empl_name" />
						</div>
					</div>
					<div class="form-group">
						<label for="new_emplSex" class="col-sm-2 control-label">
						    性别
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_emplSex" placeholder="性别" name="empl_sex" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="edit_emplDepartment" style="float:left;padding:7px 15px 0 27px;">所属部门</label>
						<div class="col-sm-10"> 
							<select	class="form-control" id="edit_emplDepartment"  name="empl_department">
								<option value="">--请选择--</option>
								<c:forEach items="${departmentType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == emplDepartment}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="edit_emplItem" style="float:left;padding:7px 15px 0 27px;">项目名称</label>
						<div class="col-sm-10">
							<select	class="form-control" id="edit_emplItem" name="empl_item">
								<option value="">--请选择--</option>
								<c:forEach items="${itemType}" var="item">
									<option value="${item.dict_id}"<c:if test="${item.dict_id == emplItem}"> selected</c:if>>${item.dict_item_name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="edit_linkMan" class="col-sm-2 control-label">联系人</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_linkMan" placeholder="联系人" name="empl_linkman" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_salary" class="col-sm-2 control-label">薪水</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_salary" placeholder="薪水" name="empl_salary" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_phone" class="col-sm-2 control-label">固定电话</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_phone" placeholder="固定电话" name="empl_phone" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_mobile" class="col-sm-2 control-label">移动电话</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_mobile" placeholder="移动电话" name="empl_mobile" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_email" class="col-sm-2 control-label">E-mail</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_email" placeholder="E-mail" name="empl_email" />
						</div>
					</div>
					<div class="form-group">
						<label for="edit_address" class="col-sm-2 control-label">联系地址</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="edit_address" placeholder="联系地址" name="empl_address" />
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" onclick="updateEmployee()">保存修改</button>
			</div>
		</div>
	</div>
</div>
<!-- 引入js文件 -->
<!-- jQuery -->
<script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="<%=basePath%>js/bootstrap.min.js"></script>
<!-- Metis Menu Plugin JavaScript -->
<script src="<%=basePath%>js/metisMenu.min.js"></script>
<!-- DataTables JavaScript -->
<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
<!-- Custom Theme JavaScript -->
<script src="<%=basePath%>js/sb-admin-2.js"></script>
<!-- 编写js代码 -->
<script type="text/javascript">
//清空新建客户窗口中的数据
	function clearEmployee() {
	    $("#new_employeeName").val("");
		$("#new_emplSex").val("");
	    $("#new_emplDepartment").val("");
		$("#new_emplItem").val("");
	    $("#new_linkMan").val("");
		$("#new_salary").val("");
	    $("#new_phone").val("");
	    $("#new_mobile").val("");
	    $("#new_email").val("");
	    $("#new_address").val("");
	}
	// 创建客户
	function createEmployee() {
	$.post("<%=basePath%>employee/create.action",
	$("#new_employee_form").serialize(),function(data){
	        if(data =="OK"){
	            alert("员工创建成功！");
	            window.location.reload();
	        }else{
	            alert("员工创建失败！");
	            window.location.reload();
	        }
	    });
	}
	// 通过id获取修改的客户信息
	function editEmployee(id) {
	    $.ajax({
	        type:"get",
	        url:"<%=basePath%>employee/getEmployeeById.action",
	        data:{"id":id},
	        success:function(data) {
	            $("#edit_empl_id").val(data.empl_id);
	            $("#edit_employeeName").val(data.empl_name);
				$("#edit_emplSex").val(data.empl_sex);
	            $("#edit_emplDepartment").val(data.empl_department);
	            $("#edit_emplItem").val(data.empl_item);
				$("#edit_salary").val(data.empl_salary);
	            $("#edit_linkMan").val(data.empl_linkman);
	            $("#edit_phone").val(data.empl_phone);
	            $("#edit_mobile").val(data.empl_mobile);
	            $("#edit_email").val(data.empl_email);
	            $("#edit_address").val(data.empl_address);
	        }
	    });
	}
    // 执行修改客户操作
	function updateEmployee() {
		$.post("<%=basePath%>employee/update.action",$("#edit_employee_form").serialize(),function(data){
			if(data =="OK"){
				alert("客户信息更新成功！");
				window.location.reload();
			}else{
				alert("客户信息更新失败！");
				window.location.reload();
			}
		});
	}
	// 删除员工
	function deleteEmployee(id) {
	    if(confirm('确定要删除该员工吗?')) {
	$.post("<%=basePath%>employee/delete.action",{"id":id},
	function(data){
	            if(data =="OK"){
	                alert("员工删除成功！");
	                window.location.reload();
	            }else{
	                alert("删除员工失败！");
	                window.location.reload();
	            }
	        });
	    }
	}
</script>
</body>
</html>