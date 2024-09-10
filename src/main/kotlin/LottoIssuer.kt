class LottoIssuer() {

    fun issues(count: Int): ArrayList<Lotto> {
        val lottos: ArrayList<Lotto> = ArrayList<Lotto>()
        repeat(count) {
            lottos.add(this.issue())
        }

        return lottos
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
