class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
     Arrays.sort(seats);
     Arrays.sort(students);
    int r = 0;
     for(int i = 0; i<students.length; i++){
        r += Math.abs(students[i]-seats[i]);
     }  
     return r; 
    }
}