package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;

import ua.lviv.iot.model.AbstractWateringTool;

public class ToolsWriter {


    public void writeToFile(List<AbstractWateringTool> tools) {

        String pathToFile = new File("").getAbsolutePath();

        File file = new File(pathToFile + "//test.txt");

        try(Writer writer = new FileWriter(file, StandardCharsets.UTF_8)) {

            for (AbstractWateringTool currentTool : tools) {
                writer.write(currentTool.getHeaders() + currentTool.toCSV() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
