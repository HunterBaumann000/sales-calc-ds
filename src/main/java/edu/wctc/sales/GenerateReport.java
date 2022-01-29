package edu.wctc.sales;

import edu.wctc.sales.isales.SalesInput;
import edu.wctc.sales.isales.SalesReport;
import edu.wctc.sales.isales.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenerateReport {
    private SalesInput in;
    private SalesReport report;
    private ShippingPolicy ship;

    @Autowired
    public GenerateReport(SalesInput in, SalesReport report, ShippingPolicy ship) {
        this.in = in;
        this.report = report;
        this.ship = ship;
    }

    public void generateReport(){
        List<Sale> allSales = in.getSales();
        for(Sale aSale : allSales)
            ship.applyShipping(aSale);
        report.generateReport(allSales);
    }
}
