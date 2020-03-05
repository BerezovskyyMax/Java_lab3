package ua.lviv.iot.manager;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import writer.ToolsWriter;

public class WateringManagerWritterTest extends AbstractWateringManagerTest {
    
    @BeforeEach
    public void setUp() {
        createAllTools();
    }
    
    @Test
    public void testWritingToFile() throws IOException {
        ToolsWriter.writeToFile(hoses);
    }

    
}
   
