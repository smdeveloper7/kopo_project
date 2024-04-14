package BattleGame;

import java.util.Random;

public class Character5 extends Base {

	/*
	 * 1.캐릭터의 이름은 한글로 세글자로 작성해주세요.(필수는 아님 하지만 글자수를 맞춰야함) 2.공격에 의해 체력이 닳게 할꺼면 꼭 체력이
	 * 감소되게 작성해주세요. -처리
	 */
	public Character5() {
		this.name = "파이리";
	}

	public Character5(String name) {
		this.name = name;
	}

	@Override
	public void underAttack() {
		System.out.println(this.name + " 공격당함");
		Random random = new Random();

		int attackNum = random.nextInt(6);
		if (attackNum == 0) {
			System.out.println("새똥 테러. 체력이 5 감소합니다.");
			this.hp -= 5;
		} else if (attackNum == 1) {
			System.out.println(this.name + " 파리떼 습격. 체력이 10 감소합니다");
			this.hp -= 10;
		} else if (attackNum == 2) {
			System.out.println(this.name + " 지네밭에 굴러 떨어짐. 체력이 15 감소합니다");
			this.hp -= 15;
		} else if (attackNum == 3) {
			System.out.println(this.name + " 대왕 거미줄에 걸림. 체력이 20 감소합니다");
			this.hp -= 20;
		} else if (attackNum == 4) {
			System.out.println(this.name + " 연속펀치. 체력이 25 감소합니다");
			this.hp -= 25;
		} else {
			System.out.println("날씨가 따뜻하네요");
			System.out.println(this.name + " 체력회복");
			this.hp += 15;
		}
	}
}


