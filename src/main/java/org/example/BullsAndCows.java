package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BullsAndCows {

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        Map<Integer, Integer> valueToOccurance = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            int currentSecret = Integer.parseInt(String.valueOf(secret.charAt(i)));
            if (valueToOccurance.containsKey(currentSecret)) {
                valueToOccurance.put(currentSecret, valueToOccurance.get(currentSecret) + 1);
            } else {
                valueToOccurance.put(currentSecret, 1);
            }
        }
        //1105
        //0111

        for (int i = 0; i < secret.length(); i++) {
            int curretSecret = Integer.parseInt(String.valueOf(secret.charAt(i)));
            int curretGuess = Integer.parseInt(String.valueOf(guess.charAt(i)));

            if (curretSecret == curretGuess) {
                bulls++;
                valueToOccurance.put(curretSecret, valueToOccurance.get(curretSecret) - 1);
            }

        }

        for (int i = 0; i < secret.length(); i++) {
            int curretGuess = Integer.parseInt(String.valueOf(guess.charAt(i)));
            int curretSecret = Integer.parseInt(String.valueOf(secret.charAt(i)));
            if (valueToOccurance.containsKey(curretGuess) && (!(valueToOccurance.get(curretGuess) == 0)) && (!(curretGuess==curretSecret))){
                cows++;
                valueToOccurance.put(curretGuess, valueToOccurance.get(curretGuess) - 1);
            }
        }

        return bulls + "A" + cows + "B";
    }
}

