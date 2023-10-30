## ✏️ 기능 목록

- [X] 자동차의 입력을 받아 저장
    - [X] 자동차 이름 입력 안내 메시지 콘솔에 출력
    - [X] `,`를 기준으로 파싱
        - [X] 쉼표 뒤의 공백도 함께 파싱
        - [X] car 객체에 저장
          <br>

  #### 🎯예외사항
    - [X] 자동차 이름이 5글자 초과일 경우
      <br>
      `IllegalArgumentException` 발생
    - [X] 자동차 이름이 0글자인 경우
      <br>
      `IllegalArgumentException` 발생
      <br>
    - [X] 자동차 이름이 중복된 경우
      `IllegalArgumentException` 발생
      <br><br><br>
- [X] 시도할 회수를 입력받아 저장
    - [X] 회수 입력 안내 메시지 콘솔에 출력
      <br>
  #### 🎯예외사항
    - [X] 빈 입력값일 경우
      `IllegalArgumentException`을 발생
    - [X] 입력 값이 숫자가 아닐 경우 & 정수가 아닐 경우
      `IllegalArgumentException`을 발생
      <br>
      (ParseInt시 동시에 검증 가능)
    - [X] 양수가 아닌 0 또는 음수일 경우
      `IllegalArgumentException`을 발생
      <br>

#### 한 판의 게임에 존재하는 기능

- [X] 0~9의 무작위 값 생성
    - [X] 4 이상의 값일 시 Car객체 앞으로 한칸 이동
    - [X] 이동한 위치 Car 객체에 저장
      <br>
- [X] 한 번의 게임이 진행될 때 마다 결과 출력
  <br>
  <br>

- [X] 모든 게임이 끝난 후 결과 출력
    - [X] 최대 거리 확인
    - [X] 최대 거리에 도달한 자동차 배열 반환

<br>

## ✏️ 클래스 별 기능

## Controller

### 1. Controller

- [x] 게임 실행
    - [x] 자동차 이름 입력 및 처리
    - [x] 입력 회수 입력 및 처리
    - [x] 입력 회수 만큼 게임 진행
    - [x] 우승 자동차 선정 및 출력

<br>

## 🚀 Model

### 1. Car

`NumberGenerator 인터페이스를 이용해서 테스트 코드는 원하는 값을 이용할 수 있도록 함`

- [x] 이름을 입력 값으로 받는 생성자
- [x] 이름 및 NumberGenerator 구현 클래스를 입력 값으로 받는 생성자
- [x] 기준 만족 시 앞으로 이동
    -[x] 앞으로 이동 하는 기준
- [x] 최종 우승자인지 판단하는 기능

### 2. Cars

`이름을 입력 값으로 받고, CarsNameValidator 클래스로 검증`
<br>
`문자열을 입력값으로 받는다.`

- [x] 자동차 이름 배열 -> 자동차 객체 배열로 변경
- [x] 우승 자동차 배열 반환
    -[x] 최대로 움직인 자동차 탐색
        -[x] 최대로 움직인 거리 탐색
-[x] 전체 자동차 움직이기

### 3. TrialNumber

`시도 회수를 입력 값으로 받고, TrialNumberValidator 클래스로 검증`

## 🚀 Util

### 👉 Enums

### 1. Constraints

- [x] 프로그램에 이용되는 상수를 정의하는 Enum
    -[x] 출력 기능

### 2. ErrorMessage

- [x] 문자열 검증 시 오류 메시지를 정의하는 Enum
    -[x] 출력 기능

<br>

### 👉 Validators

### 1. CarNamesValidator

`자동차 이름의 배열을 입력값으로 가진다.`
<br>

- [x] Parser를 통해 자동차 이름의 배열 생성
    - [x] 자동차 이름의 길이가 0인 경우 검증
    - [x] 길이가 조건보다 긴 경우 검증
    - [x] 중복된 자동차 이름 검증

### 2. TrialNumberValidator

- [x] 빈 입력값 검증
- [x] 숫자인지 아닌지 검증 + 정수인지 아닌지 검증
  <br>
  (ParseInt를 통해 동시에 검증)
- [x] 양수인지 아닌지 검증

<br>

### NumberGenerator

`숫자를 생성하는 기능의 인터페이스`

-[x] 숫자 생성 메소드

### 3. Parser

- [x] 각 자동차 명 사이에 쉼표를 기준으로 파싱
  <br>
- (`input.split(",", -1)`)으로 빈 문자열도 파싱

### 4. RandomNumberGenerator

`NumberGenerator를 구현한 클래스`
<br>
`랜덤 숫자 생성`

- [x] 0~9 사이의 랜덤한 숫자를 생성 하여 반환

### [TestNumberGenerator] - 테스트 클래스

`NumberGenerator를 구현한 클래스`
<br>
`입력받은 숫자를 이용`

- [x] 입력 받은 숫자 반환

## 🚀 View

### 1. InputView

- [x] 자동차 이름 안내문 출력
- [x] 입력 회수 안내문 출력

### 2. OutputView

- [x] "실행 결과" 출력
- [x] 한번 경기가 끝나고 결과 출력
    - [x] 한 경기의 한 자동차의 결과 출력
        -[x] 한 자동차의 이동한 거리 출력
- [x] 최종 우승자 출력