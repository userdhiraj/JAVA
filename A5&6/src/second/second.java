package second;

class A{
    void show(){
        System.out.println("First Class is running.........");
    }
}

class A1 extends A{
    void show(){
        System.out.println("Sub-Class of First Class is running.........");
    }
    void stop(){
        System.out.println("Sub-Class is Stopped..");
    }
    void still(){
        System.out.println("Sub-Class is Working..");
    }
    
}

public class second {
    public static void main(String[]args){
        A1 subclass = new A1();
        subclass.show();
        subclass.stop();
        subclass.still();
    }
}