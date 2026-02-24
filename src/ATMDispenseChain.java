public class ATMDispenseChain implements DispenseChain {
    private DispenseChain nextChain;

    public ATMDispenseChain() {
        // Initialize the chain
        this.nextChain = new Peso1000Dispenser();
        DispenseChain c2 = new Peso500Dispenser();
        //200-peso
        DispenseChain c3 = new Peso100Dispenser();
        //50-peso dispenser
        //20-peso dispenser

        // Set the chain of responsibility
        nextChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public void dispense(Currency currency) {
        nextChain.dispense(currency);
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }
}
