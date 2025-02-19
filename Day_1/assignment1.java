// Question 1
/* class Task{
 public static void main(String args[]){
 
 System.out.print("Hello, I am Anushree Upadhye" );

}
} */


// Question 2

/* class Addition{
public static void main(String args[]){
 
  int a = 74;
  int b = 36;
  int sum = a + b;
  
  System.out.println("a = " + a) ;

  System.out.println("b = " + b);

  System.out.println("sum = "+ sum); 
}
} */


// Question 3

/* class Division{
 public static void main(String args[]){
 int num1 = 18;
 int num2 = 5;
 int div = num1/num2;

 System.out.println("num1 = " + num1);
 System.out.println("num2 = " + num2);
 System.out.println("div = " + div);
}
} */


// Question 4
/* class Operations{
public static void main(String args[]){
  int a = 5;
  int b = 8;
  int c = 6;
  int d = 55;
  int e = 9;
  int f = 20;
  int g = 3;
  int h = 15;
  int i = 2;

  int ope1 = (-a + b * c);
  int ope2 = (d + e) % 9;
  int ope3 = f + (-g) * a/b;
  int ope4 = a + h/g * i -b % g;

  System.out.println(ope1);
  System.out.println(ope2);
  System.out.println(ope3);
  System.out.println(ope4);
}
} */


// Question 5

/*import java.util.Scanner;

class Multiply{
  public static void main(String args[]){
  
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter 1st integer: ");
  int num1 = scanner.nextInt();
  System.out.print("Enter 2nd integer: ");
  int num2 = scanner.nextInt();
  System.out.print("Multiplication of above two numbers: " + num1 * num2);
  
  
}
} */

// Question 6

/* import java.util.Scanner;

class Multiop{
  public static void main(String args[]){
  
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter 1st integer: ");
  int num1 = scanner.nextInt();
  System.out.print("Enter 2nd integer: ");
  int num2 = scanner.nextInt();

  System.out.println("Addition of above two numbers: " + (num1 + num2));
  System.out.println("Substraction of above two numbers: " + (num1 - num2));
  System.out.println("Multiplication of above two numbers: " + num1 * num2);
  
  
}
} */


// Question 7
 
/* import java.util.Scanner;
class Tables{
  public static void main(String args[]){

   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter an integer : ");
   int num = scanner.nextInt();
   
   for (int i = 1; i <= 10; i++) {
   System.out.println(num + " x " + i + " = " + (num * i));
  }
 scanner.close();
}
} */


//Question 8

/* import java.util.Scanner;

 class Swapnum{
 public static void main(String arga[]){

 System.out.print("Type two numbers:");

 Scanner scanner = new Scanner(System.in);

 int num1 = scanner.nextInt();
 int num2 = scanner.nextInt(); 

 System.out.println("input numbers: " +" "+num1 +" "+ num2);
 System.out.println("swapped numbers: " +" "+num2 +" "+ num1);
  }
 } */


//Question 9

/* class Cirarea{
  public static void main(String args[]){
   
  int r = 5;
  int area = 22/7 * r*r ;

  System.out.print(" Area of circle is :" + " " + area);
}
} */


//Question 10 & 11 are done in day2 assignment

//Question 12

/* import java.util.Scanner;
class ReverseString{
  public static void main(String args[]){
   
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter a String:" + " ");
  String input = scanner.nextLine();

  String reversed = new StringBuilder(input).reverse().toString();

  System.out.print("Reversed String: " + reversed);
  }

 } */


//Question 13

/* import java.util.Scanner;

 class NumAvg{
 
  public static void main(String arga[]){  

  Scanner scanner = new Scanner(System.in);

  System.out.print("enter num1: ");
  int num1 = scanner.nextInt();

  System.out.print("enter num2: ");
  int num2 = scanner.nextInt();

  System.out.print("enter num3: ");
  int num3 = scanner.nextInt();


  float average = (num1 + num2 + num3) / 3;

  System.out.print("average of above inputs is : " + average);

   }
 } */


// Question 14

/* class Fibonacci {
public static void main(String args[]){

   int first = 0, second = 1, next;

  System.out.print(first + " "+ second + " ");
  
  for( int i = 2; i < 10; i++) {
  next = first + second;
  System.out.print(next + " ");
  first = second;
  second = next;
   
  }

}
} */


//Question 15

/* import java.util.Scanner;

class Factorial{
public static void main(String args[]){
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("enter a number : ");
  int num = scanner.nextInt();

  int fact = 1;
  for (int i = 1; i <= num; i++){
  fact *= i;

  }
  System.out.println("Factorial of " + num + " is: " +  fact );
 }
  
 }*/


// Question 16

/* import java.util.Scanner;

class PrimeNum{
public static void main(String args[]){

   Scanner scanner = new Scanner(System.in);

   System.out.print("enter a num : ");
   int num = scanner.nextInt();

   boolean isPrime = true; //assume that num is prime

  if (num <= 1) {
   isPrime = false;
  } else{
     for(int i = 2; i < num; i++) {
       if(num % i == 0){
          isPrime = false;
            break;
       }
     }
   }
     if (isPrime) {

         System.out.println(num + " is a prime number");
      } else {
         System.out.println(num + " is not a prime number");
      }

 }
} */


//Question 17

/* import java.util.Scanner;

class NaturalNumber{
  public static void main(String args[]){

   Scanner scanner = new Scanner(System.in);

   System.out.print("enter a number : ");
   int num = scanner.nextInt();

   for(int i = 1; i <= num; i++){
   System.out.print(i + " ");
   }
 }
} */


//Question 18

/* import java.util.Scanner;

class TempConverse{
  public static void main(String args[]){

   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter temperature in Celsius : ");
   float temp = scanner.nextInt();

   float conversion = (temp * 9/5) + 32;
   System.out.println(conversion + "Fahrenheit");

  }
} */


//Question 19

/* import java.util.Scanner;
class ExpoNums{
  public static void main(String args[]){

   Scanner scanner = new Scanner(System.in);

   System.out.print("enter base number : ");
   int base = scanner.nextInt();

   System.out.print("enter exponent number : ");
   int exponent = scanner.nextInt();

   //double result = Math.pow(base, exponent);
   int intResult = (int) Math.pow(base, exponent);
   System.out.println(intResult);
 }
} */


//Question 20

import java.util.Scanner;
class DigitCounter{
  public static void main(String args[]){

   Scanner scanner = new Scanner(System.in);

   System.out.print("enter a number : ");
   long num = scanner.nextLong();

   int count = 0;
   long temp = num;

   while (temp != 0){
      temp /= 10;   //it will remove last digit
      count++;
   }
   System.out.println("The number " + num + " has " + count + " digits.");
 }
}
