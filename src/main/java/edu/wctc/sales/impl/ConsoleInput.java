package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;

import edu.wctc.sales.isales.SalesInput;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConsoleInput implements SalesInput {
    private Scanner scanner = new Scanner(System.in);


    @Override
    public List<Sale> getSales() {
        String line = "";
        List<Sale> salesList = new ArrayList<>();

        while(!line.equalsIgnoreCase("q")) {
            System.out.println("Enter sales information as the following: Your Name, Country, Order Cost, Tax; Enter q to quit");
            line = scanner.nextLine();

            String array[] = line.split(",");
            Sale sale = new Sale(array);
            salesList.add(sale);
        }

        return salesList;
    }
}
