import jade.core.Agent;

public class AgentLinearR extends Agent{

    public void setup(){

        Printer printer = new Printer();


        System.out.println("----- Imprimiendo B1 -----");
        printer.printSumX();
        printer.printSumY();
        printer.printSumXY();

        printer.printDividendo();
        printer.printDivisor();
        printer.printResuldatoB1();

        System.out.printf("------Imprimiendo B0 ------");
        printer.printSumX();
        printer.printSumY();
        printer.printSumXY();
        printer.printDividendoB0();
        printer.printDivisorB0();
        printer.printResultadoB0();
        printer.printYHat();
        printer.printPredictions();

        //doDelete();
    }
}
