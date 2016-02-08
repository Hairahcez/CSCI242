/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci242.assignment.a00.fileinout;

import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zstue_000
 */
public class FileInOutTest {
    
    public FileInOutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        
    }

    /**
     * Test of getInFilename method, of class FileInOut.
     */
    @Test
    public void testGetSetInFilename() {
        System.out.println("--| Test getInFilename() and set InFilename() |--");
        FileInOut instance = new FileInOut();
        String myInFilename = "myfile.txt";
        instance.setInFilename(myInFilename);
        String result = instance.getInFilename();
        assertEquals(myInFilename, result);
        
    }

    /**
     * Test of getOutFilename method, of class FileInOut.
     */
    @Test
    public void testGetSetOutFilename() {
        System.out.println("--| Test getOutFilename() and set OutFilename() |--");
        FileInOut instance = new FileInOut();
        String myOutFilename = "myfile.txt";
        instance.setOutFilename(myOutFilename);
        String result = instance.getOutFilename();
        assertEquals(myOutFilename, result);
        
    }
    /**
     * Test of openFiles method, of class FileInOut.
     */
    @Test
    public void testOpenFiles() {
        System.out.println("openFiles");
        FileInOut instance = new FileInOut();
        instance.openFiles();
        
    }

    /**
     * Test of openInFile method, of class FileInOut.
     */
    @Test
    public void testOpenInFile() {
        System.out.println("openInFile");
        FileInOut instance = new FileInOut();
        instance.openInFile();
        
    }

    /**
     * Test of openOutFile method, of class FileInOut.
     */
    @Test
    public void testOpenOutFile() {
        System.out.println("openOutFile");
        FileInOut instance = new FileInOut();
        instance.openOutFile();
        
    }

    /**
     * Test of getInFile method, of class FileInOut.
     */
    @Test
    public void testGetInFile() {
        System.out.println("getInFile");
        FileInOut instance = new FileInOut();
        Scanner expResult = instance.getInFile();
        Scanner result = instance.getInFile();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getOutFile method, of class FileInOut.
     */
    @Test
    public void testGetOutFile() {
        System.out.println("getOutFile");
        FileInOut instance = new FileInOut();
        PrintWriter expResult = instance.getOutFile();
        PrintWriter result = instance.getOutFile();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of closeFiles method, of class FileInOut.
     */
    @Test
    public void testCloseFiles() {
        System.out.println("closeFiles");
        FileInOut instance = new FileInOut();
        instance.closeFiles();
        
    }

    /**
     * Test of closeInFile method, of class FileInOut.
     */
    @Test
    public void testCloseInFile() {
        System.out.println("closeInFile");
        FileInOut instance = new FileInOut();
        instance.closeInFile();
        
    }

    /**
     * Test of closeOutFile method, of class FileInOut.
     */
    @Test
    public void testCloseOutFile() {
        System.out.println("closeOutFile");
        FileInOut instance = new FileInOut();
        instance.closeOutFile();
        
    }

    
    
}
