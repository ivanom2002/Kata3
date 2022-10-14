package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram Display", histogram);
        histogramDisplay.execute();
    }
    
}
