package CommonMethods;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xslf.usermodel.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestEvidence {
    private static XMLSlideShow ppt;
    WebDriver driver;
    public TestEvidence(WebDriver driver){
        this.driver=driver;

    }




            public void ppt(String Header) throws IOException {

                if (ppt == null) {
                    ppt = new XMLSlideShow();
                }

                // Capture a screenshot
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot, new File("screenshot.png"));

                // Create a new slide
                XSLFSlide slide = ppt.createSlide(ppt.getSlideMasters().get(0).getLayout(SlideLayout.TITLE));

                // Add a title text to the slide
                XSLFTextShape title = slide.createTextBox();
                title.setAnchor(new Rectangle(50, 30, 600, 40));
                XSLFTextParagraph p = title.addNewTextParagraph();
                XSLFTextRun r = p.addNewTextRun();
                r.setText("Screenshot " + ppt.getSlides().size());
                r.setFontColor(Color.WHITE);
                r.setFontSize(20.0);

                XSLFTextShape header = slide.createTextBox();
                header.setAnchor(new Rectangle(50, 10, 600, 20));
                XSLFTextParagraph headerParagraph = header.addNewTextParagraph();
                XSLFTextRun headerRun = headerParagraph.addNewTextRun();
                headerRun.setText(Header);
                headerRun.setFontColor(Color.BLACK);
                headerRun.setFontSize(16.0);

                // Add the screenshot to the slide
                XSLFPictureData pd = ppt.addPicture(new File("screenshot.png"), XSLFPictureData.PictureType.PNG);
                XSLFPictureShape pic = slide.createPicture(pd);

                // Set the position and size of the screenshot
                pic.setAnchor(new Rectangle(50, 100, 600, 400));

                // Delete the screenshot file (optional)
//                FileUtils.forceDelete(new File("screenshot.png"));

                // Save the PowerPoint presentation
                FileOutputStream out = new FileOutputStream(System.getProperty("user.dir")+"/src/TestEvidences/PowerPoint/TestEvidence.ppt");
                ppt.write(out);
                out.close();
            }

}
