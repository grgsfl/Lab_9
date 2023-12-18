package Lab_9.Z;

import java.util.Scanner;

public class student extends learner{
    private String kurs;
    public student(){
        super();
        kurs = "1";
    }
    public student(String fio, int kol, String mesto, String kurs){
        super(fio,kol,mesto);
        kurs = kurs;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        kurs = kurs;
    }
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ф.И.О.: ");
        String fio = sc.next();
        setName(fio);
        System.out.println("Введите количество студентов: ");
        int kol = sc.nextInt();
        setCount(kol);
        System.out.println("Введите ряд/место: ");
        String mesto = sc.next();
        setLocation(mesto);
        System.out.println("Введите курс: ");
        String kurs = sc.next();
        setKurs(kurs);
    }
    public String toString(){
        return ("\n\t"+"ФИО: "+getName() +"\n\t"+"Кол-во студентов: "+getCount()+"\n\t"+"Ряд/место: "+getLocation()+"\n\t"
                + "Курс: " + kurs);
    }
}
