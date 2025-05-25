package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import android.content.Context;

/* compiled from: CreatePdfToolsGuideChain.kt */
/* loaded from: classes3.dex */
public final class a extends po.a {
    public cg.a<Boolean> c;

    /* renamed from: d  reason: collision with root package name */
    public cg.a<tf.d> f27666d;

    /* renamed from: e  reason: collision with root package name */
    public cg.a<Boolean> f27667e;

    @Override // po.a
    public final void a() {
        cg.a<tf.d> aVar = this.f27666d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // po.a
    public final boolean c(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        cg.a<Boolean> aVar = this.c;
        if (aVar != null && aVar.invoke().booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // po.a
    public final boolean d() {
        cg.a<Boolean> aVar = this.f27667e;
        if (aVar != null) {
            return aVar.invoke().booleanValue();
        }
        return false;
    }
}
