package cn.edu.gdut.zaoying.Option.series.effectScatter.markLine.data.p1.lineStyle.emphasis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ShadowColorHex {
    int value() default 0;
}