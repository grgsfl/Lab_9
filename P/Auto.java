package Lab_9.P;

public class Auto {
    private String firm;
    private int maxSpeed;

    private int govNumber;
    public void setFirm(String firma){
        firm=firma;
    }
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    public void setGovNumber(int gosNomer){
        govNumber=gosNomer;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){
        return firm;
    }

    public int getGovNumber() {
        return govNumber;
    }

    public Auto(){
        firm="Без названия";
        maxSpeed=0;
        govNumber=0;
    }
    public Auto(String firma,int speed,int gosNomer){
        firm = firma;
        maxSpeed = speed;
        govNumber=gosNomer;
    }
}
