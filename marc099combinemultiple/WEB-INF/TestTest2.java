package com;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
public class TestTest2 {
    //public static void main(String [] args) {
public String cal(String filename, String pfilename,String psource, String ptarget){
    // The name of the file to open.
	String fileName = filename;
	String pfileName = pfilename;
	String pSource = psource; //099 field
	String pTarget = ptarget; //830 field subfield V
	
	
		// This will reference one line at a time
	String line = null;

    try {
			
				BufferedReader in = new BufferedReader(new FileReader(fileName));
				String str;

				List<String> list = new ArrayList<String>();
				while((str = in.readLine()) != null){
					list.add(str);
				}
				
				// for (String s : list) { System.out.println(s); } //print line by line
				

				String[] stringArr = list.toArray(new String[0]);
				String[] stringTar = new String[stringArr.length];
				String field099="";

				//String[] Marc=new ArrayList();
				List<String> Marc = new ArrayList<String>();
				for (int i=0; i<stringArr.length; i++){
					//System.out.println("********************************************************");
					//System.out.println(stringArr[i]+"\n");
					//System.out.println("Length:"+stringArr[i].length()+"\n");
					
								String field001="";
								stringTar[i]=stringArr[i];
								
								if (stringArr[i].length()!=0){ //if the array is not empty
									//System.out.println(stringArr[i].substring(1,4));
									
										//if(stringArr[i].substring(1,4)=="001"){
										//if(stringArr[i].substring(1,4).equals("099"))
									if(stringArr[i].substring(1,4).equals(pSource))
										{
											field099=field099+stringArr[i].substring(10,stringArr[i].length())+" ";		
											//System.out.println("field099*********0:"+stringArr[i].substring(10,stringArr[i].length()));
											//System.out.println("field099*********0:"+field099);											
										}
										//if(stringArr[i].substring(1,4).equals("830")){
									if(stringArr[i].substring(1,4).equals(pTarget)){
											stringTar[i]=stringArr[i]+"$v" + field099;
											//field099=""; //restore field099 value to empty.
											
										}
										
									//if(stringArr[i].equals("\r\n"))
									if(stringArr[i].substring(1,4).equals("LDR"))
										{
											field099=""; 
										}
										
										//if(stringArr[i].substring(0,2).equals("\r\n")){
										//if(stringArr[i].equals(System.getProperty("line.separator"))){	
									/**	if(stringArr[i].length()<1){
											field099="----------"; 
										}*/
										
										if(stringArr[i].substring(1,4).equals("001")){
												//System.out.println("001001001001001001001001001001001001001001001001001001001001");
												field001=stringArr[i].substring(6,stringArr[i].length());
												//System.out.println("field001:"+field001);
												Marc.add(field001);
										 
										}
									
									
									}
									
							/**	if (field001!=""){
									Marc.add(field001);
								}*/
									

					
					//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

					}
					
					//System.out.println(Arrays.toString(Marc.toArray()));
					
				
				//String[] MarctoArray = Marc.toArray(new String[0]); //we have to convert list Marc to array before export them to a file.
			
			//System.out.println(Arrays.toString(stringArr));
			
						FileWriter fw = new FileWriter(pfileName); //write array to a file named file.dat
						for (int i = 0; i < stringTar.length; i++) {
						  //fw.write(stringArr[i] + "\n");
						  fw.write(stringTar[i] + "\r\n");
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
	  	return "successfull";
   }
}