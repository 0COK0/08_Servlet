<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>signIn</title>
</head>
<body>
<h1>MemberList</h1>
<form action="registers" method="post">
    <table>
        <tr>
            <td>아이디 :</td>
            <td><input type="text" name="id2" style="height: 40px;" width="500px;"></td>
        </tr>
        <tr>
            <td>비밀번호 :</td>
            <td><input type="password" name="password2" style="height: 40px;" width="500px;"></td>
        <tr>
            <td>비밀번호 확인 :</td>
            <td><input type="password" name="confirm" style="height: 40px;" width="500px;"></td>
        </tr>
        <tr>
            <td>닉네임 :</td>
            <td><input type="text" name="nicName" style="height: 40px;" width="500px;"></td>
        </tr>
        <tr>
            <td>전화번호 :</td>
            <td><input type="text" name="phoneNum" style="height: 40px;" width="500px;"></td>
            <td colspan="2">
                <button type="submit" style="height: 50px;">회원 가입</button>
            </td>
        </tr>
    </table>
</form>
<hr>
<a href="LogOut">세션 데이터 지우기</a>
</body>
</html>