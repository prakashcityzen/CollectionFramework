abstract class Games{
	public abstract  void start();
	public static void stop()
	{
	System.out.println("stopping game in abstract class ");
	}
}
class GameA extends Games{
	public  void start()
	{
		System.out.println("starting game A ");
	}
}
class GameB extends Games{

	public  void start()
	{
		System.out.println("stoping game at B");
	}
}
public class AbstractExample{
	public static void main(String [] args )
	{
		Games A=new GameA();
		Games B=new GameB();
		A.start();
		A.stop();
		B.start();
		B.stop();
	}
}

		


		
