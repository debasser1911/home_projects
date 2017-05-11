import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleHolder implements Comparable<DoubleHolder> {
    public static void main(String[] args) {
        List<DoubleHolder> data = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            data.add(new DoubleHolder(i));
        }
        data.add(new DoubleHolder(Double.NaN));

        for (int i = 0; i < 10; i++) {
            Collections.shuffle(data);
            Collections.sort(data);
            System.out.println(data);
        }
    }


    double d;

    public DoubleHolder(double d) {
        this.d = d;
    }

    @Override
    public int compareTo(DoubleHolder o) {
        return d > o.d ? 1 : d == o.d ? 0 : -1;
    }

    @Override
    public String toString() {
        return String.valueOf(d);
    }


}