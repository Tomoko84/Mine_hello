/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;

public class at
implements Parcelable.Creator<OnSyncMoreResponse> {
    static void a(OnSyncMoreResponse onSyncMoreResponse, Parcel parcel, int n) {
        n = b.D(parcel);
        b.c(parcel, 1, onSyncMoreResponse.BR);
        b.a(parcel, 2, onSyncMoreResponse.Oz);
        b.H(parcel, n);
    }

    public OnSyncMoreResponse av(Parcel parcel) {
        boolean bl = false;
        int n = a.C(parcel);
        int n2 = 0;
        block4 : while (parcel.dataPosition() < n) {
            int n3 = a.B(parcel);
            switch (a.aD(n3)) {
                default: {
                    a.b(parcel, n3);
                    continue block4;
                }
                case 1: {
                    n2 = a.g(parcel, n3);
                    continue block4;
                }
                case 2: 
            }
            bl = a.c(parcel, n3);
        }
        if (parcel.dataPosition() != n) {
            throw new a.a("Overread allowed size end=" + n, parcel);
        }
        return new OnSyncMoreResponse(n2, bl);
    }

    public OnSyncMoreResponse[] bH(int n) {
        return new OnSyncMoreResponse[n];
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.av(parcel);
    }

    @Override
    public /* synthetic */ Object[] newArray(int n) {
        return this.bH(n);
    }
}

