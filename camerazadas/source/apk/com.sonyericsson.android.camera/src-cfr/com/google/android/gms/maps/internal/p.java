/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.q;

public interface p
extends IInterface {
    public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera var1) throws RemoteException;

    public static abstract class com.google.android.gms.maps.internal.p$a
    extends Binder
    implements p {
        public com.google.android.gms.maps.internal.p$a() {
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        }

        public static p bg(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            if (iInterface != null && iInterface instanceof p) {
                return (p)iInterface;
            }
            return new a(iBinder);
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public boolean onTransact(int n, Parcel object, Parcel parcel, int n2) throws RemoteException {
            switch (n) {
                default: {
                    return super.onTransact(n, (Parcel)object, parcel, n2);
                }
                case 1598968902: {
                    parcel.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    return true;
                }
                case 1: 
            }
            object.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            object = object.readInt() != 0 ? StreetViewPanoramaCamera.CREATOR.cQ((Parcel)object) : null;
            this.onStreetViewPanoramaCameraChange((StreetViewPanoramaCamera)object);
            parcel.writeNoException();
            return true;
        }

        private static class a
        implements p {
            private IBinder lb;

            a(IBinder iBinder) {
                this.lb = iBinder;
            }

            @Override
            public IBinder asBinder() {
                return this.lb;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             */
            @Override
            public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    if (streetViewPanoramaCamera != null) {
                        parcel.writeInt(1);
                        streetViewPanoramaCamera.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    this.lb.transact(1, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }
        }

    }

}

