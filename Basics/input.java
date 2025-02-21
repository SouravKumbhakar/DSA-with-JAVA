import java.util.Scanner;
//import the Scanner from the util
public class input {
    public static void main(String[] args) {
        //Defining a new sacnner As sc 
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();
        //Which type of data type i need to insert make sc.next_DataType;
        System.out.print("hello "+name+", "+age);
        
        //🟥 new line buffer problem 
        //------------------------

        System.out.println("Enter your fav color");
        String color = sc.nextLine();
        System.out.println("you are "+age+" yrs old and your fav color is "+color);

        /*output: Enter your age
                  18
                  hello sourav, 18Enter your fav color
                  you are 18 yrs old and your fav color is
        */
        
        //🧊To overcome this problem add a sc.nextLine() at line no. 13;

        //closing the sc after its work done
        sc.close();   
    }
}
