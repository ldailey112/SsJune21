
public class Singleton 
{
	//first check
	volatile public static Singleton instance = null;
	
	private Singleton()
	{
		
	}
	
	public Singleton getInstance()
	{
		synchronized(instance)
		{
			//double check
			if(instance == null)
			{
				instance = new Singleton();
			}
		}
		return instance;
	}

}
