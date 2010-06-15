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
package odelay.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Meta annotation used to describe a pattern annotation.
 *
 * @author Just Software Ltd.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface Pattern {
    String title();
    String[] forces() default {};
    String intent() default "";
    String[] references() default {};
    /*
     * Other fields? :
     * participants
     * examples / known uses
     * related patterns
     * synonyms
     * discussion
     *
     * See also:
     * http://www.martinfowler.com/articles/writingPatterns.html
     * http://hillside.net/patterns/definition.html
     */

}
