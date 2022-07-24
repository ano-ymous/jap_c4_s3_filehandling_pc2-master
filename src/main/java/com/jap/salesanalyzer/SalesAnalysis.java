package com.jap.salesanalyzer;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SalesAnalysis {
    // This method reads a file and returns the count of lines in the file
    // omit any headers present in the file
    //git trail
     public int countOfSalesRecords(String fileName){
         int recordCount = -1;
         File file;
         FileReader fileReader;
         BufferedReader bufferReader = null;
         try {
             file = new File(fileName);
             fileReader = new FileReader(file);
             bufferReader = new BufferedReader(fileReader);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
         try {
             while (bufferReader.readLine() != null) recordCount++;
         } catch (IOException e) {
             e.printStackTrace();
         }
         return recordCount;
    }

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readRecords(String fileName,int recordCount) throws ParseException{
        SalesRecord[] salesData = new SalesRecord[recordCount];
        File file;
        FileReader fileReader;
        BufferedReader bufferReader = null;
        try {
            file = new File(fileName);
            fileReader = new FileReader(file);
            bufferReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        int count = 0 ;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        try {
            bufferReader.skip(99);
            while ((line = bufferReader.readLine()) != null) {
                String[] arr = line.split(",");
                Date date;
                try {
                    date = formatter.parse(arr[0]);
                }
                catch (Exception e){
                    throw e;
                }
                salesData[count] = new SalesRecord(date,Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),arr[3],Double.parseDouble(arr[4]),Double.parseDouble(arr[5]),Integer.parseInt(arr[6]));
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return salesData;
     }

    public static void main(String[] args) throws ParseException {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        // read the file purchase_details.csv
        String fileName = "src/main/resources/purchase_details.csv";
        // the count of lines in the file
        int count = 0;
        //array to hold the sales records
        SalesRecord[] salesRecords = null;

       // display the records that have been read from the file
    }
}
