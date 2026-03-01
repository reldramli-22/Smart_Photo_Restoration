package controller;

import model.*;
import view.RestorationView;

public class RestorationController {

    private final ImageObject image;
    private final RestorationView view;
    private RestorationFilter filter; // استخدام نمط الاستراتيجية للتبديل بين الفلاتر [2]

    public RestorationController(ImageObject image, RestorationView view) {
        this.image = image;
        this.view = view;
    }

    public void setFilter(RestorationFilter filter) {
        this.filter = filter;
    }

    public void processRestoration() {
        view.displayImageInfo(image.getImagePath(), image.getFormat());
        if (filter != null) {
            filter.applyFilter(image.getImagePath());
            view.showStatus("Restoration Completed Successfully!");
        } else {
            view.showStatus("Error: Please select a restoration filter.");
        }
    }
}
