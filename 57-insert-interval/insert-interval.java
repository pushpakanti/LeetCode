class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list= new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);
        intervals= list.toArray(new int[list.size()][]);

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> list2= new ArrayList<>();

        int start1=intervals[0][0];
        int end1=intervals[0][1];

        for(int i=1; i<intervals.length; i++)
        {
            int start2= intervals[i][0];
            int end2= intervals[i][1];

            if(end1>=start2)
            {
                start1=start1;
                end1=Math.max(end1, end2);
            }
            else
            {
                list2.add(new int[]{start1, end1});
                start1=start2;
                end1=end2;
            }
        }
        list2.add(new int[]{start1, end1});
        return list2.toArray(new int[list2.size()][]);

    }
}