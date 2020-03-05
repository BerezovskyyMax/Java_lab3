package ua.lviv.iot.manager;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import writer.ToolsWriter;

public class WateringManagerWritterTest extends AbstractWateringManagerTest {
    
    @Test
    public void testWritingToFile() throws IOException {
        
        createAllTools();
        
        ToolsWriter.writeToFile(hoses);
    }

    
}
   
