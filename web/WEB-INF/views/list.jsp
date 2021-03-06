<%--
  Created by IntelliJ IDEA.
  User: wcm
  Date: 2018/11/25
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
   pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<!-- 搭建显示页面 -->
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-12"><h1>ssm_curd</h1></div>
    </div>
        <%--按钮--%>
        <div class="row">
            <div class="col-md-4 col-md-offset-10">
                <button class="btn btn-primary">新增</button>
                <button class="btn btn-danger">删除</button>
            </div>
        </div>
    <%--数据--%>
        <div class="row">
            <table class="table table-hover">
                <tr>
                    <th>#</th>
                    <th>empName</th>
                    <th>gender</th>
                    <th>email</th>
                    <th>部门</th>
                    <th>操作</th>
                </tr>
                <%--<tr>--%>
                    <%--<th>1</th>--%>
                    <%--<th>维他命</th>--%>
                    <%--<th>男</th>--%>
                    <%--<th>231354@qq.com</th>--%>
                    <%--<th>系统软件室</th>--%>
                    <%--<th>--%>
                        <%--<button class="btn btn-primary">--%>
                            <%--<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>--%>
                            <%--编辑--%>
                        <%--</button>--%>
                        <%--<button class="btn btn-danger">--%>
                            <%--<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>--%>
                            <%--删除--%>
                        <%--</button>--%>
                    <%--</th>--%>
                <%--</tr>--%>
                <%--<c:forEach items="${pageInfo.emps}" var="emp">--%>
                    <%--<tr>--%>
                        <%--<th>${emp.empId}</th>--%>
                        <%--<th>${emp.empName}</th>--%>
                        <%--<th>${emp.gender=="M"?"男":"女"}</th>--%>
                        <%--<th>${emp.email}</th>--%>
                        <%--<th>${emp.department.deptName}</th>--%>
                        <%--<th>--%>
                            <%--<button class="btn btn-primary">--%>
                                <%--<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>--%>
                                <%--编辑--%>
                            <%--</button>--%>
                            <%--<button class="btn btn-danger">--%>
                                <%--<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>--%>
                                <%--删除--%>
                            <%--</button>--%>
                        <%--</th>--%>
                    <%--</tr>--%>
                <%--</c:forEach>--%>
                <c:forEach items="${pageInfo.list }" var="emp">
                    <tr>
                        <th>${emp.empId }</th>
                        <th>${emp.empName }</th>
                        <th>${emp.gender=="M"?"男":"女" }</th>
                        <th>${emp.email }</th>
                        <th>${emp.department.deptName }</th>
                        <th>
                            <button class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                编辑
                            </button>
                            <button class="btn btn-danger btn-sm">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    <%--分页信息--%>
        <div class="row">
            <div class="col-md-6">
                当前页数为${pageInfo.pageNum},总页数为${pageInfo.pages}
            </div>
            <div class="col-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <li><a href="${APP_PATH}/emps?pn=1">首页</a></li>
                        <c:if test="${pageInfo.pageNum != 1}">
                            <li>
                                <a href="${APP_PATH}/emps?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                        </c:if>

                        <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
                            <c:if test="${page_Num == pageInfo.pageNum}">
                                <li class="active">
                                    <a href="${APP_PATH}/emps?pn=${page_Num}">${page_Num}</a>
                                </li>
                            </c:if>
                            <c:if test="${page_Num != pageInfo.pageNum}">
                                <li>
                                    <a href="${APP_PATH}/emps?pn=${page_Num}">${page_Num}</a>
                                </li>
                            </c:if>

                        </c:forEach>
                        
                        
                        <c:if test="${pageInfo.pageNum != pageInfo.pages}">
                            <li>
                                <a href="${APP_PATH}/emps?pn=${pageInfo.pageNum+1}" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </c:if>

                        <li><a href="${APP_PATH}/emps?pn=${pageInfo.pages}">末页</a></li>
                    </ul>
                </nav>
            </div>
        </div>
</div>
</body>
</html>
