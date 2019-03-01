package ua.lviv.IoT.fish;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class FishProductsWriter  {
  public void writeToFile(List<FishProducts> fishList) throws IOException {
    
   File myFile = new File("fishList.txt");
    try(FileOutputStream fos = new FileOutputStream(myFile);
    OutputStreamWriter osw = new OutputStreamWriter(fos);
    BufferedWriter bufferedWriter = new BufferedWriter(osw);){
    	
    	bufferedWriter.write(fishList.get(0).getHeaders());
    	bufferedWriter.newLine();
        
    	
    	for (int i = 0;i < fishList.size();i++) {
      
      bufferedWriter.write(fishList.get(i).toCSv());
      bufferedWriter.newLine();
    }
    } 
    	
    
   
    
  }

}
