/*-----------------------------------------------------------------------------
 * Copyright © 2011 Keith Webster Johnston.
 * All rights reserved.
 *
 * This file is part of Odelay.
 *
 * Odelay is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * Odelay is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Odelay.  If not, see <http://www.gnu.org/licenses/>.
 *---------------------------------------------------------------------------*/
package patterns.gof;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.johnstok.odelay.AntiPattern;
import com.johnstok.odelay.Pattern;


/**
 * The 'Singleton' pattern.
 *
 * @author Keith Webster Johnston.
 */
@Pattern(
    title="Singleton",
    references={
        "http://en.wikipedia.org/wiki/Singleton_pattern"
    }
)
@AntiPattern(
    justifications={
        "Makes dependent code hard to test.",
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
}
