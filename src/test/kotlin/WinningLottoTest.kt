import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class WinningLottoTest {

    @Test
    fun `로또 당첨 번호 매치 후 순위 확인`() {
        val winningLotto = WinningLotto(
            Lotto(
                setOf(
                    LottoNumber(1),
                    LottoNumber(2),
                    LottoNumber(3),
                    LottoNumber(4),
                    LottoNumber(5),
                    LottoNumber(6)
                )
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

    @Test
    fun `로또 당첨 번호와 보너스 번호는 중복될 수 없다`() {
        assertThrows<IllegalArgumentException> {
            WinningLotto(
                Lotto(
                    setOf(
                        LottoNumber(1),
                        LottoNumber(2),
                        LottoNumber(3),
                        LottoNumber(4),
                        LottoNumber(5),
                        LottoNumber(6)
                    )
                ),
                LottoNumber(1)
            )
        }
    }
}
