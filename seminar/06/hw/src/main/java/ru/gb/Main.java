package ru.gb;

import com.google.common.math.IntMath;

import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static final int COUNTS = 1000;
    public static final int COUNT_OF_DOORS = 3;
    public static Random rnd = new Random();

    public static void main(String[] args) {
        Map<Integer, Result> resultWithoutChangingSelection = new HashMap<>();
        Map<Integer, Result> resultWithChangingSelection = new HashMap<>();

        for (int i = 0; i < COUNTS; i++) {
            int winningDoor = rnd.nextInt(1, COUNT_OF_DOORS + 1);                // Назначаем дверь, за которой будет приз
            int gamerGuessOfWinningDoor = rnd.nextInt(1, COUNT_OF_DOORS + 1);    // Игрок пытается угадать дверь, за которой приз
            resultWithoutChangingSelection.put(i, winningCheck(winningDoor, gamerGuessOfWinningDoor));  // Проверяем и записываем результат предположения игрока без смены мнения
            List<Integer> remainingDoors = new ArrayList<>();   // Создаём и заполняем список оставшихся дверей, после выбора игрока

            for (int j = 1; j < COUNT_OF_DOORS + 1; j++) {
                if (j != gamerGuessOfWinningDoor) {
                    remainingDoors.add(j);
                }
            }

            if (remainingDoors.contains(winningDoor)) {     // Игрок перевыбирает дверь из оставшихся ту, которую не открывал ведущий (ведущий из оставшихся дверей открывает ту, где заведомо нет приза)
                gamerGuessOfWinningDoor = winningDoor;
            } else {
                gamerGuessOfWinningDoor = remainingDoors.get(rnd.nextInt(COUNT_OF_DOORS - 1));
            }

            resultWithChangingSelection.put(i, winningCheck(winningDoor, gamerGuessOfWinningDoor));  // Проверяем и записываем результат предположения игрока после смены мнения
        }

        System.out.printf("Вероятность выигрыша без смены хода: %d %%\n", CalcWinningProbability(resultWithoutChangingSelection));
        System.out.printf("Вероятность выигрыша со сменой хода: %d %%\n", CalcWinningProbability(resultWithChangingSelection));
    }

    public static Result winningCheck (int winningDoor, int guessOfWinningDoor) {
        return winningDoor == guessOfWinningDoor ? Result.POSITIVE : Result.NEGATIVE;
    }

    public static Integer CalcWinningProbability (Map<Integer, Result> results) {
        Integer numberOfPositive = 0;
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).equals(Result.POSITIVE)) {
                numberOfPositive ++;
            }
        }
        return IntMath.divide(numberOfPositive * 100, results.size(), RoundingMode.UP);
    }
}