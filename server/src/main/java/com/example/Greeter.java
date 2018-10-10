/**
 *this is a package name
 */

package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
 /**
  * @param name of the person
  * @return value
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
