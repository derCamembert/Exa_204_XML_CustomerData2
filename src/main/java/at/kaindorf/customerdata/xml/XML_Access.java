package at.kaindorf.customerdata.xml;

import at.kaindorf.customerdata.pojos.DataHolder;
import jakarta.xml.bind.JAXB;

import java.io.InputStream;

public final class XML_Access {

    private static XML_Access theInstance;

    private XML_Access(){

    }

    public static XML_Access getTheInstance(){
        if (theInstance ==null){
            theInstance = new XML_Access();
        }
        return theInstance;
    }

    public DataHolder loadCustomerFromXmlFile(){
        InputStream is = getClass().getResourceAsStream("/customer_data.xml");
        if(is != null){
            DataHolder dataHolder = JAXB.unmarshal(is, DataHolder.class);
            System.out.println("Success!!! ##########");
            return dataHolder;
        } else {
            System.out.println("Reading xml-file failed");
            throw new RuntimeException("Reading xml-file failed");
        }

    }

}
