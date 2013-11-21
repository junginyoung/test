/**
 * �η� CDŬ����
 * @author ���ο�
 *
 */
public class AppCDInfo extends CDInfo implements Lendable{
	String borrower; //������
	String checkOutDate; //��Ǯ��
	byte state; //�������

	/**
	 * �η�CDŬ���� ������
	 * @param registerNo : ���ù�ȣ
	 * @param title : Ÿ��Ʋ
	 */


	AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(state==0){
			this.borrower = borrower;
			this.checkOutDate=date;
			this.state=1;
			System.out.println("*"+this.title+"��(��) ����Ǿ����ϴ�.");
			System.out.println("������:"+this.borrower);
			System.out.println("������:"+this.checkOutDate);
		}else{
			System.out.println("������ �Ұ��� �մϴ�.");

		}
	}



	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println("*"+this.title+"��(��) �ݳ��Ǿ����ϴ�.");

	}

}

