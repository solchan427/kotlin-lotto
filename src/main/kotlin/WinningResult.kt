class WinningResult(private val ranks: List<Rank>) {

    fun profit(price: Double): Double {
        val totalCompensation = ranks.sumOf { it.winningMoney }

        return totalCompensation / price
    }
}
