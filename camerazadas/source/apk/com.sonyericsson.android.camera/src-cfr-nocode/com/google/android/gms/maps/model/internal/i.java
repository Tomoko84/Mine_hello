/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

public interface i
extends IInterface {
    public Tile getTile(int var1, int var2, int var3) throws RemoteException;

    /*
     * Exception performing whole class analysis ignored.
     */
    public static abstract class com.google.android.gms.maps.model.internal.i$a
    extends Binder
    implements i {
        public com.google.android.gms.maps.model.internal.i$a();

        public static i by(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements i {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public IBinder asBinder();

            @Override
            public Tile getTile(int var1, int var2, int var3) throws RemoteException;
        }

    }

}

