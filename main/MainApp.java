package main;

import model.*;
import view.RestorationView;
import controller.RestorationController;

public class MainApp {

    public static void main(String[] args) {
        // 1. إنشاء كائن الصورة والمشهد
        ImageObject myImage = new ImageObject("Archived_Photo_1950.png", "PNG");
        RestorationView myView = new RestorationView();

        // 2. إعداد المتحكم
        RestorationController controller = new RestorationController(myImage, myView);

        // 3. تطبيق فلتر إزالة الضجيج (Denoising)
        controller.setFilter(new DenoiseFilter());
        controller.processRestoration();

        System.out.println();

        // 4. التبديل إلى فلتر زيادة الوضوح (Sharpening) - مرونة نمط الاستراتيجية [3]
        controller.setFilter(new SharpenFilter());
        controller.processRestoration();
    }
}
