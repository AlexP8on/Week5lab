package ie.atu;

public class Person{

    private String firstName;

    private String lastName;

    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;

    }
    private int age;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void display(){
        System.out.println("Details are " + firstName + ", " + "age"+ age);
    }

}