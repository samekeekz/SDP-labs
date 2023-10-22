package thirdAssignment;

public class AdapterPatternDemo {
    public static void main (String[] args){
        DocumentConverter documentConverter = new DocumentConverter();

        documentConverter.convert("jpg", "Book");
        documentConverter.convert("png", "Light");
        documentConverter.convert("word", "CV");
        documentConverter.convert("jpeg", "Sunset");
    }
}
