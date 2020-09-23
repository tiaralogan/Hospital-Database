import java.util.Scanner;
import java.util.ArrayList; 
import java.util.*;

public class Hospital{
  public static void main (String [] args){
    // class scanner
    Scanner scan = new Scanner(System.in);
    
    // Array Lists for doctors and patients
    ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    ArrayList<Patient> patients = new ArrayList<Patient>();
    
    // This is your job desription 
    System.out.println("You are the manager of a hospital.");
    System.out.println("Job Description:");
    System.out.println("1: Keep a log of all of the doctors");
    System.out.println("2: Keep a log of all of the patients");
    System.out.println("");
    
    
    // Menu of all database options
    System.out.println("Welcome to the Gentle Medic database");
    System.out.println("Options:");
    System.out.println("(ENTER 1): edit doctor/patient information");
    System.out.println("(ENTER 2): look at doctor database");
    System.out.println("(ENTER 3): look at patient database");
    System.out.println("(ENTER X): EXIT DATABASE");
    char database = scan.next().charAt(0);
    
    // Enterance into database
    Boolean inDatabase = false;
    if (database == 'X') {
      inDatabase = false;
    } else {
      inDatabase = true;
    }
    
    while (inDatabase == true) {
      char databaseON = database;
      
      
      switch (databaseON) {  
        
        case '1': 
          
           // Creating a doctor for the first pass
          if (doctors.size() == 0 ) {
          
          System.out.println("Create a Doctor: ");
          
          scan.nextLine();
          
          System.out.print("- Enter first name: ");
          String docFirstName = scan.nextLine();
          
          System.out.print("- Enter last name: ");
          String docLastName = scan.nextLine();
          
          System.out.print("- Enter ID: ");
          int docID = scan.nextInt();
          
          scan.nextLine();
          
          System.out.print("- Enter specialty: ");
          String docSpecialty = scan.nextLine();
          
          // Creating the doctor object
          doctors.add(new Doctor (docFirstName, docLastName, docID, docSpecialty));
          
          // Displaying the doctor objects 
          System.out.println("");
          for(int i = 0; i < doctors.size(); i++) 
          { 
            System.out.println(i + ". " + doctors.get(i)); 
          } 
          System.out.println("");
          
        } 
          // Letting the user choose to create a doctor or a patient
          else {

          scan.nextLine();
          
          System.out.print("Would you like to create a doctor or patient? (d/p): ");
          String docOrPatient = scan.nextLine();
          
          try {
            
            // Creating a doctor
            if (docOrPatient.charAt(0) == 'd'){
              
              System.out.println("Create a Doctor: ");
              
              System.out.print("- Enter first name: ");
              String docFirstName = scan.nextLine();
              
              System.out.print("- Enter last name: ");
              String docLastName = scan.nextLine();
              
              System.out.print("- Enter ID: ");
              int docID = scan.nextInt();
              
              scan.nextLine();
              
              System.out.print("- Enter specialty: ");
              String docSpecialty = scan.nextLine();
              
              // Creating the doctor object 
              doctors.add(new Doctor (docFirstName, docLastName, docID, docSpecialty));

              // Displaying the doctor objects
              System.out.println("");
              System.out.println("Doctors in Hospital: ");
              System.out.println("First Name | Last Name | Doctor ID | Specialty");
              System.out.println("");
              
              for(int i = 0; i < doctors.size(); i++) 
              { 
                System.out.println(i + ". " + doctors.get(i)); 
              } 
              System.out.println("");
              
            } else if (docOrPatient.charAt(0) == 'p'){
              
              // Creating a patient
              System.out.println("Create a Patient: ");
              
              System.out.print("- Enter first name: ");
              String patFirstName = scan.nextLine();
              
              System.out.print("- Enter last name: ");
              String patLastName = scan.nextLine();
              
              System.out.print("- Enter patient ID: ");
              int patID = scan.nextInt();
              
              scan.nextLine();
              
              // Displaying all doctor objects so the user can choose ------
              System.out.println("");
              System.out.println("Doctors in Hospital: ");
              System.out.println("First Name | Last Name | Doctor ID | Specialty");
              System.out.println("");
              
              for(int i = 0; i < doctors.size(); i++) 
              { 
                System.out.println(i + ". " + doctors.get(i)); 
              } 
              System.out.println("");
              // ------------------------
              
              // Questions/Answers for patient
              System.out.print("- Enter designated doctor (doctor ID): ");
              int docID = scan.nextInt();
              
              scan.nextLine();
              
              System.out.print("- Do they have pre-existing conditions (y/n): ");
              String answer = scan.nextLine();
              
              try {
                
                // Questions/Answers for patient
                if (answer.charAt(0) == 'y'){
                  
                  System.out.print("- Please enter condition: ");
                  String patCondition = scan.nextLine();      
                  
                  System.out.print("- Do they take medication (y/n):");
                  String meds = scan.nextLine();
                  
                  try {
                    
                    // Questions/Answers for patient
                    if (meds.charAt(0) == 'y'){
                      
                      System.out.print("- Please enter medication: ");
                      String patMedication = scan.nextLine();    
                      
                      System.out.print("- Please enter medication dosage (mL2): ");
                      double patDosage = scan.nextDouble();    
                      
                      // Creating patient object 
                      patients.add(new Patient (patFirstName, patLastName, patID, docID, patCondition, patMedication, patDosage));
                      System.out.println("");

                      if (patients.size() == 0) { 
                        System.out.println("");
                        System.out.println("No patients in the system");
                        System.out.println("");
                        
                      } else {
                        
                        // Displaying all patient objects 
                        System.out.println("");
                        System.out.println("Patients at facility: ");
                        System.out.println("First Name | Last Name | Patient ID | Designated Doc ID | Condition | Medication | Dosage");
                        
                        System.out.println("");
                      }
                      for(int i = 0; i < patients.size(); i++) 
                      { 
                        System.out.println(i + ". " + patients.get(i)); 
                      } 
                      System.out.println("");
                      
                    } else if (meds.charAt(0) == 'n') {
                      
                      // Creating patient object
                      patients.add(new Patient (patFirstName, patLastName, patID, docID, patCondition, "N/A", 0.0));
                      
                      System.out.println("");
                      System.out.println("Patients at facility: ");
                      System.out.println("First Name | Last Name | Patient ID | Designated Doc ID | Condition | Medication | Dosage");
                      System.out.println("");
                      
                      // Displaying all patient objects
                      for(int i = 0; i < patients.size(); i++) 
                      { 
                        System.out.println(i + ". " + patients.get(i)); 
                      } 
                      System.out.println("");
                      
                      
                    } else {
                      throw new WrongAnswer("" + meds.charAt(0));}
                  } catch (WrongAnswer wa) {
                    System.out.println("Not a valid option");
                    System.out.println("");
                  }  
                  
                } else if (answer.charAt(0) == 'n') {
                  
                  // Creating patient object
                  patients.add(new Patient (patFirstName, patLastName, patID, docID, "N/A", "N/A", 0.0));
                  
                  // Displaying all patient objects 
                  System.out.println("");
                  System.out.println("Patients at facility: ");        
                  System.out.println("First Name | Last Name | Patient ID | Designated Doc ID | Condition | Medication | Dosage");
                  System.out.println("");

                  for(int i = 0; i < patients.size(); i++) 
                  { 
                    System.out.println(i + ". " + patients.get(i)); 
                  } 
                  System.out.println("");
                  
                } else {
                  throw new WrongAnswer("" + answer.charAt(0));
                }
              } catch (WrongAnswer wa) {
                System.out.println("Not a valid option");
                System.out.println("");
              }  
            } else {
              throw new WrongAnswer("" + docOrPatient.charAt(0));}
          } catch (WrongAnswer wa) {
            System.out.println("Not a valid option");
            System.out.println("");
          }  
        }
        break;
        
        case '2':
          
          // Displaying all doctor objects 
          if (doctors.size() == 0) { 
          System.out.println("");
          System.out.println("No Doctors in the system");
          System.out.println("");
        } else {
          System.out.println("");
          System.out.println("Doctors in Hospital: ");
          System.out.println("First Name | Last Name | Doctor ID | Specialty");
          System.out.println("");
        }     
        for(int i = 0; i < doctors.size(); i++) 
        { 
          System.out.println(i + ". " + doctors.get(i)); 
        } 
        System.out.println("");
        break;
        
        case '3':
          
          // Displaying all patient objects
          if (patients.size() == 0) { 
          System.out.println("");
          System.out.println("No patients in the system");
          System.out.println("");    
        } else {
          System.out.println("");
          System.out.println("Patients at facility: ");
          System.out.println("First Name | Last Name | Patient ID | Designated Doc ID | Condition | Medication | Dosage");
          System.out.println("");
        }
        for(int i = 0; i < patients.size(); i++) 
        { 
          System.out.println(i + ". " + patients.get(i)); 
        } 
        System.out.println("");
        break;
        
        default:
          break;
      }
      
      // Menu
      System.out.println("Options:");
      System.out.println("(ENTER 1): edit doctor/patient information");
      System.out.println("(ENTER 2): look at doctor database");
      System.out.println("(ENTER 3): look at patient database");
      System.out.println("(ENTER X): EXIT DATABASE");
      database = scan.next().charAt(0);
      
      
      // Stay in or leave database
      if (database != 'X' ) {
        inDatabase = true;
      } else {
        inDatabase = false;
      }
    }
    scan.close(); 
    System.out.println("Database updated. Have a nice day.");
  } 
  
}