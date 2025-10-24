class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int size= arr.length;
        int[] arr2= new int[size];
        for(int i=0; i< size; i++)
        {
            arr2[i]= arr[i];
        }

        Arrays.sort(arr2);

        HashMap<Integer, Integer> map= new HashMap<>();
        int rank=1;
        for(int j: arr2)
        {
            if(!map.containsKey(j))
            {
                map.put(j, rank++);
            }

        }
        int[] result= new int[size];

        for(int k=0; k<size; k++)
        {
            result[k]= map.get(arr[k]);
        }
        return result;


    }
}