package models.searchModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseSearchModel {
	private String apiVersion;
	private List<DataItem> data;
	private String offsetId;
	private String status;
}