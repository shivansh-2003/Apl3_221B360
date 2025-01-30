// Inside com/jiet/Pack2.java
package com.jiet;

import com.juet.Pack1;

public class Pack2 {
    public static void main(String[] args) {
        Pack1 obj = new Pack1();
        obj.display();
    }
}
// Inside com/jiet/Pack2.java
package com.jiet;

import com.juet.Pack1;

public class Pack2 extends Pack1 {
    public static void main(String[] args) {
        Pack2 obj = new Pack2();
        obj.display();
    }
}
