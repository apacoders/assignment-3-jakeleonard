package assignment3;

/**
 *
 * REQUIREMENT 2
 * 
 * The animal class must be abstract and implements a constructor to set any
 * immutable parameters.  Immutable parameters should be set by classes that
 * extend the class - only.
 * 
 * REQUIREMENT 3
 * 
 * The animal class will contain the following immutable parameters with private scope:
 * 
 * an integer containing the number of legs
 * a String containing the speakParameter
 * 
 * REQUIREMENT 4
 * 
 * The animal class will contain the following methods that cannot be modified by
 * any class that implements an Animal
 * 
 * getLegs which returns the number of legs
 * speak() which prints to the screen the speak parameter.
 * whereAmI() which prints the current location of the animal.
 * 
 * REQUIREMENT 5
 * 
 * The animal class will contain two mutable integer values called xCoordinate and yCoordinate
 * The animal class will contain an abstract method called walkTo(int x, int y)
 *
 * 
 * 
 * @author tim
 */
public abstract class Animal {

}
