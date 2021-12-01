package t01_programming_language;

public class Object {
	
	
	/* 객체지향 프로그래밍 언어
	 *  - 1960년대 simula 최초
	 * 일반 프로그래밍 (C language)
	 *  - java, C++, Python : C로 coding
	 *  - HW, 메모리를 직접 control할 수 있는 명령어, 속도가 매우 빠름
	 *  - Linux, MS-Windows
	 *  - 일반 기업 application(ex.인사시스템)을 개발했는데, 문제 발생
	 *   => 개발 생산성이 매우 낮음
	 *   => 소스코드 재활용(reuse)성이 매우 낮음
	 *     - A은행의 인사시스템 개발(10명, 6개월)
	 *     - B은행에 적용 (7명, 5개월)  => 실제는 (10명, 6개월)
	 *   => 기능개선(유지보수) => 시간이 많이 걸림
	 *   => 최대 10년 쓰면, 기존 application을 폐기하고, 새로 개발
	 *   
	 * 숙제 : 재활용(reuse)성을 어떻게 높이지? => SW개발 생산성
	 *       => 투자비를 절감, 이익 창출
	 * => 자동차, 가전제품 제조업체 => 생산 : 부품을 조립
	 * => Java (Object Oriented Programming Language)
	 *    Class라는 개념을도입하여 부품을 만드는 도구로 사용
	 * 
	 * => 인사시스템 app개발
	 *    => A회사에서 class가 전체 250개 만들었음
	 *    => B회사 개발 : A회사에서 만든 150개 재활용
	 *                 + 100 class 보완하거나 새로 개발
	 *                 
	 * 자동차 부품 정의?
	 * 현대자동차 - 엔진 파트, 운전대, 바퀴 4개, 백미러 2개 ,,,,,
	 * 엔진제조업체 : 엔진 외관 커버 4개, 실린더, 나사,,,,,
	 * 
	 * Object : 속성(명사) + 동작(동사)
	 * - 예 : Car
	 *       => 속성 : 바퀴 4개, 백미러, 카시트, 운전대,,,,,
	 *       => 동작 : drive forward, drive backward, drive turn left, stop, speed up,,,
	 * - 예 : 사람
	 *       => 속성 : 눈 2개, 입 1개, 귀 2개, 팔 2개, 몸통 ,,,,,
	 *       => 동작 : eat, drink, breathe, walk, run,,,,,
	 * - 예 : 피고용인
	 *       => 속성 : 입사날짜, 직급, 이름, 연락처, 부서,,,,
	 *       => 동작 : calculateSalary, promote,,,,
	 * 
	 * Java는 class안에 object의 속성과 동작을 모두 집어넣어 관리
	 * 
	 * 상속
	 * - 부모 class : 속성, 메소드
	 * - 자식 class :
	 *   => 부모 class의 속성, 메소드를 100% 물려받음
	 *   => 자식 class에서만 사용하는 속성, 메소드를 추가
	 * - class간에 상속 관계를 만드는 이유
	 *   => code 재활용성
	 *   => 생산성 높이는 활동
	 * 상속의 예
	 *  - 쇼핑몰 시스템에서
	 *    sale class : 메소드 중에 상품 판매하면 계산 method
	 *                 (구매원가 + 마진 10% +,,,,,)
	 *    - 자식 class 가전제품 전용 sale class
	 *      . 부모 class 의 속성, 메소드
	 *      . 대할인을 위한 promotion 메소드가 필요
	 *    - 화장품 sale class
	 *    - 식품 sale class
	 *    
	 * Instance : Class를 메모리에 올려놓은 
	 *      
	 * */

}
