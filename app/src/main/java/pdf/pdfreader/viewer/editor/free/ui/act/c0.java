package pdf.pdfreader.viewer.editor.free.ui.act;

import java.util.List;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderHomeActivity.java */
/* loaded from: classes3.dex */
public final class c0 extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26896o;

    public c0(ReaderHomeActivity readerHomeActivity) {
        this.f26896o = readerHomeActivity;
    }

    @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
    public final void b(List<PdfPreviewEntity> list) {
        ReaderHomeActivity readerHomeActivity = this.f26896o;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerHomeActivity)) {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(readerHomeActivity)) {
                FileRepository.C(readerHomeActivity, new d0(readerHomeActivity));
                return;
            }
            return;
        }
        if (list != null && !list.isEmpty()) {
            readerHomeActivity.U.addAll(list);
        }
        if (!readerHomeActivity.U.isEmpty()) {
            readerHomeActivity.X2();
        }
        readerHomeActivity.O.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(this, 6));
        readerHomeActivity.N.sendEmptyMessage(1);
    }
}
