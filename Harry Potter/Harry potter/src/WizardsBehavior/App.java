package WizardsBehavior;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

       Harry obj = new Harry();
       System.out.println("Harry:");
       System.out.println(obj.hechizo4());
       System.out.println("Do  you want use another spell Y/N?");
       Scanner sc = new Scanner(System.in);
        String seleccion=sc.nextLine();
       if (seleccion.equalsIgnoreCase("y")){
        System.out.println("select:");
        System.out.println("1.Expelliarmu");
        System.out.println("2.Oculusreparo");
        System.out.println("3.Wingardiumleviosa");
        int seleccion2=sc.nextInt();
        switch (seleccion2) {
            case 1:
             System.out.println(obj.hechizo1());
                break;
            case 2:
             System.out.println(obj.hechizo2());
                break;
            case 3:
             System.out.println(obj.hechizo3());
                break;    
            default:
             System.out.println(" invalid option");
             
                break;
        }


       }
       hermione obj1 = new hermione();
       System.out.println("Hermione:");
       System.out.println(obj.hechizo2());
       System.out.println("Do  you want use another spell Y/N?");
       Scanner sc1 = new Scanner(System.in);
        String seleccion1=sc1.nextLine();
       if (seleccion1.equalsIgnoreCase("y")){
        System.out.println("select:");
        System.out.println("1.Expelliarmus");
        System.out.println("2.ExpectoPatronum");
        System.out.println("3.Wingardiumleviosa");
        int seleccion2=sc.nextInt();
        switch (seleccion2) {
            case 1:
             System.out.println(obj.hechizo3());
                break;
            case 2:
             System.out.println(obj.hechizo4());
                break;
            case 3:
             System.out.println(obj.hechizo1());
                break;    
            default:
             System.out.println(" invalid option");
             
                break;
        }


       }
       Ron obj2 = new Ron();
       System.out.println("Ron");
       System.out.println(obj.hechizo3());
       System.out.println("Do  you want use another spell Y/N?");
       Scanner sc2 = new Scanner(System.in);
        String seleccion2=sc2.nextLine();
       if (seleccion1.equalsIgnoreCase("y")){
        System.out.println("select:");
        System.out.println("1.Oculusreparo");
        System.out.println("2.ExpectoPatronum");
        System.out.println("3.Wingardiumleviosa");
        int seleccion3=sc2.nextInt();
        switch (seleccion3) {
            case 1:
             System.out.println(obj.hechizo2());
                break;
            case 2:
             System.out.println(obj.hechizo4());
                break;
            case 3:
             System.out.println(obj.hechizo3());
                break;    
            default:
             System.out.println(" invalid option");
             
                break;
        }


       }
       

    }
}
