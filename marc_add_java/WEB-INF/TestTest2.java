package com;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class TestTest2 {
	    //public static void main(String [] args) {
public String cal(String filename, String pfilename,String paddField, String paddFieldContent){
    // The name of the file to open.
	String fileName = filename;
	String pfileName = pfilename;
	String pAddField = paddField; // The field which will be added
	String pAddFieldContent = paddFieldContent; //The field content which will be added.
    // This will reference one line at a time
    String line = null;

    try {
			
				BufferedReader in = new BufferedReader(new FileReader(fileName));
				String str;

				List<String> list = new ArrayList<String>();
				while((str = in.readLine()) != null){
					list.add(str);
				}
				
				 for (String s : list) { System.out.println(s); } //print line by line
				

				String[] stringArr = list.toArray(new String[0]);

				//String[] Marc=new ArrayList();
				List<String> Marc = new ArrayList<String>();
				for (int i=0; i<stringArr.length; i++){
					//System.out.println("********************************************************");
					//System.out.println(stringArr[i]+"\n");
					//System.out.println("Length:"+stringArr[i].length()+"\n");
					
								String field001="";
								//String field099intermediate="";
								//String field035="";
								//String fieldAddedPrefix="055";
								//String fieldAddedContent="\\\\$aThis is the test"; //we need to use four back slash, tow of them used as escape.
								String fieldAddedPrefix=pAddField;
								String fieldAddedContent=pAddFieldContent;
								
								String fieldAddedTotal="";
								String otherField="";
								
								if (stringArr[i].length()!=0){
									//System.out.println(stringArr[i].substring(1,4));
									
										//if(stringArr[i].substring(1,4)=="001"){
										if(stringArr[i].substring(1,4).equals("001")){
											
											//System.out.println("001001001001001001001001001001001001001001001001001001001001");
										 field001=stringArr[i].substring(0,stringArr[i].length());
                                          fieldAddedTotal="="+fieldAddedPrefix+"  "+fieldAddedContent;
										// System.out.println("field099:"+field099);
										 
										}else{
											otherField=stringArr[i].substring(0,stringArr[i].length());
											
										}
											
										
									
									
									}
									
								if (field001!=""){
									
									Marc.add(field001);
									Marc.add(fieldAddedTotal);
								}else
								{
									Marc.add(otherField);
								}
									

					
					//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

					}
					
					//System.out.println(Arrays.toString(Marc.toArray()));
					
				
				String[] MarctoArray = Marc.toArray(new String[0]); //we have to convert list Marc to array before export them to a file.
			
			//System.out.println(Arrays.toString(stringArr));
			
						FileWriter fw = new FileWriter(pfilename); //write array to a file named file.dat
						for (int i = 0; i < MarctoArray.length; i++) {
						  //fw.write(stringArr[i] + "\n");
						  fw.write(MarctoArray[i] + "\n");
						}
						fw.close();
			
			       in.close();

	}
    catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading file '" 
            + fileName + "'");                  
      }
	  return "successful";
   }
}