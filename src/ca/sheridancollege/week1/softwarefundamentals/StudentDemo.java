/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A model class to model Student Objects
 * @author dancye, 2019
 */
public class StudentDemo 
{
  private String studentID;
  private String name;
  private String program;
  
  /**
   * A constructor to pass in the given ID and then name
   * @param studentID - the ID to assign
   * @param name- the name to assign 
   * @param program - the program to assign 
   */
  public StudentDemo(String studentID, String name, String program)
  {
      this.studentID = studentID;
      this.name = name;
      this.program = program;
  }
  
  /**
   * A method to set the student ID
   * @param givenID the ID to set
   */
  public void setStudentID(String studentID)
  {
      this.studentID=studentID;
  }
  /**
   * An accessor method for studentID
   * @return the student's ID 
   */
  public String getStudentID()
  {
      return studentID;
  }

    /**
     * A method to return the student's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the student's name
     * @param givenName the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    
}
