/**
 * 
 */
package com.synectiks.commons.exceptions;

/**
 * @author Rajesh
 */
public class SynectiksException extends Throwable {

	private static final long serialVersionUID = -1611380723898356175L;

	/**
	 * @param message
	 */
	public SynectiksException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public SynectiksException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SynectiksException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public SynectiksException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
