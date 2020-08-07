package cs323Project2;

public class Application {

	public static void main(String[] args) 
	{
		//Data Source1 Size 10
		String txt1 = "cornucopia" ; 
		String pat1 = "cop" ; 
		String notPat1 = "corona" ; 

		//Data Source1 Size 50
		String txt2 = "Hedreamedofeatinggreenappleswithworms." ;
		String pat2 = "enap" ; 
		String notPat2 = "read" ; 

		//Data Source1 Size 100
		String txt3 = "Therobotclickeddisapprovingly,gurgledbrieflyinsideitscubicalinteriorandextrudedaponyglassofb"
				+ "rownishliquid.\"Sir,youwillundoubtedlyendupin" ;
		String pat3 = "ishli" ; 
		String notPat3 = "sir" ; 

		//Data Source2 Size 10
		String txt12 = "29638880996100942" ; 
		String pat12 = "09"; 
		String notPat12 = "99618" ; 

		//Data Source2 Size 50
		String txt22 = "9835614154070848930559474331256807322273626290545730872262" ;
		String pat22 = "32227" ; 
		String notPat22 = "9648" ; 

		//Data Source2 Size 100
		String txt32 = "0538284834778303750535803409674221358292009279975593722931162935461907220544360072940"
				+ "11556028700728694503257735484177359637750307553268255921812518357828110693533195053776355268361992139433515999671671416475594826069036579106" ;
		String pat32 = "7735" ; 
		String notPat32 = "1234" ; 

		//Data Source3 Size 10
		String txt13 = "9clvZIi0uJZi" ; 
		String pat13 = "ZI"; 
		String notPat13 = "helo" ; 

		//Data Source3 Size 50
		String txt23 = "9clvZIi0uJqhnDPKh8faDqJ7aJfS7eeQAOpnXMGju1MwjrnVD2" ;
		String pat23 = "pnX" ; 
		String notPat23 = "DJ" ; 

		//Data Source3 Size 100
		String txt33 = "LbEpmjtFo0fLlRK7oPCnmN0C9HKm2mtQ3Vy2JOxa2n5Xb4DqM9Mbqu2ZsN9pV0Yrg5EHMWQovQ1rXyaM41rCLbK2UXFa9K16zgZjPwKgHdCCpgoaDH4HsJ17g5UQ1AYVsb29k"
				+ "gGoI6wdjgbuWWHO7b7hdwpmvJxS3rQqKzNkwrO91JSmyvomE9QfJw9lCOWsmhvCKPSdX2KJfIcabJie6Ju3Y1KW4mUWnCtvFmP8rO5cDvPGkSX9HWjIGAaprXDZdmXW4cwhDKSor" ;
		String pat33 = "X2KJf" ; 
		String notPat33 = "cow" ; 
		
		
		//Data Source1 Size 10
		char text1[] = "cornucopia".toCharArray();
		char patt1[] = "cop".toCharArray();
		char notPatt1[] = "corona".toCharArray(); 

		//Data Source1 Size 50
		char text2[] = "Hedreamedofeatinggreenappleswithworms.".toCharArray();
		char patt2[] = "enap".toCharArray(); 
		char notPatt2[] = "read".toCharArray(); 

		//Data Source1 Size 100
		char text3[] = "Therobotclickeddisapprovingly,gurgledbrieflyinsideitscubicalinteriorandextrudedaponyglassofbrownishliquid.Sir,youwillundoubtedlyendupin".toCharArray();
		char patt3[] = "ishli".toCharArray(); 
		char notPatt3[] = "sir".toCharArray(); 

		//Data Source2 Size 10
		char text12[] = "29638880996100942".toCharArray(); 
		char patt12[] = "09".toCharArray(); 
		char notPatt12[] = "99618".toCharArray(); 

		//Data Source2 Size 50
		char text22[] = "9835614154070848930559474331256807322273626290545730872262".toCharArray();
		char patt22[] = "32227".toCharArray(); 
		char notPatt22[] = "9648".toCharArray(); 

		//Data Source2 Size 100
		char text32[] = "053828483477830375053580340967422135829200927997559372293116293546190722054436007294011556028700728694503257735484177359637750307553268255921812518357828110693533195053776355268361992139433515999671671416475594826069036579106".toCharArray();
		char patt32[] = "7735".toCharArray(); 
		char notPatt32[] = "1234".toCharArray(); 

		//Data Source3 Size 10
		char text13[] = "9clvZIi0uJZi".toCharArray(); 
		char patt13[] = "ZI".toCharArray(); 
		char notPatt13[] = "helo".toCharArray(); 

		//Data Source3 Size 50
		char text23[] = "9clvZIi0uJqhnDPKh8faDqJ7aJfS7eeQAOpnXMGju1MwjrnVD2".toCharArray();
		char patt23[] = "pnX".toCharArray(); 
		char notPatt23[] = "DJ".toCharArray(); 

		//Data Source3 Size 100
		char text33[] = "LbEpmjtFo0fLlRK7oPCnmN0C9HKm2mtQ3Vy2JOxa2n5Xb4DqM9Mbqu2ZsN9pV0Yrg5EHMWQovQ1rXyaM41rCLbK2UXFa9K16zgZjPwKgHdCCpgoaDH4HsJ17g5UQ1AYVsb29kgGoI6wdjgbuWWHO7b7hdwpmvJxS3rQqKzNkwrO91JSmyvomE9QfJw9lCOWsmhvCKPSdX2KJfIcabJie6Ju3Y1KW4mUWnCtvFmP8rO5cDvPGkSX9HWjIGAaprXDZdmXW4cwhDKSor".toCharArray();
		char patt33[] = "X2KJf".toCharArray(); 
		char notPatt33[] = "cow".toCharArray();
		
		// Declaring Search Structures 
		BoyerMoore boyerMoore = new BoyerMoore();
		
		
		

		NaiveAlgorithm na = new NaiveAlgorithm() ;

		KMP_Algorithm kmp = new KMP_Algorithm() ;

		RabinKarpAlgorithm rka = new RabinKarpAlgorithm() ;


		//NaiveAlgorithm

		System.out.println( "                                       ||  Naive Algorithm  ||                                                \n"
				+ "\n---------------------------***********************************************------------------------------------------" ) ;

		//testing data Source1 Size 10 when pattern exist
		na.search( txt1, pat1); 
		System.out.println( "Testing Data Source 1, size 10 when pattern exist:\n\n" + na );

		//testing data Source1 Size 10 when pattern does not exist
		na.search( txt1, notPat1) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 1, size 10 when pattern does not exist:\n\n" + na ) ;

		//testing data Source1 Size 50 when pattern exist
		na.search(txt2, pat2) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 50 when pattern exist:\n\n" + na ) ;

		//testing data Source1 Size 50 when pattern does not exist
		na.search(txt2, notPat2) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 50 when pattern does not exist:\n\n" + na ) ;

		//testing data Source1 Size 100 when pattern exist
		na.search(txt3, pat3) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 100 when pattern exist:\n\n" + na ) ;

		//testing data Source1 Size 100 when pattern does not exist
		na.search(txt3, notPat3) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 100 when pattern does not exist:\n\n" + na ) ;


		//testing data Source2 Size 10 when pattern exist
		na.search(txt12, pat12); 
		System.out.println( "\n------------------------------------------------------------------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 10 when pattern exist:\n\n" + na );

		//testing data Source2 Size 10 when pattern does not exist
		na.search(txt12, notPat12) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 2, size 10 when pattern does not exist:\n\n" + na ) ;

		//testing data Source2 Size 50 when pattern exist
		na.search(txt22, pat22) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 50 when pattern exist:\n\n" + na ) ;

		//testing data Source2 Size 50 when pattern does not exist
		na.search(txt22, notPat22) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 50 when pattern does not exist:\n\n" + na ) ;

		//testing data Source2 Size 100 when pattern exist
		na.search(txt32, pat32) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 100 when pattern exist:\n\n" + na ) ;

		//testing data Source1 Size 100 when pattern does not exist
		na.search(txt32, notPat32) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 100 when pattern does not exist:\n\n" + na ) ;


		//testing data Source3 Size 10 when pattern exist
		na.search(txt13, pat13); 
		System.out.println( "\n------------------------------------------------------------------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 10 when pattern exist:\n\n" + na );

		//testing data Source3 Size 10 when pattern does not exist
		na.search(txt13, notPat13) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 3, size 10 when pattern does not exist:\n\n" + na ) ;

		//testing data Source3 Size 50 when pattern exist
		na.search(txt23, pat23) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 50 when pattern exist:\n\n" + na ) ;

		//testing data Source3 Size 50 when pattern does not exist
		na.search(txt23, notPat23) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 50 when pattern does not exist:\n\n" + na ) ;

		//testing data Source3 Size 100 when pattern exist
		na.search(txt33, pat33) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 100 when pattern exist:\n\n" + na ) ;

		//testing data Source3 Size 100 when pattern does not exist
		na.search(txt33, notPat33) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 100 when pattern does not exist:\n\n" + na ) ;

		System.out.println( "                                      ||  Naive Algorithm  Ends ||                                                \n"
				+ "\n---------------------------***********************************************------------------------------------------"
				+ "\n\n                                  ||  Rabin Karp Algorithm  Starts ||                                                \n" 
				+ "\n---------------------------***********************************************------------------------------------------\n") ;



		//testing data Source1 Size 10 when pattern exist
		rka.search(txt1, pat1); 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 1, size 10 when pattern exist:\n\n" + rka ) ;


		//testing data Source1 Size 10 when pattern does not exist
		rka.search( txt1, notPat1) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 1, size 10 when pattern does not exist:\n\n" + rka ) ;

		//testing data Source1 Size 50 when pattern exist
		rka.search(txt2, pat2) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 50 when pattern exist:\n\n" + rka ) ;

		//testing data Source1 Size 50 when pattern does not exist
		rka.search(txt2, notPat2) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 50 when pattern does not exist:\n\n" + rka ) ;

		//testing data Source1 Size 100 when pattern exist
		rka.search(txt3, pat3) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 100 when pattern exist:\n\n" + rka ) ;

		//testing data Source1 Size 100 when pattern does not exist
		rka.search(txt3, notPat3) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 100 when pattern does not exist:\n\n" + rka ) ;


		//testing data Source2 Size 10 when pattern exist
		rka.search(txt12, pat12); 
		System.out.println( "\n-------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 10 when pattern exist:\n\n" + rka );

		//testing data Source2 Size 10 when pattern does not exist
		rka.search(txt12, notPat12) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 2, size 10 when pattern does not exist:\n\n" + rka ) ;

		//testing data Source2 Size 50 when pattern exist
		rka.search(txt22, pat22) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 50 when pattern exist:\n\n" + rka ) ;

		//testing data Source2 Size 50 when pattern does not exist
		rka.search(txt22, notPat22) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 50 when pattern does not exist:\n\n" + rka ) ;

		//testing data Source2 Size 100 when pattern exist
		rka.search(txt32, pat32) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 100 when pattern exist:\n\n" + rka ) ;

		//testing data Source1 Size 100 when pattern does not exist
		rka.search(txt32, notPat32) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 100 when pattern does not exist:\n\n" + rka ) ;


		//testing data Source3 Size 10 when pattern exist
		rka.search(txt13, pat13); 
		System.out.println( "\n------------------------------------------------------------------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 10 when pattern exist:\n\n" + rka );

		//testing data Source3 Size 10 when pattern does not exist
		rka.search(txt13, notPat13) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 3, size 10 when pattern does not exist:\n\n" + rka ) ;

		//testing data Source3 Size 50 when pattern exist
		rka.search(txt23, pat23) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 50 when pattern exist:\n\n" + rka ) ;

		//testing data Source3 Size 50 when pattern does not exist
		rka.search(txt23, notPat23) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 50 when pattern does not exist:\n\n" + rka ) ;

		//testing data Source3 Size 100 when pattern exist
		rka.search(txt33, pat33) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 100 when pattern exist:\n\n" + rka ) ;

		//testing data Source3 Size 100 when pattern does not exist
		rka.search(txt33, notPat33) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 100 when pattern does not exist:\n\n" + rka ) ;

		System.out.println( "                                   ||  Rabin Karp Algorithm  Ends ||                                                \n"
				+ "\n---------------------------***********************************************------------------------------------------"
				+ "\n\n                              ||  Knuth Morris Pratt Algorithm  Starts||                                                \n" 
				+ "\n---------------------------***********************************************------------------------------------------\n") ;



		//testing data Source1 Size 10 when pattern exist
		kmp.KMPSearch( pat1, txt1); 
		System.out.println( "Testing Data Source 1, size 10 when pattern exist:\n\n" + kmp );

		//testing data Source1 Size 10 when pattern does not exist
		kmp.KMPSearch( notPat1, txt1 ) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 1, size 10 when pattern does not exist:\n\n" + kmp ) ;

		//testing data Source1 Size 50 when pattern exist
		kmp.KMPSearch(pat2, txt2 ) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 50 when pattern exist:\n\n" + kmp ) ;

		//testing data Source1 Size 50 when pattern does not exist
		kmp.KMPSearch( notPat2, txt2 ) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 50 when pattern does not exist:\n\n" + kmp ) ;

		//testing data Source1 Size 100 when pattern exist
		kmp.KMPSearch(pat3, txt3 ) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 100 when pattern exist:\n\n" + kmp ) ;

		//testing data Source1 Size 100 when pattern does not exist
		kmp.KMPSearch( notPat3, txt3 ) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 100 when pattern does not exist:\n\n" + kmp ) ;


		//testing data Source2 Size 10 when pattern exist
		kmp.KMPSearch( pat12, txt12); 
		System.out.println( "\n------------------------------------------------------------------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 10 when pattern exist:\n\n" + kmp );

		//testing data Source2 Size 10 when pattern does not exist
		kmp.KMPSearch( notPat12, txt12 ) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 2, size 10 when pattern does not exist:\n\n" + kmp ) ;

		//testing data Source2 Size 50 when pattern exist
		kmp.KMPSearch(pat22 , txt22 ) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 50 when pattern exist:\n\n" + kmp ) ;

		//testing data Source2 Size 50 when pattern does not exist
		kmp.KMPSearch( notPat22 , txt22 ) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 50 when pattern does not exist:\n\n" + kmp ) ;

		//testing data Source2 Size 100 when pattern exist
		kmp.KMPSearch(pat32, txt32 ) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 100 when pattern exist:\n\n" + kmp ) ;

		//testing data Source1 Size 100 when pattern does not exist
		kmp.KMPSearch( notPat32 , txt32 ) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 100 when pattern does not exist:\n\n" + kmp ) ;


		//testing data Source3 Size 10 when pattern exist
		kmp.KMPSearch( pat13, txt13); 
		System.out.println( "\n------------------------------------------------------------------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 10 when pattern exist:\n\n" + kmp );

		//testing data Source3 Size 10 when pattern does not exist
		kmp.KMPSearch( notPat13, txt13 ) ; 
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 3, size 10 when pattern does not exist:\n\n" + kmp ) ;

		//testing data Source3 Size 50 when pattern exist
		kmp.KMPSearch(pat23 , txt23 ) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 50 when pattern exist:\n\n" + kmp ) ;

		//testing data Source3 Size 50 when pattern does not exist
		kmp.KMPSearch( notPat23 , txt23 ) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 50 when pattern does not exist:\n\n" + kmp ) ;

		//testing data Source3 Size 100 when pattern exist
		kmp.KMPSearch(pat33, txt33 ) ; 
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 100 when pattern exist:\n\n" + kmp ) ;

		//testing data Source3 Size 100 when pattern does not exist
		kmp.KMPSearch( notPat33 , txt33 ) ; 
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 100 when pattern does not exist:\n\n" + kmp ) ;


		System.out.println( "                                ||  Knuth Morris Pratt Algorithm  Ends||                                               \n"
				+ "\n---------------------------***********************************************------------------------------------------"
				+ "\n\n                                 ||  Boyer Moore Algorithm  Starts||                                                \n" 
				+ "\n---------------------------***********************************************------------------------------------------\n") ;



		//testing data Source1 Size 10 when pattern exist
		boyerMoore.search(text1, patt1);
		System.out.println( "Testing Data Source 1, size 10 when pattern exist:\n\n" + boyerMoore);

		//testing data Source1 Size 10 when pattern does not exist
		boyerMoore.search(text1, notPatt1);
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 1, size 10 when pattern does not exist:\n\n" + boyerMoore);

		//testing data Source1 Size 50 when pattern exist
		boyerMoore.search(text2, patt2);
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 50 when pattern exist:\n\n" + boyerMoore);

		//testing data Source1 Size 50 when pattern does not exist
		boyerMoore.search(text2, notPatt2);
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 50 when pattern does not exist:\n\n" + boyerMoore) ;

		//testing data Source1 Size 100 when pattern exist
		boyerMoore.search(text3, patt3);
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 1, size 100 when pattern exist:\n\n" + boyerMoore);

		//testing data Source1 Size 100 when pattern does not exist
		boyerMoore.search(text3, notPatt3);
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 1, size 100 when pattern does not exist:\n\n" + boyerMoore);

		//testing data Source2 Size 10 when pattern exist
		boyerMoore.search(text12, patt12);
		System.out.println( "\n------------------------------------------------------------------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 10 when pattern exist:\n\n" + boyerMoore);

		//testing data Source2 Size 10 when pattern does not exist
		boyerMoore.search(text12, notPatt12);
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 2, size 10 when pattern does not exist:\n\n" + boyerMoore);

		//testing data Source2 Size 50 when pattern exist 
		boyerMoore.search(text22, patt22);
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 50 when pattern exist:\n\n" + boyerMoore);

		//testing data Source2 Size 50 when pattern does not exist
		boyerMoore.search(text22, notPatt22);
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 50 when pattern does not exist:\n\n" + boyerMoore);

		//testing data Source2 Size 100 when pattern exist
		boyerMoore.search(text32, patt32);
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 2, size 100 when pattern exist:\n\n" + boyerMoore);

		//testing data Source1 Size 100 when pattern does not exist
		boyerMoore.search(text32, notPatt32);
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 2, size 100 when pattern does not exist:\n\n" + boyerMoore);


		//testing data Source3 Size 10 when pattern exist
		boyerMoore.search(text13, patt13);
		System.out.println( "\n------------------------------------------------------------------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 10 when pattern exist:\n\n" + boyerMoore);

		//testing data Source3 Size 10 when pattern does not exist
		boyerMoore.search(text13, notPatt13);
		System.out.println( "**********************************************\n"
				+ "Testing Data Source 3, size 10 when pattern does not exist:\n\n" + boyerMoore);

		//testing data Source3 Size 50 when pattern exist
		boyerMoore.search(text23, patt23);
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 50 when pattern exist:\n\n" + boyerMoore);

		//testing data Source3 Size 50 when pattern does not exist
		boyerMoore.search(text23, notPatt23);
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 50 when pattern does not exist:\n\n" + boyerMoore);

		//testing data Source3 Size 100 when pattern exist
		boyerMoore.search(text33, patt33);
		System.out.println( "---------------------------------------------------------------------------\n" + 
				"\nTesting Data Source 3, size 100 when pattern exist:\n\n" + boyerMoore);

		//testing data Source3 Size 100 when pattern does not exist
		boyerMoore.search(text33, notPatt33);
		System.out.println( "**********************************************\n" + 
				"\nTesting Data Source 3, size 100 when pattern does not exist:\n\n" + boyerMoore);
		
		System.out.println( "                                   ||  Boyer Moore Algorithm  Starts||                                                 \n"
				+ "\n---------------------------***********************************************------------------------------------------" ) ;



	}

}
