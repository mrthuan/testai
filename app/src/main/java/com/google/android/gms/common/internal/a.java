package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class a extends zag {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f11238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f11239b;
    public final /* synthetic */ int c = 2;

    public a(Activity activity, Intent intent) {
        this.f11238a = intent;
        this.f11239b = activity;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.f11238a;
        if (intent != null) {
            this.f11239b.startActivityForResult(intent, this.c);
        }
    }
}
