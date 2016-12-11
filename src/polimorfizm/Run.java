package polimorfizm;


/**
 * Created by Lida on 11.12.2016.
 */
public class Run {
    public static void main(String[] args) {
        Student student = new MA_student("Philosophy","Vasia",22,"philosoph",1,"FGN", 99);

        System.out.println("\n Student student = new MA_student \n");
        student.eat();
        student.haveFun();

        MA_student student1 = new MA_student("Litrball", "Petrovych", 35, "male", 2, "FGN", 61);
        System.out.println("\nMA_student student1 = new MA_student\n");
        student1.sleep();
        student1.haveFun();
        student1.eat();
        student1.drownInNostalgie();

        Student student2 = new Student("Katia",21, "female", 1, "FGN", 91 );
        System.out.println("\n Student student2 = new Student\n");
        student2.eat();
        student2.haveFun();
        student2.washSkovorodu();

        Human human = new Human("Ann",18,"female");

        System.out.println("\nHuman human = new Human\n");
        human.haveFun();
        human.eat();
        System.out.println("\nHuman human1 = new Student\n");

        Human human1 = new Student("Maria", 34,"female",2,"FI",87 );
        human1.haveFun();
        human1.eat();



        //Student studick = (Student) new Human("Moisha",43, "male"); classCastEx!
       // studick.haveFun();
    }

}