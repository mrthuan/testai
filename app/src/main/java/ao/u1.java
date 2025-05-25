package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class u1 implements cg.a<tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5138a;

    public u1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5138a = readerPreviewActivity;
    }

    @Override // cg.a
    public final tf.d invoke() {
        this.f5138a.D.post(new t1(this));
        return null;
    }
}
