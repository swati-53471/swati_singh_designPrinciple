package calculator;

class Subtraction extends Input implements Calculate{

	Subtraction() {
		super(num1, num2);
		inputnum();
		calculate();

		// TODO Auto-generated constructor stub
	}
	public void calculate()
	{
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}

}
