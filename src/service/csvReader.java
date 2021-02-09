package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class csvReader {
    public String urlFile = "";
    protected String separator = ";";

    
    public csvReader() {}
    
    public void read(String urlFile) {
    	/*
        File file = new File(urlFile);
        Scanner sc;

        try {
            sc = new Scanner(file);
            sc.useDelimiter(";");
            while(sc.hasNextLine()) {
            	System.out.print(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
    	
    	BufferedReader reader;
    	
        try {
            reader = new BufferedReader(new FileReader(urlFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

