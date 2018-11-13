package lotto.domain;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMachineTest {

    @Test
    public void 스트링티켓을_티켓으로_변환하는_테스트() {
        WinningLotto result = LottoMachine.convertWinningNumbers("1, 2, 3, 4, 5, 6", 7);

        assertThat(result.winningLottoStatus()).isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6));
    }
}