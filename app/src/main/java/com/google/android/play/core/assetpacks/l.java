package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class l extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13288b;
    public final /* synthetic */ TaskCompletionSource c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f13289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y yVar, TaskCompletionSource taskCompletionSource, int i10, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13288b = i10;
        this.c = taskCompletionSource2;
        this.f13289d = yVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        y yVar = this.f13289d;
        try {
            ?? r12 = yVar.f13444d.f29126m;
            String str = yVar.f13442a;
            int i10 = this.f13288b;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            r12.A0(str, bundle, y.j(), new v(yVar, this.c));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
