
package kata3;


public class KATA3 {


    public static void main(String[] args) {
       Histogram<String> histogram = new Histogram<>();
       histogram.increment("gemail.com");
       histogram.increment("gemail.com");
       histogram.increment("hotmail.com");
       histogram.increment("g.com");
       histogram.increment("g.com");
       histogram.increment("ull.com");
       new HistogramDisplay(histogram).execute();
    }
}
