package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class n extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13324b;
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y yVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13324b = taskCompletionSource2;
        this.c = yVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        y yVar = this.c;
        try {
            yVar.f13445e.f29126m.W(yVar.f13442a, y.j(), new s(yVar, this.f13324b));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "keepAlive", new Object[0]);
        }
    }
}
