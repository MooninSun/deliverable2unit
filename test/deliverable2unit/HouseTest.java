package deliverable2unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.chang.House;
import com.chang.Room;

public class HouseTest {

	//This tests whether we can get room description.
	@Test
	public void testRoomDescription(){
		Room r= mock(Room.class);
		when(r.getDescription()).thenReturn("description");
		Room[] rooms=new Room[1];
		rooms[0]=r;
		House h=new House(rooms);
		String result=h.getCurrentRoomInfo();
		assertEquals(result,"description");
		verify(r,times(1)).getDescription();
		
		
	}

}
