package models.grammarCourcesModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentSystemsItem {
	private String name;
	private Integer id;
}