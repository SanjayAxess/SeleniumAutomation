public class ArraysPractice {
    String [] country = {"India", "Singapore", "Russia", "Nepal", "China", "Afghanistan"};
    String countries;
    int [][] TwoDimen = {{50,51,52,53,54,55},{60,61,62,63,64,65},{70,71,72,73,74,75},{80,81,82,83,84,85},{90,91,92,93,94,95}};

    public void World(){
//        for (int i = 0; i < country.length; i++) {
//            countries = country[i];
//            System.out.println("Country Lists " + (i+1) + " " +countries);
//
//        }
//        for (int i = 0; i < TwoDimen.length; i++) {
//            for (int j = 0; j < TwoDimen[i].length; j++) {
//                System.out.println(TwoDimen[i][j]);
//
//            }
//
//        }

        for (int [] row : TwoDimen){
            for (int cell : row){
                System.out.print(cell + " ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        ArraysPractice ap = new ArraysPractice();
        ap.World();
    }
}
