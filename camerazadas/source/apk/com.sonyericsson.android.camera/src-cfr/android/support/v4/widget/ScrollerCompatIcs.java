/*
 * Decompiled with CFR 0_100.
 */
package android.support.v4.widget;

import android.widget.OverScroller;

class ScrollerCompatIcs {
    ScrollerCompatIcs() {
    }

    public static float getCurrVelocity(Object object) {
        return ((OverScroller)object).getCurrVelocity();
    }
}

