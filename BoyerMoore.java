package cs323Project2;

/* Java Program for Bad Character Heuristic of Boyer  
Moore String Matching Algorithm */
  
public class BoyerMoore { 
	
	String pattern ;
	long startTime ;
	long endTime ;
	int comparisons ;
	int times ;

	public BoyerMoore() {
		pattern = "" ;
		startTime = 0 ;
		endTime = 0 ;
		comparisons = 0 ;
		times = 0 ;
	}
	
	int NO_OF_CHARS = 256; 
	
	int max (int a, int b) { 
		return (a > b)? a: b; 
	}
	
	void badCharHeuristic( char []str, int size,int badchar[]) { 
		int i;
		
		for (i = 0; i < NO_OF_CHARS; i++) {
           badchar[i] = -1; 
		}
		
		for (i = 0; i < size; i++) {
           badchar[(int) str[i]] = i; 
		}
	} 
	
	void search(char txt[],  char pat[]) { 
		int m = pat.length; 
		int n = txt.length; 
		comparisons = 0 ;
		
		startTime = System.nanoTime();
		int badchar[] = new int[NO_OF_CHARS]; 
		
		badCharHeuristic(pat, m, badchar); 
		
		int s = 0;  
		while(s <= (n - m)) { 
			comparisons++;
			int j = m-1; 
			
			while(j >= 0 && pat[j] == txt[s+j]) {
				comparisons++;
				j--; 
			}
			
			if (j < 0) {
				pattern = "Patterns occur at shift = " + s;
				s += (s+m < n)? m-badchar[txt[s+m]] : 1;
				comparisons++;
				times++;
			}
			else {
				comparisons++;
				s += max(1, j - badchar[txt[s+j]]); 
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
