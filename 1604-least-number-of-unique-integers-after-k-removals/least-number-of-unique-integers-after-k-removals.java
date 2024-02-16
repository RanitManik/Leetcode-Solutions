class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // Count occurrences of each element in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue to store elements based on their frequencies
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));

        // Add elements to the priority queue
        pq.addAll(frequencyMap.keySet());

        // Remove the least frequent elements to meet the required count
        while (k > 0) {
            int num = pq.poll();
            int frequency = frequencyMap.get(num);
            if (frequency <= k) {
                k -= frequency;
                frequencyMap.remove(num);
            } else {
                frequencyMap.put(num, frequency - k);
                k = 0;
            }
        }

        // Return the number of unique elements remaining
        return frequencyMap.size();
    }
}