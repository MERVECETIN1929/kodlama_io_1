/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomtest;

import java.util.Random;

/**
 *
 * @author merve
 */
public class RandomTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        Random rand=new Random();
        System.out.println(rand);
        for (int i = 0; i < 10; i++) {
            int num=(rand.nextInt(100));
            System.out.println(num);
            sum+=num;
            
        }
        System.out.println("topmal"+sum);    }
    
}
