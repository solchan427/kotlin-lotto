import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoNumberTest {

    @Test
    fun `로또 번호는 1부터 45입니다`() {
        assertThrows<IllegalArgumentException> { LottoNumber(0) }
        assertThrows<IllegalArgumentException> { LottoNumber(46) }
    }
}
