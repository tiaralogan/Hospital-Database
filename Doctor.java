import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*;

public class Doctor {
  
  public String firstName;
  public String lastName;
  public int id;
  public String specialty;
  
  public Doctor (String docFirstName, String docLastName, int docID, String docSpecialty) {
    firstName = docFirstName;
    lastName = docLastName;
    id = docID;
    specialty = docSpecialty;
  }
 
  public String toString(){
    return (firstName + ", " + lastName + ", " + id + ", " + specialty);
  }
}