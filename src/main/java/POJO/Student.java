package POJO;


public class Student {

    private String ID;
    private String name;
    private String gender;
    private long mobile;

    public String getID() {
        return ID;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", Gender='" + gender + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Student(String ID, String name, String gender, long mobile) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
    }
}
