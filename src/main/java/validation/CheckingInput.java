package validation;

import java.util.HashSet;

public class CheckingInput {

    public static void validateCarNames(String[] carNames) {
        int carNamesLength = carNames.length;

        for (String carName : carNames) {
            if (carName.isEmpty() || carName.length() > 5) {
                throw new IllegalArgumentException("이름은 1자 이상 5자 이하가 되어야 합니다.");
            }
        }

        if (carNamesLength < 2) {
            throw new IllegalArgumentException("참여 자동차가 2개 이상이어야 합니다.");
        }

        HashSet<String> carNameSet = new HashSet<>();
        for (String carName : carNames) {
            if (!carNameSet.add(carName)) {
                throw new IllegalArgumentException("같은 이름이 두개 이상 있습니다.");
            }
        }

    }

    public static void validateAttemptCount(String count) {
        for (int i = 0; i < count.length(); i++) {
            char c = count.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("입력된 값은 숫자여야 합니다");
            }
        }

        int stringToNum = Integer.parseInt(count);
        if (stringToNum <= 0) {
            throw new IllegalArgumentException("입력된 값은 0보다 커야 합니다.");
        }

    }
}
