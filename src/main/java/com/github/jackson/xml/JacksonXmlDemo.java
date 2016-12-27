package com.github.jackson.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.jackson.xml.data.Customer;
import com.github.jackson.xml.data.IndividualCustomer;
import com.github.jackson.xml.data.MasterData;

import static java.util.Arrays.asList;

public class JacksonXmlDemo {
    public static void main(String[] args) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();

        final IndividualCustomer value1 = new IndividualCustomer();
        final IndividualCustomer value2 = new IndividualCustomer();

        final MasterData masterData = new MasterData();
        final Customer customer = new Customer();
        customer.individualCustomers = asList(value1, value2);

        masterData.customer = customer;

        String xml = mapper.writeValueAsString(masterData);

        System.out.println(xml);
    }
}
