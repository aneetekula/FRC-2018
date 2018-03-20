package org.usfirst.frc.team1923.robot.autonomous;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Autonomous {

    String name();

    String description() default "Autonomous Command";

    Side[] startingPosition();

    FieldConfiguration[] fieldConfigurations() default { FieldConfiguration.LLL, FieldConfiguration.RRR, FieldConfiguration.LRL, FieldConfiguration.RLR };

    int defaultPriority() default 0;

    public enum Side {
        NONE,
        LEFT,
        LEFT_STRAIGHT,
        CENTER,
        RIGHT,
        RIGHT_STRAIGHT
    }

    public enum FieldConfiguration {
        LLL,
        RRR,
        LRL,
        RLR
    }

}
