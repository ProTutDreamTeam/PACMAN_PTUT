package sample;

public enum LegendeLabyrinthe {
    EMPTY,
    WALL,
    PACGOMME,
    MAGIC_PACGOMME,
    TELEPORTATION,
    GOST_WALL;

    public static LegendeLabyrinthe intToLegendeLabyrinthe(int n){
        switch (n){
            case 0:
                return EMPTY;
            case 1:
                return WALL;

            case 2:
                return PACGOMME;

            case 3:
                return MAGIC_PACGOMME;

            case 4:
                return TELEPORTATION;

            case 5:
                return GOST_WALL;
            default:
                return EMPTY;
        }
    }
}


