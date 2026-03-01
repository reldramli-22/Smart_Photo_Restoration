package model;

public class SharpenFilter implements RestorationFilter {

    @Override
    public void applyFilter(String imageName) {
        System.out.println("Processing: Enhancing Edges (Sharpening) for " + imageName + "...");
    }
}
