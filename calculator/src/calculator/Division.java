package calculator;

class Division extends Input implements Calculate{

	Division() {
		super(num1, num2);
		inputnum();
		calculate();

		// TODO Auto-generated constructor stub
	}
	public void calculate()
	{
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}


}
