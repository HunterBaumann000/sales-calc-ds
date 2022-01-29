package edu.wctc.sales.isales;

import edu.wctc.sales.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> saleList);
}
