class Employe{
    String name;
    int empid;
    String role;

    public Employe(String name,int employ,String role){
        this.name=name;
        this.empid=empid;
        this.role=role;
    }
    public void display(){
        System.out.print("Name"+name+"employ"+empid+"Role"+role);
    }
}
public class Passingobj{
    public static int showDetails(Employe emp){
        emp.display();
    }

    public static void main(String[] args){
        Employe  e=new Employe("Priya",434,"developer");
        showDetails(e);
    }
}
}