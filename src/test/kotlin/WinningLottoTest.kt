import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WinningLottoTest {

    @Test
    fun `로또 당첨 번호 매치 후 순위 확인`() {
        val winningLotto = WinningLotto(
            setOf(
                LottoNumber(1),
                LottoNumber(2),
                LottoNumber(3),
                LottoNumber(4),
                LottoNumber(5),
                LottoNumber(6)
            ),
            LottoNumber(8)
        )
        val lotto = Lotto(
            setOf(
                LottoNumber(1),
                LottoNumber(2),
                LottoNumber(3),
                LottoNumber(4),
                LottoNumber(5),
                LottoNumber(6)
            )
        )
        val rank = winningLotto.match(lotto)
        assertThat(rank).isEqualTo(Rank.FIRST)
    }
}
