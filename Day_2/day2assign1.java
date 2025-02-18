//Question1 & Question 2

/* import java.util.Scanner;
class Numcheck{
  public static void main(String args[]){

      Scanner scanner = new Scanner(System.in);
      System.out.print("enter a number");
      int num = scanner.nextInt();

   if (num >= 0) {
     System.out.println("input number is positive");
   }
    else {
     System.out.println("input number is negative");
   }

   System.out.println(" execution done!");
}
} */


// Question3

/* import java.util.Scanner;
class Oddeven{
  public static void main(String args[]){

      Scanner scanner = new Scanner(System.in);
      System.out.print("enter a number : " + " ");
      int num = scanner.nextInt();

   if (num % 2 == 0) {
     System.out.println("input number is even");
   }
    else {
     System.out.println("input number is odd");
   }

   System.out.println(" execution done!");
}
} */


//Question 4

/* import java.time.LocalTime;
   import java.util.Scanner;


class Greetings{
  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Type anything and press enter:" + " " );
    String userInput = scanner.nextLine();

    LocalTime currentTime = LocalTime.now();  //this will get current time when user presses enter
    int hour = currentTime.getHour();

    if (hour >= 5 && hour < 12){
      System.out.println("Hii, Good Morning!");
    } else if (hour >= 12 && hour < 17) {
      System.out.println("Hii, Good Afternoon!");
    } else if (hour >= 17 && hour < 21) {
      System.out.println("Hii, Good Evening!");
    } else {
      System.out.println("Hii, Good Night!");
    }

    scanner.close();
}
} */



//Question 5

/*  class Sqarea{
  public static void main(String args[]){
   
  int side = 5;
  int area = side * side ;

  System.out.print(" Area of square is :" + " " + area);
}
} */


//Question 6

/* class Recarea{
  public static void main(String args[]){
   
  int length = 15;
  int breath = 5;
  int area = length * breath ;

  System.out.print(" Area of rectangle is :" + " " + area);
}
} */


// Question 7 

/* class Largestnum{
 public static void main(String args[]){

   int a = 108;
   int b = 120;
   int c = 145;

   if (a > b && a > c) {
    System.out.print("the largest number is :" + " " + a);
   } 
   else if (b > a && b > c){
    System.out.print("the largest number is :" + " " + b);
   }
   else {
    System.out.print("the largest number is :" + " " + c);
   }

 }
 } */

