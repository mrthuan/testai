package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Fragment.java */
/* loaded from: classes.dex */
public final class p extends Fragment.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t.a f3894a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3895b;
    public final /* synthetic */ j.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.b f3896d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Fragment f3897e;

    public p(Fragment fragment, o oVar, AtomicReference atomicReference, pdf.pdfreader.viewer.editor.free.utils.a aVar, com.google.android.tools.d dVar) {
        this.f3897e = fragment;
        this.f3894a = oVar;
        this.f3895b = atomicReference;
        this.c = aVar;
        this.f3896d = dVar;
    }

    @Override // androidx.fragment.app.Fragment.e
    public final void a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        Fragment fragment = this.f3897e;
        sb2.append(fragment.f3673f);
        sb2.append("_rq#");
        sb2.append(fragment.U.getAndIncrement());
        this.f3895b.set(((androidx.activity.result.f) this.f3894a.apply()).c(sb2.toString(), fragment, this.c, this.f3896d));
    }
}
