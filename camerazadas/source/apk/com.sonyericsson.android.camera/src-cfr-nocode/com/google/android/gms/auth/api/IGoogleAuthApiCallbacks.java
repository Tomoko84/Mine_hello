/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.auth.api;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.GoogleAuthApiResponse;

public interface IGoogleAuthApiCallbacks
extends IInterface {
    public void onConnectionSuccess(GoogleAuthApiResponse var1) throws RemoteException;

    public void onError(int var1, String var2, PendingIntent var3) throws RemoteException;

    /*
     * Exception performing whole class analysis ignored.
     */
    public static abstract class Stub
    extends Binder
    implements IGoogleAuthApiCallbacks {
        public Stub();

        public static IGoogleAuthApiCallbacks asInterface(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements IGoogleAuthApiCallbacks {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public IBinder asBinder();

            @Override
            public void onConnectionSuccess(GoogleAuthApiResponse var1) throws RemoteException;

            @Override
            public void onError(int var1, String var2, PendingIntent var3) throws RemoteException;
        }

    }

}

