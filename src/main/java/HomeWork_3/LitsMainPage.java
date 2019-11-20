package HomeWork_3;

public class LitsMainPage {

    private String mainUrl="http://lits.ua/";
    private String logo = "Logo Lits";
    private String menuGroupDropDown = "Group Menu";
    private String codeSchoolGroup = "Code School Group";
    private String qaSchoolGroup = "QA School Group";

    public void clickOnButton(String nameButton){
        System.out.println("Click on " + nameButton);
    }
    public void openURL(){
        System.out.println("Open URL - " + mainUrl);
    }
    public void openMenuGroup(){
        clickOnButton(menuGroupDropDown);
    }
    public void clickLogo(){
        clickOnButton(logo);
    }
    public void chooseQaSchoolGroup(){
        clickOnButton(qaSchoolGroup);
    }
    public void chooseCodeSchoolGroup(){
        clickOnButton(codeSchoolGroup);
    }
    public boolean verifyInt(int s1, int s2){
        if(s1 == s2){
            System.out.println("Verify " + s2 + " - True");
            return true;
        }else {
            System.out.println("Verify"+ s2 +" - False");
            return false;
        }
    }
    public boolean verify(String s1, String s2){
        if(s1.equals(s2)){
            System.out.println("Verify " + s2 + " - True");
            return true;
        }else {
            System.out.println("Verify"+ s2 +" - False");
            return false;
        }
    }
    public void hoverOnCourseBlock(){
    }
    public void moreDetailsClick(){
    }
}
