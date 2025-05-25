package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class u extends o {
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13390d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13391e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f13392f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, TaskCompletionSource taskCompletionSource, int i10, String str, int i11) {
        super(yVar, taskCompletionSource);
        this.f13392f = yVar;
        this.c = i10;
        this.f13390d = str;
        this.f13391e = i11;
    }

    @Override // com.google.android.play.core.assetpacks.o, q9.t
    public final void g0(Bundle bundle) {
        y yVar = this.f13392f;
        yVar.f13444d.d(this.f13341a);
        y.f13440g.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i10 = this.f13391e;
        if (i10 > 0) {
            yVar.l(this.c, i10 - 1, this.f13390d);
        }
    }
}
