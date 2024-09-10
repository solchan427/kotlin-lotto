import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WinningResultTest {

    @Test
    fun `수익률 계산 결과 테스트`() {
        val result = WinningResult(listOf(Rank.THIRD))
        val money = 14000
        assertThat(result.profit(money.toDouble())).isEqualTo(Rank.THIRD.winningMoney.toDouble() / money.toDouble())
    }
}
