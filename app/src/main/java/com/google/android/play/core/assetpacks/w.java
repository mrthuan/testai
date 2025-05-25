package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class w extends o {
    public final y0 c;

    /* renamed from: d  reason: collision with root package name */
    public final v1 f13414d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f13415e;

    public w(y yVar, TaskCompletionSource taskCompletionSource, y0 y0Var, v1 v1Var, c0 c0Var) {
        super(yVar, taskCompletionSource);
        this.c = y0Var;
        this.f13414d = v1Var;
        this.f13415e = c0Var;
    }

    @Override // com.google.android.play.core.assetpacks.o, q9.t
    public final void j0(Bundle bundle, Bundle bundle2) {
        super.j0(bundle, bundle2);
        this.f13341a.d(d.a(bundle, this.c, this.f13414d, this.f13415e));
    }
}
