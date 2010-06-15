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
 * The 'Composite' pattern.
 *
 * @author Just Software Ltd.
 */
@Pattern(
    title="Composite"
)
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Composite {
    String implementation() default "";
}
