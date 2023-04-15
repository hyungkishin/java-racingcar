package racingcar;

import racingcar.domain.Game;
import racingcar.domain.InputData;
import racingcar.domain.RandomNumberGenerator;
import racingcar.domain.RandomMoveStrategy;
import racingcar.domain.Records;
import racingcar.domain.strategy.MoveStrategy;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        final MoveStrategy strategy = new RandomMoveStrategy(new RandomNumberGenerator());
        final InputData inputData = InputView.getUserInput();
        final Game game = new Game(inputData);

        run(game, strategy);
    }

    private static void run(final Game game, final MoveStrategy strategy) {
        final List<Records> records = game.playGame(strategy);
        ResultView.print(records);

    }
}
