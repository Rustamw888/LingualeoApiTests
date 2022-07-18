package models.thematicCoursesModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoursesItem {
	private Integer productId;
	private Integer campaignId;
	private Double discountPrice;
	private Integer counter;
	private String picture;
	private String url;
	private String name;
	private Object progress;
	private String currency;
	private Integer id;
	private Integer isPremium;
	private String nameLocal;
	private Integer paymentStatus;
	private Object basePrice;
}