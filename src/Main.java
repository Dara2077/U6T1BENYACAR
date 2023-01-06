public class Main {
    public static void main(String[] args){
//        //Activity 1
//        int[] heights = new int[3];
//        for (int i = 0; i<=2; i ++){
//            System.out.println(heights[i]);
//        }
//        heights[0] = 78;
//        heights[1] = 72;
//        heights[2] = 69;
//
//        for (int i = 0; i<=2; i ++){
//            System.out.println(heights[i]);
//        }
//        //Activity 2
//        boolean[] bools = {true, false, true, false, true, false};
//        bools[0] = bools[3];
//
//        //Original code
////        for (int i = 0; i <= 5; i += 2 ){
////            bools[i] = true;
////        }
////        bools[0] = false;
//        System.out.println(bools.length);
//        System.out.println(bools[0]);
//        System.out.println(bools[bools.length - 1]);

//        //Activity 3
//        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
//        String temp = alphabeticalNames[1];
//        alphabeticalNames[1] = alphabeticalNames[2];
//        alphabeticalNames[2] = temp;
//
//        System.out.println(alphabeticalNames[0]);
//        System.out.println(alphabeticalNames[1]);
//        System.out.println(alphabeticalNames[2]);
//        System.out.println(alphabeticalNames[3]);

//        //Activity 4
//
//        double[] array1 = {7.5, 10.0};
//        double[] array2 = {8.2, 14.8};
//        double[] array3 = {array1[0] + array2[0], array1[1] * array2[1]};
//        for (int i = 0; i<=1; i++){
//            System.out.println(array3[i]);
//        }

//        //Activity 5
//        String[] animals = new String[4];
//        for (int i = 0; i<=3; i ++){
//            System.out.println(animals[i]);
//        }
//        animals[0] = "dog";
//        animals[1] = "camel";
//        animals[2] = "aardvark";
//        animals[3] = "bunny";
//
//        for (int i = 0; i<=3; i ++){
//            System.out.println(animals[i]);
//        }
//
//        System.out.println(animals[3]);
//        animals[2] = animals[2] + "s";
//        System.out.println(animals[2]);
//        System.out.println(animals.length);
//        System.out.println(animals[2].length());

//        //Activity 7
//        int[] ints1 = {2, 4, 6, 8, 10};
//        int[] ints2 = ints1;
//        ints2[3] = 15;
//        System.out.println(ints1[3]);
//        System.out.println(ints2[3]);

        //Activity 8
        String[] myStrs = {"hi", "bye", "what", "purple"};
        int arrLen = myStrs.length;
        int strLen = myStrs[3].length();
        System.out.println(arrLen + strLen);

        String str = myStrs[2].substring(1, 3);
        System.out.println(str);


    }
}
