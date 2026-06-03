package opps_concept;

class Admin {

	// super admin

	String Admin(String readpermission, String writepermission, String executepermission) {
		String rolls = readpermission + writepermission + executepermission;
		return rolls;
	}
          //sub admin
	int Admin(int readmode, int writemode) {
		int rolls = readmode + writemode;
		return rolls;
	}
	  //only admin
	int Admin(int readmode) {
		int rolls = readmode;
		return rolls;
	

}
	
}//class end

public class OverloadingDemo {
	
	public static void main(String arg[]) {
		
		Admin admin = new Admin();//calling method admin from here
	int result = admin.Admin(1);
	System.out.println("admin mode"+result);
	int temp = admin.Admin(0, 1);
	System.out.println("admin "+temp);
	String values =	admin.Admin("r\t", "w\t", "e\t");
	System.out.println("admin "+values);
		
	}
}