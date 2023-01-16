<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%-- formatter를 이용하겠다는 뜻 --%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <div>Home ! -JSTL FORMATS-</div>
    <div>
    234124.12 --> 234,124.12
    2023.01.16 10:18.50 --> 2023 1 16,
    </div>
    <hr />
    <div>jstl Formats - Number</div>
    <c:set var="num_first" value="1234567.89" />
    <div>세자리 구분 : <fmt:formatNumber value="${num_first}" type="number"/> </div>
    <%-- value = 어떤 값을 어떤 타입으로 바꿔줄건데?라는 뜻ㅋ --%>
    <c:set var="num_second" value="0.1234" />
    <div>백분율 : <fmt:formatNumber value="${num_second}" type="percent" /> </div>
    <hr />
    <div>jstl Formats - Date</div>
    <%-- set data.는 변수와 값이 필요함 ! --%>
    <div>pure java의 Data date_first = new java.util.Date();를 밑의 방식으로</div>
    <c:set var="date_first" value="<%= new java.util.Date() %>"/>
    <div>값 출력 : ${date_first}</div>
    <div>time출력 : <fmt:formatDate value="${date_first}" type="time" /> </div>
    <div>date 출력 : <fmt:formatDate value="${date_first}" type="date" /></div>
    <div>date and time : <fmt:formatDate value="${date_first}" type="both" /> </div>
  <hr/>
  <div>jstl Formats - Location</div>
  <c:set var="num_third" value="1234567.89" />
  <c:set var="date_third" value="<%= new java.util.Date() %>" />
  <div>대한민국 나라 : <fmt:setLocale value="ko_KR" scope="session" /> </div>
  <div>통화 : <fmt:formatNumber value="${num_third}" type="currency" /> </div>
  <div>날짜 : <fmt:formatDate value="${date_third}" type="both" /> </div>

  <div>나라 : <fmt:setLocale value="en-US" scope="session" /> </div>
  <div>통화 : <fmt:formatNumber value="${num_third}" type="currency" /> </div>
  <div>날짜 : <fmt:formatDate value="${date_third}" type="both" /> </div>

  <div>나라 : <fmt:setLocale value="ja-JP" scope="session" /> </div>
  <div>통화 : <fmt:formatNumber value="${num_third}" type="currency" /> </div>
  <div>날짜 : <fmt:formatDate value="${date_third}" type="both" /> </div>
  <div></div>
  <div></div>

  </body>
</html>
