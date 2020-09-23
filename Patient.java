import java.util.Scanner;

public class Patient{
  
  protected String firstName;
  protected String lastName;
  protected int id;
  protected int doctor;
  protected String condition;
  protected String medication;
  protected double dosage;

  public Patient (String patFirstName, String patLastName, int patID, int docID, String patCondition) {
    firstName = patFirstName;
    lastName = patLastName;
    id = patID;
    doctor = docID;
    condition = patCondition;
  }
  
    public Patient (String patFirstName, String patLastName, int patID, int docID, String patCondition, String patMedication, Double patDosage) {
    firstName = patFirstName;
    lastName = patLastName;
    id = patID;
    doctor = docID;
    condition = patCondition;
    medication = patMedication;
    dosage = patDosage;
  }
    
   public String toString() {
     return (firstName + ", " + lastName + ", " + id + ", " + doctor + ", " + condition + ", " + medication + ", " + dosage);
  }
  
}