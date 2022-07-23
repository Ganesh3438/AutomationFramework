package javaQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WAP28_FindDuplicateElements {

	public static void main(String[] args) {
		
		String infra[] = {"Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Saucelabs", "Azure", "GCP"};
		
		// approach 1 :
		
		for(int i=0; i<infra.length; i++) {
			
			for(int j=i+1; j<infra.length; j++) {
				
				if(infra[i].equals(infra[j])) {
					System.out.println(infra[j]);
				}
			}
		}
		
		
		//approach 2:
		
		String name = "maheshbabu";
		
		char[] c = name.toCharArray();
		
		for(int i=0; i<name.length(); i++) {
			
			for(int j=i+1; j<name.length(); j++) {
				
				if(c[i]==c[j]) {
					
					System.out.println(c[i]);
				}
			}
		}

		
		// approach 3:
		
		String name1 = "java";
		
		char[] ch = name1.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character character: ch) {
			
			Integer count = map.get(character);
			
			if(count == null) {
				map.put(character, 1);
			}else {
				count = count + 1;
				map.put(character, count);
			}
			
		}
		System.out.println(map);
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<Character, Integer> map1: entrySet) {
			
			if(map1.getValue()>1) {
				System.out.println(map1.getKey() + " "+ map1.getValue());
			}
		}
	}

	
	
	
	
	
}
