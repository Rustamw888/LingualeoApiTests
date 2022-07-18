package models.grammarCourcesModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModulesItem {
	private String name;
	private Integer progress;
	private Integer counter;
	private Integer id;
	private Integer isFinished;
	private String picture;
	private String url;
}