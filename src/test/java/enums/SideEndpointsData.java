package enums;

public enum SideEndpointsData {

    BEGINNER("/ru/course/grammar#beginner"),
    MIDDLE("/ru/course/grammar#middle"),
    ADVANCED("/ru/course/grammar#advanced");

    public final String title;

    SideEndpointsData(String title) {
        this.title = title;
    }
}
