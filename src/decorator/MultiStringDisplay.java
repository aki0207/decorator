package decorator;

import java.util.ArrayList;

public class MultiStringDisplay extends Display {
	private ArrayList<String> stringList = new ArrayList<>();
	private int columns;

	@Override
	public int getColumns() {
		return 0;
	}

	@Override
	public int getRows() {
		return stringList.size();
	}

	@Override
	public String getRowText(int row) {
		return stringList.get(row);
	}

	public void add(String string) {
		stringList.add(string);
		updateColumns(string);
	}

	private void updateColumns(String msg) {
		if (msg.getBytes().length > columns) {
			columns = msg.getBytes().length;
		}
		for (int i = 0; i < stringList.size(); i++) {
			int files = columns - stringList.get(i).getBytes().length;
			if (files > 0) {
				stringList.set(i, stringList.get(i) + spaces(files));
			}
		}
	}

	private String spaces(int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(" ");
		}
		return buf.toString();
	}
}
