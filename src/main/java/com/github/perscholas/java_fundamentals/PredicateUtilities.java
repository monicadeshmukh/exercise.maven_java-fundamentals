package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
/**Method functionalities added
 * Monica Deshmukh
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        return (x>y);
        //return null;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        return (x<y);
        //return null;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        return (x>=y);
        //return null;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        return (x<=y);
        //return null;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        return true;
        //return null;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        return false;
        //return null;
    }

}