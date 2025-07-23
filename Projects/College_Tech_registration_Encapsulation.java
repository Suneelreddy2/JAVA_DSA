package Projects;

class Participant {
    private int participantId;
    private String name;
    private double baseRegistrationFee;
    private int numberOfEvents;
    private double eventChargePerEvent;
    // Setters
    public void setParticipantId(int id) {
        participantId = id;
    }
    public void setName(String s) {
        name = s;
    }
    public void setBaseRegistrationFee(double fee) {
        baseRegistrationFee = fee;
    }
    public void setNumberOfEvents(int no) {
        numberOfEvents = no;
    }
    public void setEventChargePerEvent(double amount) {
        eventChargePerEvent = amount;
    }
    // Getters
    public int getParticipantId() {
        return participantId;
    }
    public String getName() {
        return name;
    }
    public double getBaseRegistrationFee() {
        return baseRegistrationFee;
    }
    public int getNumberOfEvents() {
        return numberOfEvents;
    }
    public double getEventChargePerEvent() {
        return eventChargePerEvent;
    }
    public double calculateTotalFee() {
        return baseRegistrationFee + (numberOfEvents * eventChargePerEvent);
    }
    public void displayDetails() {
        System.out.println("Participant ID: " + participantId);
        System.out.println("Name: " + name);
        System.out.println("Base Registration Fee: " + baseRegistrationFee);
        System.out.println("Number of Events: " + numberOfEvents);
        System.out.println("Event Charge per Event: " + eventChargePerEvent);
        System.out.println("Total Fee: " + calculateTotalFee());
    }
}
public class College_Tech_registration_Encapsulation {
    public static void main(String[] args) {
        Participant obj = new Participant();     
        // Setting participant details
        obj.setParticipantId(101);
        obj.setName("Suneel Reddy");
        obj.setBaseRegistrationFee(500);
        obj.setNumberOfEvents(3);
        obj.setEventChargePerEvent(100);
        // Displaying participant details
        obj.displayDetails();
    }
}
