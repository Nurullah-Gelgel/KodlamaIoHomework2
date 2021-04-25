package KodlamaIo;

public class Main {

    public static void main(String[] args) {

        HomePage homePage = new HomePage();

        homePage.SıgnUp();
        homePage.SignIn();

    	Courses course1 = new Courses("Java Yazılım Geliştirici Yetiştirme Kampı","2 ay sürecek.","Engin Demiroğ");
        Courses course2 = new Courses("C# Yazılım Geliştirici Yetiştirme Kampı","2 ay sürecek.","Engin Demiroğ");
        Courses course3 = new Courses("Programlamaya Giriş için Temel Kurs","Phyton Java C# gibi dillerin temel mantığı anlaşılır.","Engin Demiroğ");



    	Courses[] courses = {course1,course2,course3};

        for (Courses course:courses) {

            System.out.println("Kurs Adı: " + course.courseName);
            System.out.println("Kurs Detayı: " + course.coursedetail);
            System.out.println("Eğitmen Adı: " + course.teacherName +"\n");


        }

        AccountSetting accountSetting =  new AccountSetting();

        accountSetting.AddCard();
        accountSetting.Address();
        accountSetting.Contact();
        accountSetting.EditProfile();
        accountSetting.ManageMembership();


    }
}
