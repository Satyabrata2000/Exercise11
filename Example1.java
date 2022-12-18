package Exercise11;

//Constructor chaining
public class Example1 {

    Example1(){
        this("String1");
        System.out.println("Default constructor called");
    }
    Example1(String str){
        System.out.println("Parametrized Constructor called");
    }

    public static void main(String[] args) {

        Example1 obj = new Example1();
    }
}
