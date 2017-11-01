package combination;

public class Combination_lib {
	
	private int s, r;

	public Combination_lib(int s, int r) {
		this.s = s;
		this.r = r;
	}
	

	public int getFactorial() {
		int ans;
		int s_ans = this.s;
		int r_ans = this.r;
		int m_ans = this.s- this.r;
		for(int i = this.s-1; i > 0; i--) {
			s_ans *= i;
		}
		for(int i = this.r-1; i > 0; i--) {
			r_ans *= i;
		}
		for(int i = (this.s-this.r)-1; i > 0; i--) {
			m_ans *= i;
		}
		
		ans = s_ans / (r_ans * m_ans);
		return ans;
	}

}
