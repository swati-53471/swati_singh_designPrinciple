package calculator;

public class Addition extends Input implements Calculate{

	Addition() {
		super(num1, num2);
		inputnum();
		calculate();
	}
	
	public void calculate()
	{
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}

	
}
