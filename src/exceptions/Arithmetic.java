package exceptions;

public class Arithmetic {
  public static int devision(int num,int denum) /*throws OperationException*/ {
	  if(denum==0) {
		  throw new OperationException("Devision by zero :(");
	  }
	  
	  return num/denum;
  }
}
