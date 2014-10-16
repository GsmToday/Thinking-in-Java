/**
 * Composition for code reuse
 * Chapter 7 in Thinking in Java
 * Practice 1
 */
class Soap{
	private String s;
	public String toString(){
		return s;
	}
}
class Bath {

	private Soap DiaoPai;
	private String value;
	
	public void show()
	{
		if(DiaoPai == null)
		{
			DiaoPai = new Soap();
		}		
	}
}
