package deliverable2unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.chang.Game;
import com.chang.House;
import com.chang.Player;

public class GameTest {
	
	//This tests whether the instruction "N" can work well.

	@Test
	public void test_N_MoveNorth() {
		Player p=mock(Player.class);
		House h=mock(House.class);
		Game g=new Game(p,h);
		
		//Stubbing the moveNorth method
		doNothing().when(h).moveNorth();
		int result=g.doSomething("N");
		assertEquals(result,0);
		
		//Checking whether moveNorth is called
		verify(h).moveNorth();		
		
	}
	
	//This tests whether the instruction "n" can work well.
	@Test
	public void test_n_MoveNorth() {
		Player p=mock(Player.class);
		House h=mock(House.class);
		Game g=new Game(p,h);
		
		//Stubbing the moveNorth method
		doNothing().when(h).moveNorth();
		int result=g.doSomething("n");
		assertEquals(result,0);
		
		//Checking whether moveNorth is called
		verify(h).moveNorth();		
		
	}

}
