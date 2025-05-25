package u;

import android.os.Bundle;
import pdf.pdfreader.viewer.editor.free.office.b0;
import pdf.pdfreader.viewer.editor.free.office.c0;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30096a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f30097b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30098d;

    public /* synthetic */ h(Object obj, int i10, Object obj2, boolean z10) {
        this.f30096a = i10;
        this.c = obj;
        this.f30097b = z10;
        this.f30098d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30096a;
        boolean z10 = this.f30097b;
        Object obj = this.f30098d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((n) obj2).onVerticalScrollEvent(z10, (Bundle) obj);
                return;
            case 1:
                c0 c0Var = (c0) obj2;
                b0 b0Var = (b0) obj;
                kotlin.jvm.internal.g.e(c0Var, ea.a.p("O2hYc10w", "3koBZptR"));
                kotlin.jvm.internal.g.e(b0Var, ea.a.p("F2MqbB9iA2Nr", "9nd76ob0"));
                c0Var.f26077f.run();
                if (c0Var.f26080i && !z10) {
                    ea.a.p("WnNrdBZyD2kcYUBpBm4h", "QrI9Dp6S");
                } else if (!c0Var.f26079h) {
                    b0Var.a(z10);
                } else {
                    ea.a.p("EWE8IDVlPHUkdEZiQXR3ZF1zJnImeVNkIQ==", "97yOGOOE");
                }
                c0Var.f26075d = false;
                return;
            case 2:
                BaseOperatePDFActivity.l2((String) obj, (BaseOperatePDFActivity) obj2, z10);
                return;
            default:
                ((g2) obj2).H.c((String) obj, z10);
                return;
        }
    }

    public /* synthetic */ h(g2 g2Var, String str, boolean z10) {
        this.f30096a = 3;
        this.c = g2Var;
        this.f30098d = str;
        this.f30097b = z10;
    }
}
