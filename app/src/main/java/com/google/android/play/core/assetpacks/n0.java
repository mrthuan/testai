package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class n0 implements q9.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13325a;

    /* renamed from: b  reason: collision with root package name */
    public final q9.m f13326b;

    public /* synthetic */ n0(q9.l lVar, int i10) {
        this.f13325a = i10;
        this.f13326b = lVar;
    }

    @Override // q9.m
    public final Object a() {
        int i10 = this.f13325a;
        q9.m mVar = this.f13326b;
        switch (i10) {
            case 0:
                return new m0(new q9.k(androidx.activity.s.j(mVar)));
            default:
                Context b10 = ((s2) mVar).b();
                try {
                    Bundle bundle = b10.getPackageManager().getApplicationInfo(b10.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        return bundle.getString("local_testing_dir");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
        }
    }
}
