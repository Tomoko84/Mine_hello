/*
 * Decompiled with CFR 0_100.
 */
package com.sonyericsson.android.camera.view.settings.executor;

import com.sonyericsson.android.camera.ExtendedActivity;
import com.sonyericsson.android.camera.configuration.parameters.ParameterValue;
import com.sonyericsson.cameracommon.setting.executor.SettingChangeExecutor;
import com.sonyericsson.cameracommon.setting.executor.SettingChangerInterface;
import com.sonyericsson.cameracommon.setting.settingitem.TypedSettingItem;

/*
 * Exception performing whole class analysis.
 */
class FaceIdentifyOnExecutor
extends SettingChangeExecutor<ParameterValue> {
    private ExtendedActivity mActivity;

    public FaceIdentifyOnExecutor(ExtendedActivity var1, SettingChangerInterface<ParameterValue> var2);

    @Override
    public void onExecute(TypedSettingItem<ParameterValue> var1);
}

