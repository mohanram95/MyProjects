package Practiceprograms;

public class Findtheoccuranceofthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Mohanram";
		
		char tofind='m';
		
		int occurance=0;
		
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==tofind)
			{
				occurance++;
			}
		}
		
		System.out.println(occurance);
		
	}

}
