package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class m extends q9.z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13299b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f13300d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13301e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13302f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y f13303g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y yVar, TaskCompletionSource taskCompletionSource, int i10, String str, String str2, int i11, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f13299b = i10;
        this.c = str;
        this.f13300d = str2;
        this.f13301e = i11;
        this.f13302f = taskCompletionSource2;
        this.f13303g = yVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.IInterface, q9.r] */
    @Override // q9.z
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f13302f;
        int i10 = this.f13299b;
        int i11 = this.f13301e;
        String str = this.f13300d;
        String str2 = this.c;
        y yVar = this.f13303g;
        try {
            ?? r62 = yVar.f13444d.f29126m;
            String str3 = yVar.f13442a;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str);
            bundle.putInt("chunk_number", i11);
            r62.n(str3, bundle, y.j(), new q(yVar, taskCompletionSource));
        } catch (RemoteException e10) {
            y.f13440g.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", str2, str, Integer.valueOf(i11), Integer.valueOf(i10));
            taskCompletionSource.c(new RuntimeException(e10));
        }
    }
}
