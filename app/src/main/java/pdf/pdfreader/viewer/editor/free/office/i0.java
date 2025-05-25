package pdf.pdfreader.viewer.editor.free.office;

import java.io.File;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26108a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26109b;

    public /* synthetic */ i0(Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26108a = i10;
        this.f26109b = word2PDFConvertActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26108a;
        Word2PDFConvertActivity word2PDFConvertActivity = this.f26109b;
        switch (i10) {
            case 0:
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "A8ol2GGK"));
                word2PDFConvertActivity.w2();
                return;
            default:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("BWgPc0ow", "WKqfn7R1"));
                word2PDFConvertActivity.f26035k1 = true;
                word2PDFConvertActivity.u2().post(new k0(word2PDFConvertActivity, 1));
                try {
                    sp.h hVar = word2PDFConvertActivity.f26051w0;
                    if (hVar != null) {
                        hVar.e(true);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                word2PDFConvertActivity.f26033j1 = System.currentTimeMillis();
                sn.d.d().getClass();
                sp.h hVar2 = new sp.h(word2PDFConvertActivity, androidx.activity.f.m(sn.d.e(), "convert", File.separator), false, word2PDFConvertActivity);
                word2PDFConvertActivity.f26051w0 = hVar2;
                hVar2.h(word2PDFConvertActivity.f26029h0);
                return;
        }
    }
}
