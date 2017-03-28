<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆</title>	
<script type="text/javascript" src="<c:url value="classPath:../resources/js/jquery-1.11.1.min.js"/>"></script>

<script type="text/javascript">
	$(document).ready(function(){
		$("#username").focus();
	});
</script>

</head>
<body>

	<div class="zyzContainer" style="width:500px;">

		<div class="m-form" style="margin-top: 150px; auto;">
			<form name="" action="<c:url value="/user/login.htm"/>" method="post">
				<sec:csrfInput />
				<fieldset>
					<legend>登陆系统
						<c:if test="${param.error != null}">        
            				<span class="color:red;">:用户名或密码错误！</span>
    					</c:if>
    					<c:if test="${param.logout != null}">       
					        <span class="color:red;">:成功退出！</span>
					    </c:if>
					</legend>
					<div class="formitm">
						<label class="lab">用户名：</label>
						<div class="ipt">
							<input type="text" class="u-ipt"  id="username" name="name"/>
						</div>
					</div>
					<div class="formitm">
						<label class="lab">密码：</label>
						<div class="ipt">
							<input type="password" class="u-ipt"  id="password" name="password"/>
						</div>
					</div>				
					
					<div class="formitm formitm-1">
						<input type="submit" class="u-btn u-btn-lg" value="登陆">
						<input type="reset" class="u-btn u-btn-lg" value="重置">
					</div>
				</fieldset>
			</form>
		</div>


	</div>

</body>
</html>
