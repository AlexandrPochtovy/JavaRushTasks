package testing;

/**
 * Created by admin on 12.02.2017.
 */
public class cycle_test {
    public static void main(String[] args) {
        for (int i = 0, j = 0; ((i < 10) | (j < 8)); i++, j++) {
            System.out.println ( i + j );
        }
    }
}
