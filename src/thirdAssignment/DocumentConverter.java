package thirdAssignment;

public class DocumentConverter implements ConverterToPdf{
    FileAdapter fileAdapter;

    @Override
    public void convert(String fileType, String fileName) {
        // In-built function
        if (fileType.equalsIgnoreCase("png")) {
            System.out.println("Converting Png file <" + fileName + "> to PDF");
        } else if (fileType.equalsIgnoreCase("word") || fileType.equalsIgnoreCase("jpg")) {
            fileAdapter = new FileAdapter(fileType);
            fileAdapter.convert(fileType, fileName);
        } else{
            System.out.println("Invalid file. " + fileType + " format not supported");
        }
    }
}
