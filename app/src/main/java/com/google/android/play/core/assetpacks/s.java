package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class s extends o {
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, TaskCompletionSource taskCompletionSource) {
        super(yVar, taskCompletionSource);
        this.c = yVar;
    }

    @Override // com.google.android.play.core.assetpacks.o, q9.t
    public final void g0(Bundle bundle) {
        q9.i0 i0Var = this.c.f13445e;
        TaskCompletionSource taskCompletionSource = this.f13341a;
        i0Var.d(taskCompletionSource);
        int i10 = bundle.getInt("error_code");
        y.f13440g.b("onError(%d)", Integer.valueOf(i10));
        taskCompletionSource.c(new AssetPackException(i10));
    }

    @Override // com.google.android.play.core.assetpacks.o, q9.t
    public final void m(Bundle bundle, Bundle bundle2) {
        super.m(bundle, bundle2);
        y yVar = this.c;
        if (!yVar.f13446f.compareAndSet(true, false)) {
            y.f13440g.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            yVar.f();
        }
    }
}
