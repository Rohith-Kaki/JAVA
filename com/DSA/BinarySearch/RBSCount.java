package DSA.BinarySearch;
//count the no of rotations in the rotated sorted array....
public class RBSCount {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4,2};
        System.out.println(Search(arr));
    }
    //It DDOESNOT WORK IF THERE ARE DUPLICATE ELEMENTS BUT IT WORKS OF NON DUPLICATE ARRAYS BUT WENEED to
    // add one more case that checks the array is rotated or not

    //if not rotated return.
    //if rotated then check no of rotations...

    static int Search(int[] arr){
        if(arr[0] < arr[arr.length - 1]){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        
        return count+1;
    }
}



// OR we can also say no of rotations by finding pivot index + 1  {refer RSBCount2}