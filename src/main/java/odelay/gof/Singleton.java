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
package odelay.gof;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import odelay.annotations.AntiPattern;
import odelay.annotations.Pattern;


/**
 * The 'Singleton' pattern.
 *
 * @author Just Software Ltd.
 */
@Pattern(
    title="Singleton",
    references={
        "http://en.wikipedia.org/wiki/Singleton_pattern"
    }
)
@AntiPattern(
    justifications={
        "Make dependant code hard to test.",
        "Hard to implement."
    },
    references={
        "http://tech.puredanger.com/2007/07/03/pattern-hate-singleton/",
        "http://steve.yegge.googlepages.com/singleton-considered-stupid"
    }
)
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Singleton {
    String implementation() default "";
}
