class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int battery : batteries) sum += battery;

        long l = 0, r = sum / n, ans = 0;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (canRunAll(batteries, mid, n)) {
                ans = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }

    boolean canRunAll(int[] batteries, long t, int n) {
        long total = 0;
        for (int battery : batteries) {
            total += Math.min(battery, t);
            if (total >= t * n) return true;
        }
        return false;
    }
}