package BattleGame;

import java.util.Random;

public class Character1 extends Base {

	
	
	public Character1() {
		this.name = "리자몽";
	}
	
	@Override
	public void underAttack() {
		System.out.println(this.name+"공격당함");
		Random random = new Random();
		int attckNum = random.nextInt(2);
		if(attckNum == 0) {
			System.out.println("동상에 걸렸습니다. 체력이 5 감소합니다.");
			this.hp -=5;
		}else {
			System.out.println(this.name+" 캐릭터의 고유 효과로 방어에 성공했습니다.");
		}

	}
	
}
