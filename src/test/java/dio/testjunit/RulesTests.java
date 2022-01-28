package dio.testjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class RulesTests {
   /*Rules were used in Junit 4. In Junit 5, its used @ExtendWith and @TempDir to text. */
   
    @TempDir
    File tempDir;
    
    @Test
    public void shouldCreatedAFileInTempDir() throws IOException{
        assertTrue(tempDir.isDirectory());
        
        //usando este comando, apenas será criado um path (caminho), mas o arquivo ainda não será criado
        File newFile = new File(tempDir, "abc.txt"); 
        //agora o arquivo será criado, com o método createNewFile
        newFile.createNewFile();
        
        //com o método createTempFile, o arquivo temporário já será criado. Este método garante que
        //o arquivo será apagado após a execução.
        Path tempFile = Files.createTempFile("abc2", ".txt");
       
        //Desta forma, o arquivo temporário já pode ser criado dentro da pasta tempDir.
        File tempFile2 = File.createTempFile("abc3", ".txt");
        
        System.out.println(newFile.getAbsolutePath());
        System.out.println(tempDir.getAbsolutePath());
        System.out.println(tempFile.toFile().getAbsolutePath());
        System.out.println(tempFile2.getAbsolutePath());

        assertEquals(newFile.getParentFile().getAbsolutePath(), tempDir.getAbsolutePath());
        
        assertTrue(newFile.isFile());
        assertTrue(tempFile.toFile().isFile());
        assertTrue(tempFile2.isFile());
        assertTrue(newFile.delete(), "Should delete the file");
    }



}
