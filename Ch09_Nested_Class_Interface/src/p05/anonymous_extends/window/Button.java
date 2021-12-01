package p05.anonymous_extends.window;
//중첩 인터페이스
public class Button {
	
	OnClickListener listener;
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// nested interface
	interface OnClickListener {
		void onClick();
	}
}
