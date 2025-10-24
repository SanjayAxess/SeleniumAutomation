public class Arrays {

        // collection of data
        int [] nums = {1,383,4,5,6,7};
        char [] vowels = {'a','e','i','o','u'};

        // Array is index based
        // index -> length -1

        int a = 10;
        public void arrayIteration(){
            for(int i = 0; i<6 ; i++) {
                System.out.println(nums[i]);
                //nums[0] = 1, nums[1] = 383, num[5] = 7
            }
                for(int j=0;j<5;j++){
                    System.out.println(vowels[j]);
            }
        }

        public static void main(String[] args) {
            Arrays as = new Arrays();
            as.arrayIteration();
        }
    }

