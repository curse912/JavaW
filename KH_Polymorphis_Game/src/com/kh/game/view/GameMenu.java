package com.kh.game.view;

import java.util.Scanner;

import com.kh.game.controller.GameController;
import com.kh.game.job.model.vo.Characters;
import com.kh.game.monster.model.vo.Monster;

public class GameMenu {
	private GameController gc = new GameController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 캐릭터 생성");
			System.out.println("2. 게임 시작");
			System.out.println("3. 캐릭터 정보 확인");
			System.out.println("4. 게임 종료");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: createCharacter();
					break;
			case 2: gameStart();
					break;
			case 3: characterInfo();
					break;
			case 4: System.out.println();
					break;
			default : 
				System.out.println("잘못된 번호입니다.");
			}
			
		}
		
	}
	public void createCharacter() {
		Characters ch =gc.getCharacter();
		
		if(ch != null) {
			System.out.println("이미 캐릭터가 생성되었습니다. 메인메뉴로 돌아갑니다.");
			return;
		}
		while(true) {
			System.out.print("작업을 선택하세요 (1.전사, 2. 궁수, 3. 마법사) : ");
			int job = sc.nextInt();
			sc.nextLine();
			
			if(!(job >= 1 && job <= 3)) {
				System.out.println("존재하지 않는 직업입니다.");
				continue;
			}
			System.out.print("캐릭터 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			gc.createCharacter(job, name);
			System.out.println(ch);
		
		}
		
	}
	public void characterInfo() {
		System.out.println("캐릭터 정보 : ");
		System.out.println();
		
	}
	public void gameStart() {
		while(true) {
			System.out.println("출전할 몬스터를 선택하세요 : ");
			System.out.println("1. 고블린(lv1) : 초보용");
			System.out.println("2. 오크(lv10) : 중수용");
			System.out.println("3. 드래곤(lv100) : 고수용");
			System.out.println("몬스터 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			
			// 존재하지 않는 몬스터 번호를 입력시 “존재하지 않는 몬스터입니다.” 출력 후 재입력
			// 입력한 몬스터 번호를 gameController의 createMonster()함수에 담아서 전달하여
			// 몬스터 반환
			// gameController의 getCharacter()메서드를 호출하여 캐릭터 정보를 반환
			// 선택한 몬스터와 플레이어간의 전투 진행
			if(!(num >= 1&& num<= 3)) {
				System.out.println("존재하지 않는 몬스터입니다.");
				continue;
			}
			Monster m = gc.createMonster(num);
			Characters c = gc.getCharacter();
			
			while(true) {
				System.out.println("전투를 시작합니다!");
				System.out.println(c.getName() + "의 턴!!");
				System.out.println("1. 공격");
				System.out.println("2. 스킬(5레벨부터 사용가능)");
				System.out.println("3. 도망치기");
				System.out.println(">>>>");
				int menu = sc.nextInt();
				
				// 잘못된 번호를 입력시 “잘못된 명령입니다.” 출력 후 재입력
				// 2번 스킬 사용시 사용자의 레벨을 체크하여 5보다 작다면
				// “레벨 부족으로 스킬을 사용할 수 없습니다” 출력 후 재입력
				// 몬스터 공격 후 몬스터의 체력이 0 이하라면 전투 종료
				if(!(menu >= 1 &&menu <=3)) {
					System.out.println("잘못된 명령입니다.");
					continue;
				}
				if(menu  == 2 && c.getLevel()<5) {
					System.out.println("레벨 부족으로 스킬을 사용할 수 없습니다.");
					continue;
				}
				switch(menu) {
				case 1: c.attack(m);
						break;
				case 2: c.useSkill(m);
						break;
				case 3: System.out.println("도망갑니다.");
						return;
				}
				// 몬스터가 가진 경험치만큼 플레이어의 경험치를 증가.
				// 몬스터의 체력이 0보다 크다면 몬스터가 플레이어를 공격
				// 공격후 플레이어의 체력이 0이하라면 전투종료.
				if(m.getHp() <= 0){
					System.out.println(m.getName() + "처치! 전투에서 승리했습니다!!");
					System.out.println(m.getExp() + "경험치를 획득했습니다!");
					c.setExp(c.getExp( + m.getExp()));
				}else {
					m.attack(c);
				}
				if(c.getHp() <= 0) {
					System.out.println("전투패배! ");
				}
				///////////////////////이자리가 맞나
				// 전투 종료 후에는 플레이어의 hp를 maxHp만큼 회복복
				c.setHp(c.getMaxHp());
				return;
			}
			
		}
		
		
	
		
	}
	
	

}
