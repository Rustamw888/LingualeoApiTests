package models.searchModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataItem {
	private Integer bookmarkStatus;
	private Integer pages;
	private Integer created;
	private Integer format;
	private String name;
	private Integer rating;
	private Integer id;
	private String pic;
	private String url;
	private Integer learningStatus;
}