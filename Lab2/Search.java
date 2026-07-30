public class Search {
    int arr[];

    Search(int arr[]) {
        this.arr = arr;
    }
    // return type = void
    // parameters = int
    public void findElement(int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(target + " found at index " + i + ".");
                return;
            }   
        }
        System.out.println(target + " not found.");
    }

    // return type === int 
    // paramters = float
    public int findElement(float target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(target + " found at index " + i + ".");
                return i; 
            }   
        }
        return -1; 
    }

    public static void main(String args[]) {
        int arrI[] = {2, 3, 5, 1, 4};

        Search findI = new Search(arrI);

        float target = 5.0f; 
        
        System.out.println("--- Calling the Float Method ---");

        int resultIndex = findI.findElement(target);
        System.out.println("Returned index value: " + resultIndex);

        System.out.println("--- Calling the Int Method ---");
        findI.findElement(5); 
    }
}
