/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomcomparer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher Irvine
 */
public class RoomTest {
    
    private Room room;
    
	@Before
	public void init() {
		room = new Room(true, 54, 343, 5, "Bob Champion");
	}

	@Test
	public void testSetLightsWorking() {
		room.setLightsWorking(false);
		System.out.println("Test for false");
                assertEquals(false, room.getLightsWorking());
                System.out.println("Test for true");
                room.setLightsWorking(true);
		assertTrue(room.getLightsWorking());
	}
}