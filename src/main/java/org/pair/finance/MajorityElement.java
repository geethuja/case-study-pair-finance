package org.pair.finance;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {
    public static int getMajorityElement(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int highestCount = 1, result = nums[0];
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                currentCount++;
            else
                currentCount = 1;

            if (currentCount > highestCount) {
                highestCount = currentCount;
                result = nums[i - 1];
            }
        }
        return result;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the size of the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Please enter the elements:");
        for(int i = 0; i < n; i++){
            System.out.print("Element "+ ( i + 1 ) + ":");
            nums[i] = scanner.nextInt();
        }

        int result = MajorityElement.getMajorityElement(nums);
        System.out.println("Majority Element : " + result);

    }

}
