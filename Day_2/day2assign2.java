//snippet 1

/* public class Main {
public void main(String[] args) {
System.out.println("Hello, World!");
}
} */

// error explanation : The class is named Main although it is declared publicly, 
//therefore the file must also be named Main.java.
// also it is missing the word static in the method

//correction:

/* class Main{
  public static void main(String args[]){
  System.out.println("Hello, World!"); 
 }
 
} */


//snippet 2

/* public class Main {
static void main(String[] args) {
System.out.println("Hello, World!");
}
} */

//error explanation: again similar to question 1, same error, and the word public is missing in the method.

//correction:

/* class Main{
  public static void main(String args[]){
  System.out.println("Hello, World!"); 
 }
 
} */


//snippet 3

/*public class Main {
public static int main(String[] args) {
System.out.println("Hello, World!");
return 0;
}

}*/

//error : the main method is incorrect, alsoit includes errors of Q1 & Q2
// the void keyword indicates that the method does not have any return type

//correction

/* public class Main {
    public static void main(String[] args) {  
        System.out.println("Hello, World!");
    }
} */


//snippet 4

/* public class Main {
public static void main() {
System.out.println("Hello, World!");
}
} */


//error: same as above

//String[] args is needed for jvm to find correct main method

//correction
/* public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
} */ 


//Question 5

/* public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
} */

// No java does not allow two main methods in the same class

//error: above code is correct given that file name was Main.java


//Question 6

/* public class Main {
public static void main(String[] args) {
int x = y + 10;
System.out.println(x);
}
} */

//error : cannot find symbol, as y is not defined.

//variables should be declared because the compiler has to see how much space to reserve in memory
// Also if variables were used without being declared, their values would be unknown, 
//leading to unpredictable results.

//correction
 /* public class Main {
    public static void main(String[] args) {
        int y = 5;  
        int x = y + 10;
        System.out.println(x);  // Output: 15
    }
} */



//Question 7

/* public class Main {
public static void main(String[] args) {
int x = "Hello";
System.out.println(x);
}
} */

//error :  incompatible type: String cannot be converted to int
//java enforces type safety to prevent errors, improve reliability, and ensure code runs as expected.

//correction

/* public class Main {
    public static void main(String[] args) {
        String x = "Hello";  
        System.out.println(x);  
    }
} */


// Question 8 

/* public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!"
}
} */

//error: ')' expected

// The program will not compile until the missing ) is fixed.

//correction
 
/* public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
} */


//Question 9

/* public class Main {
public static void main(String[] args) {
int class = 10;
System.out.println(class);
}
} */

//error: illegal type, identifier expected, also int class = 10; is not a statement

//Reserved keywords in Java are words that have a special meaning in the language and are used for specific //purposes like control structures, data types, and method declarations.

//correction
/* public class Main {
public static void main(String[] args) {
int myClass = 10;  
System.out.println(myClass);
}
} */


//Question 10

/* public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}*/

//error: display is a non static method therefore it cannot be referenced from a static context

//yes, java does allow multiple methods with the same name as long as they have different parameter lists.

//correction
/* public class Main {
    public static void main(String[] args) {
        System.out.println("No parameters");   // First method
        System.out.println("With parameter: " + 5);  // Second method
    }
} */


//Question 11

/* class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[5]);
}
} */

//error: ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
/* this occured because the array size is onnly 3 and the sop statement has value 5 
which is out of range of given array. */

//correction

/* class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[2]);
}
} */



//Question 12

/*class Main {
 public static void main(String[] args) {
while (true) {
System.out.println("Infinite Loop");
}
}
} */

//error: infinite loop
//to avoid infinite loop we can put condition

//correction
/*class Main {
  public static void main(String[] args) {
  int i = 1;
  while (i <= 5) {
     System.out.println("finite Loop" + " "+i);
i++;
}
}
} */


//Question 13

 /*  class Main {
     public static void main(String[] args) {

    String str = null;
    System.out.println(str.length());

}
}  */

/* error: null pointer exception, it occurs because the str is null, 
and the sop statement is trying to print length */

//there is no such correction in the code , only the length can be changed.



//Question 14

/* class Main {
    public static void main(String[] args) {
    double num = "Hello";
    System.out.println(num);
}
} */

/*error : string cannot be converted to double.
Java enforces data type constraints to ensure type safety and prevent unexpected behavior or errors at runtime.*/

//correction
/* class Main {
    public static void main(String[] args) {
    String str = "Hello";
    System.out.println(str);
}
} */



//Question 15

/* class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + num2;
System.out.println(result);
}
} */

/* error: incompatible types: possible lossy conversion from double to int
for handling different data types we either have to keep data type same for all or do type casting */

//correction: 
/* class Main {
public static void main(String[] args) {
int num1 = 10;
int num2 = 35;
int result = num1 + num2;
System.out.println(result);
}
} */


//Question 16

/*public class Main {
public static void main(String[] args) {
int num = 10;
double result = num / 4;
System.out.println(result);
}
} */

//did not expect 2.0, instead the ans should be 2.5, which is corrected below

//correction

/* class Main {
public static void main(String[] args) {
double num = 10;
double result = num / 4;
System.out.println(result);
}
}*/



//Question 17

/* public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a ** b;
System.out.println(result);
}
} */

/* error: illegal start of expression
In Java, the ** operator is not valid because Java does not have a built-in exponentiation operator */

//correction

/* public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double result = Math.pow(a, b);  //this will print a raised to b
        System.out.println(result);  
    }
} */



//Question 18

/* public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a + b * 2;
System.out.println(result);
}
} */

//no error, above code is correct, multiplication has higher precedence than addition, therfore the answer is 20.


//Question 19

/* class Main {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b;
System.out.println(result);
}
} */

/* arithmetic expression error, java throws an ArithmeticException because
 division by zero is undefined in mathematics. */



//Question 20

/* class Main {
public static void main(String[] args) {
System.out.println("Hello, World")
}
} */

//compilation error, ; affects to compilation 

//correction

/* class Main {
public static void main(String[] args) {
System.out.println("Hello, World");
}
} */



//Question 21

/* public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
// Missing closing brace here
} */

//error: reached end of file while parsing

//correction

 /*class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");

}
}  */



//Question 22

/* class Main {
public static void main(String[] args) {
static void displayMessage() {
System.out.println("Message");
}
}
} */

/* error: illegal start of expression and also
Since displayMessage() is inside main(), the compiler gets confused and expects a class, 
interface, or enum declaration instead of another method. */

//correction

/* class Main{

  static void DisplayMessage(){
    System.out.println("Message");
  }
  public static void main(String[] args) {
    DisplayMessage();
  }

} */


//Question 23

/* class Confusion {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
case 3:
System.out.println("Value is 3");
default:
System.out.println("Default case");
}
}
} */

// there is no break statement written, therefore it prints all sops.also known as fall through.

//correction

/* class Confusion {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
break;
case 2:
System.out.println("Value is 2");
break;
case 3:
System.out.println("Value is 3");
break;
default:
System.out.println("Default case");
}
}
} */



//Question 24

/* class MissingBreakCase {
public static void main(String[] args) {
int level = 1;
switch(level) {
case 1:
System.out.println("Level 1");
case 2:
System.out.println("Level 2");
case 3:
System.out.println("Level 3");
default:
System.out.println("Unknown level");
}
}
} */

/* Without a break;, the program falls through to the next case and keeps executing them until 
the end of the switch block. we use break to prevent fall through. */



//Question 25

/* class Switch {
public static void main(String[] args) {
double score = 85.0;
switch(score) {
case 100:
System.out.println("Perfect score!");
break;
case 85:
System.out.println("Great job!");
break;
default:
System.out.println("Keep trying!");
}
}
} */

/* error: incompatible types: possible lossy conversion from double to int
the switch expression only supports certain data types like int, char, string, short, byte 
but certainly not double */

//correction

/* public class SwitchExample {
    public static void main(String[] args) {
        int score = 85; // Changed from double to int
        
        switch(score) {
            case 100:
                System.out.println("Perfect score!");
                break;
            case 85:
                System.out.println("Great job!");
                break;
            default:
                System.out.println("Keep trying!");
        }
    }
}*/



//Question 26

/* class Switch {
public static void main(String[] args) {
int number = 5;
switch(number) {
case 5:
System.out.println("Number is 5");

break;
case 5:
System.out.println("This is another case 5");
break;
default:
System.out.println("This is the default case");
}
}
} */

//error: duplicate case label
//Java does not allow multiple cases with the same constant value because it would create ambiguity.

//correction

/* public class SwitchExample {
    public static void main(String[] args) {
        int number = 5;

        switch(number) {
            case 5:
                System.out.println("Number is 5");
                break;
            case 10: // Changed from duplicate 5 to a different value
                System.out.println("Number is 10");
                break;
            default:
                System.out.println("This is the default case");
        }
    }
} */
