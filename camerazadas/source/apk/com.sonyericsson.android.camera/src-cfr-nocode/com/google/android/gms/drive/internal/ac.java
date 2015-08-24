/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnContentsResponse;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.internal.OnDrivePreferencesResponse;
import com.google.android.gms.drive.internal.OnListEntriesResponse;
import com.google.android.gms.drive.internal.OnListParentsResponse;
import com.google.android.gms.drive.internal.OnLoadRealtimeResponse;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.internal.OnResourceIdSetResponse;
import com.google.android.gms.drive.internal.OnStorageStatsResponse;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;
import com.google.android.gms.drive.realtime.internal.m;

public interface ac
extends IInterface {
    public void a(OnContentsResponse var1) throws RemoteException;

    public void a(OnDownloadProgressResponse var1) throws RemoteException;

    public void a(OnDriveIdResponse var1) throws RemoteException;

    public void a(OnDrivePreferencesResponse var1) throws RemoteException;

    public void a(OnListEntriesResponse var1) throws RemoteException;

    public void a(OnListParentsResponse var1) throws RemoteException;

    public void a(OnLoadRealtimeResponse var1, m var2) throws RemoteException;

    public void a(OnMetadataResponse var1) throws RemoteException;

    public void a(OnResourceIdSetResponse var1) throws RemoteException;

    public void a(OnStorageStatsResponse var1) throws RemoteException;

    public void a(OnSyncMoreResponse var1) throws RemoteException;

    public void o(Status var1) throws RemoteException;

    public void onSuccess() throws RemoteException;

    /*
     * Exception performing whole class analysis ignored.
     */
    public static abstract class com.google.android.gms.drive.internal.ac$a
    extends Binder
    implements ac {
        public com.google.android.gms.drive.internal.ac$a();

        public static ac V(IBinder var0);

        @Override
        public IBinder asBinder();

        @Override
        public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) throws RemoteException;

        /*
         * Exception performing whole class analysis.
         * Exception performing whole class analysis ignored.
         */
        private static class a
        implements ac {
            private IBinder lb;

            a(IBinder var1);

            @Override
            public void a(OnContentsResponse var1) throws RemoteException;

            @Override
            public void a(OnDownloadProgressResponse var1) throws RemoteException;

            @Override
            public void a(OnDriveIdResponse var1) throws RemoteException;

            @Override
            public void a(OnDrivePreferencesResponse var1) throws RemoteException;

            @Override
            public void a(OnListEntriesResponse var1) throws RemoteException;

            @Override
            public void a(OnListParentsResponse var1) throws RemoteException;

            @Override
            public void a(OnLoadRealtimeResponse var1, m var2) throws RemoteException;

            @Override
            public void a(OnMetadataResponse var1) throws RemoteException;

            @Override
            public void a(OnResourceIdSetResponse var1) throws RemoteException;

            @Override
            public void a(OnStorageStatsResponse var1) throws RemoteException;

            @Override
            public void a(OnSyncMoreResponse var1) throws RemoteException;

            @Override
            public IBinder asBinder();

            @Override
            public void o(Status var1) throws RemoteException;

            @Override
            public void onSuccess() throws RemoteException;
        }

    }

}
