// import java.util.*;
// public class main{
//     public static void swap(int i , int j , int[] nums){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
//     public static void help(List<List<Integer>> result , int[] nums  , int idx){
//         if(idx == nums.length) {
//             result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));

//             return;
//         }
//         for (int i = idx ; i < nums.length ; i++){

//         swap(idx , i, nums);
//         help(result , nums , idx+1);
//         swap(idx , i, nums);
//         }


//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

        

//     }
// }

// class Solution {
//     public static void swap(int i , int j , int[] nums){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
//     public static void help(List<List<Integer>> result , int[] nums  , int idx){
//         if(idx == nums.length) {
//             result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));

//             return;
//         }
//         for (int i = idx ; i < nums.length ; i++){

//         swap(idx , i, nums);
//         help(result , nums , idx+1);
//         swap(idx , i, nums);
//         }


//     }
//     public List<List<Integer>> permute(int[] nums) {

//         List<List<Integer>> result =  new ArrayList<>();
//         help(result , nums, 0);
//         return result;

//     }
// }

// import java.util.*;
// import java.util.stream.Collectors;

// public class main {
//     public static void swap(int i, int j, int[] nums) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     public static void help(List<Integer> result, int[] nums, int idx) {
//         if (idx == nums.length) {
//             // Convert the array to a single integer
//             int num = 0;
//             for (int digit : nums) {
//                 num = num * 10 + digit;
//             }
//             result.add(num);
//             return;
//         }
//         for (int i = idx; i < nums.length; i++) {
//             swap(idx, i, nums);
//             help(result, nums, idx + 1);
//             swap(idx, i, nums);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         List<List<Integer>> arrays = new ArrayList<>();


//         List<Integer> singleIntegers = new ArrayList<>();

//         // Extract arrays and convert to single integers
//         for (List<Integer> array : arrays) {
//             int[] intArray = new int[array.size()];
//             for (int i = 0; i < array.size(); i++) {
//                 intArray[i] = array.get(i);
//             }
//             help(singleIntegers, intArray, 0);
//         }

//         // Print the single integers
//         for (int num : singleIntegers) {
//             System.out.println(num);
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// public class main {
//     public static void generatePermutations(String input, String current, List<String> result) {
//         if (input.isEmpty()) {
//             if (!current.startsWith("0")) {
//                 result.add(current);
//             }
//             return;
//         }

//         for (int i = 0; i < input.length(); i++) {
//             char digit = input.charAt(i);
//             String remaining = input.substring(0, i) + input.substring(i + 1);
//             generatePermutations(remaining, current + digit, result);
//         }
//     }

//     public static void main(String[] args) {
//         String input = "1001";
//         List<String> result = new ArrayList<>();
//         generatePermutations(input, "", result);

//         for (String permutation : result) {
//             System.out.println(permutation);
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.List;
// import java.util.*;

// public class main {
//     public static void generatePermutations(int input, String current, List<String> result) {
//         String inputStr = String.valueOf(input);
//         generatePermutations(inputStr, current, result);
//     }

//     public static void generatePermutations(String input, String current, List<String> result) {
//         if (input.isEmpty()) {
//             if (!current.startsWith("0")) {
//                 result.add(current);
//             }
//             return;
//         }

//         for (int i = 0; i < input.length(); i++) {
//             char digit = input.charAt(i);
//             String remaining = input.substring(0, i) + input.substring(i + 1);
//             generatePermutations(remaining, current + digit, result);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         int s = sc.nextInt();
//         List<String> result = new ArrayList<>();
//         generatePermutations(input, "", result);

//         for (String permutation : result) {
//             if (input+permutation == s){

//             }
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.List;
// import java.util.*;

// public class main {
//     public static List<Integer> generatePermutations(int input) {
//         String inputStr = String.valueOf(input);
//         List<Integer> result = new ArrayList<>();
//         generatePermutations(inputStr, 0, result);
//         return result;
//     }

//     public static void generatePermutations(String input, int current, List<Integer> result) {
//         if (input.isEmpty()) {
//             if (current != 0) {
//                 result.add(current);
//             }
//             return;
//         }

//         for (int i = 0; i < input.length(); i++) {
//             char digit = input.charAt(i);
//             String remaining = input.substring(0, i) + input.substring(i + 1);
//             int newCurrent = current * 10 + (digit - '0');
//             generatePermutations(remaining, newCurrent, result);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         int s = sc.nextInt();
//         boolean check = false;
//         List<Integer> result = generatePermutations(input);

//         for (int permutation : result) {
//             // if(input+permutation == s){
//             //     check = true ;
//             //     break;
//             // }
//             System.out.println(permutation);
//         }
//         // if(check){
//         //     System.out.println("YES");
//         // }else{
//         //     System.out.println("NO");
//         // }
//     }
// }
// import java.util.ArrayList;
// import java.util.List;

// public class main {
//     public static List<Integer> generatePermutations(int input, List<Integer> exclusions) {
//         String inputStr = String.valueOf(input);
//         List<Integer> result = new ArrayList<>();
//         generatePermutations(inputStr, 0, result, exclusions);
//         return result;
//     }

//     public static void generatePermutations(String input, int current, List<Integer> result, List<Integer> exclusions) {
//         if (input.isEmpty()) {
//             if (current != 0 && !exclusions.contains(current)) {
//                 result.add(current);
//             }
//             return;
//         }

//         for (int i = 0; i < input.length(); i++) {
//             char digit = input.charAt(i);
//             String remaining = input.substring(0, i) + input.substring(i + 1);
//             int newCurrent = current * 10 + (digit - '0');
//             generatePermutations(remaining, newCurrent, result, exclusions);
//         }
//     }

//     public static void main(String[] args) {
//         int input = 1000;
//         List<Integer> exclusions = new ArrayList<>();
//         exclusions.add(1);
//         exclusions.add(10);
//         exclusions.add(100);

//         List<Integer> result = generatePermutations(input, exclusions);

//         for (int permutation : result) {
//             System.out.println(permutation);
//         }
//     }
// }
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class main {
//     public static List<Integer> generatePermutations(int input) {
//         String inputStr = String.valueOf(input);
//         List<Integer> result = new ArrayList<>();
//         generatePermutations(inputStr, 0, result, inputStr.length());
//         return result;
//     }

//     public static void generatePermutations(String input, int current, List<Integer> result, int targetLength) {
//         if (current != 0 && String.valueOf(current).length() == targetLength) {
//             result.add(current);
//         }

//         if (input.isEmpty()) {
//             return;
//         }

//         for (int i = 0; i < input.length(); i++) {
//             char digit = input.charAt(i);
//             String remaining = input.substring(0, i) + input.substring(i + 1);
//             int newCurrent = current * 10 + (digit - '0');
//             generatePermutations(remaining, newCurrent, result, targetLength);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         int s = sc.nextInt();
//         int check1 = s-input;
//         boolean check = false;

//         List<Integer> result = generatePermutations(input);

//         for (int permutation : result) {
//             if(check1 == permutation){
//                 check = true;
//             }
//         }
//         if(check){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO");
//         }
//     }
// }

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input the original number 'a' and the desired sum 's'
//         int a = sc.nextInt();
//         int s = sc.nextInt();

//         // Convert 'a' to a string to manipulate its digits
//         String aStr = Integer.toString(a);

//         // Check if it's possible to rearrange the digits of 'a' to obtain 's'
//         if (canRearrangeToSum(aStr, s)) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }

//     public static boolean canRearrangeToSum(String numStr, int s) {
//         // Calculate the sum of the digits in 'numStr'
//         int digitSum = 0;
//         for (int i = 0; i < numStr.length(); i++) {
//             digitSum += numStr.charAt(i) - '0';
//         }

//         // Check if it's possible to obtain 's' by rearranging the digits
//         return digitSum >= s && (digitSum - s) % 2 == 0;
//     }
// }


// class main {
    // public int triangularSum(int[] nums) {
    //     int[][] dp = new int[nums.length][nums.length];
    //     for(int i = 0 ; i < nums.length ; i++){
    //         dp[0][i] = nums[i];
    //     }
    //     for(int j = 1 ; j < nums.length ; j ++){
    //         for(int i = 0 ; i < nums.length-1 ; i++){
    //         dp[j][i] = dp[j-1][i] + dp[j-1][i+1];
    //     }
    //     }
    //     return dp[nums.length-1][nums.length-1];
        
    // }
//     public static void main(String[] args) {
//         int nums[] = {1,2,3,4,5} ;
//         int[][] dp = new int[nums.length][nums.length];
//         for(int i = 0 ; i < nums.length ; i++){
//             dp[0][i] = nums[i];
//         }
//         for(int j = 1 ; j < nums.length ; j ++){
//             for(int i = 0 ; i < nums.length-j ; i++){
//             dp[j][i] = (dp[j-1][i] + dp[j-1][i+1])%10;
//         }
//         }
//         for (int i = 0; i < dp.length; i++) {
//             for (int j = 0; j < dp[i].length; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//         System.out.println(dp[nums.length-1][0]);
        
//     }
// }

// class LL{
//     Node head;
//     class Node{
//         String data ;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public void addfirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
        
//     }
//     public void addlast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node CurrNode = head;
//         while(CurrNode.next != null){
//             CurrNode = CurrNode.next;

//         }



//     }

//     public void delfi(){
//         if(head == null){
//             System.out.println("The list is empty");
//         }

//         head = head.next;
//     }
//     public void della(){
//         Node CurrNode = head;
//         if(head.next == null){
//             head = null;
//             return;
//         }
//         while(CurrNode.next.next != null){
//             CurrNode = CurrNode.next;
//         }
//         CurrNode.next = null;
//     }
//     public void printNode(){
//         Node CurrNode = head;
//         if(head == null ){
//             System.out.println("List is empty");
//             return;
//         }
//         while(CurrNode != null){
//             System.out.print(CurrNode.data + "->");
//             CurrNode = CurrNode.next;

//         }
        
        
//     }
//     public void reverse(){

//         if(head == null || head.next ==  null){
//             return;
//         }
//         Node pervious = head;
//         Node currn = head.next;
//         while(currn != null){
//             Node next = currn.next;
//             currn.next = pervious;

//             pervious = currn;
//             currn = next;            
//         }
//         head.next = null;
//         head = pervious;

//     }
//    public Node reverse(Node head) {
//     if (head == null || head.next == null) {
//         return head;
//     }
//     Node newHead = reverse(head.next);
//     head.next.next = head;
//     head.next = null;
//     return newHead;
// }
//     public static void main(String[] args) {
//         LL list = new LL();
//         list.addfirst("hello");
//         list.addfirst("hell");
//         list.addfirst("hel");
//         list.addfirst("he");

//         list.printNode();

//         list.reverse(list.head);
//         System.out.println();
//         list.printNode();
        
//         ;
        


        
//     }
// }


// import java.util.*;
// class main{
//     // public void removen(LinkedList<String>){

//     // }
//     /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//   private static ListNode reverse(ListNode head){
//       if(head == null || head.next == null){
//           return head;
//       }
//       ListNode curr = head;
//       ListNode prev = null;
//       while(curr != null){
//           ListNode next = curr.next;
//           curr.next = prev;
//           prev = curr;
//           curr = curr.next;
      
//       }
//       return prev;
//   }


//   public boolean isPalindrome(ListNode head) {
//       ListNode hare = head.next;
//       ListNode tur = head;
//       while(hare.next != null && hare.next.next != null){
//           hare = hare.next.next;
//           tur = tur.next;
//       }
//       ListNode second = reverse(tur.next);
//       tur.next = second;
//       hare = head;
//       while(second != null){
//           if(hare.val != second.val){
//               return false;
//           }
//           hare = hare.next;
//           second = second.next;

//       }
//       return false;


      
//   }
// }
//     public static void main(String[] args) {
//       for (int i = 0; i < 100;) {
//         System.out.println("hello");
        
//       }
        
//     }
// }

