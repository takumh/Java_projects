public class Arrays {
    public static void main (String args[]){
        int [] A = new int [5];
        for (int j = 0; j < A.length; j++){
            A[j] = j;
        }

        for (int i = A.length -1; i >= 0; i--){
            System.out.print(A[i] + " ");
        }

    }
}

