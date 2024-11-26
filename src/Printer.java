public class Printer {

    DataSet dataSet = new DataSet();
    Totales totales = new Totales();
    YHat yHat = new YHat();
    Predictions predecir = new Predictions();
    DiscreteMathematics discreteMathematics = new DiscreteMathematics();

    public void printSumX(){
        System.out.println("\nSumatoria X: \n" + discreteMathematics.sumatoriaX(dataSet.x));
    }

    public void printSumY(){
        System.out.println("\nSumatoria Y: \n" + discreteMathematics.sumatoriaY(dataSet.y));
    }

    public void printSumXY(){
        System.out.println("\nSumatoria XY: \n" + discreteMathematics.sumatoriaXY(discreteMathematics.multiplicacionXY(dataSet.x, dataSet.y)));
    }

    public void printDividendo(){
        System.out.println("\nEl resultado del dividendo es: \n" + discreteMathematics.dividendo(dataSet.x, dataSet.y));
    }

    public void printDivisor(){
        System.out.println("\nEl resultado del divisor es:\n " + discreteMathematics.divisor(dataSet.x, dataSet.y));
    }

    public void printResuldatoB1(){
        System.out.println("\nB1: " + totales.calcularB1(dataSet.x, dataSet.y));
    }

    public void printDividendoB0(){
        System.out.println("\nEl resultado del dividendo es:\n " + discreteMathematics.dividendoB0(dataSet.x, dataSet.y));
    }

    public void printDivisorB0(){
        System.out.println("\nEl resultado del divisor es:\n " + discreteMathematics.divisorB0(dataSet.x, dataSet.y));
    }

    public  void  printResultadoB0(){
        System.out.println("\nB0: \n" + totales.calcularB0(dataSet.x, dataSet.y));
    }

    public void  printYHat(){
        System.out.println("\nEl resultado de Y de Hat es: ");
        for(int i=0; i<yHat.yHat.length; i++){
            System.out.println(yHat.yHat[i]);
        }
    }
    public void  printPredictions(){
        System.out.println("\nLas predicciones son : ");
        for (int i=0; i<predecir.predecir.length; i++){
            System.out.println(predecir.resultado[i]);
        }
    }

}
