/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class OnLoadRealtimeResponse
implements SafeParcelable {
    public static final Parcelable.Creator<OnLoadRealtimeResponse> CREATOR;
    final int BR;
    final boolean vR;

    static;

    OnLoadRealtimeResponse(int var1, boolean var2);

    @Override
    public int describeContents();

    @Override
    public void writeToParcel(Parcel var1, int var2);
}

