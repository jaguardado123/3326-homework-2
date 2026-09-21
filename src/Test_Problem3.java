import static org.junit.Assert.*;
import org.junit.Test;
import problem3.*;

public class Test_Problem3 {
	
	@Test
	public void testing_input() {
		Vector<Integer> vect = new Vector<>();
        vect.push_back(5);
        vect.push_back(10);
        assertEquals(5, vect.at(0));
        assertEquals(10, vect.at(1));
	}

	@Test
	public void testing_remove() {
		Vector<Integer> vect = new Vector<>();
        vect.push_back(5);
        vect.push_back(10);
        assertEquals(2, vect.size());
        vect.pop_back();
        assertEquals(1, vect.size());
	}

	@Test
	public void testing_resize() {
		Vector<Integer> vect = new Vector<>();
        int size = 50;
        for(int i = 0; i < size; i++) {
            vect.push_back(i);
        }
        assertEquals(size, vect.size());
	}
}
