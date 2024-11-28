package ForLoop.BreakLoop;

public class BreakLoopExample {


    public void performBreakloop(){
        for ( int i = 0; i < 10; i++){
            if(i == 3){
                break;
            }
            System.out.println("Number" + i);
        }
    }
}
