fun main() {
    val price = Input.readPrice()
    val count = price / 1000
    println(count.toString().plus("를 구매했습니다."))

    val lottoIssuer = LottoIssuer()

    val lottos: List<Lotto> = lottoIssuer.issues(count)
    lottos.forEach { println(it.numbers) }

    val winningLotto = Input.winningLotto()

    val ranks: Set<Rank> = lottos.map { winningLotto.match(it) }.toSet()

    val rankCounts: Map<Rank, Int> = ranks
        .groupingBy { it }
        .eachCount()

    var totalCompensation: Double = 0.0
    for (rank in Rank.winningRanks()) {
        val matchCount = rankCounts.getOrDefault(rank, 0)
        if (matchCount != 0) {
            totalCompensation += matchCount * rank.winningMoney
        }
        if (rank == Rank.SECOND) {
            println("${rank.countOfMatch}개 일치, 보너스 볼 일치(${rank.winningMoney}원) - ${matchCount}개")
            continue
        }
        println("${rank.countOfMatch}개 일치 (${rank.winningMoney}원) - ${matchCount}개")
    }

    val profitRate = totalCompensation / price
    print("총 수익률은 $profitRate 입니다.")
    if (profitRate < 1.0) {
        println("(기준이 1이기 때문에 결과적으로 손해라는 의미임)")
    }
}
