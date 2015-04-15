/* ==========================================
 * jORLib : a free Java OR library
 * ==========================================
 *
 * Project Info:  https://github.com/jkinable/jorlib
 * Project Creator:  Joris Kinable (https://github.com/jkinable)
 *
 * (C) Copyright 2015, by Joris Kinable and Contributors.
 *
 * This program and the accompanying materials are licensed under GPLv3
 *
 */
/* -----------------
 * PricingProblemSolverFactory.java
 * -----------------
 * (C) Copyright 2015, by Joris Kinable and Contributors.
 *
 * Original Author:  Joris Kinable
 * Contributor(s):   -
 *
 * $Id$
 *
 * Changes
 * -------
 *
 */
package org.jorlib.frameworks.columnGeneration.pricing;

import org.jorlib.frameworks.columnGeneration.colgenMain.AbstractColumn;

/**
 * 
 * 
 * @author Joris Kinable
 * @version 13-4-2015
 *
 * @param <T>
 * @param <U>
 * @param <V>
 */
public interface PricingProblemSolverFactory<T,U extends AbstractColumn<T,U,V>, V extends AbstractPricingProblem<T,U,V>> {
	public PricingProblemSolver<T, U, V> createSolverInstance(V pricingProblem);
}
