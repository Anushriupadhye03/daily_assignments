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
        String x = "Hello";  // ✅ x is now a String
        System.out.println(x);  // Output: Hello
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
int myClass = 10;  // ✅ Variable renamed
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
