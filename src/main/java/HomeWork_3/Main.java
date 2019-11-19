package HomeWork_3;

public class Main {

    public static void main(String[] args) {

        LitsMainPage litsMainPage = new LitsMainPage();
        litsMainPage.openURL();
        litsMainPage.openMenuGroup();
        litsMainPage.chooseCodeSchoolGroup();

        CodeSchoolPage codeSchoolPage = new CodeSchoolPage();
        codeSchoolPage.verify("Volodymyr Krokhmaluik", codeSchoolPage.getNameTeachers());
        codeSchoolPage.verifyInt(13, codeSchoolPage.getCounterTeachers());
        codeSchoolPage.hoverOnCourseBlock();
        codeSchoolPage.moreDetailsClick();

        JavaAdvancePage javaAdvancePage = new JavaAdvancePage();

    }
}
