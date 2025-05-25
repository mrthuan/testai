package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25296a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f25297b;

    public /* synthetic */ a(f fVar, int i10) {
        this.f25296a = i10;
        this.f25297b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View c22;
        int i10 = this.f25296a;
        f fVar = this.f25297b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(fVar, ea.a.p("R2gic1cw", "qBd85osm"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(fVar) && (c22 = fVar.c2()) != null) {
                    c22.setVisibility(0);
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.g.e(fVar, ea.a.p("R2gic1cw", "wQTc5GLS"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(fVar)) {
                    fVar.f2();
                    return;
                }
                return;
        }
    }
}
