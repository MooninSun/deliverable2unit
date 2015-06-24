package deliverable2unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.chang.Game;
import com.chang.House;
import com.chang.Player;

public class GameTest3 {

	//This tests whether the instruction "D" can work well.
	@Test
	public void test_D_Drink() {
		Player p=mock(Player.class);
		House h=mock(House.class);
		Game g=new Game(p,h);
		
		//Stubbing the drink method
	     when(p.drink()).thenReturn(true);
		int result=g.doSomething("D");
		assertEquals(result,1);
		
		//Checking whether drink is called
		verify(p).drink();	
	}

	//This tests whether the instruction "d" can work well.
	@Test
	public void test_d_Drink() {
		Player p=mock(Player.class);
		House h=mock(House.class);
		Game g=new Game(p,h);
		
		//Stubbing the drink method
	     when(p.drink()).thenReturn(true);
		int result=g.doSomething("d");
		assertEquals(result,1);
		
		//Checking whether drink is called
		verify(p).drink();	
	}
}
