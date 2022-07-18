package models.jungleModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataItem {
	private Integer hasSubLevel;
	private Integer count;
	private String name;
	private Object description;
	private Integer id;
	private String pic;
	private String key;
	private String url;
}