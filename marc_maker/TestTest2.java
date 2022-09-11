package com;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import org.apache.commons.lang.*;


public class TestTest2 {
    //public static void main(String [] args) {
public String cal(String filename, String pfilename){
    // The name of the file to open.

    // The name of the file to open.
    String fileName = filename;
	String pfileName = pfilename;
    String line = null;

    try {
			
				BufferedReader in = new BufferedReader(new FileReader(fileName));
				String str;

				//String content = readFile("test.txt", StandardCharsets.UTF_8);
				
				List<String> list = new ArrayList<String>();
				while((str = in.readLine()) != null){
					list.add(str);
				}
				
			//	for (String s : list) { System.out.println(s); } //print line by line
				

				String[] stringArr = list.toArray(new String[0]);
				
			//	String[] stringSplit=stringArr[0].split("");
				
	
				
				String marcLine="";
				
				String marcOneString="";
				
				String controlNumber=""; //the control nubmer in one marc record
				
				String controlContent=""; //the control content in one marc record
				String middleContent="";
				String tagContent="";
				String tagContentProcessed="";
				
				String tagNumber="";
				String tagLength="";
				String tagLocation="";
				
				String zero="0";
				
					List<String> listIntermediate = new ArrayList<String>();
					
					
				for (int i=0; i<stringArr.length; i++){	
					if (stringArr[i].length()!=0){
							if(stringArr[i].substring(1,4).equals("LDR")){
								listIntermediate.add(stringArr[i].substring(6,stringArr[i].length()));
								
							}
							else{

								
								tagContent=stringArr[i].substring(6,stringArr[i].length());
								tagContentProcessed=""+tagContent.replace("$","");
								
								tagContentProcessed=tagContentProcessed.replace("{dollar}","$");
								tagContentProcessed=tagContentProcessed.replace("{lcub}","{");
								tagContentProcessed=tagContentProcessed.replace("{rcub}","}");
								
								if (stringArr[i].substring(1,4).equals("001")||stringArr[i].substring(1,4).equals("002")||stringArr[i].substring(1,4).equals("003")||stringArr[i].substring(1,4).equals("004")||stringArr[i].substring(1,4).equals("005")||stringArr[i].substring(1,4).equals("006")||stringArr[i].substring(1,4).equals("007")||stringArr[i].substring(1,4).equals("008")){
									tagContentProcessed=tagContentProcessed.replace("\\"," ");
									
								}else
								{
									tagContentProcessed=tagContentProcessed.substring(0,3).replace("\\"," ")+tagContentProcessed.substring(3,tagContentProcessed.length());  //the reason is to do from 0 to 3, because first char is rs record seperator.
								}
								
								
								tagNumber=stringArr[i].substring(1,4);
								tagLength=String.valueOf(tagContentProcessed.length());
								tagLength=StringUtils.repeat("0",4-tagLength.length())+tagLength;    //Commons Lang StringUtils.repeat() in apache api    org.apache.commons.lang.*
								
								
								
								middleContent=controlContent; //middleContent equal to th controlContent before changing
								tagLocation=String.valueOf(middleContent.length());
								tagLocation=StringUtils.repeat("0", 5-tagLocation.length())+tagLocation; //Commons Lang StringUtils.repeat() in apache api  org.apache.commons.lang.*
								
								
								controlContent=controlContent+tagContentProcessed;
								controlNumber=controlNumber+tagNumber+tagLength+tagLocation;
								
								//controlNumber
								
								System.out.println("tagNumber:"+tagNumber); //length is 3
								System.out.println("tagLength:"+tagLength);// length is 4
								System.out.println("tagLocation:"+tagLocation);// length is 5
							
							}

					}else{
						System.out.println("controlNumber:"+controlNumber);
						System.out.println("controlContent:"+controlContent);
						
						listIntermediate.add(controlNumber);
						listIntermediate.add(controlContent);
						listIntermediate.add("");
						middleContent="";
						controlContent="";
						controlNumber="";
						
						
						
					}
				
				}
				
				
					System.out.println(Arrays.toString(listIntermediate.toArray()));
					
					
				/**for (int i=0; i<stringSplit.length; i++){
					String leader="=LDR  "+stringSplit[i].substring(0,24);
					System.out.println("Leader:"+leader);
					int RSoccurance=StringUtils.countMatches(stringSplit[i], "");
					System.out.println("RS occurance:"+StringUtils.countMatches(stringSplit[i], "")); //StringUtils function need common lang apache api.
					String controlNumber=stringSplit[i].substring(24,stringSplit[i].indexOf(""));
					System.out.println("Control number:"+controlNumber);
					
					String RSnoneIndex=stringSplit[i].substring(stringSplit[i].indexOf(""),stringSplit[i].length());
					System.out.println("RS non index part:"+RSnoneIndex);
					
					listTarget.add(leader); //LDR part
					
					for(int j=0;j<RSoccurance;j++){
						
						String RSindex=stringSplit[i].substring(24+12*j,24+12*(j+1));
						
						System.out.println("RSindex["+j+"]:"+RSindex);
						String marcTag=RSindex.substring(0,3);
						int marcTagint=Integer.parseInt(marcTag);
						int marcLength=Integer.parseInt(RSindex.substring(3,7));
						int marcLocation=Integer.parseInt(RSindex.substring(7,12));
						System.out.println("marcTag:"+marcTag);
						System.out.println("marcTagint:"+marcTagint);
						System.out.print("marcLength:");
						System.out.println(marcLength);
						System.out.print("marcLocation:");
						System.out.println(marcLocation);
						if (marcTagint==1||marcTagint==2||marcTagint==3||marcTagint==4||marcTagint==5||marcTagint==6||marcTagint==7||marcTagint==8||marcTagint==9){
							System.out.println("<=8");
							marcLine=RSnoneIndex.substring(marcLocation+1,marcLocation+marcLength);
								marcLine=marcLine.replace(" ","\\");  //double backslash, one of them is escape sign
							
						}else
						{
							System.out.println(">8");
							marcLine=RSnoneIndex.substring(marcLocation+1,marcLocation+marcLength);
							marcLine=marcLine.replace("{","{lcub}");
							marcLine=marcLine.replace("}","{rcub}");
							marcLine=marcLine.replace("\\","{bsol}");
							
							marcLine=marcLine.replace("$","{dollar}"); //replace real $ context with {dollar};
							
							marcLine=marcLine.substring(0,2).replace(" ","\\")+marcLine.substring(2,marcLine.length());
							
							
							
							marcLine=marcLine.replace("","$"); //relace all subfield separator with $ sign					}
						}
					
						System.out.println("marcLine:"+"="+marcTag+"  "+marcLine);
						listTarget.add("="+marcTag+"  "+marcLine);
						
						
					}
					listTarget.add("");
				}*/

				
				List<String> Marc = new ArrayList<String>();

					//***********************************************************************
					String[] listIntermediatetoArray = listIntermediate.toArray(new String[0]); //we have to convert list Marc to array before export them to a file.
						FileWriter fw = new FileWriter(pfileName); //write array to a file named file.dat
						for (int i = 0; i < listIntermediatetoArray.length; i++) {
						  //fw.write(stringArr[i] + "\n");
						  fw.write(listIntermediatetoArray[i] + ""); //don't add /r/n at the end of fw.write.
						}
						fw.close();
			       in.close();
					//***********************************************************************
					
					

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