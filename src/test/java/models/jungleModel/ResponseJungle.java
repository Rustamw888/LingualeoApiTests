package models.jungleModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseJungle {
	private String apiVersion;
	private List<DataItem> data;
	private Object categoryName;
	private String status;
}