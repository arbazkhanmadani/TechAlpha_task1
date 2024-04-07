import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;

public class RemoveDuplicateFromAnArray{

	public static void main(String[] args) {

	    Object[] ua = duplicate(new int[] {3,0,3,1,1,7,2,1});
        for(Object o : ua ) System.out.println(o);

	}
	
	public static Object[] duplicate(int[] a){


        if(a.length==0) return null;
		
        int count=0;
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for(int i =0; i<a.length; i++){
			
			if(hm.get(a[i])==null){
				//false key -> one time(unique) 
				hm.put(a[i], false);
            }
			else {
				//true key -> multiple time(duplicate) 
                hm.put(a[i], true);
				
			}
		 }
		
		
		for(Entry<Integer, Boolean> entry : hm.entrySet() ){
			
			//entry.getValue()==false =>one time....
			if(entry.getValue()==false){
			 count++;
			}
		}


        Object ua[] =  new Object[count];
        int idx = 0;
        
        for(Entry<Integer, Boolean> entry : hm.entrySet() ){
			
			//entry.getValue()==false =>one time....
			if(entry.getValue()==false){
			 ua[idx++] =  entry.getKey();
             System.out.println("idc : "+ idx);
			}
		}

        return ua;

	}
}
