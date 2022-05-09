public class nested_for {
    public static void main(String[] args) {
        int i, j;

        for(i = 1; i <= 5; i++){
            for(j = 1; j <= i; j++){
                

                if(j == 2){
                    continue;
                }
                System.out.print( j);
            }
            if(i == 4){
                break;
            }
            System.out.println();
        }
    }
    
}
