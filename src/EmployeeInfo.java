/*
  File: Item.java
  By:   Brandon Davis
  Date: 12/5/2018
  Description: Class that represents an employee. Information is gathered
               by user input.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  //fields
  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern patternTest;
  private Scanner in;

  /**
   * Constructor for the class Employee Info. Constructor instantiates the scanner class
   * to get user employee info to set the name and deptId. It also checks the pattern
   * for deptId.
   */
  public EmployeeInfo() {
    this.in = new Scanner(System.in, "UTF-8");
    this.patternTest = patternTest.compile("[A-Z][a-z]{3}[0-9]{2}");
    setName();
    setDeptId();
    this.in.close();
  }

  //class methods
  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { // valid, contains space)
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else { //no space
      code = "guest";
    }
  }

  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    String name = in.nextLine();
    return name;
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Function to get user input for deptId (Department Identification).
   */
  public String getDeptId() {
    System.out.println("Please enter the department ID: ");
    String deptId = in.nextLine();
    return deptId;
  }

  private void setDeptId() {
    String checkId = getDeptId();
    if (validId(checkId)) {
      this.deptId = checkId;
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    return Pattern.matches(patternTest.pattern(), id);
  }

  /**
   * Function that will reverse the order of the text stored for the department id.
   * This is done by recursively using a method named reverseString().
   */
  public String reverseString(String id) {
    if (id.length() <= 1) {
      return id;
    } else {
      return reverseString(id.substring(1)) + id.charAt(0);
    }
  }


  @Override
  public String toString() {
    return "Employee Code : " + getCode() + "\n"
           + "Department Number : " + getId();
  }


}

