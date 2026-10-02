package stage.ifm;

public class Context {
    private Strategy strategy = new DefautStrategyImpl();

    public void effectuerOperation(){
        System.out.println("**********************");
        strategy.operationStrategy();
        System.out.println("======================");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
