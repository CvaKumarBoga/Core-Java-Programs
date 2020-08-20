package com.app;

/*
 * LetMobile is want to same features of SamsungMobile i.e version and ram,so that case simply 
 * inherit the SamsumgMobile class it has already implement version and ram features use it 
 * with out implementing the features of LetvMobile class.
 */
public class LetvMobile extends SamsungMobile{
	/*
	 * If I want to only ram feature I dont't want to version future so that case to override the
	 * version method of SamsungMobile class and implement there own version.
	 */
	@Override
	public void version() {
		System.out.println("Android version @ 9.");
	}
	
	public static void main(String[] args) {
		LetvMobile letv = new LetvMobile();
		letv.version();
		letv.ram();
	}

}
/*
 * Output: (Before overriding)
 *	  Android version @ 7.
 *	  Ram is 4GB.
 * 
 * Output:  (After overriding)
 *	  Android version @ 9.
 *	  Ram is 4GB.
 */