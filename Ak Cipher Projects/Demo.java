public class Demo {

    public void showName(String a){                                  // Method
        System.out.println("Neme Of Candidate : " + a);
    }
    public void showAge(int a){
        System.out.println("Age : " + a);
    }
    public void showNum(String b){

        System.out.println("Number : " + b);
    }
    public static void main (String a[]){
        // Main Method
        Demo Obj = new Demo();
        Obj.showName("Abishek");
        Obj.showAge(21);
        Obj.showNum("9159168341");
    }
}
