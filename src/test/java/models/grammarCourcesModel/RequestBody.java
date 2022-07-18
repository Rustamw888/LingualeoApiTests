package models.grammarCourcesModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestBody {

	private String apiVersion;
	private Integer courseId;
	private String courseName;
	private List<IDsItem> iDs;

	public RequestBody() {
	}

	public RequestBody(String apiVersion, Integer courseId, String courseName, List<IDsItem> iDs) {
		this.apiVersion = apiVersion;
		this.courseId = courseId;
		this.courseName = courseName;
		this.iDs = iDs;
	}
}