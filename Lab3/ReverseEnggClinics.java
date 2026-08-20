abstract class HomeAutomation {

    public void displayLights() {
        System.out.println("Displaying the Lights..");
    }

    public void offLights() {
        System.out.println("Off the Lights...");
    }

    abstract public void controlLights();
}

public class ReverseEnggClinics extends HomeAutomation {

    public void controlLights() {
        System.out.println("Controlling the Lights...");
    }

    public static void main(String[] args) {

        ReverseEnggClinics obj1 = new ReverseEnggClinics();

        obj1.displayLights();
        obj1.offLights();

        System.out.println("Printing the Abstract method...");

        obj1.controlLights();
    }
}