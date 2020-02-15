package Mavencalculator.Calculator1;

public class Test2 extends Test1 implements Test3{
	int s;
	Test2(int x, int y) {
		super(x, y);
		s=0;
	}

	public int add(int x,int y) {
		s=x+y;
		return s;
	}

	public int sub(int x,int y) {
		s=x-y;
		return s;
	}

	public int mul(int x,int y) {
		s=x*y;
		return s;
	}

	public int div(int x,int y) {
		if(x>y) {
			s=x/y;
			return s;
		}
		else if(y>x) {
			s=x/y;
			return s;
		}
		else {
			s=0;
			return s;
		}
	}
	
}
