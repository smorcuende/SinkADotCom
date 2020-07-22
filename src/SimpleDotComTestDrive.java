public class SimpleDotComTestDrive {

      /*
        Método para hacer un test de la clase
        ¿Qué codigo voy a escribir para comprobar que la clase funciona correctamente:
        1.- Instanciar el objeto SimpleDotCom
        2.- Asignar una localización de 3 posiciones array int
        3.- Crear  una jugada de un usuario
        4.- Invocar este método checkYourself con las preguntas del usuario
        5.- Imprimir el resultado del test si pasa o no
     */
    public static void main (String[] args){

        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "Failed";

        if (result.equals("Hit")){

            testResult = "Passed";

        }

        System.out.println(testResult);

    }

}
