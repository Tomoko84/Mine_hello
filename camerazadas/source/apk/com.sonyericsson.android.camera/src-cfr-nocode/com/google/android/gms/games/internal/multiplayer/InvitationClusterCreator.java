/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;

/*
 * Exception performing whole class analysis ignored.
 */
public class InvitationClusterCreator
implements Parcelable.Creator<ZInvitationCluster> {
    public InvitationClusterCreator();

    static void a(ZInvitationCluster var0, Parcel var1, int var2);

    public ZInvitationCluster ci(Parcel var1);

    @Override
    public /* synthetic */ Object createFromParcel(Parcel var1);

    public ZInvitationCluster[] dN(int var1);

    @Override
    public /* synthetic */ Object[] newArray(int var1);
}

