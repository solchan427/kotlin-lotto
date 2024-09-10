package lotto.domain

object LottoIssuer {

    fun issues(count: Int): List<Lotto> {
        return (1..count).map {
            issue()
        }.toList()
    }

    private fun issue(): Lotto {
        val lottoNumbers = generateSequence { ((1..45).random()) }
            .distinct()
            .take(6)
            .map { LottoNumber(it) }
            .toSet()

        return Lotto(lottoNumbers)
    }
}
