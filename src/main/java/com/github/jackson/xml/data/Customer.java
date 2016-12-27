package com.github.jackson.xml.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class Customer {
    @JacksonXmlElementWrapper(localName = "individualCustomer", useWrapping = false)
    public List<IndividualCustomer> individualCustomers;
}
