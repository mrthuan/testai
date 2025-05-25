package qb;

import com.inmobi.media.P;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29198a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cg.a f29199b;

    public /* synthetic */ g(cg.a aVar, int i10) {
        this.f29198a = i10;
        this.f29199b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29198a;
        cg.a aVar = this.f29199b;
        switch (i10) {
            case 0:
                P.a(aVar);
                return;
            default:
                kotlin.jvm.internal.g.e(aVar, ea.a.p("F3I-bh1hAGxl", "oaZmF3UH"));
                aVar.invoke();
                return;
        }
    }
}
