package loopingstatement;

public class WhileLoopStatement {//2
	int i = 10;
	public static void main(String[] args) {
		WhileLoopStatement wl = new WhileLoopStatement();
		wl.decrease();
		while(wl.i<10) {
			System.out.println(wl.i);
			wl.i++;
		}

	}
    public void decrease() {
    	while(i>0) {
    		System.out.println(8*i);
    		i--;
    	}
    	
    }
}
