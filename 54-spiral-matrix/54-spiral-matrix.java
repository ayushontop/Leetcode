class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
           int k=0,l=0;
            int lr = matrix.length-1;
            int lc = matrix[0].length-1;

            List<Integer> res = new ArrayList<>();

            while(k<=lr && l<=lc)
            {
                for(int i=l;i<=lc;i++)
                {
                    res.add(matrix[k][i]);
                }
                k++;
                for(int i=k;i<=lr;i++)
                {
                    res.add(matrix[i][lc]);
                }
                lc--;
                if(k<=lr)
                {
                    for(int i=lc;i>=l;i--)
                    {
                        res.add(matrix[lr][i]);
                    }
                    lr--;
                }
                if(l<=lc)
                {
                    for(int i=lr;i>=k;i--)
                    {
                        res.add(matrix[i][l]);
                    }
                    l++;
                }
            }
            return res;
        }
    }