class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;

        for (int num : nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    list.add(i);
                    if(i != num/i)
                    {
                        list.add(num/i);
                    }
                }
            }

            if(list.size()==4)
            {
               for(int j=0; j<list.size(); j++)
               {
                sum+=list.get(j);
               }
            }
            }

            return sum;
        }

}
