package models.thematicCoursesModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseThematicCourses {
	private String apiVersion;
	private List<GrammarItem> grammar;
	private List<PaymentSystemsItem> paymentSystems;
	private List<ThematicItem> thematic;
	private String status;
}