package day7;

//iterface 1
interface Interface1 {
    void method1a();
    void method1b();
}

// Interface 2
interface Interface2 {
    void method2a();
    void method2b();
}

// Interface 3
interface Interface3 {
    void method3a();
    void method3b();
}

// Combined Interface
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

// Concrete class
class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete method in ConcreteClass");
    }
}

// Class implementing the CombinedInterface and inheriting from ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void method1a() {
        System.out.println("Method 1a");
    }

    @Override
    public void method1b() {
        System.out.println("Method 1b");
    }

    @Override
    public void method2a() {
        System.out.println("Method 2a");
    }

    @Override
    public void method2b() {
        System.out.println("Method 2b");
    }

    @Override
    public void method3a() {
        System.out.println("Method 3a");
    }

    @Override
    public void method3b() {
        System.out.println("Method 3b");
    }

    @Override
    public void newMethod() {
        System.out.println("New Method");
    }
}

class Methods {
    // Method that takes Interface1 as an argument
    static void methodWithInterface1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }

    // Method that takes Interface2 as an argument
    static void methodWithInterface2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }

    // Method that takes Interface3 as an argument
    static void methodWithInterface3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }

    // Method that takes CombinedInterface as an argument
    static void methodWithCombinedInterface(CombinedInterface obj) {
        obj.method1a();
        obj.method2a();
        obj.method3a();
        obj.newMethod();
    }

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObj = new MyClass();

        // Call methods with different interfaces as arguments
        methodWithInterface1(myObj);
        methodWithInterface2(myObj);
        methodWithInterface3(myObj);
        methodWithCombinedInterface(myObj);

        // Call the concrete method from ConcreteClass
        myObj.concreteMethod();
    }
}