// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Processing extends HttpServlet {
 
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Using Post Method to Read Form Data";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>File name:</b>: "
                  + request.getParameter("pfilename") + "\n" +
				  "  <li><b>File path:</b>: "+
request.getParameter("filepath") + "\n" +
request.getParameter("marcfield")+ "\n" +
               "</ul>\n" +
            "</body>" +
         "</html>"
      );
	  String folderandname=request.getParameter("folderandname");
	  
	  String pfilename=request.getParameter("pfilename");
	  
	  String pfilepath=request.getParameter("filepath");
	  
	   String paddField=request.getParameter("pAddField");
	   
	   String paddFieldContent=request.getParameter("pAddFieldContent");
	   
	      String lastfolder=request.getParameter("lastFolder");
	  
	  String pFilepathandFilename=pfilepath+pfilename;
	  
	     request.setAttribute("fileNamex", folderandname);
		  request.setAttribute("pfileNamex", pFilepathandFilename);
		   request.setAttribute("pfileName", pfilename);
		    request.setAttribute("pAddField", paddField);
		   	    request.setAttribute("pAddFieldContent", paddFieldContent);
		     request.setAttribute("plastFolder", lastfolder);
		
		 request.getRequestDispatcher("/result2.jsp").forward(request, response);
	  	//	<%

		//TestTest TT=new TestTest();

		//final String fileName = (String) request.getAttribute ("folderandname");
		//final String pfileName = (String) request.getAttribute ("pfolderandname");
		
		//final String fileName=folderandname;
		//final String pfileName=pFilepathandFilename;
		
		//TT.cal(fileName,pfileName);
		//	%>
	  
   }
}