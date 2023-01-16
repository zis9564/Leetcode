package org.example;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        //check if "target" is in "matrix" range
        int columnLength = matrix.length-1;
        int rowLength = matrix[columnLength].length-1;
        if(target < matrix[0][0] || target > matrix[columnLength][rowLength])
            return false;
        //invoke binary search with given params
        return bSearch(matrix, target, 0, matrix.length-1);
    }

    private boolean bSearch(int[][] matrix, int target, int start, int end) {
        int mid = (start+end)/2;
        //if 1st element in row > "target"
        // -> invoke bSearch() recursively with "mid" as "end" param
        if(matrix[mid][0] > target) return bSearch(matrix, target, start, mid);
        //if 1st element in row < "target"
        if(matrix[mid][0] < target) {
            //invoke bSearchRow() to check if given row contains "target"
            var isContain = bSearchRow(matrix[mid], target, 0, matrix[mid].length-1);
            //return true if given row contains "target"
            if(isContain) return true;
            //return false if given row doesn't contain "target" AND next row starts with value > "target"
            if(isNextRowGreaterThanTarget(matrix, mid, target)) return false;
            //if given row doesn't contain "target" AND next row starts with value <= "target"
            // return bSearch() with "mid+1" as "start" param
            return bSearch(matrix, target, mid + 1, end);
        }
        //return true if 1st element = "target"
        return true;
    }

    private boolean isNextRowGreaterThanTarget(int[][] matrix, int mid, int target) {
        //if 1st element "mid+1" > "target" OR "mid+1" out of "matrix" range
        //-> return true
        try{
            return matrix[mid + 1][0] > target;
        } catch (IndexOutOfBoundsException e) {
            return true;
        }
    }

    private boolean bSearchRow(int[] row, int target, int start, int end) {
        //calculate middle of given row
        int mid = (start + end)/2;
        //terminal (negative) condition
        if(start==end && row[mid] != target) return false;
        //if "mid" < "target"
        //-> recursively invoke bSearchRow() with "mid+1" as "start" param
        if(row[mid] < target) return bSearchRow(row, target, mid+1, end);
        //if "mid" > "target"
        //-> recursively invoke bSearchRow() with "mid" as "end" param
        if(row[mid] > target) return bSearchRow(row, target, start, mid);
        //terminal (positive) condition
        return true;
    }
}
