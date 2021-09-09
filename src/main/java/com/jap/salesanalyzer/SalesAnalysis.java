package com.jap.salesanalyzer;

import java.text.ParseException;

/**
This class performs the file reading and stores the data in SalesRecord array
 */
public class SalesAnalysis {
    // This method reads a file and returns the count of lines in the file
    // omit any headers present in the file
     public int countOfSalesRecords(String fileName){
         int recordCount = -1;

        return recordCount;
    }

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readRecords(String fileName,int recordCount) throws ParseException {
        SalesRecord[] salesData = null;
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
