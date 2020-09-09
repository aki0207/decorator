package decorator;

public class Main {
	public static void main(String[] args) {
		Display d1 = new StringDisplay("Hello world");
		Display d2 = new SideBorder(d1, '#');
		Display d3 = new FullBorder(d2);
		Display d4 = new UpDownBorder(d1, '-');
		Display d5 = new UpDownBorder(d2, '-');
		d1.show();
		d2.show();
		d3.show();
		d4.show();
		d5.show();

		MultiStringDisplay md = new MultiStringDisplay();
		md.add("おはようございます。");
		md.add("こんにちは。");
		md.add("こんばんは。");
		Display d6 = md;
		Display d7 = new SideBorder(d6, '#');
		d6.show();
		d7.show();

	}
}