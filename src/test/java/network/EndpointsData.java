package network;

public enum EndpointsData {

    GET_THEMATIC_COURSES("/GetCourses"),
    GET_GRAMMAR_COURSES("/GetCourseModules"),
    GET_JUNGLE_CATEGORIES("/GetJungleCategories"),
    GET_JUNGLE_SEARCH("/GetJungleSearch"),
    GET_PROMO("/ProcessTraining");

    public final String title;

    EndpointsData(String title) {
        this.title = title;
    }
}
