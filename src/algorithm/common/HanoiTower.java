package algorithm.common;

public class HanoiTower {

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		hanoi.ha(3, 'L', 'M', 'R');
	}
}

class Hanoi {
	public Hanoi() {
	}
	public void ha(int n, char from, char temp, char to) {
		if (n == 1)
		{
			System.out.println("원판 1을 " + from + "에서 " + to + "로 옮긴다.");
		}
		else
		{
			ha(n - 1, from, to, temp);
			System.out.println("원판 " + n + "을 " + from + "에서 " + to +"로 옮긴다.");
			ha(n - 1, temp, from, to);
		}
	}
}
