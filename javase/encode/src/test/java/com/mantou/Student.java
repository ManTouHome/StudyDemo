package com.mantou;

public class Student {
    private String stuName ;
    private Integer stuAge ;

    public Student() {
    }

    public Student(String stuName, Integer stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
