import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double height = 0;
        double width = 0;
        double area = 0;

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        area = height*width;
        System.out.println("the area = "+area+"cm²");
        

        sc.close();
    }
}
