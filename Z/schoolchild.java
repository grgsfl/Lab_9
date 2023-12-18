package Lab_9.Z;

import java.util.Scanner;

public class schoolchild extends learner{
    private String cls;
    public schoolchild(){
        super();
        cls ="7";
    }
    public schoolchild(String fio, int kol, String mesto, String cls){
        super(fio,kol,mesto);
        cls = cls;
    }

    public String getCls() {
        return cls;
    }

    public void setAutor(String cls) {
        cls = cls;
    }
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ф.И.О.: ");
        String fio = sc.next();
        setName(fio);
        System.out.println("Введите количество школьников: ");
        int kol = sc.nextInt();
        setCount(kol);
        System.out.println("Введите ряд/место: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("Введите класс");
        String cls = sc.next();
        setAutor(cls);
    }
    public String toString(){
        return ("\n\t"+"ФИО: "+getName() +"\n\t"+"Кол-во школьников: "+getCount()+"\n\t"+"Место: "+getLocation()+"\n\t"
                + "Класс: " + cls);
    }
}
