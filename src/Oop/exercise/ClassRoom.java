package Oop.exercise;

public class ClassRoom {
    private String fullname;
    private String email;
    private String gender;
    private int age;

    private int grade;
    public ClassRoom(String fullname, String email, char gender, int age, int grade) {
        this.fullname = fullname;
        this.email = email;
        this.gender = String.valueOf(gender);
        this.age = age;
        this.grade = grade;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String name) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

