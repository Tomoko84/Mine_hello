/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SessionStopResult;

public interface ks
extends IInterface {
    public void a(SessionStopResult var1) throws RemoteException;

    /*
     * Exception performing whole class analysis ignored.
     */
    public static abstract class com.google.android.gms.internal.ks$a
    extends Binder
    implements ks {
        public com.google.android.gms.internal.ks$a();

        public static ks av(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements ks {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public void a(SessionStopResult var1) throws RemoteException;

            @Override
            public IBinder asBinder();
        }

    }

}

