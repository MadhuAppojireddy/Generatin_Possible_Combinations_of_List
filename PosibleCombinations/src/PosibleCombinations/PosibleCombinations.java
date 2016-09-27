/**
 * 
 */
package PosibleCombinations;

/**
 * @author Madhu_Appojireddy
 *
 */
public class PosibleCombinations {

	/**
	 * @param args
	 */
	
	/* You can give any number rows and columns as per the problem specification */
	
	     public static String[][] vec = {{"A1","B1","C1"}, {"A2"}, {"B3","A3"}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		posiblecombinations(0, "");
		

	}
	
	public static void posiblecombinations(int d, String str) {
		  if (d == vec.length) {
			System.out.println(str.substring(0, str.length()-1));
			return;
		  }
		  for (int k = 0; k < vec[d].length; k++) {
			  posiblecombinations(d + 1, str + vec[d][k] + ",");
		  }
		  return;
		  
		}

}
