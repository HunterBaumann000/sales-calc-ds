package edu.wctc.sales.impl.shippingOptions;

import edu.wctc.sales.Sale;
import edu.wctc.sales.isales.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.shipping = 0.00;
    }
}
