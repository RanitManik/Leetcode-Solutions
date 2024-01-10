import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> numList = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("+")) {
                numList.add(numList.get(numList.size() - 1) + numList.get(numList.size() - 2));
            } else if (op.equals("D")) {
                numList.add(numList.get(numList.size() - 1) * 2);
            } else if (op.equals("C")) {
                numList.remove(numList.size() - 1);
            } else {
                numList.add(Integer.parseInt(op));
            }
        }

        return numList.stream().mapToInt(Integer::intValue).sum();
    }
}
