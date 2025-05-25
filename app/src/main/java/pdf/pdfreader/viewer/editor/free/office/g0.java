package pdf.pdfreader.viewer.editor.free.office;

import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26102a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26103b;

    public /* synthetic */ g0(Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26102a = i10;
        this.f26103b = word2PDFConvertActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26102a;
        Word2PDFConvertActivity word2PDFConvertActivity = this.f26103b;
        switch (i10) {
            case 0:
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "OlSGMp1n"));
                t1.b(ea.a.p("ZFAYMiNEJFAAZUJpDHcXYzBpRGkyeWNvKCAIRBdsMHl0byVlIXUMbhNiWGVJdD90KGUSZyluZQ==", "FerQShiA"));
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                word2PDFConvertActivity.M0 = false;
                return;
            default:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "PJSXBuPI"));
                word2PDFConvertActivity.K0 = !pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(word2PDFConvertActivity);
                return;
        }
    }
}
