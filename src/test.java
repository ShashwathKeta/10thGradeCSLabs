
public class test {
	public static void main(String[] args) {
		int[] aRay = {5,10,3,6,9,15};
		
		for(int i = 0; i<aRay.length; i = i+2) {
			aRay[i] = aRay[aRay.length-1-i];
		}
		
		System.out.println(aRay[4]);
	}

}