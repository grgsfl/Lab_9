package Lab_9.Z;

import java.util.ArrayList;

public class conference {
    private ArrayList<learner> maslearn = new ArrayList<learner>();
    public void addlearn(learner m){
        maslearn.add(m);
    }
    public Boolean findlearn(learner m){
        return maslearn.contains(m);
    }
    public conference(){
    }
    public conference(ArrayList<learner> n){
        maslearn=n;
    }
    public void printlearn(){
        System.out.println("В конференции: ");
        for(learner p:maslearn){
            System.out.println("\t"+p.toString());
        }
        printCount();
    }
    public void printCount(){
        int b = 0;
        int m = 0;
        for(learner p:maslearn){
            if(p instanceof schoolchild){
                b+=1;
            } else if (p instanceof student) {
                m+=1;
            }
        }
        System.out.println("В конференции: "+b+" школьников и "+m+" студентов");
    }
}
