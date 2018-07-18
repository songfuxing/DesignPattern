package com.songfuxing.patterns.decorator.myDecorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by songfuxing on 2018/7/18.
 */
public class InputTest {
     public static void main(String[] args) {
         int c;
         try {
             InputStream in = new LowerCaseInputStream(new FileInputStream("/Users/songfuxing/myprogram/DesignPattern/src/com/songfuxing/patterns/decorator/myDecorator/test.txt"));
             while ((c = in.read()) >= 0){
                 System.out.print((char)c);
             }
             in.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}
