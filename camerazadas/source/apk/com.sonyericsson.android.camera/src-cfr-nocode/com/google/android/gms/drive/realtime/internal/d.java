/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;

public interface d
extends IInterface {
    public void a(ParcelableCollaborator var1) throws RemoteException;

    public void b(ParcelableCollaborator var1) throws RemoteException;

    public static abstract class com.google.android.gms.drive.realtime.internal.d$a
    extends Binder
    implements d {
        public static d Z(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements d {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public void a(ParcelableCollaborator var1) throws RemoteException;

            @Override
            public IBinder asBinder();

            @Override
            public void b(ParcelableCollaborator var1) throws RemoteException;
        }

    }

}

