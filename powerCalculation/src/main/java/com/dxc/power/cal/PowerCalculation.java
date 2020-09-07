package com.dxc.power.cal;


import com.dxc.power.service.PowerCalService;
import com.dxc.power.service.impl.PowerCalServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculation {

    public static void main( String[] args ) throws Exception
    {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("enter a number");
            int powerNumber = input.nextInt();
            powerCal(powerNumber);

        }catch (InputMismatchException exp) {
            System.out.println("Please enter integer number not string");
            Scanner input = new Scanner(System.in);
            int powerNumber = input.nextInt();
            powerCal(powerNumber);
        }finally {
          System.out.println("program complete");
        }

    }

    static void powerCal(int powerNumber)  {
        if(powerNumber >= 0) {
            PowerCalService powerCalService = new PowerCalServiceImpl();
            String result = powerCalService.powerCal(powerNumber);
            System.out.println("power calcualtion string value is ::"+result);
        }  else {
            System.out.println("please enter positive number ");
        }
    }
}