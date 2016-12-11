package polimorfizm;

/**
 * Created by Lida on 11.12.2016.
 */
public class Student extends Human {
    private int course;
    private String faculty;
    private int GPA;

    protected Student(String name, int age, String gander, int course, String faculty, int GPA) {
        super(name, age, gander);
        this.course = course;
        this.faculty = faculty;
        this.GPA = GPA;
    }
    public Student getStudent(String name, int age, String gander, int course, String faculty, int GPA){
        Student student = new Student(name,age, gander,course,faculty,GPA);
        return student;
    }
    @Override
    public void eat(){
        System.out.println("saying \" dear students, don't pick up crumb, don't infuriate cockroaches \" is not funny anymore ");
    }

     private void sleep(){
        System.out.println("Library is the best place for resting! Except classes of course ");
    }

    @Override
    public void haveFun() {
        System.out.println("Wow!! TSR!! Korablyk!!");
    }
    public void washSkovorodu(){
        System.out.println("I hate pigeons!! Damn birds!");
    }
}
