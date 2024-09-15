class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class Demo{
    public static void main(String[] args){
        A obj1=new A();
        obj1.show();
        A.B obj2=obj1.new B();
        obj2.config();
    }
}
