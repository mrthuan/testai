package pdf.pdfreader.viewer.editor.free.ui.frag;

import java.util.Comparator;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public final class h implements Comparator<PdfPreviewEntity> {
    @Override // java.util.Comparator
    public final int compare(PdfPreviewEntity pdfPreviewEntity, PdfPreviewEntity pdfPreviewEntity2) {
        PdfPreviewEntity pdfPreviewEntity3 = pdfPreviewEntity;
        PdfPreviewEntity pdfPreviewEntity4 = pdfPreviewEntity2;
        if (pdfPreviewEntity3 != null && pdfPreviewEntity4 != null) {
            return Long.compare(pdfPreviewEntity4.getRecentDate(), pdfPreviewEntity3.getRecentDate());
        }
        return 0;
    }
}
