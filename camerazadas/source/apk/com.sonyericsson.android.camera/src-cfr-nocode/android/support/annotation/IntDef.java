/*
 * Decompiled with CFR 0_100.
 */
package android.support.annotation;

@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.ANNOTATION_TYPE})
public @interface IntDef {
    public boolean flag() default 0;

    public long[] value() default {};
}

