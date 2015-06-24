package deliverable2unit;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.chang.House;
import com.chang.Player;
import com.chang.Room;

public class HouseTest3 {
	
	//This tests looking for item in the rooms.
	//The room has just sugar, no coffee and cream.

	@Test
	public void testLook() {
		Player p=mock(Player.class);
		Room r=mock(Room.class);
		when(r.hasItem()).thenReturn(true);
		when(r.hasCoffee()).thenReturn(false);
		when(r.hasCream()).thenReturn(false);
		when(r.hasSugar()).thenReturn(true);
		//There is no return value when calling getSugar. 
		//So we ask this void method to do nothing.
		doNothing().when(p).getSugar();
		Room[] rooms=new Room[1];
		rooms[0]=r;
		House h=new House(rooms);
		h.look(p, r);
		verify(r).hasItem();
		verify(r).hasCoffee();
		verify(r).hasCream();
		verify(r).hasSugar();
		verify(p).getSugar();				
	}

}
