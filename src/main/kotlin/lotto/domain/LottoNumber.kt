package lotto.domain

const val MAXIMUM_LOTTO_NUMBER: Int = 45
const val MINIMUM_LOTTO_NUMBER: Int = 1

data class LottoNumber(private val number: Int) {

    init {
        require(number in (MINIMUM_LOTTO_NUMBER..MAXIMUM_LOTTO_NUMBER)) { "로또 번호는 1부터 45입니다." }
    }

    override fun toString(): String {
        return number.toString()
    }
}
