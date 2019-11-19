package HomeWork_3;

public class QaSchoolPage extends LitsMainPage{

    private String pageTitle = "QA School";
    private int coutteachers = 7;
    private String yourTeacherProfile = "Taras Lytvyn";
    private String automationTestingCourse = "Automation Testing";
    private String moreAboutAdvancedJavaCourse = "Details about Automation Testing ";

    @Override
    public void hoverOnCourseBlock() {
        clickOnButton(automationTestingCourse);
    }

    @Override
    public void moreDetailsClick() {
        clickOnButton(moreAboutAdvancedJavaCourse);
    }
}
