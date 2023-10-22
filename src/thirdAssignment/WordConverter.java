package thirdAssignment;

public class WordConverter implements AdvancedConverter{

    @Override
    public void convertWordToPDF(String fileName) {
        System.out.println("Converting Word file <" + fileName + "> to PDF");
    }

    @Override
    public void convertJpgToPDF(String fileName) {

    }
}
