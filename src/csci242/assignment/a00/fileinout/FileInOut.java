package csci242.assignment.a00.fileinout;

import java.util.*;

/**
 * This program opens and closes files.
 * 
 * @author Zechariah Stuedemann
 * @edu.uwp.cs.242.course CSCI 242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 0
 * @bugs none
 */
public class FileInOut {
    // Creates a constant to store the default input filename.
    final String DEFAULTINFILENAME = "default_in.txt";
    // Creates a constant to store the default output filename.
    final String DEFAULTOUTFILENAME = "default_out.txt";
    // Creates a string to hold the temporary input filename.
    private String inFilename;
    // Creates a string to hold the temporary output filename.
    private String outFilename;
    // Creates an int which lets the getInFile method know when it should create a new Scanner.
    int inCount = 0;
    // Creates an int which lets the getOutFile method know when it should create a new PrintWriter.
    int outCount = 0;
    // Declares a Scanner.
    Scanner input;
    // Declares a PrintWriter.
    java.io.PrintWriter output;
    /**
     * Default Constructor
     * <p>
     * Sets the input file to the default input file and the output file to the default output file.
     * <p>
     */
    public FileInOut()
    {
        // Resets the Scanner and PrintWriter.
        inCount = 0;
        outCount = 0;
        // Sets the filenames to their defaults.
        inFilename = DEFAULTINFILENAME;
        outFilename = DEFAULTOUTFILENAME;
    }
    /**
     * Three argument constructor to instantiate a FileInOut object.
     * <p>
     * This constructor uses the provided input and output file names to set the objects internal input and 
     * output file names. The files can also be opened by passing TRUE as the pOpenFlag parameter.
     * <p>
     * @param pIn String value for the name of the input file.
     * @param pOut String value for the name of the output file.
     * @param pOpenFlag Flag that determined whether the files will be opened or not. TRUE means 
     * that the files should be opened; FALSE otherwise.
     */
    public FileInOut(String pIn, String pOut, boolean pOpenFlag)
    {
        // Resets the Scanner and PrintWriter.
        inCount = 0;
        outCount = 0;
        inFilename = pIn;
        outFilename = pOut;
        if(pOpenFlag == true)
            openFiles();
    }
    /**
     * Gets the InFilename.
     * @return Returns the InFilename.
     */
    public String getInFilename()
    {
        return inFilename;
    }
    /**
     * Gets the OutFilename.
     * @return Returns the OutFilename.
     */
    public String getOutFilename()
    {
        return outFilename;
    }
    /**
     * Sets the InFilename to a new filename.
     * @param newFilename The new InFilename
     */
    public void setInFilename(String newFilename)
    {
        // Resets the Scanner.
        inCount = 0;
        inFilename = newFilename;
    }
    /**
     * Sets the OutFilename to a new filename.
     * @param newFilename The new OutFilename
     */
    public void setOutFilename(String newFilename)
    {
        // Resets the PrintWriter.
        outCount = 0;
        outFilename = newFilename;
    }
    /**
     * Meta-method that opens both the input file and the output file.
     */
    public void openFiles()
    {
        openInFile();
        openOutFile();
    }
    /**
     * Opens the input file for input using a Scanner.
     * <p>
     * This method opens the file whose name is specified in the class level variable inFilename. The length is  
     * checked to ensure the variable has content. The file is opened via the Java Scanner class.
     * <p>
     */
    public void openInFile()
    {
        try(Scanner input = getInFile();)
        {
            java.io.File file = new java.io.File(getInFilename());
            // Checks if the file exists.
            if(file.exists())
            {
                // Loops through the file and writes what is in it.
                while (input.hasNext())
                {
                    String text = input.nextLine();
                    System.out.println(text);
                }
            }
        }    
    }
    /**
     * Opens the output file for output using a PrintWriter.
     * <p>
     * This method opens the file whose name is specified in the class level variable outFilename. The length is 
     * checked to ensure the variable has content. The file is opened via the Java PrintWriter class.
     * <p>
     */
    public void openOutFile()
    {
        try(java.io.PrintWriter output = getOutFile())
        {
            
        }
        
    }
    /**
     * Retrieves the input Scanner.
     * @return Scanner object for performing input on the opened file.
     */
    public java.util.Scanner getInFile()
    {
        // Checks to see if the scanner has already been created.
        if(inCount == 0)
        {
                input = new Scanner(inFilename);
                inCount = 1;
                return input;
            
        }
        else
        {
            return input;
        }
    }
    /**
     * Retrieves the output PrintWriter.
     * @return PrintWriter object for performing output on the opened file.
     */
    public java.io.PrintWriter getOutFile()
    {
        try
        {
            // Checks to see if the PrintWriter has already been created.
            if(outCount == 0)
            {
                output = new java.io.PrintWriter(outFilename);
                outCount = 1;
                return output;
            }
            else
            {
                return output;
            }
        }
        catch(java.io.FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Meta-method to close all the open files.
     */
    public void closeFiles()
    {
        closeInFile();
        closeOutFile();
    }
    /**
     * Closes the input file.
     */
    public void closeInFile()
    {
        Scanner input = getInFile();
        input.close();
        // Resets the Scanner.
        inCount = 0;
    }
    /**
     * Closes the output file.
     */
    public void closeOutFile()
    {
        java.io.PrintWriter output = getOutFile();
        output.close();
        // Resets the PrintWriter.
        outCount = 0;
    }
    
}
