package lotto.domain

data class LottoNumber(private val number: Int) {

    init {
        require(number in (1..45)) { "로또 번호는 1부터 45입니다." }
    }

    override fun toString(): String {
        return number.toString()
    }
}
