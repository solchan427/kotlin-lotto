class LottoIssuer() {

    fun issues(count: Int): ArrayList<Lotto> {
        val lottos: ArrayList<Lotto> = ArrayList<Lotto>()
        repeat(count) {
            lottos.add(this.issue())
        }

        return lottos
    }

    fun issue(): Lotto {
        val numbers: MutableSet<LottoNumber> = HashSet<LottoNumber>()
        while (numbers.size < 6) {
            val lottoNumber = LottoNumber((1..45).random())
            numbers.add(lottoNumber)
        }
        return Lotto(numbers)
    }
}
