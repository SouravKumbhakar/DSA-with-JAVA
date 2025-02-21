public class main {
    public static void main(String[] args) {
        //This is my firsst java program (this is a single line comment);
        /* 
          This
          is
          a
          multiline
          comment
        */


        System.out.println("I like pizza!");
        System.out.println("Its really good");


//🧊Variables:  a reusable container for a value ;
//               a variable behaves as if it was the value it contains;

//🟥primitive = simmple value stored directly in memory(stack);
//🟦Reference = memory adress(stack) that points to the (heap);

// 🟥primitive  vs  🟦Reference
// ------------      ------------
//      int             string
//      double          array
//      char            object
//      boolean         

// 2 steps to create variable 
//----------------------------
//  1.declaration
//  2.assignment

     //   int age = 10.5; // error: possible lossy conversion from double to int
        int age = 18;
        int year = 2025;
        //System.out.println(age);
        //System.out.println("in the year "+year+" my age will be "+age);
        //This is how concatination work in java .

        double price = 19.99;
        double gpa = 8.5;
        double temp = -12.5;

        char grade = 'a';
        char firstletter = 's';
        char symbol = '!';

        boolean student = true;
        boolean forSale; //by default false;

        String name = "tony stark";
        String food = "Burger";

        //System.out.println("hello i am "+name+" my fav food is "+food);

        


    }
    
}