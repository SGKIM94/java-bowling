package domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallThrowCountTest {
    public static final int MINIMUM_BALL_THROW_COUNT = 0;
    public static final int MAX_BALL_THROW_COUNT = 2;

    @Test
    public void 점수를_입력받으면_볼카운트는_자동으로_증가한다() {
    }

    @Test
    public void 볼_던진_횟수의_값을_임의의_값보다_더_큰지_비교한다() {
        BallThrowCount ballThrowCount = new BallThrowCount(1);

        assertThat(ballThrowCount.isBigger(MINIMUM_BALL_THROW_COUNT)).isEqualTo(true);
    }

    @Test
    public void 볼_던진_횟수의_값을_임의의_값과_더_작은지_비교한다() {
        BallThrowCount ballThrowCount = new BallThrowCount(1);

        assertThat(ballThrowCount.isSmaller(MAX_BALL_THROW_COUNT)).isEqualTo(true);
    }

}
