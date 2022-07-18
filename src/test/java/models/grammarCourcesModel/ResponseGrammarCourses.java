package models.grammarCourcesModel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseGrammarCourses {
	private Integer totalUsers;
	private Object productId;
	private Integer level;
	private Object campaignId;
	private List<PaymentSystemsItem> paymentSystems;
	private String description;
	private String picture;
	private String apiVersion;
	private Object minPrice;
	private Object upsaleId;
	private String name;
	private Object progress;
	private String currency;
	private Integer id;
	private Integer isPremium;
	private List<CategoryItem> category;
	private String nameLocal;
	private Integer paymentStatus;
	private String status;
}