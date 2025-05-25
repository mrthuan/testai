package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class f extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f13227b;
    public final /* synthetic */ Map c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13228d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y f13229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y yVar, TaskCompletionSource taskCompletionSource, ArrayList arrayList, HashMap hashMap, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13227b = arrayList;
        this.c = hashMap;
        this.f13228d = taskCompletionSource2;
        this.f13229e = yVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f13228d;
        y yVar = this.f13229e;
        List list = this.f13227b;
        try {
            yVar.f13444d.f29126m.H(yVar.f13442a, y.n(list), y.m(this.c), new x(yVar, taskCompletionSource, yVar.f13443b, yVar.c));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "startDownload(%s)", list);
            taskCompletionSource.c(new RuntimeException(e10));
        }
    }
}
