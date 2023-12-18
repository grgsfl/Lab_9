package Lab_9.Z;

public class Main {
    public static void main(String[] args){
        conference conf = new conference();
        student m1 = new student("Уваровский Геннадий Дмитриевич",1,"B1","2");
        System.out.println(m1.toString());
        schoolchild b1 = new schoolchild("Кампеев Владимир Фёдорович",1,"B2","8");
        System.out.println(b1.toString());
        conf.addlearn(m1);
        conf.addlearn(b1);
        conf.printlearn();
    }
}
