
class Ankit{
    public int age;
    public int serviceduration;
    Ankit(){
        System.out.println("This is the default constructor");
    }
    Ankit(String s, int b){
        System.out.println("Constructor overloading");
        System.out.println("This the channel name "+ s + " So far this much video has been uploaded "+b);
    }
    Ankit(String s, int b, Double duration){
        System.out.println("This the channel name "+ s + " So far this much video has been uploaded "+b + " MAximum duration of the each video is up to "+ duration +" min");
    }
    public void dataset(int age,int serviceduration){
            this.age=age;
            this.serviceduration=serviceduration;
    }
    public int getage(){
        return  age;
    }
    public int getserviceduration(){
        return  serviceduration;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Ankit obj1 =new Ankit();
        Ankit Obj2=new Ankit("Code_wave",54);
        Ankit Obj3=new Ankit("Code_wave",54, 15.56);
        obj1.dataset(23, 45);
        Obj2.dataset(45, 96);
        Obj3.dataset(66, 23);
        System.out.println(obj1.getage());
        System.out.println(Obj2.getage());
        System.out.println(Obj3.getage());
    }
}
