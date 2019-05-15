
public class Escr 
{

	viernes t = new viernes();
	
	
	
	public void punto()
	{
		t.moverbrazo(50);
		t.moverbrazo(-50);
		t.caminar(1);
	}
	
	public void raya()
	{
		t.moverbrazo(50);
		t.caminar(2);
		t.moverbrazo(-50);
		t.caminar(1);
	}
}
