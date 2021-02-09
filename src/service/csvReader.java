package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class csvReader {
    public String urlFile = "";
    protected String line = "\n";
    protected String separator = ";";

    
    public void csvReader(String urlFile, String line, String separator) {
    	this.urlFile = urlFile;
    	this.line = line;
    	this.separator = separator;
    }
    
    public void read(String urlFile) {

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
    }
}

