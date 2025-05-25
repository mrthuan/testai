package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class h extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f13244b;
    public final /* synthetic */ TaskCompletionSource c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f13245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y yVar, TaskCompletionSource taskCompletionSource, HashMap hashMap, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13244b = hashMap;
        this.c = taskCompletionSource2;
        this.f13245d = yVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.c;
        y yVar = this.f13245d;
        try {
            yVar.f13444d.f29126m.x0(yVar.f13442a, y.m(this.f13244b), new r(yVar, taskCompletionSource));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "syncPacks", new Object[0]);
            taskCompletionSource.c(new RuntimeException(e10));
        }
    }
}
