 <%@ page import="com.TestTest2" %>
  <%@ page import="com.DownloadServlet" %>
 <%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>

      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		        <title>File Upload Example in JSP and Servlet - Java web application</title>
		<link rel="stylesheet" href="css/style.css">
		<script  src="js/index.js"></script>
		<script  src="js/jquery-1.11.1.js"></script>
        <title>File Upload Example in JSP and Servlet - Java web application</title>
		<script class="jsbin" src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		<style>
				input[type=text] {
				  padding: 5px;
				  border: 2px solid #ccc;
				  -webkit-border-radius: 5px;
				  border-radius: 5px;
				}

				input[type=text]:focus {
				  border-color: #333;
				}

				input[type=submit] {
				  padding: 5px 15px;
				  background: #ccc;
				  border: 0 none;
				  cursor: pointer;
				  -webkit-border-radius: 5px;
				  border-radius: 5px;
				}
				
				#apDiv1 {
					position:relative;
					width:700px;
					margin-left: auto ;
					margin-right: auto ;
					height:315px;
					z-index:1;

				}
				

				* {
					font: 25px Tahoma, Helvetica, Arial, Sans-Serif;
	`				text-align: center;
					color: #222;
					text-shadow: 0px 1px 2px #555;
				}

		</style>
    </head>
    <body> 
		<!--<h3>Hello world!</h3>
				<h3>${requestScope["fileNamex"]}</h3>
				<h3>${requestScope["pfileName"]}</h3>
			<h3>${requestScope["pfileNamex"]}</h3>
			<h3>${requestScope["pfilePath"]}</h3>
			<h3>${requestScope["pmarcfield"]}</h3>
			<h3>${requestScope["plastFolder"]}</h3>
					final String pmarcField=(String)request.getAttribute("pmarcfield");
			-->
	
		  	<%

		TestTest2 TT=new TestTest2();
	
		final String fileName=(String)request.getAttribute("fileNamex");
		final String pfileName=(String)request.getAttribute("pfileNamex");


		TT.cal(fileName,pfileName);
		
		
			%>
			
			<!--<a href="${requestScope["pfileNamex"]}"> Please Download the processed file!</a>-->
			<br>
			<a href="DownloadServlet?fileName=${requestScope["pfileName"]}&lastFolder=${requestScope["plastFolder"]}">Download the Processed File</a>
			<br><br><a href="http://librarysysworld.com:8080/marc_maker">Go back</a>
			
			<h3> </h3>
	</body>
	
</html>