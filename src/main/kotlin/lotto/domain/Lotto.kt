package lotto.domain

const val LOTTO_NUMBERS: Int = 6

class Lotto(val numbers: Set<LottoNumber>) {

    init {
        require(numbers.size == LOTTO_NUMBERS)
    }

    fun contains(lottoNumber: LottoNumber): Boolean {
        return numbers.contains(lottoNumber)
    }

    fun matchCount(lotto: Lotto): Int {
        return numbers.intersect(lotto.numbers).count()
    }
}
