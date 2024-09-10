package lotto.view

import lotto.domain.Lotto
import lotto.domain.LottoNumber
import lotto.domain.WinningLotto

class Input {
    companion object {
        fun readPrice(): Int {
            println("구입금액을 입력해 주세요.")
            // TODO: 예외 처리 핸들링
            return readln().toInt()
        }

        fun winningLotto(): WinningLotto {
            // TODO: 예외 처리 핸들링
            println("지난 주 당첨 번호를 입력해 주세요.")
            val stringNumbers: List<String> = readln().trim().split(",")
            val lottoNumbers = stringNumbers.map { LottoNumber(it.trim().toInt()) }
                .toSet()

            println("보너스 볼을 입력해 주세요.")
            val bonusNumber = LottoNumber(readln().trim().toInt())

            return WinningLotto(Lotto(lottoNumbers), bonusNumber)
        }
    }
}
