// public class pract53{
//     public static void main(String args[]){
//        char []arr1 = {'B','C','D','A','A','C','D'};
//         char []arr2 = {'A','C','D','B','A','C'};
//         int [][]matrix = new int [8][7];
//         for(int i = 0;i<arr1.length + 1;i++){
//             for(int j = 0;j<arr2.length + 1;j++){
//                 if(i == 0 || j == 0){
//                     matrix[i][j] = 0;
//                 }
//                 else{
//                 if(arr1[i-1] == arr2[j-1]){
//                     matrix[i][j] = matrix[i-1][j-1] + 1;
//                 }
//                 else{
//                     matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
//                 }
//                 }

//             }
//         }
//         System.out.println(matrix[arr1.length][arr2.length] );
//         for (int i = 0; i < arr1.length+1; i++) {
//             for (int j = 0; j < arr2.length+1; j++) {
//                 System.out.print(matrix[i][j]+ " ");
//             }
//             System.out.println(" ");
            
//         }
//     }
// }
class pract53{
    public static void main(String args[]){
       char []arr1 = {'A','C','A','D','B'};
        char []arr2 = {'C','B','D','A'};
        int [][]matrix = new int [6][5];
        for(int i = 0;i<arr1.length + 1;i++){
            for(int j = 0;j<arr2.length + 1;j++){
                if(i == 0 || j == 0){
                    matrix[i][j] = 0;
                }
                else{
                if(arr1[i-1] == arr2[j-1]){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                }
                else{
                    matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
                }
                }

            }
        }
        System.out.println(matrix[arr1.length][arr2.length] );
         for (int i = 0; i < arr1.length+1; i++) {
            for (int j = 0; j < arr2.length+1; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println(" ");
            
        }
    }
}