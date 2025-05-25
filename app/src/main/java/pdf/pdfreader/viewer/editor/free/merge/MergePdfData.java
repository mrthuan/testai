package pdf.pdfreader.viewer.editor.free.merge;

import androidx.activity.f;
import java.io.Serializable;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: MergePdfData.kt */
/* loaded from: classes3.dex */
public final class MergePdfData implements Serializable {
    private String copyPath;

    /* renamed from: id  reason: collision with root package name */
    private final long f25886id;
    private final boolean needPassword;

    /* renamed from: pdf  reason: collision with root package name */
    private final PdfPreviewEntity f25887pdf;

    public MergePdfData(PdfPreviewEntity pdfPreviewEntity, boolean z10, String str, long j10) {
        g.e(pdfPreviewEntity, ea.a.p("Q2Rm", "z7FWSHUV"));
        g.e(str, ea.a.p("UG87eSNhFmg=", "13zFI0iu"));
        this.f25887pdf = pdfPreviewEntity;
        this.needPassword = z10;
        this.copyPath = str;
        this.f25886id = j10;
    }

    public static /* synthetic */ MergePdfData copy$default(MergePdfData mergePdfData, PdfPreviewEntity pdfPreviewEntity, boolean z10, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pdfPreviewEntity = mergePdfData.f25887pdf;
        }
        if ((i10 & 2) != 0) {
            z10 = mergePdfData.needPassword;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            str = mergePdfData.copyPath;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            j10 = mergePdfData.f25886id;
        }
        return mergePdfData.copy(pdfPreviewEntity, z11, str2, j10);
    }

    public final PdfPreviewEntity component1() {
        return this.f25887pdf;
    }

    public final boolean component2() {
        return this.needPassword;
    }

    public final String component3() {
        return this.copyPath;
    }

    public final long component4() {
        return this.f25886id;
    }

    public final MergePdfData copy(PdfPreviewEntity pdf2, boolean z10, String copyPath, long j10) {
        g.e(pdf2, "pdf");
        g.e(copyPath, "copyPath");
        return new MergePdfData(pdf2, z10, copyPath, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergePdfData)) {
            return false;
        }
        MergePdfData mergePdfData = (MergePdfData) obj;
        if (g.a(this.f25887pdf, mergePdfData.f25887pdf) && this.needPassword == mergePdfData.needPassword && g.a(this.copyPath, mergePdfData.copyPath) && this.f25886id == mergePdfData.f25886id) {
            return true;
        }
        return false;
    }

    public final String getCopyPath() {
        return this.copyPath;
    }

    public final long getId() {
        return this.f25886id;
    }

    public final boolean getNeedPassword() {
        return this.needPassword;
    }

    public final PdfPreviewEntity getPdf() {
        return this.f25887pdf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f25887pdf.hashCode() * 31;
        boolean z10 = this.needPassword;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int h10 = f.h(this.copyPath, (hashCode + i10) * 31, 31);
        long j10 = this.f25886id;
        return h10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final void setCopyPath(String str) {
        g.e(str, "<set-?>");
        this.copyPath = str;
    }

    public String toString() {
        PdfPreviewEntity pdfPreviewEntity = this.f25887pdf;
        boolean z10 = this.needPassword;
        String str = this.copyPath;
        long j10 = this.f25886id;
        return "MergePdfData(pdf=" + pdfPreviewEntity + ", needPassword=" + z10 + ", copyPath=" + str + ", id=" + j10 + ")";
    }

    public /* synthetic */ MergePdfData(PdfPreviewEntity pdfPreviewEntity, boolean z10, String str, long j10, int i10, d dVar) {
        this(pdfPreviewEntity, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? pdfPreviewEntity.getId() : j10);
    }
}
