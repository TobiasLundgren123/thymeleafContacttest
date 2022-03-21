package se.lexicon.thymeleafcontacttest.model;

public class Contact {

    private String name;
    private int number;
    private String info;

    public Contact(String name, int number, String info) {
        this.name = name;
        this.number = number;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", info='" + info + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
