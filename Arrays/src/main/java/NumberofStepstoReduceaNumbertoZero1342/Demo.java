package NumberofStepstoReduceaNumbertoZero1342;

public class Demo {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 8;
        int num3 = 123;
        System.out.println("Number of steps required to reduce the number "+num1+" to 0 is : "+numberOfSteps(num1));
        System.out.println("Number of steps required to reduce the number "+num2+" to 0 is : "+numberOfSteps(num2));
        System.out.println("Number of steps required to reduce the number "+num3+" to 0 is : "+numberOfSteps(num3));
    }

    public static int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if(num%2==0){
                num /=2;
                count++;
            }else{
                num -=1;
                count++;
            }
        }
        return count;
    }
}
