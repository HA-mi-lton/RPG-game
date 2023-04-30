package monster2;

public class Main {

	public static void main(String[] args) {
		Monster m1 = new Monster("ドラゴン",50,50,20,0);
		Monster m2 = new Monster("トリケラトプス",45,45,15,5);
		
		System.out.println(m1.getName());
		System.out.println("体力："+m1.getHp());
		System.out.println("最大体力："+m1.getHp());
		System.out.println("攻撃力："+m1.getAtk());
		System.out.println("守備力："+m1.getProtect());
		System.out.println("--------------------------");
		System.out.println(m2.getName());
		System.out.println("体力："+m2.getHp());
		System.out.println("最大体力："+m2.getHp());
		System.out.println("攻撃力："+m2.getAtk());
		System.out.println("守備力："+m2.getProtect());
		System.out.println("\n");
		System.out.println(m1.getName()+"と"+m2.getName()+"のバトルスタート！");
		System.out.println("\n");
		
		while(m1.getHp()>=0 && m2.getHp()>=0) {
			System.out.println(m1.getName()+"の攻撃");
			m1.attack(m2);
			System.out.println(m2.getName()+"の攻撃");
			m2.attack(m1);
			System.out.println("\n");
			System.out.println(m1.getName()+"のHP："+m1.getHp());
			System.out.println(m2.getName()+"のHP："+m2.getHp());
		}
		System.out.println("試合終了！\n結果発表！\n");
		if(m1.getHp() > m2.getHp()) {
			System.out.println(m1.getName()+"の勝利！");
		}else {
			System.out.println(m2.getName()+"の勝利！");
		}
	}
}
