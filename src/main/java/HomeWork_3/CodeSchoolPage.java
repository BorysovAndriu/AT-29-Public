package HomeWork_3;

public class CodeSchoolPage extends LitsMainPage{

    private String pageTitle = "Code School";
    private int counterTeachers = 13;
    private String yourTeacherProfile = "Volodymyr Krokhmaluik";
    private String advancedJavaCourse = "Advanced Java";
    private String moreAboutAdvancedJavaCourse = "Details about Advanced Java ";

    @Override
    public void hoverOnCourseBlock() {
        clickOnButton(advancedJavaCourse);
    }

    @Override
    public void moreDetailsClick() {
        clickOnButton(moreAboutAdvancedJavaCourse);
    }

    public int getCounterTeachers(){
        return counterTeachers;
    }
    public String getNameTeachers(){
        return yourTeacherProfile;
    }
}
