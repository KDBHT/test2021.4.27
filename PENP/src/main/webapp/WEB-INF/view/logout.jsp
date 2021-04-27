<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/22
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
    <script>
        $(function () {
            $("#sesionclose").click(function () {
                $.post("${pageContext.request.contextPath}/meeting/login/usersessionclose",function (data) {
                        // this.session = data;
                    console.log(data)
                })
            })
        })
    </script>
</head>
<body>
欢迎您：
<%=
session.getAttribute("name")
%>
<button id="sesionclose">注销</button>

</body>
</html>
