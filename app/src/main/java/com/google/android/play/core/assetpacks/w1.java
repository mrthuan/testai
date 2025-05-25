package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class w1 {
    public static final q9.y c = new q9.y("PackageStateCache");

    /* renamed from: a  reason: collision with root package name */
    public final Context f13424a;

    /* renamed from: b  reason: collision with root package name */
    public int f13425b = -1;

    public w1(Context context) {
        this.f13424a = context;
    }

    public final synchronized int a() {
        if (this.f13425b == -1) {
            try {
                this.f13425b = this.f13424a.getPackageManager().getPackageInfo(this.f13424a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f13425b;
    }
}
