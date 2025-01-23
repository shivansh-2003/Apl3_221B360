/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother {
    static void show() {
        System.out.println("Mother's static show()");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Child's static show()");
    }
}

public class Main {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); // Calls Mother's static show() method
    }
}
