package lotto.view

import lotto.domain.Lotto
import lotto.domain.Rank
import lotto.domain.WinningResult

object Output {
    fun viewLottoCount(count: Int) {
        println(count.toString().plus("를 구매했습니다."))
    }

    fun viewLottos(lottos: List<Lotto>) {
        lottos.forEach { println(it.numbers) }
    }

    fun viewResult(result: WinningResult) {
        for (rank in Rank.winningRanks()) {
            val matchCount = result.matchCount(rank)
            if (rank == Rank.SECOND) {
                println("${rank.countOfMatch}개 일치, 보너스 볼 일치(${rank.winningMoney}원) - ${matchCount}개")
                continue
            }
            println("${rank.countOfMatch}개 일치 (${rank.winningMoney}원) - ${matchCount}개")
        }
    }

    fun viewProfit(result: WinningResult, price: Int) {
        print("총 수익률은 ${result.profit(price.toDouble())} 입니다.")
        if (result.profit(price.toDouble()) < 1.0) {
            println("(기준이 1이기 때문에 결과적으로 손해라는 의미임)")
        }
    }
}
