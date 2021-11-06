package first;

class One{
    void function(){
        System.out.println("First Method is called");
    }
}
class Two extends One{
    void function(){
        System.out.println("Second Method is called");
    }
}
class Three extends One{
    void function(){
        System.out.println("Third Method is called");
    }
}

public class first {
    public static void main(String[] args){
        One obj1 = new One();
        Two obj2 = new Two();
        Three obj3 = new Three();

        One result = obj1;
        result.function();
        result = obj2;
        result.function();
        result = obj3;
        result.function();
    }
}