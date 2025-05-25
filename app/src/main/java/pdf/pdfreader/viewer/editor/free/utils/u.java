package pdf.pdfreader.viewer.editor.free.utils;

import java.util.Comparator;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: FileUtils.java */
/* loaded from: classes3.dex */
public final class u implements Comparator<PdfPreviewEntity> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ no.e f28780a;

    public u(no.e eVar) {
        this.f28780a = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(PdfPreviewEntity pdfPreviewEntity, PdfPreviewEntity pdfPreviewEntity2) {
        PdfPreviewEntity pdfPreviewEntity3 = pdfPreviewEntity;
        PdfPreviewEntity pdfPreviewEntity4 = pdfPreviewEntity2;
        if (pdfPreviewEntity3 != null && pdfPreviewEntity4 != null) {
            no.e eVar = this.f28780a;
            if (eVar.a() == 14) {
                return Long.compare(pdfPreviewEntity4.getDate(), pdfPreviewEntity3.getDate());
            }
            if (eVar.a() == 13) {
                return Long.compare(pdfPreviewEntity3.getDate(), pdfPreviewEntity4.getDate());
            }
            if (eVar.a() == 15) {
                return Long.compare(pdfPreviewEntity4.getSize(), pdfPreviewEntity3.getSize());
            }
            if (eVar.a() == 16) {
                return Long.compare(pdfPreviewEntity3.getSize(), pdfPreviewEntity4.getSize());
            }
            String name = pdfPreviewEntity3.getName();
            String name2 = pdfPreviewEntity4.getName();
            if (name.equals(name2)) {
                return 0;
            }
            if (eVar.a() == 11) {
                return name.toUpperCase(Locale.getDefault()).compareTo(name2.toUpperCase(Locale.getDefault()));
            }
            if (eVar.a() == 12) {
                return name2.toUpperCase(Locale.getDefault()).compareTo(name.toUpperCase(Locale.getDefault()));
            }
            return Long.compare(pdfPreviewEntity4.getDate(), pdfPreviewEntity3.getDate());
        } else if (pdfPreviewEntity3 == null) {
            return -1;
        } else {
            return 1;
        }
    }
}
