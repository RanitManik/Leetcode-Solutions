class Solution {
    public double average(int[] salary) {
        int minSalary = salary[0];
        int maxSalary = salary[0];
        double sumSalary = 0;

        for (int eachSalary : salary) {
            sumSalary += eachSalary;

            if (minSalary > eachSalary) {
                minSalary = eachSalary;
            }

            if (maxSalary < eachSalary) {
                maxSalary = eachSalary;
            }
        }

        sumSalary = sumSalary - maxSalary - minSalary;

        // Use (double) to ensure the division results in a double
        return (double) (sumSalary / (salary.length - 2));
    }
}
