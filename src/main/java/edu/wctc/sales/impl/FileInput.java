package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.isales.SalesInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<String> contents = readline();
        List<Sale> sales = new ArrayList<>();

        for(String row : contents) {
            String[] array = row.split(",");
            Sale sale = new Sale(array);
            sales.add(sale);
        }

        return sales;
    }

    public List<String> readline() {

        File data = new File("src/main/java/edu/wctc/sales/data.txt");

        BufferedReader in = null;
        String line = null;
        List<String> contents = new ArrayList<>();

        try {
            if (data.exists()) {
                in = new BufferedReader(new java.io.FileReader(data));

                while (true) {
                    line = in.readLine();
                    if (line == null) {
                        break;
                    }
                    contents.add(line);
                }
                in.close();
            } else {
                System.out.println("File not found - data.txt");
            }
        } catch (IOException ioe) {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe2) {
                System.out.println(ioe2.getMessage());
            }
            System.out.println(ioe.getMessage());
            System.exit(1);
        }

        return contents;
    }
}
