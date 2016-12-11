package polimorfizm;

/**
 * Created by Lida on 11.12.2016.
 */
public class MA_student extends Student {
    private String BA_Degree;

    public MA_student(String BA_Degree,String name, int age, String gander, int course, String faculty, int GPA) {
        super(name,age, gander, course, faculty,GPA);
        this.BA_Degree = BA_Degree;
    }


    public void sleep() {
        System.out.println("I find a bed I will sleep till noon");
    }

    @Override
    public void eat() {
        System.out.println("Crumbs with cockroaches are much more delicious");
    }

    @Override
    public void haveFun() {
        System.out.println("Korablyk - this is for kids...");
    }
    public void drownInNostalgie(){
        System.out.println("Mohulianka is not the same any more....");
    }
}
