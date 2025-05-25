package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25299a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f25300b;

    public /* synthetic */ b(f fVar, int i10) {
        this.f25299a = i10;
        this.f25300b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25299a;
        f fVar = this.f25300b;
        switch (i10) {
            case 0:
                f.a2(fVar);
                return;
            default:
                kotlin.jvm.internal.g.e(fVar, ea.a.p("Q2gFc0Ew", "A77leO3B"));
                View c22 = fVar.c2();
                if (c22 != null) {
                    c22.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
