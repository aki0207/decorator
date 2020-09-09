package decorator;

/**
 * 飾り枠を表すクラス
 */
public abstract class Border extends Display {
	// この飾り枠がくるんでいる「中身」をさす
	protected Display display;
	protected Border(Display display) {
		this.display = display;
	}
}
