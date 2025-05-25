package pdf.pdfreader.viewer.editor.free.office;

import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26094b;

    public /* synthetic */ e0(Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26093a = i10;
        this.f26094b = word2PDFConvertActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26093a;
        final Word2PDFConvertActivity word2PDFConvertActivity = this.f26094b;
        switch (i10) {
            case 0:
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("OGgnc10w", "FKLNybMq"));
                if (!word2PDFConvertActivity.A2()) {
                    word2PDFConvertActivity.runOnUiThread(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.office.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                            String p10 = ea.a.p("O2hYc10w", "LGbZ2IPN");
                            Word2PDFConvertActivity word2PDFConvertActivity2 = Word2PDFConvertActivity.this;
                            kotlin.jvm.internal.g.e(word2PDFConvertActivity2, p10);
                            word2PDFConvertActivity2.I2();
                            word2PDFConvertActivity2.f26035k1 = false;
                        }
                    });
                    return;
                } else {
                    word2PDFConvertActivity.runOnUiThread(new i0(word2PDFConvertActivity, 1));
                    return;
                }
            case 1:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("BWg8c1Aw", "jJqUtYxR"));
                return;
            default:
                Word2PDFConvertActivity.a aVar3 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "E2UaArQa"));
                word2PDFConvertActivity.r2();
                return;
        }
    }
}
