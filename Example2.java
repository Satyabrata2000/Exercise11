package Exercise11;

//Calling Super Class Constructor
public class Example2 {

    Example2(){
        this(10, 20);
        System.out.println("Base class default constructor");
    }

    Example2(int x, int y){
        System.out.println("Base class parametrized constructor called");
    }


}
