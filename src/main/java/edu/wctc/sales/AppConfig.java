package edu.wctc.sales;

import edu.wctc.sales.isales.*;
import edu.wctc.sales.impl.*;
import edu.wctc.sales.impl.shippingOptions.FreeShippingOverX;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.sales")
public class AppConfig {


    @Bean
    public SalesInput salesInput() {
        //return new ConsoleInput();
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new DetailReport();
        //return new SummaryReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        //return new FreeShipping();
        //return new FlatRateShipping();
        return new FreeShippingOverX();

    }
}
