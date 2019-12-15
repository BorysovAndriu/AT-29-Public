package HomeWork_5;

import java.util.*;

public class Collection {


    public static void main(String[] args) {

        //HW №1
        Group group = new Group("QA School");
        Group.showList(group.getListCourses());
        group = new Group("PM School");
        Group.showList(group.getListCourses());
        group = new Group("Code School");
        Group.showList(group.getListCourses());

        //HW №2
        Teacher teatcer = new Teacher( new String[]{"ВОЛОДИМИР КРОХМАЛЮК","ВОЛОДИМИР РАЧУК","ОЛЕГ МАКСИМУК","ОЛЕСЯ ПАСЛАВСЬКА",
                "ТАРАС ЛИТВИН","ТАРАС БУНИК","СОФІЯ ЗАСАДНА","ВОЛОДИМИР КРОХМАЛЮК","ТАРАС ЛИТВИН","ОЛЕГ МАКСИМУК"});
        HashSet<Teacher> teachers = new HashSet();
        teachers.add(teatcer);
        System.out.println(teachers);

        //HW №3
        News news = new News();
        news.showNews();

    }

    public static class Group {

        private String nameGroup;

        public Group(String nameGroup) {
            this.nameGroup = nameGroup;
        }

        String[] codeSchool = {"FRONT-END БАЗОВИЙ","TRUE DEVOPS","JAVA ADVANCED",
                "БАЗОВИЙ КУРС C#","JРОЗРОБКА ПІД ANDROID","JРОЗРОБКА ПІД IOS","PYTHON"};

        String[] qaSchool = {"ТЕСТУВАННЯ ПРОГРАМНОГО ЗАБЕЗПЕЧЕННЯ", "АВТОМАТИЗОВАНЕ ТЕСТУВАННЯ",
                "ТРЕНІНГ ТА ЗДАЧА ЕКЗАМЕНУ ISTQB CTFL", "ЗДАЧА ЕКЗАМЕНУ ISTQB CTFL"};

        String[] pmSchool = {"PRODUCT MANAGEMENT","ОСНОВИ УПРАВЛІННЯ ПРОЕКТАМИ В ІТ","PM EXCELLENCE"};

        public ArrayList getListCourses(){
            ArrayList arrayList = new ArrayList<String>();

            if(nameGroup.equals("Code School")){
                for(int i = 0; i< codeSchool.length; i++){
                    arrayList.add(i, codeSchool[i]);
                }
            } else if (nameGroup.equals("QA School")){
                for(int i = 0; i< qaSchool.length; i++){
                    arrayList.add(i, qaSchool[i]);
                }
            } else if(nameGroup.equals("PM School")){
                for(int i = 0; i< pmSchool.length; i++){
                    arrayList.add(i, pmSchool[i]);
                }
            } else {
                System.out.println("Error - name Group is not correct");
            }
            return arrayList;
        }

        public static void showList(java.util.Collection array){
            for(Object name : array){
                System.out.println("Name = " + name);
            }
        }
    }

    public static class Teacher {

        String[] nameTeachersList;

        @Override
        public String toString() {
            return "Teacher{" +
                    "nameTeachersList=" + Arrays.toString(nameTeachersList) +
                    '}';
        }

        public Teacher(String[] nameTeachersList) {
            this.nameTeachersList = nameTeachersList;
        }
    }

    public  static class News {

        public void showNews(){
            HashMap<String,String> news = new HashMap<>();
            news.put("LITS провів воркшоп з 3D-візуалізації для вчителів львівських шкіл","18/12/2017");
            news.put("LITS серед партнерів проекту «Lviv MUN»","12/10/2017");
            news.put("LITS долучився до освітньої програми PRYZM","04/10/2017");

            for(Map.Entry<String,String> anons : news.entrySet()){
                System.out.println(anons.getKey() + " - " + anons.getValue());
            }
        }




    }
}
