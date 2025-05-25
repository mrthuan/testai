package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class k extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13277b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13278d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13279e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f13280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y yVar, TaskCompletionSource taskCompletionSource, int i10, String str, TaskCompletionSource taskCompletionSource2, int i11) {
        super(taskCompletionSource);
        this.f13277b = i10;
        this.c = str;
        this.f13278d = taskCompletionSource2;
        this.f13279e = i11;
        this.f13280f = yVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        try {
            y yVar = this.f13280f;
            ?? r12 = yVar.f13444d.f29126m;
            String str = yVar.f13442a;
            int i10 = this.f13277b;
            String str2 = this.c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            bundle.putString("module_name", str2);
            r12.f(str, bundle, y.j(), new u(this.f13280f, this.f13278d, this.f13277b, this.c, this.f13279e));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
