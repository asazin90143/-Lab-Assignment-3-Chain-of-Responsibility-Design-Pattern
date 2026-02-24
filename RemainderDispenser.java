public class RemainderDispenser implements DispenseChain {
    
    @Override
    public void setNextChain(DispenseChain nextChain) {
        // This is the end of the chain, no next handler needed
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() > 0) {
            System.out.println("Cannot dispense remaining amount: " + cur.getAmount() + " pesos");
        }
    }
}
