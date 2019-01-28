package com.codedifferently.thunderborg;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.wiringpi.SoftPwm;

import java.io.IOException;

public class Thunderborg {

    /**
         This module is designed to communicate with the ThunderBorg

         busNumber               Iï¿½C bus on which the ThunderBorg is attached (Rev 1 is bus 0, Rev 2 is bus 1)
         bus                     the smbus object used to talk to the Iï¿½C bus
         i2cAddress              The Iï¿½C address of the ThunderBorg chip to control
         foundChip               True if the ThunderBorg chip can be seen, False otherwise
         printFunction           Function reference to call when printing text, if None "print" is used
     **/

    public static void main (String[] args){
        I2CBus I2C_BUS;
        I2CDevice Thunderborg;
        System.out.println("Hello pi");


        try {
            I2C_BUS = I2CFactory.getInstance(I2CBus.BUS_1);
            System.out.println("Connected to bus. Ok");
            Thunderborg = I2C_BUS.getDevice(Constants.I2C_ID_THUNDERBORG);
            System.out.println("Device id " + Thunderborg.read(Constants.COMMAND_GET_ID));


            Thunderborg.write(Constants.COMMAND_VALUE_FWD, (byte) Constants.PWM_MAX);
            //Thread.sleep(100l);
            //Thunderborg.write(Constants.COMMAND_SET_B_FWD, (byte) Constants.PWM_MAX);

            //System.out.println("Motor on");

            Thread.sleep(2000l);
            Thunderborg.write(Constants.COMMAND_VALUE_FWD, (byte) 0);
            //Thread.sleep(100l);
            //Thunderborg.write(Constants.COMMAND_SET_B_FWD, (byte) 0);


        }catch(IOException exception){
            System.out.println("Failed");
        } catch (Exception ex){
            System.out.println("Fuck");
        }

    }


}
