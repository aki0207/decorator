package decorator;

/**
 * 上下左右に飾りをつけるクラス
 *
 */
public class FullBorder extends Border{

	protected FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		// 文字数は両側に飾り文字分を加えたもの
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		// 文字数は上下に飾り文字分を加えたもの
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0) {
			// 枠の上側
			return "+" + makeLine('-', display.getColumns()) + '+';
		} else if (row == display.getRows() + 1) {
			// 枠の下側
			return "+" + makeLine('-', display.getColumns()) + '+';
 		} else {
 			return "|" + display.getRowText(row - 1) + "|";
 		}
	}

	/**
	 * 指定した文字を連続して作成する
	 *
	 */
	private String makeLine(char ch, int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}
		return buf.toString();
	}
}