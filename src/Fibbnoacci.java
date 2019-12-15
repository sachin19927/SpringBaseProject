
public class Fibbnoacci {



	
	public static void main(String[] args) {
	
		String name="madam";
		String orignal=name;
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+orignal.charAt(i);
		}
		System.err.println(reverse);
		if(orignal==reverse)
		{
			System.err.println("paalendrome");
		}
		else
		{
			System.err.println("not paalendrome");
		}
	
		
	
		
	}
	
	
	
	
	
}
