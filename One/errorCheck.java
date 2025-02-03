package One;

public class errorCheck {

	public String checkNumber(int a) {
		if (a == 0)
			return "Zero";
		else if (a > 0)
			return "Positive";
		else
			return "Negative";

	}
}
