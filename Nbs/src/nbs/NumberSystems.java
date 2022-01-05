
package nbs;

import static java.lang.System.out;

public class NumberSystems {
   
    static void example (){
        int i10 = 60;
        int i2 = 0b111100;
        int i8 = 074;
        int i16 = 0x3C;
        
        out.println(i10 + "" + i2 + "" + i8 + "" + i16);
        
    }
    
    static void task (){
        byte b10 = 12;
        byte b2 = 0b1100;
        byte b8 = 014;
        byte b16 = 0xC;
        out.println(b10 + "\n" + b2 + "\n" + b8 + "\n" + b16 + "\n");
        
        short s10 = 1300;
        short s2 = 0b10100010100;
        short s8 = 02424;
        short s16 = 0x514;
        out.println(s10 + "\n" + s2 + "\n" + s8 + "\n" + s16 + "\n");
        
        int i10 = 0;
        int i2 = 0b0;
        int i8 = 0;
        int i16= 0x0;
        out.println(i10 + "\n" + i2 + "\n" + i8 + "\n" + i16 + "\n");
        
        long l10 = 123456789L;
        long l2 = 0b111010110111100110100010101;
        long l8 = 0726746425;
        long l16 = 0x75BCD15;
        out.println(l10 + "\n" + l2 + "\n" + l8 + "\n" + l16 + "\n");

        
        char c1,c2,c3,c4;
        c1 = 'f';
        c2 = 'F';
        c3 = '5';
        c4 = '?';
        out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n");
        
        c1 = 102;
        c2 = 70;
        c3 = 65301;
        c4 = 63;
        out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n");
        
        c1 = '\u0066';
        c2 = '\uFF26';
        c3 = '\uFF15';
        c4 = '\u003F';
        out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n");

    }
}
