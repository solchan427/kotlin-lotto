import lotto.domain.Lotto
import lotto.domain.LottoNumber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoTest {

    @Test
    fun `로또는 6개의 번호를 가진다`() {
        val lotto =
            Lotto(setOf(LottoNumber(1), LottoNumber(2), LottoNumber(3), LottoNumber(4), LottoNumber(5), LottoNumber(6)))
        assertThat(lotto.numbers).hasSize(6)
        assertThrows<IllegalArgumentException> { Lotto(setOf()) }
    }
}
