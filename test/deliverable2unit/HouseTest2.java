package deliverable2unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.chang.House;
import com.chang.Room;

public class HouseTest2 {
	
	//This  test is testing gernerateRooms.
	//It checks whether the return value is what we need.

	@Test
	public void testGenerateRooms() {
	    int length=6;
	    House house=new House(length);
	    Room[] rooms=house.generateRooms(length);
	    assertEquals(rooms.length,length);  
	    
	    
	}

}
