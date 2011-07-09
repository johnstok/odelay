/*-----------------------------------------------------------------------------
 * Copyright (c) 2009 Just Software Ltd.
 * All rights reserved.
 *
 * Revision      $Rev$
 * Modified by   $Author$
 * Modified on   $Date$
 *
 * Changes: see subversion log.
 *-----------------------------------------------------------------------------
 */
package odelay.gof.behavioral;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import odelay.annotations.Pattern;


/**
 * The 'Interpreter' pattern.
 *
 * @author Just Software Ltd.
 */
@Pattern(
    title="Interpreter"
)
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Interpreter {
    String implementation() default "";
}