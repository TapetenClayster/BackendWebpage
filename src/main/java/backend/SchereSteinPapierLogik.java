package backend;

import org.junit.Test;

import java.util.Random;

public class SchereSteinPapierLogik {

    public String random_decision() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return "Stein";
            case 1:
                return "Schere";
            case 2:
                return "Papier";
            default:
                return "";
        }
    }

    public String schereSteinPapier(String playerOneDecision, String playerTwoDecision) {
        if (playerOneDecision.equals(playerTwoDecision)) {
            return "Unentschieden";
        }

        switch (playerOneDecision) {
            case "Schere":
                switch (playerTwoDecision) {
                    case "Stein":
                        return "Player 2";
                    case "Papier":
                        return "Player 1";
                }
            case "Stein":
                switch (playerTwoDecision) {
                    case "Schere":
                        return "Player 1";
                    case "Papier":
                        return "Player 2";
                }
            case "Papier":
                switch (playerTwoDecision) {
                    case "Schere":
                        return "Player 2";
                    case "Stein":
                        return "Player 1";
                }
        }

        return "";
    }

}
