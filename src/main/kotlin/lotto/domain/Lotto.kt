package lotto.domain

class Lotto(val numbers: Set<LottoNumber>) {

    init {
        require(numbers.size == 6)
    }

    fun contains(lottoNumber: LottoNumber): Boolean {
        return numbers.contains(lottoNumber)
    }

    fun matchCount(lotto: Lotto): Int {
        return numbers.intersect(lotto.numbers).count()
    }
}
