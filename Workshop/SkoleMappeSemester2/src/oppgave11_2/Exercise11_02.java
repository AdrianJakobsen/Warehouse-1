//import java.util.*;
//
//public class Exercise11_02 {
//  public static void main(String[] args) {
//    // Opprett objekter av ulike typer fra arvehierarkiet
//  }
//}
//
//class Person {
//  private String name;
//  private String address;
//  private String phoneNumber;
//  private String email;
//  
//  // lag constructor som tar i mot data for alle datamedlemmer
//
//  // Endre toString slik at den skriver ut alle data fra objektet
//  @Override
//  public String toString() {
//    return "Person";
//  }
//}
//
//class Student extends Person {
//  public static final int FRESHMAN = 1;
//  public static final int SOPHOMORE = 2;
//  public static final int JUNIOR = 3;
//  public static final int SENIOR = 4;
//
//  private int status;
//  
//  //lag constructor som tar i mot data for alle datamedlemmer
//
//  //Endre toString slik at den skriver ut alle data fra objektet
//  @Override
//  public String toString() {
//    return "Student";
//  }
//}
//
//class Employee extends Person {
//  private String office;
//  private int salary;
//  private MyDate dateHired;
//  
//  //lag constructor som tar i mot data for alle datamedlemmer
//  
//  //Endre toString slik at den skriver ut alle data fra objektet
//  @Override
//  public String toString() {
//    return "Employee";
//  }
//}
//
//class Faculty extends Employee {
//  public static final int LECTURER = 1;
//  public static final int ASSISTANT_PROFESSOR = 2;
//  public static final int ASSOCIATE_PROFESSOR = 3;
//  public static final int PROFESSOR = 4;
//
//  private String officeHours;
//  private int rank;
//  
//  //lag constructor som tar i mot data for alle datamedlemmer
//  
//  //Endre toString slik at den skriver ut alle data fra objektet
//  @Override
//  public String toString() {
//    return "Faculty";
//  }
//}
//
//class Staff extends Employee {
//  private String title;
//  
//  //lag constructor som tar i mot data for alle datamedlemmer
//  
//  //Endre toString slik at den skriver ut alle data fra objektet
//  @Override
//  public String toString() {
//    return "Staff's title is " + title;
//  }
//}
