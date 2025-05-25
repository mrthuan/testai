package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class b extends zag {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f11240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleFragment f11241b;

    public b(Intent intent, LifecycleFragment lifecycleFragment) {
        this.f11240a = intent;
        this.f11241b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void a() {
        Intent intent = this.f11240a;
        if (intent != null) {
            this.f11241b.startActivityForResult(intent, 2);
        }
    }
}
