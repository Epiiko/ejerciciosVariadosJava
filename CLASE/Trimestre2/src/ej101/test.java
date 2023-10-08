

package ej101;

import java.security.PKCS12Attribute;


public class test {

    public static void main(String[] args) {
       Partitura p1=new Partitura("sdsad", "dsahdjkas");
       p1.addNota("do", 2);
        for (int i = 0; i < 10; i++) {
            p1.addNota("re", 3);
        }
        System.out.println(p1);
    }

}
