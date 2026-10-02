package stage.ifm;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Strategy strategy;
        HashMap<String, Strategy> strategyMap = new HashMap<>();
        while (true) {
            System.out.println("Quelle Strategie ? : ");
            String str = scanner.nextLine();
            strategy= strategyMap.get(str);
            if (strategy == null) {
                System.out.println("Creation d'un nouvel objet de StrategyImpl"+str);
                strategy = (Strategy) Class.forName("stage.ifm.StrategyImpl"+str).getConstructor().newInstance();
                strategyMap.put(str, strategy);
            }
            context.setStrategy(strategy);
            strategy.operationStrategy();
        }
    }
}