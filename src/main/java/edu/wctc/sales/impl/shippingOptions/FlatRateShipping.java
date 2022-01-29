package edu.wctc.sales.impl.shippingOptions;

import edu.wctc.sales.Sale;
import edu.wctc.sales.isales.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        switch (sale.Country) {
            case "United States":
                sale.shipping = 5.99;
                break;
            case "Japan":
                sale.shipping = 14.50;
                break;
            case "India":
                sale.shipping = 11.79;
                break;
            case "Scotland":
                sale.shipping = 7.54;
                break;
            case "South Korea":
                sale.shipping = 8.19;
                break;
            default: sale.shipping = 0.00;
        }
    }
}
