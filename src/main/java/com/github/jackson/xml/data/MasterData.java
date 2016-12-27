package com.github.jackson.xml.data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "masterData")
public class MasterData {
    public Customer customer;
}
