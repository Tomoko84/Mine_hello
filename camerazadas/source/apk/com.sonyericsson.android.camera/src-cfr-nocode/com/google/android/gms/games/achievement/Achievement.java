/*
 * Decompiled with CFR 0_100.
 */
package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

public interface Achievement
extends Parcelable,
Freezable<Achievement> {
    public static final int STATE_HIDDEN = 2;
    public static final int STATE_REVEALED = 1;
    public static final int STATE_UNLOCKED = 0;
    public static final int TYPE_INCREMENTAL = 1;
    public static final int TYPE_STANDARD = 0;

    public String getAchievementId();

    public int getCurrentSteps();

    public String getDescription();

    public void getDescription(CharArrayBuffer var1);

    public String getFormattedCurrentSteps();

    public void getFormattedCurrentSteps(CharArrayBuffer var1);

    public String getFormattedTotalSteps();

    public void getFormattedTotalSteps(CharArrayBuffer var1);

    public long getLastUpdatedTimestamp();

    public String getName();

    public void getName(CharArrayBuffer var1);

    public Player getPlayer();

    public Uri getRevealedImageUri();

    @Deprecated
    public String getRevealedImageUrl();

    public int getState();

    public int getTotalSteps();

    public int getType();

    public Uri getUnlockedImageUri();

    @Deprecated
    public String getUnlockedImageUrl();

    public long getXpValue();
}

