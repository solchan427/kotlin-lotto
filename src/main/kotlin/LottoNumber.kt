class LottoNumber(private val number: Int) {

    init {
        require(number in (1..45)) { "로또 번호는 1부터 45입니다." }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LottoNumber

        return number == other.number
    }

    override fun hashCode(): Int {
        return number
    }

    override fun toString(): String {
        return number.toString()
    }
}
