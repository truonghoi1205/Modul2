package case_study.customer;

import javax.xml.namespace.QName;

public class Customer {
    private String name;
    private String gender;
    private int age;
    private int phoneNumber;
    private String customerCode;


    public Customer(String name, String gender, int age, int phoneNumber, String customerCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.customerCode = customerCode;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return String.format("Customer name = '%s', gender = '%s', age = %d, phoneNumber = %d, customerCode = '%s'", name, gender, age, phoneNumber, customerCode);
    }
}
