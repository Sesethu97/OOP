package Oop.exercise;

public class Boys {
    private String fullname;
    private String gender;
    private int age;
    private int height;

    public Boys(String fullname, String gender, int age, int height) {
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString(){
        return "'" +fullname +"' is a " +gender+ "and is "+height+ "cm tall. ";
    }
}
