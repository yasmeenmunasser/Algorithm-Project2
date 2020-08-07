package cs323Project2;

public class RabinKarpAlgorithm {

	// d is the number of characters in the input alphabet 

	int d;
	long startTime ;
	long endTime ;
	int q;
	String pattern;
	int comparisons;
	
	public RabinKarpAlgorithm() {
		d = 256;
		startTime = 0;
		endTime = 0;
		q = 101;
		pattern = "";
		comparisons = 0;
	}

	/* pat -> pattern 
        txt -> text 
        q -> A prime number 
	 */

	void search(String txt, String pat) 
	{ 
		startTime = System.nanoTime();
		int M = pat.length();                   
		int N = txt.length(); 
		int i, j; 
		int p = 0; // hash value for pattern 
		int t = 0; // hash value for txt 
		int h = 1; 
		comparisons = 0;
		
		for (i = 0; i < M-1; i++) 
		{
			h = (h*d)%q; 
		}
		// Calculate the hash value of pattern and first 
		// window of text 
		for (i = 0; i < M; i++) 
		{ 
			p = (d*p + pat.charAt(i))%q; 
			t = (d*t + txt.charAt(i))%q; 					

		} 

		// Slide the pattern over text one by one 
		for (i = 0; i <= N - M; i++) 
		{ 

			// Check the hash values of current window of text 
			// and pattern. If the hash values match then only 
			// check for characters on by one 
			if ( p == t ) 
			{ 
				/* Check for characters one by one */
				for (j = 0; j < M; j++) 
				{ if (txt.charAt(i+j) != pat.charAt(j)) 
				{
					comparisons++;
					break; }
				} 

				// if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1] 
				if (j == M) 
					pattern += "Pattern found at index " + i; 
			} 

			// Calculate hash value for next window of text: Remove 
			// leading digit, add trailing digit 
			if ( i < N-M ) 
			{ 
				t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q; 

				// We might get negative value of t, converting it 
				// to positive 
				if (t < 0) 
					t = (t + q); 
				comparisons++;
			} 
		} 

		endTime = System.nanoTime();
	} 

			public String toString() {
				long duration = (endTime - startTime);
				
				if( pattern == "" )
					return "Pattern not found.\nTime taken: "  + duration + " Nanosecond,\nNumber of Comparisons: " + comparisons + "\n" ;
				
				String temp = pattern ;
				pattern = "" ;
				
				return temp + "\nTime taken to find the pattern: " + duration + " Nanosecond,\nNumber of Comparisons: " + comparisons  + "\n" ;
			}

}
