// 1. Abstract Class: Person

abstract class Person {

    private int personID;

    private String name;

    private int age;

    private String gender;

    private String phoneNumber;

    private String address;

    public Person() {

    }

    public Person(int personID, String name, int age, String gender, String phoneNumber, String address) {

        this.personID = personID;

        this.name = name;

        this.age = age;

        this.gender = gender;

        this.phoneNumber = phoneNumber;

        this.address = address;

    }

    public int getPersonID() {

        return personID;

    }

    public void setPersonID(int personID) {

        this.personID = personID;

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

        if (age > 0) {

            this.age = age;

        } else {

            System.out.println("Invalid age.");

        }

    }

    public String getGender() {

        return gender;

    }

    public void setGender(String gender) {

        this.gender = gender;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public abstract void performRole();

    public void displayPersonDetails() {

        System.out.println("Person ID: " + personID);

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Gender: " + gender);

        System.out.println("Phone Number: " + phoneNumber);

        System.out.println("Address: " + address);

    }

}
