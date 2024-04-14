package BattleGame;

import java.util.Random;

public class Character4 extends Base{
	

	/*
 		조하준
	*/
	
	public Character4() {
		this.name = "잠만보";
	}
	
	@Override
	public void underAttack() {
		System.out.println(this.name+"공격당함");
		Random random = new Random();
		int ranNum = random.nextInt(3)+1;
		switch(ranNum) {
		case 1:
			System.out.println("따끔할 정도의 피해만 입어 체력이 1 감소합니다");
			this.hp -= 1;
			break;
		case 2:
			System.out.println("큰 통증을 느낍니다(체력 5 감소)");
			this.hp -= 5;
			break;
		case 3:
			System.out.println("내상을 입어 피를 토합니다(체력 15 감소)");
			this.hp -= 15;
			break;
		}
	}
}
