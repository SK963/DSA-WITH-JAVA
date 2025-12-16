import java.util.*;

public class NMettings {

    // count of meetings :
    public static int maxMeetings(int start[], int end[]) {
        int n = start.length;
        int meet[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            meet[i][0] = start[i];
            meet[i][1] = end[i];
        }

        Arrays.sort(meet, (a, b) -> {
            if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);
            else
                return Integer.compare(a[0], b[0]);

        });

        System.out.println(Arrays.deepToString(meet));

        int count = 0;
        for (int i = 0; i < n - 1; i++) {

            int j = i + 1;
            while (j < n && meet[i][1] >= meet[j][0]) {
                j++;

            }
            if (j < n) {
                count++;
                continue;
            }
            i = j - 1;

        }

        return Integer.max(count,1);

    }

    static class meeting {
        int start;
        int end;
        int pos;

        meeting(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    static class meetingComparator implements Comparator<meeting> {
        @Override
        public int compare(meeting o1, meeting o2) {
            if (o1.end < o2.end)
                return -1;
            else if (o1.end > o2.end)
                return 1;
            else if (o1.pos < o2.pos)
                return -1;
            return 1;
        }
    }

    public static int maxMeetings2(int start[], int end[]) {
        int n = start.length;

        ArrayList<meeting> meet = new ArrayList<>();
        for (int i = 0; i < n; i++)
            meet.add(new meeting(start[i], end[i], i + 1));

        meetingComparator mc = new meetingComparator();

        Collections.sort(meet, mc);

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for (int i = 1; i < start.length; i++) {
            if (meet.get(i).start > limit) {
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }

        // System.out.println(answer.toString());

        return answer.size();
    }

    public static void main(String[] args) {

        System.out.println(maxMeetings(new int[] { 1, 3, 0, 5, 8, 5 }, new int[] { 2, 4, 6, 7, 9, 9 }));// 4
        System.out.println(maxMeetings(new int[] { 0, 3, 1, 5, 5, 8 }, new int[] { 5, 4, 2, 9, 7, 9 }));// 4
        System.out.println(maxMeetings(new int[] { 7, 18, 24 }, new int[] { 30, 26, 28 }));// 1

    }
}