

/**
 * PolymorphisinInheritance
 */
interface MyCamera1{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("God Day");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k....");
    }
}
interface  Mywifi{
    String[] getNetwork();
    void conntectToNetwork(String network);
}
class Mycellphone{
  void callToNumber(int phoneNumber){
    System.out.println("Calling "+phoneNumber);
  }
  void pickCall(){
    System.out.println("Connect To call....");
  }
}
class MySmartPhone2 extends Mycellphone implements MyCamera1, Mywifi{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking video");
    }
    public String[] getNetwork(){
        System.out.println("Getting List of Network");
        String[] networkList={"Ankit","Harry","Code"};
        return networkList;
    }
    public void conntectToNetwork(String network){
        System.out.println("Connect to"+network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }
}
public class PolymorphisinInheritance {

    public static void main(String[] args) {
        //Dynamic distpatch
        MyCamera1 cam1=new MySmartPhone2();
        //cam1.getsampleMeth(); //Not allowed for the good.
        cam1.record4kVideo();
        cam1.recordVideo();
        MySmartPhone2 s=new MySmartPhone2();
        s.sampleMeth();
        s.getNetwork();
        s.conntectToNetwork("Ankit device");
    }
}