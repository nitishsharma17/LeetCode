class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
     int r = 0;
     Arrays.sort(seats);
     Arrays.sort(students);

     for(int i = 0; i<students.length; i++){
        r += Math.abs(seats[i]-students[i]);
     }  
     return r; 
    }
}