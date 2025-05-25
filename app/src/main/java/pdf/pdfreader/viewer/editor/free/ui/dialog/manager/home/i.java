package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import android.content.Context;

/* compiled from: UpgradeDialogChain.kt */
/* loaded from: classes3.dex */
public final class i extends po.a {
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public cg.a<tf.d> f27693d;

    @Override // po.a
    public final boolean b() {
        return true;
    }

    @Override // po.a
    public final boolean c(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        if (kotlin.jvm.internal.g.a(this.f28987b, Boolean.TRUE)) {
            cg.a<tf.d> aVar = this.f27693d;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // po.a
    public final boolean d() {
        return this.c;
    }

    @Override // po.a
    public final void a() {
    }
}
