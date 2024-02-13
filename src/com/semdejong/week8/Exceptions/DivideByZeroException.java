package com.semdejong.week8.Exceptions;

public class DivideByZeroException extends Exception{
    private static final long serialVersionUID = 2256477558314496007L;

    /**
     * Constructs an {@code ArithmeticException} with no detail
     * message.
     */
    public DivideByZeroException() {
        super();
    }

    /**
     * Constructs an {@code ArithmeticException} with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public DivideByZeroException(String s) {
        super(s);
    }
}
