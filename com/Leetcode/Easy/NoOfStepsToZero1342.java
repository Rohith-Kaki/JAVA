public class NoOfStepsToZero1342{
    public static void main(String[] args) {
        System.out.println(NoOfSteps(57));
    }
    public static int NoOfSteps(int num){
        return StepCounter(num, 0);
    }
    public static int StepCounter(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return StepCounter(num / 2, steps + 1);
        }
        return StepCounter(num - 1, steps + 1);
    }
}