/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

public interface q
extends IInterface {
    public void onStreetViewPanoramaChange(StreetViewPanoramaLocation var1) throws RemoteException;

    /*
     * Exception performing whole class analysis ignored.
     */
    public static abstract class com.google.android.gms.maps.internal.q$a
    extends Binder
    implements q {
        public com.google.android.gms.maps.internal.q$a();

        public static q bh(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements q {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public IBinder asBinder();

            @Override
            public void onStreetViewPanoramaChange(StreetViewPanoramaLocation var1) throws RemoteException;
        }

    }

}

