package exceptions;

public class TestExceptions {
public static void main(String[] args) {
	int addResult=0;
	try {
		addResult=Arithmetic.devision(10, 0);
		
	}catch(OperationException e) {
		System.out.println(e.getMessage());
	} catch (Exception e) {
		e.printStackTrace(System.out);
		System.out.println(e.getMessage());
		
	}finally {
		System.out.println("End of devision method");
	}
	System.out.println("Result: "+addResult);
}
}
