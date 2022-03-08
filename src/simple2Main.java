package tr.edu.maltepe.oop
public class simple2Main {

    public static void main(String[] args){

        Professor p1;
        Professor p2;

        p1 = new Professor(name: "ensar gül");
        p1.teaches();

        p2 = new Professor(name: "raif hoca");
        p2.teaches();

    }
}
