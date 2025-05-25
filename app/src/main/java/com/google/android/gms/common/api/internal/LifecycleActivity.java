package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleActivity {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f10954a;

    public LifecycleActivity(Activity activity) {
        if (activity != null) {
            this.f10954a = activity;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }
}
