public class BustCheck {
    int sum = 0;
    public boolean bustCheck(int values[]) {
        for (int i=0; i<values.length; i++) {
            sum = sum + values[i];
        }

        if(sum > 21) {
            return true;
        } else {
            return false;
        }
    }
}
