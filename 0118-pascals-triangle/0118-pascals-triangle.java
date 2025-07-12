class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) return result; 

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1); //add 1 o first row
        result.add(firstRow);

        if(numRows == 1) return result; //if no of rows is 1 then return result(1 as O/P)

        for(int i=1; i<numRows; i++){ //for next rows
            List<Integer> prevRow = result.get(i-1); //prev row

            List<Integer> nxtRow = new ArrayList<>();

            nxtRow.add(1); //first element of next rows(1)

            for(int j=0; j<i-1; j++){ //add the prev rows elements 
                nxtRow.add(prevRow.get(j) + prevRow.get(j+1));
            }

            nxtRow.add(1); //last element of next rows(1)

            result.add(nxtRow);
        }
        return result;
    }
}