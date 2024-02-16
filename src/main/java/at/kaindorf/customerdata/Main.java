package at.kaindorf.customerdata;

import at.kaindorf.customerdata.pojos.DataHolder;
import at.kaindorf.customerdata.xml.XML_Access;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        DataHolder dataHolder = XML_Access.getTheInstance().loadCustomerFromXmlFile();
    }
}
