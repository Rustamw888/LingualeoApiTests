package models.activationModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestActivation {
	private JsonMember jsonMember;
	private String apiVersion;
	private Data data;
	private String trainingName;
	private String G;
	private List<IDsItem> iDs;
	private String Y;
	private String apiCall;
	private String promoCode;
}