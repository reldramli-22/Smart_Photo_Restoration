package model;

public class ImageObject {

    private String imagePath; // إخفاء المعلومات باستخدام private [1]
    private String format;

    public ImageObject(String imagePath, String format) {
        this.imagePath = imagePath;
        this.format = format;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getFormat() {
        return format;
    }
}
