package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class x extends o {
    public final y0 c;

    /* renamed from: d  reason: collision with root package name */
    public final v1 f13426d;

    public x(y yVar, TaskCompletionSource taskCompletionSource, y0 y0Var, v1 v1Var) {
        super(yVar, taskCompletionSource);
        this.c = y0Var;
        this.f13426d = v1Var;
    }

    @Override // com.google.android.play.core.assetpacks.o, q9.t
    public final void r(int i10, Bundle bundle) {
        super.r(i10, bundle);
        this.f13341a.d(d.a(bundle, this.c, this.f13426d, new kotlinx.coroutines.y(0)));
    }
}
