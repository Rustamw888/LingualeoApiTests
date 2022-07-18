package models.searchModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestSearchContent{
	private String categoryType;
	private String search;
	private String apiVersion;
	private Integer perPage;
	private Object level;
	private List<IDsItemSearch> iDs;
	private String categoryId;
	private Object offsetId;

}