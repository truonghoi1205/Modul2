package ss8_clean_code.bai_tap;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double[] score;
    private String gender;

    public Student(int id, String name, double[] score, String gender) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getArray() {
        return score;
    }

    public void setArray(double[] array) {
        this.score = array;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double average() {
        double sum = 0;
        for (double Score : score) {
            sum += Score;
        }
        return sum / score.length;
    }

    @Override
    public String toString() {
        return "Student id = " + id + ", name= " + name + ", score = " + Arrays.toString(score) + ", gender = " + gender + ", average = " + average() ;
    }
}
