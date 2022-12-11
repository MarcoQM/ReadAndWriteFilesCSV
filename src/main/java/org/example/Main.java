package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {

        String archCSV = "C:\\Users\\mquin\\Downloads\\datoscsv.csv";
        CSVReader csvReader = new CSVReader(new FileReader(archCSV), ';');
        String[] fila = null;
        while((fila = csvReader.readNext()) != null) {
            System.out.println(fila[0]);
        }

        csvReader.close();

    }

}

