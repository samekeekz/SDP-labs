package thirdAssignment;

public class FileAdapter implements ConverterToPdf{
    AdvancedConverter advancedConverter;

    public FileAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("jpg")) {
            advancedConverter = new JpgConverter();
        } else if (fileType.equalsIgnoreCase("word")) {
            advancedConverter = new WordConverter();
        }
    }

    @Override
    public void convert(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("jpg")){
            advancedConverter.convertJpgToPDF(fileName);
        }
        else if(fileType.equalsIgnoreCase("word")){
            advancedConverter.convertWordToPDF(fileName);
        }
    }
}
