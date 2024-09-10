class WinningLotto(val numbers: Set<LottoNumber>, val bonus: LottoNumber) {

    init {
        if (numbers.contains(bonus)) {
            throw IllegalArgumentException("Lotto $bonus has duplicated number")
        }
    }

    fun match(lotto: Lotto): Rank {
        val matchCount: Int = numbers.intersect(lotto.numbers).count()
        val matchBonus: Boolean = lotto.numbers.contains(bonus)

        return Rank.valueOf(matchCount, matchBonus)
    }
}
