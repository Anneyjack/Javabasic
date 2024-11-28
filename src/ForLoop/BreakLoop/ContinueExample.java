package ForLoop.BreakLoop;

public class ContinueExample {


    public void PerformContinueExample() {
        for (int i = 0; i < 10; i++) {
            if (i ==3){
                continue;
            }
            System.out.println("NUmber" + i);
        }
    }
}
