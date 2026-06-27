package com.saksham;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        PaymentService service = new PaymentService();
        OrderService order = new OrderService(service);
        order.placeOrder();

//        Student s1 = new Student();
//        Class<Student> c1 = Student.class; // stores metadata of class Student.

        //Class hai jisk naam bhi Class hai -> store metadata of class.
        /*
        c1 store :
            class Name - Student
            field - name,age
            Constructor -> Student()
            Methos -> getAttendence(), print()
            Annotations
        */
    }
}


//class Student{
//    private String name;
//    private int age;
//    int roll;
//
//    public Student(){
//    }
//
//    public void getAttendence(){
//    }
//
//    public void print(){
//    }
//}




