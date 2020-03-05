package ua.lviv.iot.manager;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import writer.ToolsWriter;

public class WateringManagerWritterTest extends AbstractWateringManagerTest {
    
    ToolsWriter toolsWritter;
    
    @BeforeEach
    public void setUp() {
        createAllTools();
        toolsWritter = new ToolsWriter();
    }
    
    @Test
    public void testWritingToFile() throws IOException {
        
        
        toolsWritter.writeToFile(hoses);
    }

    
}
   
