package com.stx.domain;

import java.util.List;

/**
 * 教师表
 *
 * @author ChengXing
 * @Date Created in 19:56 2020/12/21
 * @Description stx
 */
public class Employee {
    private Integer id;
    private String name;
    private String sex;
    private String nation;
    private Integer age;
    private String position;
    private String avatar;
    private String department;
    private String culturalProgram;
    private String jobTitle;
    private List<Bonus> bonus;
    private List<Fine> fines;

    public Employee() {
    }

    public Employee(String name, String sex, String nation, Integer age, String position, String avatar, String department, String culturalProgram, String jobTitle) {
        this.name = name;
        this.sex = sex;
        this.nation = nation;
        this.age = age;
        this.position = position;
        this.avatar = avatar;
        this.department = department;
        this.culturalProgram = culturalProgram;
        this.jobTitle = jobTitle;
    }

    public Employee(Integer id, String name, String sex, String nation, Integer age, String position, String avatar, String department, String culturalProgram, String jobTitle) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.nation = nation;
        this.age = age;
        this.position = position;
        this.avatar = avatar;
        this.department = department;
        this.culturalProgram = culturalProgram;
        this.jobTitle = jobTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCulturalProgram() {
        return culturalProgram;
    }

    public void setCulturalProgram(String culturalProgram) {
        this.culturalProgram = culturalProgram;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }

    public List<Bonus> getBonus() {
        return bonus;
    }

    public void setBonus(List<Bonus> bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", avatar='" + avatar + '\'' +
                ", department='" + department + '\'' +
                ", culturalProgram='" + culturalProgram + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", bonus=" + bonus +
                ", fines=" + fines +
                '}';
    }
}
