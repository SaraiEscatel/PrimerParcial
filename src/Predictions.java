public class Predictions {

    public int predecir[] = new int[]{60,80,100,25,50};
    public double resultado [] = new double[predecir.length];
    Totales tl =new Totales();

    public Predictions (){
        this.resultado = prediccion(tl.totalB1, tl.totalB0, predecir);
    }

    //crear una funcion para guardar los resultados de la formula B0 + (B1 * P1)
    public  double [] prediccion(double b1,double b0, int [] predecir){
        double Arreglo [] = new double[predecir.length];
        for(int i=0; i<predecir.length; i++){
            Arreglo [i] = b0+ (b1 * predecir[i]);
        }
        return Arreglo;
    }
}
