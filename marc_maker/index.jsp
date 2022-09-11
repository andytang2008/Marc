 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
   
            <h3> Choose Marc File to Upload to Server </h3>
	<div class="image-upload-wrap">
            <form action="upload" method="post" enctype="multipart/form-data" >
											 <input class="file-upload-input" type="file" name="file" onchange="document.getElementById('submit_button_id').click();" />
			      <!--Input the processed file name: <input type="text"  name="pfilename" placeholder="Processed filename">  <br>-->
               <!-- Upload the file you want to process:--><!--<input type="file" name="file" style="display: none;" />-->
                
				<input type="submit" value="upload" id="submit_button_id" style="display: none;" />

            </form>  
			<div class="drag-text">
			  <h3>Drag and drop a file or select to add a file</h3>
			</div>

  </div>
      
    </body>
</html>