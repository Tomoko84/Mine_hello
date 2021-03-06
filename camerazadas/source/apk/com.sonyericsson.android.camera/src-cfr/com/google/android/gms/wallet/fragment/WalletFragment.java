/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.or;
import com.google.android.gms.internal.os;
import com.google.android.gms.internal.oz;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.WalletFragmentStyle;

public final class WalletFragment
extends Fragment {
    private final Fragment Sj;
    private WalletFragmentOptions atU;
    private WalletFragmentInitParams atV;
    private MaskedWalletRequest atW;
    private MaskedWallet atX;
    private Boolean atY;
    private b aud;
    private final com.google.android.gms.dynamic.b aue;
    private final c auf;
    private a aug;
    private boolean mCreated = false;

    public WalletFragment() {
        this.aue = com.google.android.gms.dynamic.b.a(this);
        this.auf = new c();
        this.aug = new a(this);
        this.Sj = this;
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletFragmentOptions) {
        WalletFragment walletFragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        walletFragment.Sj.setArguments(bundle);
        return walletFragment;
    }

    public int getState() {
        if (this.aud != null) {
            return this.aud.getState();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void initialize(WalletFragmentInitParams walletFragmentInitParams) {
        if (this.aud != null) {
            this.aud.initialize(walletFragmentInitParams);
            this.atV = null;
            return;
        } else {
            if (this.atV != null) {
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
                return;
            }
            this.atV = walletFragmentInitParams;
            if (this.atW != null) {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.atX == null) return;
            {
                Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
        }
    }

    @Override
    public void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (this.aud != null) {
            this.aud.onActivityResult(n, n2, intent);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onCreate(Bundle bundle) {
        WalletFragmentOptions walletFragmentOptions;
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams)bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.atV != null) {
                    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.atV = walletFragmentInitParams;
            }
            if (this.atW == null) {
                this.atW = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
            }
            if (this.atX == null) {
                this.atX = (MaskedWallet)bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.atU = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey("enabled")) {
                this.atY = bundle.getBoolean("enabled");
            }
        } else if (this.Sj.getArguments() != null && (walletFragmentOptions = (WalletFragmentOptions)this.Sj.getArguments().getParcelable("extraWalletFragmentOptions")) != null) {
            walletFragmentOptions.aa(this.Sj.getActivity());
            this.atU = walletFragmentOptions;
        }
        this.mCreated = true;
        this.auf.onCreate(bundle);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.auf.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mCreated = false;
    }

    @Override
    public void onInflate(Activity activity, AttributeSet object, Bundle bundle) {
        super.onInflate(activity, (AttributeSet)object, bundle);
        if (this.atU == null) {
            this.atU = WalletFragmentOptions.a(activity, (AttributeSet)object);
        }
        object = new Bundle();
        object.putParcelable("attrKeyWalletFragmentOptions", this.atU);
        this.auf.onInflate(activity, (Bundle)object, bundle);
    }

    @Override
    public void onPause() {
        super.onPause();
        this.auf.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        this.auf.onResume();
        FragmentManager fragmentManager = this.Sj.getActivity().getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null) {
            fragmentManager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.Sj.getActivity()), this.Sj.getActivity(), -1);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.auf.onSaveInstanceState(bundle);
        if (this.atV != null) {
            bundle.putParcelable("walletFragmentInitParams", this.atV);
            this.atV = null;
        }
        if (this.atW != null) {
            bundle.putParcelable("maskedWalletRequest", this.atW);
            this.atW = null;
        }
        if (this.atX != null) {
            bundle.putParcelable("maskedWallet", this.atX);
            this.atX = null;
        }
        if (this.atU != null) {
            bundle.putParcelable("walletFragmentOptions", this.atU);
            this.atU = null;
        }
        if (this.atY != null) {
            bundle.putBoolean("enabled", this.atY);
            this.atY = null;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        this.auf.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        this.auf.onStop();
    }

    public void setEnabled(boolean bl) {
        if (this.aud != null) {
            this.aud.setEnabled(bl);
            this.atY = null;
            return;
        }
        this.atY = bl;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.aug.a(onStateChangedListener);
    }

    public void updateMaskedWallet(MaskedWallet maskedWallet) {
        if (this.aud != null) {
            this.aud.updateMaskedWallet(maskedWallet);
            this.atX = null;
            return;
        }
        this.atX = maskedWallet;
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
        if (this.aud != null) {
            this.aud.updateMaskedWalletRequest(maskedWalletRequest);
            this.atW = null;
            return;
        }
        this.atW = maskedWalletRequest;
    }

    public static interface OnStateChangedListener {
        public void onStateChanged(WalletFragment var1, int var2, int var3, Bundle var4);
    }

    static class a
    extends os.a {
        private OnStateChangedListener auh;
        private final WalletFragment aui;

        a(WalletFragment walletFragment) {
            this.aui = walletFragment;
        }

        @Override
        public void a(int n, int n2, Bundle bundle) {
            if (this.auh != null) {
                this.auh.onStateChanged(this.aui, n, n2, bundle);
            }
        }

        public void a(OnStateChangedListener onStateChangedListener) {
            this.auh = onStateChangedListener;
        }
    }

    private static class b
    implements LifecycleDelegate {
        private final or aub;

        private b(or or) {
            this.aub = or;
        }

        private int getState() {
            try {
                int n = this.aub.getState();
                return n;
            }
            catch (RemoteException var2_2) {
                throw new RuntimeException(var2_2);
            }
        }

        private void initialize(WalletFragmentInitParams walletFragmentInitParams) {
            try {
                this.aub.initialize(walletFragmentInitParams);
                return;
            }
            catch (RemoteException var1_2) {
                throw new RuntimeException(var1_2);
            }
        }

        private void onActivityResult(int n, int n2, Intent intent) {
            try {
                this.aub.onActivityResult(n, n2, intent);
                return;
            }
            catch (RemoteException var3_4) {
                throw new RuntimeException(var3_4);
            }
        }

        private void setEnabled(boolean bl) {
            try {
                this.aub.setEnabled(bl);
                return;
            }
            catch (RemoteException var2_2) {
                throw new RuntimeException(var2_2);
            }
        }

        private void updateMaskedWallet(MaskedWallet maskedWallet) {
            try {
                this.aub.updateMaskedWallet(maskedWallet);
                return;
            }
            catch (RemoteException var1_2) {
                throw new RuntimeException(var1_2);
            }
        }

        private void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
            try {
                this.aub.updateMaskedWalletRequest(maskedWalletRequest);
                return;
            }
            catch (RemoteException var1_2) {
                throw new RuntimeException(var1_2);
            }
        }

        @Override
        public void onCreate(Bundle bundle) {
            try {
                this.aub.onCreate(bundle);
                return;
            }
            catch (RemoteException var1_2) {
                throw new RuntimeException(var1_2);
            }
        }

        @Override
        public View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
            try {
                object = (View)e.f(this.aub.onCreateView(e.k(object), e.k(viewGroup), bundle));
                return object;
            }
            catch (RemoteException var1_2) {
                throw new RuntimeException(var1_2);
            }
        }

        @Override
        public void onDestroy() {
        }

        @Override
        public void onDestroyView() {
        }

        @Override
        public void onInflate(Activity activity, Bundle parcelable, Bundle bundle) {
            parcelable = (WalletFragmentOptions)parcelable.getParcelable("extraWalletFragmentOptions");
            try {
                this.aub.a(e.k(activity), (WalletFragmentOptions)parcelable, bundle);
                return;
            }
            catch (RemoteException var1_2) {
                throw new RuntimeException(var1_2);
            }
        }

        @Override
        public void onLowMemory() {
        }

        @Override
        public void onPause() {
            try {
                this.aub.onPause();
                return;
            }
            catch (RemoteException var1_1) {
                throw new RuntimeException(var1_1);
            }
        }

        @Override
        public void onResume() {
            try {
                this.aub.onResume();
                return;
            }
            catch (RemoteException var1_1) {
                throw new RuntimeException(var1_1);
            }
        }

        @Override
        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.aub.onSaveInstanceState(bundle);
                return;
            }
            catch (RemoteException var1_2) {
                throw new RuntimeException(var1_2);
            }
        }

        @Override
        public void onStart() {
            try {
                this.aub.onStart();
                return;
            }
            catch (RemoteException var1_1) {
                throw new RuntimeException(var1_1);
            }
        }

        @Override
        public void onStop() {
            try {
                this.aub.onStop();
                return;
            }
            catch (RemoteException var1_1) {
                throw new RuntimeException(var1_1);
            }
        }
    }

    private class c
    extends com.google.android.gms.dynamic.a<b>
    implements View.OnClickListener {
        private c() {
        }

        @Override
        protected void a(FrameLayout frameLayout) {
            int n;
            Button button = new Button(WalletFragment.this.Sj.getActivity());
            button.setText(R.string.wallet_buy_button_place_holder);
            int n2 = -1;
            int n3 = n = -2;
            int n4 = n2;
            if (WalletFragment.this.atU != null) {
                WalletFragmentStyle walletFragmentStyle = WalletFragment.this.atU.getFragmentStyle();
                n3 = n;
                n4 = n2;
                if (walletFragmentStyle != null) {
                    DisplayMetrics displayMetrics = WalletFragment.this.Sj.getResources().getDisplayMetrics();
                    n4 = walletFragmentStyle.a("buyButtonWidth", displayMetrics, -1);
                    n3 = walletFragmentStyle.a("buyButtonHeight", displayMetrics, -2);
                }
            }
            button.setLayoutParams(new ViewGroup.LayoutParams(n4, n3));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        protected void a(f<b> f) {
            Object object = WalletFragment.this.Sj.getActivity();
            if (WalletFragment.this.aud != null || !WalletFragment.this.mCreated || object == null) return;
            try {
                object = oz.a((Activity)object, WalletFragment.this.aue, WalletFragment.this.atU, WalletFragment.this.aug);
                WalletFragment.this.aud = new b((or)object);
                WalletFragment.this.atU = null;
                f.a(WalletFragment.this.aud);
            }
            catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
                return;
            }
            if (WalletFragment.this.atV != null) {
                WalletFragment.this.aud.initialize(WalletFragment.this.atV);
                WalletFragment.this.atV = null;
            }
            if (WalletFragment.this.atW != null) {
                WalletFragment.this.aud.updateMaskedWalletRequest(WalletFragment.this.atW);
                WalletFragment.this.atW = null;
            }
            if (WalletFragment.this.atX != null) {
                WalletFragment.this.aud.updateMaskedWallet(WalletFragment.this.atX);
                WalletFragment.this.atX = null;
            }
            if (WalletFragment.this.atY == null) return;
            WalletFragment.this.aud.setEnabled(WalletFragment.this.atY);
            WalletFragment.this.atY = null;
        }

        @Override
        public void onClick(View callback) {
            callback = WalletFragment.this.Sj.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)callback), (Activity)callback, -1);
        }
    }

}

