
public class InterfaceEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SeparateVolume obj1= new SeparateVolume(
			"863777��","����","��������");
	AppCDInfo obj2 = new AppCDInfo(
			"2007-7001","Redhat Fedora");
	
	obj1.checkOut("���ο�","20131121");
	obj2.checkOut("���ο�","20131121");
	
	obj1.checkIn();
	obj2.checkIn();

	}

}
