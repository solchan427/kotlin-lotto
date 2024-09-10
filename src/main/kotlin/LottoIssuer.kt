class LottoIssuer() {

    fun issues(count: Int): List<Lotto> {
        return (1..count).map {
            this.issue()
        }.toList()
    }

    private fun issue(): Lotto {
        val lottoNumbers: Set<LottoNumber> = generateSequence { ((1..45).random()) }
            .distinct()
            .take(6)
            .map { LottoNumber(it) }
            .toSet()

        return Lotto(lottoNumbers)
    }
}
