package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class g extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f13233b;
    public final /* synthetic */ TaskCompletionSource c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f13234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(y yVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13233b = list;
        this.c = taskCompletionSource2;
        this.f13234d = yVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        y yVar = this.f13234d;
        List list = this.f13233b;
        try {
            yVar.f13444d.f29126m.J(yVar.f13442a, y.n(list), y.j(), new p(yVar, this.c));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "cancelDownloads(%s)", list);
        }
    }
}
