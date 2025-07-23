class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if(numRows==0) return res;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        if(numRows==1) return res;

        for(int i=1;i<numRows;i++)
        {
            List<Integer> prevRow = res.get(i-1);

            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }
            row.add(1);

            res.add(row);
        }
        return res;
    }
}