package Exercise11;

class Example3 extends Example2 {
    Example3() {
        this("Java", "Python");
        System.out.println("Derived class default constructor called");
    }

    Example3(String str1, String str2) {
        super();
        System.out.println("Derived class parametrized constructor called");

    }

    public static void main(String[] args) {

        Example3 obj = new Example3();
    }

}