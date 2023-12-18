package Lab_9.Z;

public class learner {
    private String name;
    private int count;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String fio) {
        name = fio;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int kol) {
        count = kol;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String mesto) {
        location = mesto;
    }
    public learner(){
        name = "ФИО не указано";
        count = 0;
        location = "Без места";
    }
    public learner(String fio, int kol, String mesto) {
        name = fio;
        count = kol;
        location = mesto;
    }
}
