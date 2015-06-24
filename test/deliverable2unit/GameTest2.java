package deliverable2unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.chang.Game;
import com.chang.House;
import com.chang.Player;

public class GameTest2 {

	//This tests whether the instruction "I" can work well.
	@Test
	public void test_I_ShowInventery() {
		Player p=mock(Player.class);
		House h=mock(House.class);
		Game g=new Game(p,h);
		
		//Stubbing the showInventory method
		doNothing().when(p).showInventory();
		int result=g.doSomething("I");
		assertEquals(result,0);
		
		//Checking whether showInventory is called
		verify(p).showInventory();	
	}

	//This tests whether the instruction "i" can work well.
	@Test
	public void test_i_ShowInventery() {
		Player p=mock(Player.class);
		House h=mock(House.class);
		Game g=new Game(p,h);
		
		//Stubbing the showInventory method
		doNothing().when(p).showInventory();
		int result=g.doSomething("i");
		assertEquals(result,0);
		
		//Checking whether showInventory is called
		verify(p).showInventory();	
	}
}
