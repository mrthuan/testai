package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class j extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13267b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f13268d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13269e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13270f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y f13271g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(y yVar, TaskCompletionSource taskCompletionSource, int i10, String str, String str2, int i11, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13267b = i10;
        this.c = str;
        this.f13268d = str2;
        this.f13269e = i11;
        this.f13270f = taskCompletionSource2;
        this.f13271g = yVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        y yVar = this.f13271g;
        try {
            ?? r12 = yVar.f13444d.f29126m;
            String str = yVar.f13442a;
            int i10 = this.f13267b;
            String str2 = this.c;
            String str3 = this.f13268d;
            int i11 = this.f13269e;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str3);
            bundle.putInt("chunk_number", i11);
            r12.B(str, bundle, y.j(), new t(yVar, this.f13270f));
        } catch (RemoteException e10) {
            y.f13440g.c(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
