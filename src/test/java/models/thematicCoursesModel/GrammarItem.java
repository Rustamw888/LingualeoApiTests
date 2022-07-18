package models.thematicCoursesModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrammarItem {
	private String name;
	private Integer counter;
	private Integer id;
	private Object picture;
	private String url;
}