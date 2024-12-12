public class SearchDuplicates {
    public static void main(String[] args) {
        // Input array
        int arr[] = {4, 7, 2, 4, 9, 7, 1, 2};

        // Print the input array
        System.out.println("Input Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // Linear search for duplicates
        //boolean foundDuplicate = false; // To check if any duplicates exist
        int flag=0;
        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " found at indexes " + i + " and " + j);
                    flag = 1; // Mark that a duplicate was found
                }
            }
            
        }

        // If no duplicates are found
        if (flag == 0) {
            System.out.println("Duplicates not found!");
        }
    }
}