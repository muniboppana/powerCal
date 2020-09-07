package com.dxc.power.service.impl;

import com.dxc.power.constants.PowerConstants;
import com.dxc.power.service.PowerCalService;

public class PowerCalServiceImpl implements PowerCalService {
    @Override
    public String powerCal(int powerNumber) {
        if (powerNumber == 0) {
            return  "*";

        }
        int base = PowerConstants.BASE_NUMBER;
        int result = base;
        int increment = result;

        StringBuffer sb = new StringBuffer();

        for(int index=1 ; index < powerNumber ; index++) {

            for( int j=1 ; j < base ; j++) {
                result+= increment;
            }
            increment = result;

        }
        System.out.println("power calculation result is ::"+ result);
        for(int i = 0; i<result ; i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
