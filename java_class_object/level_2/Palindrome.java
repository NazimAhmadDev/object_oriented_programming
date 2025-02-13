package week2_Assignment1;
class PalindromeChecker{
	String text;
	
	PalindromeChecker(String text){
		this.text = text;
	}
	
	public boolean CheckPalindrome() {
		int left = 0;
		int right = text.length()-1;
		
		while(left < right) {
			if(text.charAt(left) != text.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public void result() {
		if(CheckPalindrome()) {
			System.out.println("Text is palindrome");
		}else {
			System.out.println("Text is not palindrome");
		}
	}
}
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeChecker obj = new PalindromeChecker("Noon");
		
		//obj.CheckPalindrome();
		obj.result();

	}

}
