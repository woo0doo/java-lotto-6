package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class GenerateLottoNumbersUtil {

    public static List<Integer> generateLottoNumber() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}