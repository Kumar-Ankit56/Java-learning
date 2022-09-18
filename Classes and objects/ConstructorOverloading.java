class StudentData{
    int roll_no;
    String name;
    StudentData(){
        roll_no=0;
        name="xyz";
    }
    StudentData(int x){
        roll_no=x;
        System.out.println("The Student Rollno is "+roll_no);
        System.out.println("Student haven't enter his/her name make sure to enter the apporpritate data");
    }
    StudentData(int x , String str){
        roll_no=x;
        name=str;
        System.out.println("Now you have enter the all prerequeste data you are ready to go");
    }
    public void Getdata(){
        System.out.println("Hello Student! Welcome to the organisation \nFollowing are the information you have enterd so far make sure to checkitout" );
        System.out.println("Roll_no =" +roll_no);
        System.out.println("Your name =" +name);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        // StudentData s1=new StudentData();
        // s1.Getdata();
        // StudentData s2=new StudentData(45);
        // s2.Getdata();
        StudentData s3=new StudentData(45,"Ankur");
        s3.Getdata();
    }
}
