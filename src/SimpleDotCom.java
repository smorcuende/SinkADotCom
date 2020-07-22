public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;


    public void setLocationCells(int[] cellLocations){

        this.locationCells = cellLocations;

    }


    public String checkYourself(String userGuess){

        int guess = Integer.parseInt(userGuess);

        String result = "Miss";

        for (int cell : locationCells){

            // Comparación de respuesta con casilla del array
            if (guess == cell) { // si acierta

                result = "Hit";

                numOfHits ++;

                break;

            }
        }

        // Si ya ha acertado 3 veces: barco hundido
        if (numOfHits == locationCells.length) {

            result = "Kill";

        }

        System.out.println(result);

        return result;
    }




}
