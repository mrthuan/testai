package com.google.android.gms.common.internal;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ResourceUtils {
    static {
        new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();
    }

    private ResourceUtils() {
    }
}
