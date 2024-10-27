package RichestCustomerWealth1672;

public class RichestCustomer {
    public static void main(String[] args) {
        int [][] account1 = {{1,2,3},{3,2,1}};
        int [][] account2 = {{1,5},{7,3},{3,5}};
        int [][] account3 = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println("The wealthiest amount in account1 is:" + maxWealth(account1));
        System.out.println("The wealthiest amount in account2 is:" + maxWealth(account2));
        System.out.println("The wealthiest amount in account3 is:" + maxWealth(account3));
    }


    public static int maxWealth(int[][] accounts) {
        int M = accounts.length;
        int N = accounts[0].length;
        int highestwealth =0;
        for(int i=0;i<M;i++){
            int sum=0;
            for(int j=0;j<N;j++){
                sum += accounts[i][j];
            }
            highestwealth = Math.max(highestwealth,sum);
        }
        return highestwealth;
    }
}
