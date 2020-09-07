package com.dxc.power.cal;


import com.dxc.power.service.PowerCalService;
import com.dxc.power.service.impl.PowerCalServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerCalculationTest  {

    PowerCalService powerCalService;

    @Before
    public void setUp() throws Exception {
         powerCalService  = new PowerCalServiceImpl();
    }

    @Test
    public void testPowerCal() {
        int powerNumber =2;
        String result =powerCalService.powerCal(powerNumber);
        assertEquals("****",result);
    }

    @Test
    public void testFailPowerCal() {
        int powerNumber =3;
        String result =powerCalService.powerCal(powerNumber);
        assertNotEquals("Expected value is not match",6,result);
    }


}
