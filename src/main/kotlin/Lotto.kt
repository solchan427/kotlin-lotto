class Lotto(val numbers: Set<LottoNumber>) {

    init {
        require(numbers.size == 6)
    }
}
