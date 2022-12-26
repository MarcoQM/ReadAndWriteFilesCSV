package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        String archCSV = "C:\\Users\\mquin\\Downloads\\datoscsv.csv";
        CSVReader csvReader = new CSVReader(new FileReader(archCSV), ';');
        String[] fila = null;
        PrintWriter writer = new PrintWriter("C:\\Users\\mquin\\Downloads\\filename.txt", "UTF-8");
        while((fila = csvReader.readNext()) != null) {
            try {
                writer.println("(NULL, '"+fila[0]+"', '"+fila[1]+"', '"+fila[2]+"', '"+fila[3]+"', '"+fila[4]+"', '"+fila[5]+"', '"+fila[6]+"', '"+fila[7]+"', '"+fila[8]+"', '"+fila[9]+"', '"+fila[10]+"', current_timestamp(), current_timestamp()),");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        writer.close();
        csvReader.close();

                /*LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);*/

        /*String strDatewithTime = "2015-08-04T10:11:30";
        LocalDateTime aLDT = LocalDateTime.parse(strDatewithTime);
        System.out.println("Date with Time: " + aLDT);*/

        /*DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss.SSSSSS Z");
        ZonedDateTime.now().format(FORMATTER);

        String strDatewithTime = "2022-11-21T01:31:16.763652Z";
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(strDatewithTime);
        System.out.println(zonedDateTime);

        String foo = "soy un texto";
        String bar = foo. split(" ")[0];
        System.out.println(bar);*/
    }

}

