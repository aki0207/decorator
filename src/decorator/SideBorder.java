package decorator;

/**
 * 文字列の左右に決まった文字で飾りをつけるクラス
 *
 */
public class SideBorder extends Border {
	private char borderChar;

	protected SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() {
		// 文字数は両側に飾り文字分を加えたもの
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}
}
