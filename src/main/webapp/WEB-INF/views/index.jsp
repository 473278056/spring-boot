<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="margin: 0 auto">
        <div role="alert">Sptring Boot学习资源大奉送</div>
        <table border="1">
            <thead>
            <tr>
                <td>作者</td>
                <td>教程名称</td>
                <td>地址</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${learnList}" var="learnResouce" varStatus="status">
                <tr>
                    <td>${learnResouce.author}</td>
                    <td>${learnResouce.title}</td>
                    <td><a href="${learnResouce.url}"><span>点我</span></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>