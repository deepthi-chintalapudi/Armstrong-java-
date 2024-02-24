
public class Armstrong {
    public static void main(String[] args) {
        int n=371,remainder,result=0;
        int temp=n;
        while(temp!=0){
            remainder=temp%10;
            result+=Math.pow(remainder,3);
            temp/=10;
        }
        if(result==n){
            System.out.println("the given number is Armstrong number");
        }
        else{
            System.out.println("the given number is not an Armstrong number");
        }
    }
}
