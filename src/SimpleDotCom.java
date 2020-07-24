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
            if (guess == cell) {

                result = "Hit";

                numOfHits ++;

                break;

            }
        }

        if (numOfHits == locationCells.length) {

            result = "Kill";

        }

        System.out.println(result);

        return result;
    }
}
