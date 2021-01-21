public enum Values {
    ROCK, PAPER, SCISSORS, LIZARD, SPOK;

    public int compareValues(Values xValue){
        if (this == xValue){
            return 0;
        }
        return switch (this) {
            case ROCK -> (xValue == SCISSORS ? 1 : -1);
            case PAPER -> (xValue == ROCK ? 1 : -1);
            case SPOK -> (xValue == SCISSORS ? 1 : -1);
            case SCISSORS -> (xValue == PAPER ? 1 : -1);
            case LIZARD -> (xValue == SPOK ? 1 : -1);
        };
    }
}
