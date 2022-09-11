package com;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class TestTest{
	
	public String cal(String filename, String pfilename){

    // The name of the file to open.
    //String fileName = "C:/ApacheTomcat9/customer_data/temp.txt";
String fileName = filename;
String pfileName = pfilename;
    // This will reference one line at a time
    String line = null;

	
    try {
        // FileReader reads text files in the default encoding.
       // FileReader fileReader = 
         //   new FileReader(fileName);
			
				BufferedReader in = new BufferedReader(new FileReader(fileName));
				String str;

				List<String> list = new ArrayList<String>();
				while((str = in.readLine()) != null){
					list.add(str);
				}
				
				 for (String s : list) { System.out.println(s); } //print line by line
				

				String[] stringArr = list.toArray(new String[0]);	
			
			System.out.println(Arrays.toString(stringArr));
			
						//FileWriter fw = new FileWriter("C:/ApacheTomcat9/customer_data/file.dat"); //write array to a file named file.dat
						FileWriter fw = new FileWriter(pfileName);
						for (int i = 0; i < stringArr.length; i++) {
						  fw.write(stringArr[i] + "\n");
						}
						fw.close();
			
			       in.close();

        // Always wrap FileReader in BufferedReader.
 /**       BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }   */
		BufferedReader in2 = new BufferedReader(new FileReader(fileName));
		        while((line = in2.readLine()) != null) {
				System.out.println(line);}

        // Always close files.
        //bufferedReader.close();         
		in2.close();
		
		
			
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
        // Or we could just do this: 
        // ex.printStackTrace();
      }
	  
	  return "successfull";
   }
   
}
