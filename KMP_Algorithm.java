package cs323Project2;

public class KMP_Algorithm 
{
	String pattern ;
	long startTime ;
	long endTime ;
	int operations ;
	int times ;

	public KMP_Algorithm()
	{
		pattern = "" ;
		startTime = 0 ;
		endTime = 0 ;
		operations = 0 ;
		times = 0 ;
	}
	void KMPSearch(String pat, String txt) 
	{ 
		int M = pat.length(); 
		int N = txt.length(); 
		operations = 0 ;
		// create lps[] that will hold the longest 
		// prefix suffix values for pattern 
		int lps[] = new int[M]; 
		int j = 0; // index for pat[] 

		// Preprocess the pattern (calculate lps[] 
		// array) 
		startTime = System.nanoTime();
		computeLPSArray(pat, M, lps); 

		int i = 0; // index for txt[] 
		while (i < N) 
		{ 
			if (pat.charAt(j) == txt.charAt(i)) 
			{ 
				j++; 
				i++; 
				operations++ ;
			} 
			if (j == M) 
			{ 
				pattern += "Found pattern " + "at index " + (i - j) + "\n" ; 
				j = lps[j - 1]; 
				times++ ;
			} 

			// mismatch after j matches 
			else if (i < N && pat.charAt(j) != txt.charAt(i)) 
			{ 
				// Do not match lps[0..lps[j-1]] characters, 
				// they will match anyway 
				if (j != 0) 
					j = lps[j - 1]; 
				else
					i = i + 1; 
				
				operations++ ;
				
			} 
		} 
		endTime = System.nanoTime();
	} 
	

	private void computeLPSArray(String pat, int M, int lps[]) 
	{ 
		// length of the previous longest prefix suffix 
		int len = 0; 
		int i = 1; 
		lps[0] = 0; // lps[0] is always 0 

		// the loop calculates lps[i] for i = 1 to M-1 
		while (i < M) { 
			if (pat.charAt(i) == pat.charAt(len)) { 
				len++; 
				lps[i] = len; 
				i++; 
			} 
			else // (pat[i] != pat[len]) 
			{ 
				// This is tricky. Consider the example. 
				// AAACAAAA and i = 7. The idea is similar 
				// to search step. 
				if (len != 0) { 
					len = lps[len - 1]; 

					// Also, note that we do not increment 
					// i here 
				} 
				else // if (len == 0) 
				{ 
					lps[i] = len; 
					i++; 
				} 
			} 
		} 
	} 

	public String toString()
	{
		long duration = (endTime - startTime);
		
		if( pattern == "" )
			return "Pattern not found.\nTime taken: "  + duration + " Nanosecond, Number of Operations: " + operations + "\n" ;
		
		if( times > 1 )
			operations += ( times - 1 ) ;
		
		String temp = pattern ;
		pattern = "" ;
		
		return temp + "Time taken to find the pattern: " + duration + " Nanosecond, Number of Operations: " + operations  + "\n" ;
	}
}
