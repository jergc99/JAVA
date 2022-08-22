public class Droid {

    String name;
    int batteryLevel;

    Droid(String droidName){
        name=droidName;
        batteryLevel=100;

    }

    public String toString() {
        
        return "Hello, I’m the droid: "+ name;
    }

    public void performTask(String task){
        System.out.println(name+" is performing task: "+task);
    }

    public String energyReport(){
        return "Battery level is: "+ batteryLevel;
    }
    public static void main(String[] args) {
        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid.name);
        myDroid.batteryLevel=10;
        myDroid.performTask("Dancing");
    }
}
