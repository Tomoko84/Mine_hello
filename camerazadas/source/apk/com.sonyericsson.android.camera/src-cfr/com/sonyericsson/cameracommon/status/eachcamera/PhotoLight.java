/*
 * Decompiled with CFR 0_100.
 */
package com.sonyericsson.cameracommon.status.eachcamera;

import com.sonyericsson.cameracommon.status.EachCameraStatusValue;
import com.sonyericsson.cameracommon.status.EnumValue;

public class PhotoLight
extends EnumValue<Value>
implements EachCameraStatusValue {
    public static final Value DEFAULT_VALUE = Value.OFF;
    public static final String KEY = "photo_light";
    private static int REQUIRED_PROVIDER_VERSION = 1;

    public PhotoLight(Value value) {
        super(value);
    }

    @Override
    public String getKey() {
        return "photo_light";
    }

    @Override
    public int minRequiredVersion() {
        return REQUIRED_PROVIDER_VERSION;
    }

    public static enum Value {
        ON("on"),
        OFF("off");
        
        private final String mStringExpression;

        private Value(String string2) {
            this.mStringExpression = string2;
        }

        public String toString() {
            return this.mStringExpression;
        }
    }

}

