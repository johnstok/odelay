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
package odelay.gof.structural;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import odelay.annotations.Pattern;


/**
 * The 'Flyweight' pattern.
 *
 * @author Just Software Ltd.
 */
@Pattern(
    title="Flyweight"
)
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Flyweight {
    String implementation() default "";
}
