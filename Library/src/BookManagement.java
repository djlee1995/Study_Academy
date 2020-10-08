import java.util.*;
public class BookManagement {
	Scanner sc = new Scanner(System.in);
	Book[] books = new Book[100];
	// ���α׷� ���� flag
	boolean isRun = true;
	// ���� �޴� ���� ��ȣ
	int selectNo = 0;
	// �������� ��ȣ
	int count=1;    

	public BookManagement(){
	    run();
	}

	public void run() {
	    while(isRun) {
	        System.out.println("===============================================================");
	        System.out.println(" 1.������� | 2. ������� | 3.�������� | 4.�������� | 5. ����");
	        System.out.println("===============================================================");
	        selectNo = getSelectNum("��ȣ�� �����ϼ���>");

	        switch(selectNo) {
	            case 1 :
	                registerBook();
	                break;
	            case 2 :
	                selectBook();
	                break;
	            case 3 :
	                updateBook();
	                break;
	            case 4 : 
	                deleteBook();
	                break;
	            case 5 : 
	                terminate();
	                break;    
	            default : 
	                System.out.println("��ϵ� �޴��� �ƴմϴ�.");

	        }
	    }
	}

	// ���α׷� ����
	public void terminate() {
	    System.out.println("���α׷� ����");
	    isRun = false;
	}

	// ���� ���
	
	// ���� ��� ���
	public void selectBook() {
	    System.out.println("2. �������");
	    for(Book b : books) {
	        if(b != null) {
	            printBookInfo(b);
	        }
	    }
	}

	// ���� ���� ����
	public void updateBook() {
	    System.out.println("3. ��������");
	    int bookNum = getSelectNum("������ ������ ������ȣ�� �Է��ϼ��� >");

	    Book b = findBook(bookNum);

	    if(b == null) {
	        System.out.println("�Է��Ͻ� ������ȣ�� å�� �������� �ʽ��ϴ�");
	        return;
	    }

	    boolean isUpdate = true;



	} // BookUpdate end

	// ���� ��Ͽ��� å ���� ����
	public void deleteBook() {
	    System.out.println("4. ��������");
	    int bookNum = getSelectNum("������ ������ ������ȣ�� �Է��ϼ��� >");

	    Book b = findBook(bookNum);

	    if(b == null) {
	        System.out.println("�Է��Ͻ� ������ȣ�� å�� �������� �ʽ��ϴ�");
	        return;
	    }

	    for (int i = 0; i < books.length; i++) {
	        if(books[i] != null && books[i].getNum() == bookNum) {
	            books[i] = null;
	            System.out.println("���� �Ϸ�");
	            return;
	        }
	    }
	}

	// å ���� ���
	public void printBookInfo(Book b) {
	    System.out.println(b.toString());
	}

	// ����������ȣ�� å ���� ã��
	public Book findBook(int num) {

	    for (int i = 0; i < books.length; i++) {
	        if(books[i] != null && books[i].getNum() == num) {
	            return books[i];
	        }
	    }

	    return null;
	}

	// ����ڿ��� �޽����� ���� �޾� ����ϰ� ���ڿ� �� �޾� ��ȯ
	String getData(String message) {
	    System.out.println(message);
	    return sc.next();
	}

	// ��ȣ ���� �ޱ�
	int getSelectNum(String message) {
	    System.out.println(message);
	    return sc.nextInt();
	}

	public static void main(String[] args) {
	    new BookManagement();
	}
	}



	

