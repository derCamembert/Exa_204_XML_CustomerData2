package at.kaindorf.customerdata.pojos;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Country {
    private Long countryId;
    private String countryName;
    private String countryCode;

    @XmlElementWrapper(name = "Cities")
        @XmlElement(name = "City")
    private List<City> cities;

}