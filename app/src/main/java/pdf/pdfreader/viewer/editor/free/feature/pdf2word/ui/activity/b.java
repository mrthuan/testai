package pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity;

import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.utils.p;
import tf.d;

/* compiled from: ReaderConvertPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class b implements oo.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderConvertPreviewActivity f25596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cg.a<d> f25597b;

    public b(ReaderConvertPreviewActivity readerConvertPreviewActivity, cg.a<d> aVar) {
        this.f25596a = readerConvertPreviewActivity;
        this.f25597b = aVar;
    }

    @Override // oo.b
    public final void a() {
        ReaderConvertPreviewActivity readerConvertPreviewActivity = this.f25596a;
        if (!readerConvertPreviewActivity.K1) {
            n.f23972a.b(readerConvertPreviewActivity);
        }
        p.l(readerConvertPreviewActivity, readerConvertPreviewActivity.R2());
        this.f25597b.invoke();
    }

    @Override // oo.b
    public final void cancel() {
    }
}
