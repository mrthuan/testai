package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public class o extends q9.s {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f13341a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f13342b;

    public o(y yVar, TaskCompletionSource taskCompletionSource) {
        this.f13342b = yVar;
        this.f13341a = taskCompletionSource;
    }

    @Override // q9.t
    public void N(ArrayList arrayList) {
        this.f13342b.f13444d.d(this.f13341a);
        y.f13440g.d("onGetSessionStates", new Object[0]);
    }

    @Override // q9.t
    public void g0(Bundle bundle) {
        q9.i0 i0Var = this.f13342b.f13444d;
        TaskCompletionSource taskCompletionSource = this.f13341a;
        i0Var.d(taskCompletionSource);
        int i10 = bundle.getInt("error_code");
        y.f13440g.b("onError(%d)", Integer.valueOf(i10));
        taskCompletionSource.c(new AssetPackException(i10));
    }

    @Override // q9.t
    public void j0(Bundle bundle, Bundle bundle2) {
        this.f13342b.f13444d.d(this.f13341a);
        y.f13440g.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // q9.t
    public void m(Bundle bundle, Bundle bundle2) {
        this.f13342b.f13445e.d(this.f13341a);
        y.f13440g.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // q9.t
    public void r(int i10, Bundle bundle) {
        this.f13342b.f13444d.d(this.f13341a);
        y.f13440g.d("onStartDownload(%d)", Integer.valueOf(i10));
    }

    @Override // q9.t
    public void r0(Bundle bundle, Bundle bundle2) {
        this.f13342b.f13444d.d(this.f13341a);
        y.f13440g.d("onGetChunkFileDescriptor", new Object[0]);
    }
}
