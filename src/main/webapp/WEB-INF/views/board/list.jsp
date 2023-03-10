<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
        <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
</head>
<body>
  <div class="container text-center fs-5">DRAMA LIST</div>
      <table class="table table-bordered">
        <tr>
          <td>Title</td>
          <td>Content</td>
          <td>User Name</td>
          <td>Date</td>
        </tr>
          <c:forEach items="${boardList}" var="board" varStatus="status">
                    <tr>
                    <th scope=>${status.count}</th>
                    <td><a href="/board/view?title=${board.title}">${board.title}</a></td>
                    <td>${board.userName}</td>
                    <td>${board.date}</td>
                    </tr>
                </c:forEach>
      </table>

       <div>
            <form action="/board/form"><button>form</button></form>
        <div>
        <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
</body>
</html>
