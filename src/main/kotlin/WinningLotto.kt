class WinningLotto(val numbers: Lotto, val bonus: LottoNumber) {

    init {
        if (numbers.contains(bonus)) {
            throw IllegalArgumentException("Lotto $bonus has duplicated number")
        }
    }

    fun match(lotto: Lotto): Rank {
        val matchCount: Int = numbers.matchCount(lotto)
        val matchBonus: Boolean = numbers.contains(bonus)

        return Rank.valueOf(matchCount, matchBonus)
    }
}
