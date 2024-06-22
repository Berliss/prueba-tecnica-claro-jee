package com.bersoft.crudapplication.client.soap;


import com.bersoft.crudapplication.client.soap.generated.NumberConversion;
import com.bersoft.crudapplication.client.soap.generated.NumberConversionSoapType;

import java.math.BigDecimal;
public class NumbersClient {
    private final NumberConversionSoapType service;

    public NumbersClient() {
        this.service = new NumberConversion().getNumberConversionSoap();
    }

    public String numberToDollars(Double number){
        return service.numberToDollars(BigDecimal.valueOf(number));
    }

}
