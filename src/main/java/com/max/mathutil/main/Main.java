/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.max.mathutil.main;

import com.max.mathutil.core.MathUtility;

/**
 *
 * @author Leon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0; //ham kiem tra 0!
        long expected = 1; // ham y rang hy vong n = 0
        long actual = MathUtility.getFactorial(n);
                
        System.out.println(n+ "! -> expected:" + expected +" | actual:" + actual);
        
        n = 5; //ham kiem tra 0!
        expected = 120; // ham y rang hy vong n = 0
        actual = MathUtility.getFactorial(n);
                
        System.out.println(n+ "! -> expected:" + expected +" | actual:" + actual);
    }
    
}
