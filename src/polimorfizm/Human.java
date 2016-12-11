package polimorfizm;

/**
 * Created by Lida on 11.12.2016.
 */
public class Human {
    private String name;
    private int age;
    private String gander;


    public Human(String name, int age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    public void eat(){
        System.out.println("Mom prepare me meal. I will eat until crack :)");
    }
    private static void sleep(){
        System.out.println("Mom prepare my bed. I will sleep till noon ");

    }
    public void haveFun(){
        System.out.println("Party hard!!");
    }
}
