package models.grammarCourcesModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryItem {
	private String name;
	private Integer id;
	private List<ModulesItem> modules;
}