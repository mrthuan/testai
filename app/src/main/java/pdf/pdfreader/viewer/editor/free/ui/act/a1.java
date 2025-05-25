package pdf.pdfreader.viewer.editor.free.ui.act;

import java.util.List;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderSearchActivity.java */
/* loaded from: classes3.dex */
public final class a1 implements pdf.pdfreader.viewer.editor.free.utils.extension.e<List<PdfPreviewEntity>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderSearchActivity f26888a;

    public a1(ReaderSearchActivity readerSearchActivity) {
        this.f26888a = readerSearchActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.extension.e
    public final void e(List<PdfPreviewEntity> list) {
        List<PdfPreviewEntity> list2 = list;
        ReaderSearchActivity readerSearchActivity = this.f26888a;
        if (readerSearchActivity.G.isEmpty()) {
            readerSearchActivity.G.addAll(list2);
            readerSearchActivity.K.sendEmptyMessage(15);
        }
    }
}
