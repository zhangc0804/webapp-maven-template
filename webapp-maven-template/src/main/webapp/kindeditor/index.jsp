<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>webapp-maven-template</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/js/kindeditor/themes/default/default.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/js/kindeditor/plugins/code/prettify.css" />
<script charset="utf-8" src="${pageContext.request.contextPath}/js/kindeditor/kindeditor-all.js"></script>
<script charset="utf-8" src="${pageContext.request.contextPath}/js/kindeditor/lang/zh-CN.js"></script>
<script charset="utf-8" src="${pageContext.request.contextPath}/js/kindeditor/plugins/code/prettify.js"></script>
<script>
        KindEditor.ready(function(K) {
                window.editor = K.create('#editor_id');
        });
</script>
</head>
<body>
	<p>welcome to use kindeditor.</p>

	<form action="${pageContext.request.contextPath}/kindeditor/saveOrUpdate.do" method="post">
		<textarea id="editor_id" name="content"
			style="width: 700px; height: 300px;">
&lt;strong&gt;HTML内容&lt;/strong&gt;
</textarea>
	<input type="submit" value="提交">
	</form>
</body>
</html>