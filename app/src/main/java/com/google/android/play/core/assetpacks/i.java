package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class i extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f13252b;
    public final /* synthetic */ Map c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13253d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c0 f13254e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f13255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(y yVar, TaskCompletionSource taskCompletionSource, List list, HashMap hashMap, TaskCompletionSource taskCompletionSource2, j2 j2Var) {
        super(taskCompletionSource);
        this.f13252b = list;
        this.c = hashMap;
        this.f13253d = taskCompletionSource2;
        this.f13254e = j2Var;
        this.f13255f = yVar;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        y yVar = this.f13255f;
        List list = this.f13252b;
        try {
            yVar.f13444d.f29126m.A(yVar.f13442a, y.n(list), y.m(this.c), new w(yVar, this.f13253d, yVar.f13443b, yVar.c, this.f13254e));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "getPackStates(%s)", list);
            this.f13253d.c(new RuntimeException(e10));
        }
    }
}
