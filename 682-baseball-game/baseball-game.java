class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            try {
                // If it's a number, parse and add it to the list
                numList.add(Integer.parseInt(operations[i]));
            } catch (NumberFormatException e) {
                // If it's not a number, perform corresponding operation
                if (operations[i].equals("+")) {
                    numList.add(numList.get(numList.size() - 1) + numList.get(numList.size() - 2));
                } else if (operations[i].equals("D")) {
                    numList.add(numList.get(numList.size() - 1) * 2);
                } else if (operations[i].equals("C")) {
                    numList.remove(numList.size() - 1);
                }
            }
        }

        // Calculate the sum of the elements in the list
        int sum = 0;
        for (int num : numList) {
            sum += num;
        }

        return sum;
    }
}
