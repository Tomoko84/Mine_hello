/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.BleDevice;

public abstract class BleScanCallback {
    public abstract void onDeviceFound(BleDevice var1);

    public abstract void onScanStopped();
}

