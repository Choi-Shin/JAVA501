package p10.static_block;

public class HundredNumbers {
    static int arr[];
    
    //실행 버튼을 누르면 가장먼저 실행(한번만)
    static{
    	arr = new int[100];
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = i;
    		
    	}
    }
    
    
    {
    	
    }
}
