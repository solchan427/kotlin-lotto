import lotto.domain.Lotto
import lotto.domain.LottoIssuer
import lotto.domain.Rank
import lotto.domain.WinningResult
import lotto.view.Input
import lotto.view.Output

fun main() {
    val price = Input.readPrice()
    val count = price / 1000
    Output.viewLottoCount(count)

    val lottos: List<Lotto> = LottoIssuer.issues(count)
    Output.viewLottos(lottos)

    val winningLotto = Input.winningLotto()

    val ranks: List<Rank> = lottos.map { winningLotto.match(it) }

    val winningResult = WinningResult(ranks)
    Output.viewResult(winningResult)
    Output.viewProfit(winningResult, price)
}
