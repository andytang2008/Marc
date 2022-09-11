
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
        <div id="result">
         <!-- <h3>${requestScope["message"]}</h3>
		  <h3>${requestScope["UPLOAD_DIRECTORY_name"]}</h3>
		  <h3>${requestScope["UPLOAD_DIRECTORY_real_name"]}</h3>
			
			<h3>${requestScope["filename"]}</h3>
			<h3>${requestScope["folder"]}</h3>
			<h3>${requestScope["folderandname"]}</h3>
			<h3>${requestScope["pfolderandname"]}</h3>
			<h3>${requestScope["lastfolder"]}</h3>
			<h3></h3>-->
	            <form action="upload2" method="post" ><br>
			<!--	Input the Marc field you want to use to generate the list: <input type="text"  name="marcfield" placeholder="Marc Field">  <br>-->
			      Input the processed file name you would like to download: <input type="text"  name="pfilename" placeholder="Processed filename">  <br>
				  
		  
					  <input type="hidden" name="folderandname" value="${requestScope['folderandname']}">
					  <input type="hidden" name="filepath" value="${requestScope['pfolderandname']}">
					   <input type="hidden" name="lastFolder" value="${requestScope['lastfolder']}">
                <input type="submit" value="Continue" />
            </form>   		
			

        </div>
      
    </body>
</html>
