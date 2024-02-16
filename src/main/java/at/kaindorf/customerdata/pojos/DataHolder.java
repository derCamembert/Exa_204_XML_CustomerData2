package at.kaindorf.customerdata.pojos;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@XmlRootElement(name = "dataHolder")
@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DataHolder {

    @XmlElementWrapper(name = "Countries")
            @XmlElement(name = "Country")
    List<Country> countryList;
}
