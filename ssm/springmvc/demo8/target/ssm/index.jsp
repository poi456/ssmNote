<%--
  Created by IntelliJ IDEA.
  User: lsm
  Date: 2020/11/27
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <script>
        <%--$(function () {--%>
        <%--    $("#asd").click(function () {--%>
        <%--        $.post("${pageContext.request.contextPath}/bb",function (data) {--%>
        <%--            console.log(data);--%>
        <%--        })--%>
        <%--    })--%>
        <%--})--%>
        function aa() {
            $.post({
                url:"${pageContext.request.contextPath}/cc",
                data:{"name":$("#user").val()},
                success:function (data) {
                    alert(data);
                }
            })
        }
    </script>
</head>
<body>
    用户名：<input type="text" placeholder="请输入用户名" id="user"></br>
    密码： <input type="text" id="pass"></br>
    <input type="submit" value="按钮" onclick="aa()">
<%--<table>--%>
<%--    <tr>--%>
<%--        <td>姓名</td>--%>
<%--        <td>年龄</td>--%>
<%--        <td>性别</td>--%>
<%--    </tr>--%>
<%--    <tbody>--%>

<%--    </tbody>--%>
<%--</table>--%>
</body>
</html>
