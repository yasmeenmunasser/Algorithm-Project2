package cs323Project2;

public class NaiveAlgorithm {

	String pattern ;
	long startTime ;
	long endTime ;
	int comparisons ;
	int times ;

	public NaiveAlgorithm() {
		pattern = "" ;
		startTime = 0 ;
		endTime = 0 ;
		comparisons = 0 ;
		times = 0 ;
	}

	void search(String text, String pattern) 
	{ 
		int M = pattern.length(); 
		int N = text.length(); 
		comparisons = 0;
		startTime = System.nanoTime();

		/* A loop to slide pattern one by one */
		for (int i = 0; i <= N - M; i++) { 
			comparisons++;
			int j; 

			/* For current index i, check for pattern  
              match */
			for (j = 0; j < M; j++) {
				comparisons++;
				if (text.charAt(i + j) != pattern.charAt(j)) {
					comparisons++;
					break;
				} 
			}

			if (j == M) { // if pattern[0...M-1] = txt[i, i+1, ...i+M-1] 
				comparisons++;
				pattern = "Pattern found at index " + i; 
				times++;
			} 
				
		}
		endTime = System.nanoTime();
	} 

	public String toString() {
		long duration = (endTime - startTime);
		
		if( pattern == "" )
			return "Pattern not found.\nTime taken: "  + duration + " Nanosecond,\nNumber of Comparisons: " + comparisons + "\n" ;
		
		if( times > 1 )
			comparisons += ( times - 1 ) ;
		
		String temp = pattern ;
		pattern = "" ;
		
		return temp + "\nTime taken to find the pattern: " + duration + " Nanosecond,\nNumber of Comparisons: " + comparisons  + "\n" ;
	}

}
