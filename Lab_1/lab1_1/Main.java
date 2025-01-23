/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Application {
    public static void main(String[] args) {
        // Create an instance of Mother
        Mother m = new Mother();
        m.x = 10; // Set the value of x
        m.show(); // Call the show method of Mother

        // Create an instance of Child
        Child ch = new Child();
        ch.x = 20; // Set the value of x
        ch.show(); // Call the inherited show method from Mother
    }
}
