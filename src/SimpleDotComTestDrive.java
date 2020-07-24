public class SimpleDotComTestDrive {

    public static void main (String[] args){

        SimpleDotCom dot = new SimpleDotCom();

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "Failed";

        if (result.equals("Hit")){

            testResult = "Passed";

        }

        System.out.println(testResult);

    }

}
