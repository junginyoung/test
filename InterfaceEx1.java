
public class InterfaceEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SeparateVolume obj1= new SeparateVolume(
			"863777개","개미","베르베르");
	AppCDInfo obj2 = new AppCDInfo(
			"2007-7001","Redhat Fedora");
	
	obj1.checkOut("정인영","20131121");
	obj2.checkOut("정인영","20131121");
	
	obj1.checkIn();
	obj2.checkIn();

	}

}
