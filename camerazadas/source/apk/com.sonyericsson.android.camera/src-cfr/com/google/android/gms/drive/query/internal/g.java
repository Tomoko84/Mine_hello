/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.internal.HasFilter;

public class g
implements Parcelable.Creator<HasFilter> {
    static void a(HasFilter hasFilter, Parcel parcel, int n) {
        int n2 = b.D(parcel);
        b.c(parcel, 1000, hasFilter.BR);
        b.a(parcel, 1, hasFilter.QL, n, false);
        b.H(parcel, n2);
    }

    public HasFilter aO(Parcel parcel) {
        int n = a.C(parcel);
        int n2 = 0;
        MetadataBundle metadataBundle = null;
        block4 : while (parcel.dataPosition() < n) {
            int n3 = a.B(parcel);
            switch (a.aD(n3)) {
                default: {
                    a.b(parcel, n3);
                    continue block4;
                }
                case 1000: {
                    n2 = a.g(parcel, n3);
                    continue block4;
                }
                case 1: 
            }
            metadataBundle = a.a(parcel, n3, MetadataBundle.CREATOR);
        }
        if (parcel.dataPosition() != n) {
            throw new a.a("Overread allowed size end=" + n, parcel);
        }
        return new HasFilter(n2, metadataBundle);
    }

    public HasFilter[] ca(int n) {
        return new HasFilter[n];
    }

    @Override
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.aO(parcel);
    }

    @Override
    public /* synthetic */ Object[] newArray(int n) {
        return this.ca(n);
    }
}

