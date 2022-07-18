package models.thematicCoursesModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThematicItem {
	private List<CoursesItem> courses;
	private String name;
	private Integer counter;
	private Integer id;
	private Object picture;
	private String url;
}