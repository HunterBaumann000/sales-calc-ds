package edu.wctc.sales.isales;

import edu.wctc.sales.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
