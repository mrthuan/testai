package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class Wrappers {

    /* renamed from: b  reason: collision with root package name */
    public static final Wrappers f11392b = new Wrappers();

    /* renamed from: a  reason: collision with root package name */
    public PackageManagerWrapper f11393a = null;

    @KeepForSdk
    public static PackageManagerWrapper a(Context context) {
        PackageManagerWrapper packageManagerWrapper;
        Wrappers wrappers = f11392b;
        synchronized (wrappers) {
            if (wrappers.f11393a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                wrappers.f11393a = new PackageManagerWrapper(context);
            }
            packageManagerWrapper = wrappers.f11393a;
        }
        return packageManagerWrapper;
    }
}
