/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestType {
    private RequestType() {
    }

    public static String dH(int n) {
        switch (n) {
            default: {
                GamesLog.q("RequestType", "Unknown request type: " + n);
                return "UNKNOWN_TYPE";
            }
            case 1: {
                return "GIFT";
            }
            case 2: 
        }
        return "WISH";
    }
}

