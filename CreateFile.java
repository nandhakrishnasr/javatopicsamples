package com.sample.crud;

import java.io.FileWriter; 
import java.io.IOException; 
class CreateFile 
{ 
 public static void main(String[] args) throws IOException 
 { 
     
     String str = "File Handling in Java using "+ 
             " FileWriter and FileReader"; 
       
     FileWriter fw=new FileWriter("D:\\Tracker\\output.txt"); 
  
     for (int i = 0; i < str.length(); i++) 
         fw.write(str.charAt(i)); 

     System.out.println("Writing successful"); 
       
     fw.close(); 
 } 
}