/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whenyoueatyoursmarties;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class WhenYouEatYourSmarties {

    static int[] smarties=new int[8];
    static Scanner sc=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0;i<10;i++) {
            doOnTestCase();
        }
        
    }
    
    static private int timeNeedForOneColor(int num) {
        int iRet=num/7;
        if ((num%7)!=0) iRet++;
        return (iRet*13);
    }

    private static void doOnTestCase() {
        for (int i=0;i<smarties.length;i++) {
            smarties[i]=0;
        }
        String smarty = sc.nextLine();
        while (!smarty.equalsIgnoreCase("end of box")) {
            if (smarty.equalsIgnoreCase("orange")) smarties[0]++;
            else if (smarty.equalsIgnoreCase("blue")) smarties[1]++;
            else if (smarty.equalsIgnoreCase("green")) smarties[2]++;
            else if (smarty.equalsIgnoreCase("yellow")) smarties[3]++;
            else if (smarty.equalsIgnoreCase("pink")) smarties[4]++;
            else if (smarty.equalsIgnoreCase("violet")) smarties[5]++;
            else if (smarty.equalsIgnoreCase("brown")) smarties[6]++;
            else if (smarty.equalsIgnoreCase("red")) smarties[7]++;
            smarty=sc.nextLine();
        }
        int seconds=0;
        for (int i=0;i<smarties.length-1;i++) {
            seconds+=timeNeedForOneColor(smarties[i]);
        }
        seconds+=16*smarties[7];
        System.out.println(seconds);
    }
}
