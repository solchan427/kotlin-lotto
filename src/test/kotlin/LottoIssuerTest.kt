import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LottoIssuerTest {

    @Test
    fun `로또 발급기는 개수만큼 로또를 발급한다`() {
        val lottoIssuer = LottoIssuer()
        assertThat(lottoIssuer.issues(6)).hasSize(6)
    }
}
