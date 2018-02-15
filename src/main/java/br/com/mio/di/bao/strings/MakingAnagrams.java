package br.com.mio.di.bao.strings;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] alphabetLetters = new int[26];
        int count = 0;
        for(char letters : first.toCharArray()) {
        	alphabetLetters[letters - 'a']++;
        }
        for(char letters : second.toCharArray()) {
        	alphabetLetters[letters - 'a']--;
        }
        for(int value : alphabetLetters) {
        	count += Math.abs(value);
        }
        return count;
    }
    
    public static int abs(int n) {
        return (n ^ (n >> 31)) + (n >>> 31);
    }
  
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
    	Long begin = System.currentTimeMillis();
        String a = "cde";//in.next();
        String b = "abc";//in.next();
        System.out.println(numberNeeded(a, b));
        Long end = System.currentTimeMillis();
        System.out.println("Time is: "+(begin - end));
    }
}
