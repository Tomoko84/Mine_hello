/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class PlayerBuffer
extends DataBuffer<Player> {
    public PlayerBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override
    public Player get(int n) {
        return new PlayerRef(this.II, n);
    }
}

