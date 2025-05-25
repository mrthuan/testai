package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class e extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13218b;
    public final /* synthetic */ TaskCompletionSource c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f13219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y yVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13218b = str;
        this.c = taskCompletionSource2;
        this.f13219d = yVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        String str = this.f13218b;
        y yVar = this.f13219d;
        try {
            ?? r32 = yVar.f13444d.f29126m;
            String str2 = yVar.f13442a;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putString("module_name", str);
            r32.h0(str2, bundle, y.j(), new p(yVar, this.c));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "removePack(%s)", str);
        }
    }
}
