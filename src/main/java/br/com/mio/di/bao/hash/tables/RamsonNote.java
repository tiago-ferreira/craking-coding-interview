package br.com.mio.di.bao.hash.tables;

import java.util.HashMap;
import java.util.Map;

public class RamsonNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RamsonNote(String magazine, String note) {
        magazineMap = splitStringAnPutAndMap(magazine);
        noteMap = splitStringAnPutAndMap(note);
    }

	private Map<String, Integer> splitStringAnPutAndMap(String value) {
		Map<String, Integer> map = new HashMap<>();
		for(String str : value.split(" ")) {
        	if(!map.containsKey(str)) {
        		map.put(str, 1);
        	} else {
	        	Integer oldValue = map.get(str);
        		map.put(str, oldValue + 1);
        	}
        }
		return map;
	}
    
    public boolean solve() {
    	if(noteMap.size() > magazineMap.size()) {
    		return false;
    	}
    	for(Map.Entry<String, Integer> value : noteMap.entrySet()) {
    		if(!magazineMap.containsKey(value.getKey()) || magazineMap.get(value.getKey()) < value.getValue()) {
    			return false;
    		}
    	}
        return true;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int m = 6;//scanner.nextInt();
        int n = 5;//scanner.nextInt();
    	String magazine = "two times three is not four";
    	String ramsonNote = "two times two is four";
//        String magazine = "give me one grand today night";
//        String ramsonNote = "give one grand today";
//        int m = 6;//scanner.nextInt();
//        int n = 4;//scanner.nextInt();
        
        // Eat whitespace to beginning of next line
//        scanner.nextLine();
        
        RamsonNote s = new RamsonNote(magazine, ramsonNote);//new RamsonNote(scanner.nextLine(), scanner.nextLine());
//        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}