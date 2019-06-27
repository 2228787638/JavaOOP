package model;

/**
 * @author yif
 */
public class Student {
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别(0表示男，1表示女)
     */
    private String sex;
    /**
     * 学号
     */
    private long studentNumber;

    public Student(String name,int age,String sex,long studentNumber){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.studentNumber=studentNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString(){
        return "学生姓名："+this.name+" 年龄："+this.age+" 性别："+this.sex+" 学号："+this.studentNumber;
    }
}
