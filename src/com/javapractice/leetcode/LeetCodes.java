package com.javapractice.leetcode;


public class LeetCodes {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    	/*
		AddTwoNumbers test = new AddTwoNumbers();
		ListNode one = new ListNode(0);
		ListNode two = new ListNode(9);
		ListNode three = new ListNode(1);
		ListNode four = new ListNode(6);
		two.next = three;
		three.next = four;
		ListNode cur = test.addTwoNumbersAlter(one, two);
		while(cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
		
		Anagrams test0 = new Anagrams();
		String[] a = {"tho","tin","erg","end","pug","ton","alb",
				"mes","job","ads","soy","toe","tap","sen","ape",
				"led","rig","rig","con","wac","gog","zen","hay",
				"lie","pay","kid","oaf","arc","hay","vet","sat",
				"gap","hop","ben","gem","dem","pie","eco","cub",
				"coy","pep","wot","wee"};
		//String[] b = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
		//String[] c = {"", ""};
		System.out.println(test0.anagrams(a));
		
    	Candy test1 = new Candy();
    	int[] ratings = {1,2};
    	int res = test1.candy(ratings);
    	System.out.println(res);
    	
    	long begintime = System.nanoTime();
    	UniqueBST test2 = new UniqueBST();
    	int res2 = test2.numTrees(20);
    	long endtime=System.nanoTime();
    	long costTime1 = (endtime - begintime)/1000;

    	begintime = System.nanoTime();
    	res2 = test2.numTreesDP(20);
    	endtime=System.nanoTime();
    	long costTime2 = (endtime - begintime)/1000;
    	
    	System.out.println("result is: " + res2 + " cost time: " + costTime1 + "ms" 
    			+ " cost time 2: " + costTime2 + "ms");

		char[][] graph = {
				{0,8,7,6,5,4,3,2,1},
                {2,0,0,0,0,0,0,0,0},
                {3,0,0,0,0,0,0,0,0},
                {4,0,0,0,0,0,0,0,0},
                {5,0,0,0,0,0,0,0,0},
                {6,0,0,0,0,0,0,0,0},
                {7,0,0,0,0,0,0,0,0},
                {8,0,0,0,0,0,0,0,0},
                {9,0,0,0,0,0,0,0,0}};
		
		ValidSudoku test3 = new ValidSudoku();
		System.out.println(test3.isValidSudoku(graph));
    	WordSearchII test = new WordSearchII();
    	char[][] board = {{'a'}};
    	String[] words = {"a"};
    	System.out.println(test.findWords(board, words));
		*/
    	BasicCalculator test = new BasicCalculator();
    	System.out.println(test.calculate("(3-(2-(5-(9-(4)))))"));
    }
    
}