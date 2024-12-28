import java.util.Queue;
import java.util.LinkedList;   // LinkedList also implements Queue
import java.util.Set;
import java.util.HashSet;

class Clinic {

    private Queue<Patient> patientQueue;
    private Set<Patient> admittedPatients;
    private int dayCount;

    // Constructor to initialize the clinic with a queue and a set of admitted patients
    public Clinic() {
        this.patientQueue = new LinkedList<>();       // no patient in queue yet
        this.admittedPatients = new HashSet<>();      // no patient admitted yet
        this.dayCount = 1;    // Start with Day 1
    }


    // Admit a patient to the clinic
    public void admitPatient(Patient patient) {
        // Add the patient to the queue and print "Patient <name> admitted."

        if(!admittedPatientSet.contains(patient)){
            admittedPatients.add(patient);
            admittedPatientSet.add(patient);
            System.out.println("Patient" + patient.getName() +" is already admitted.");
        }
    }
    

    // Schedule appointments (maximum 3 patients per day)
    public void getSchedule() {
        // Assign appointment day to patients(eg. Day 1, Day 2, and so on) as per their order in queue. 
        // Give appointment to maximum 3 patients per day.
        // Once appointment is given to a patient, add that patient to `admittedPatients` set. Also, print "Scheduled <name> on <appointmentDay>"
        int max_appointments = 3;
        System.out.println("Schedule for Day" + dayCount +":");
        int count = 0;
        while(count < max_appointments && admittedPatients.isEmpty()){
            Patient patient = admittedPatients.add(patient);
            System.out.println(patient.getName());
            admittedPatients.add(patient);
            count++;
        }
        dayCount++;
    }


    // Provide treatment or prescription for a patient after their appointment
    public void providedTreatment(Patient patient, String treatment) {
        // Provide treatment to a patient only if the patient is admitted. Print "Treatment provided to <name>: <treatment>"
        // Else print "Patient not found in the admitted list."
        
        if(admittedPatientSet.contains(patient){
            System.out.println("Treatment provided to" + patient.getName() +":" + treatment);
        }else{
            System.out.println("Patient" + patient.getName() +" not found in admitted list");
        }
    }


    // Get the details of a patient
    public void getPatientDetails(Patient patient) {
        // Print patient details only if the patient is admitted.
        // Else print "Patient not found in the admitted list."
        
        if(admittedPatientSet.contains(patient){
            System.out.println("Patient Details"+ patient.getName()); //doubt
        }else{
            System.out.println("Patient not found in the admitted list");
        }
    }


    // Get the appointment details of a patient
    public void getAppointmentDetails(Patient patient) {
        // Print appointment details of a patient only if the patient is admitted. "Appointment Details: <name> is scheduled on <appointmentDay>"
        // Else print "Patient not found in the admitted list."
        
        if(admittedPatientSet.contains(patient)){

            System.out.println("Patient details "+patient.getName()); //doubt

        }else{
            System.out.println("Patient "+patient.getName()+ "not found in the appointment list");
        }
    }


    // Discharge a patient from the clinic
    public void dischargePatient(Patient patient) {
        // Remove the patient from admitted patients list. Print "Patient <name> discharged."

        if(admittedPatientSet.contains(patient)){
            admittedPatients.remove(patient);
            admittedPatientSet.remove(patient);
            System.out.println(" Patient "+patient.getName()+" discharged");

        }else{
            System.out.println("Patient "+patient.getName()+ "not found in admitted patients list.");

        }
    }
}
