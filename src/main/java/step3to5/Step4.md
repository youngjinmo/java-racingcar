Step 4. 기능 요구사항

- 각 자동차에 이름을 부여할 수 있으며 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할때 자동차 이름을 출력한다.
- 자동차 이름은 쉼표를 기준으로 구분한다.
- 자동차 경주 게임을 완료한후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

## 실행결과

~~~
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
~~~

### 힌트

- 자동차 이름 쉼표 구분시에는 String 클래스의 `split()`를 활용한다.

## 프로그래밍 요구사항

- indent depth를 2를 넘지않도록 구현 (1까지만 허용!)
- 함수(메소드)의 길이가 15라인을 넘지않도록 구현한다.
  - 함수가 한가지 일만 잘하도록 구현!
- 모든 로직에 단위 테스트를 구현한다. (UI 로직은 제외)
  - UI 로직은 InputView, ResultView 같은 View 전용 클래스로 분리

- 기능 구현전 README에 구현할 기능목록을 정리해 추가한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  - https://google.github.io/styleguide/javaguide.html
  - https://myeonguni.tistory.com/1596
- else 예약어를 쓰지 않는다.
  - switch문도 불허

## 진행상황

- [x] 기능 구현
  - [x] InputView에서 레이싱 참여하는 자동차 이름 한꺼번에 입력받기(`,`로 구분하며 이름은 5자 이하)
    - [x] 입력값(자동차 이름 길이, 심볼 크기) 검증하는 유틸 추가(`InputValidator.java`)
  - [x] 전진하는 자동차 이름 부여하여 출력
    - [x] List -> String으로 바꿔주는 유틸 추가 (`ConvertToStringFromList.java`)
  - [x] 우승자 결정 (우승자는 동일한 스코어일경우 모두 우승자로 결정)

