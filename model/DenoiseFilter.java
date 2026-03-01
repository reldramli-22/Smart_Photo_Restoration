package model;

public class DenoiseFilter implements RestorationFilter {

    @Override
    public void applyFilter(String imageName) {
        System.out.println("Processing: Reducing Noise (Denoising) for " + imageName + "...");
    }
}
