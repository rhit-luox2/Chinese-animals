package main;

import org.junit.Assert.*;
import org.junit.Test;

public class UnitTests {
    
    @Test
	public void getZodiacFromAngleNO1() {
        assertEquals("Horse", WheelManager.getZodiacFromAngle(Math.toRadians(195)));
    } 

    @Test
	public void getZodiacFromAngleNO2() {
        assertEquals("Snake", WheelManager.getZodiacFromAngle(Math.toRadians(165)));
    }   

    @Test
	public void getZodiacFromAngleNO3() {
        assertEquals("Rat", WheelManager.getZodiacFromAngle(Math.toRadians(15)));
    }   


    
}
