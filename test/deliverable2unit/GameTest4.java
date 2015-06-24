package deliverable2unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.chang.Game;
import com.chang.House;
import com.chang.Player;

public class GameTest4 {

	//This tests whether letter, not the expected instruction, can work well.
	//It should print "what".
		@Test
		public void testOtherLetter() {
			Player p=mock(Player.class);
			House h=mock(House.class);
			Game g=new Game(p,h);
			
			int result=g.doSomething("k");
			assertEquals(result,0);
			
		}
}
