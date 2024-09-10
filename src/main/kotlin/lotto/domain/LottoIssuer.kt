package lotto.domain

object LottoIssuer {

    fun issues(count: Int): List<Lotto> {
        return (1..count).map {
            issue()
        }.toList()
    }

    private fun issue(): Lotto {
        val lottoNumbers = generateSequence { ((MINIMUM_LOTTO_NUMBER..MAXIMUM_LOTTO_NUMBER).random()) }
            .distinct()
            .take(LOTTO_NUMBERS)
            .map { LottoNumber(it) }
            .toSet()

        return Lotto(lottoNumbers)
    }
}
