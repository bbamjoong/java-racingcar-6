package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Cars;
import racingcar.model.TrialNumber;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Controller {
    Cars cars;
    TrialNumber trialNumber;

    /**
     * 게임 실행
     */
    public void run() {
        getCarListByUserInput(); //자동차 입력
        getTrialNumberByUserInput(); //회수 입력
        OutputView.printResultHeader(); //"실행 결과" String 출력
        playGame(); //게임 시작
        endGame(); //우승자 출력
    }

    /**
     * 자동차 이름을 입력 받기
     */
    private void getCarListByUserInput() {
        InputView.requestCarsName();
        String carsName = Console.readLine();
        cars = new Cars(carsName);
    }

    /**
     * 시도 회수 입력 받기
     */
    private void getTrialNumberByUserInput() {
        InputView.requestTrialNumber();
        String inputNumber = Console.readLine();
        System.out.println();
        trialNumber = new TrialNumber(inputNumber);
    }

    /**
     * 입력 회수만큼 게임 진행
     */
    private void playGame() {
        int rounds = trialNumber.getTrialNumber();
        for (int count = 0; count < rounds; count++) {
            cars.moveCars();
            OutputView.printResult(cars.getCars());
        }
    }


    /**
     * 모든 게임 종료 시 우승 자동차 선정
     */
    private void endGame() {
        List<String> winnerName = cars.getWinnerCars();
        OutputView.printWinner(winnerName);
    }
}