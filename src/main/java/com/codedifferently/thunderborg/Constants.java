package com.codedifferently.thunderborg;

public final class Constants {
    public static final byte I2C_SLAVE                  = (byte) 0X0703;
    public static final int PWM_MAX                     = 255;
    public static final int I2C_MAX_LEN                 = 6;
    public static final double VOLTAGE_PIN_MAX          = 36.3;  // Maximum voltage from the analog voltage monitoring pin
    public static final double VOLTAGE_PIN_CORRECTION   = 0.0;   // Correction value for the analog voltage monitoring pin
    public static final double BATTERY_MIN_DEFAULT      = 7.0;   // Default minimum battery monitoring voltage
    public static final double BATTERY_MAX_DEFAULT      = 35.0;  // Default maximum battery monitoring voltage
    public static final byte I2C_ID_THUNDERBORG         = 0x15;
    public static final int COMMAND_SET_LED1            = 1;     // Set the colour of the ThunderBorg LED
    public static final int COMMAND_GET_LED1            = 2;     // Get the colour of the ThunderBorg LED
    public static final int COMMAND_SET_LED2            = 3;     // Set the colour of the ThunderBorg Lid LED
    public static final int COMMAND_GET_LED2            = 4;     // Get the colour of the ThunderBorg Lid LED
    public static final int COMMAND_SET_LEDS            = 5;     // Set the colour of both the LEDs
    public static final int COMMAND_SET_LED_BATT_MON    = 6;     // Set the colour of both LEDs to show the current battery level
    public static final int COMMAND_GET_LED_BATT_MON    = 7;     // Get the state of showing the current battery level via the LEDs
    public static final int COMMAND_SET_A_FWD           = 8;     // Set motor A PWM rate in a forwards direction
    public static final int COMMAND_SET_A_REV           = 9;     // Set motor A PWM rate in a reverse direction
    public static final int COMMAND_GET_A               = 10;    // Get motor A direction and PWM rate
    public static final int COMMAND_SET_B_FWD           = 11;    // Set motor B PWM rate in a forwards direction
    public static final int COMMAND_SET_B_REV           = 12;    // Set motor B PWM rate in a reverse direction
    public static final int COMMAND_GET_B               = 13;    // Get motor B direction and PWM rate
    public static final int COMMAND_ALL_OFF             = 14;    // Switch everything off
    public static final int COMMAND_GET_DRIVE_A_FAULT   = 15;    // Get the drive fault flag for motor A, indicates faults such as short-circuits and under voltage
    public static final int COMMAND_GET_DRIVE_B_FAULT   = 16;    // Get the drive fault flag for motor B, indicates faults such as short-circuits and under voltage
    public static final int COMMAND_SET_ALL_FWD         = 17;    // Set all motors PWM rate in a forwards direction
    public static final int COMMAND_SET_ALL_REV         = 18;    // Set all motors PWM rate in a reverse direction
    public static final int COMMAND_SET_FAILSAFE        = 19;    // Set the failsafe flag, turns the motors off if communication is interrupted
    public static final int COMMAND_GET_FAILSAFE        = 20;    // Get the failsafe flag
    public static final int COMMAND_GET_BATT_VOLT       = 21;   // Get the battery voltage reading
    public static final int COMMAND_SET_BATT_LIMITS     = 22;    // Set the battery monitoring limits
    public static final int COMMAND_GET_BATT_LIMITS     = 23;    // Get the battery monitoring limits
    public static final int COMMAND_WRITE_EXTERNAL_LED  = 24;    // Write a 32bit pattern out to SK9822 / APA102C
    public static final byte COMMAND_GET_ID             = (byte) 0x99;  // Get the board identifier
    public static final byte COMMAND_SET_I2C_ADD        = (byte) 0xAA;  // Set a new I2C address
    public static final int COMMAND_VALUE_FWD           = 1;     // I2C value representing forward
    public static final int COMMAND_VALUE_REV           = 2;     // I2C value representing reverse
    public static final int COMMAND_VALUE_ON            = 1;     // I2C value representing on
    public static final int COMMAND_VALUE_OFF           = 0;     // I2C value representing off
    public static final byte COMMAND_ANALOG_MAX         = (byte) 0x3FF; // Maximum value for analog readings
}
