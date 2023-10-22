package thirdAssignment;

public class JpgConverter implements AdvancedConverter{
    @Override
    public void convertWordToPDF(String fileName) {

    }

    @Override
    public void convertJpgToPDF(String fileName) {
        System.out.println("Converting Jpg file <" + fileName + "> to PDF");
    }
}
