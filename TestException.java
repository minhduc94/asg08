import java.util.*;

class ExceptionA extends Exception{
}

class ExceptionB extends ExceptionA{
}

class ExceptionC extends ExceptionB{
}

public class TestException {
	public static void main(String [] args){
		try{
			Random rand = new Random();
			if( rand.nextInt(2) == 0 ) throw new ExceptionB();
			else throw new ExceptionC();
		}
		catch(ExceptionA e){
			e.printStackTrace();
		}
	}
}