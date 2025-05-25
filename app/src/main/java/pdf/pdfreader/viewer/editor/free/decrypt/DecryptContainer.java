package pdf.pdfreader.viewer.editor.free.decrypt;

import androidx.activity.r;
import java.io.Serializable;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: DecryptContainer.kt */
/* loaded from: classes3.dex */
public final class DecryptContainer implements Serializable {
    private String newPath;
    private String password;
    private final PdfPreviewEntity pdfPreviewEntity;

    public DecryptContainer(PdfPreviewEntity pdfPreviewEntity, String str, String str2) {
        kotlin.jvm.internal.g.e(pdfPreviewEntity, ea.a.p("P2QXUEBlMGktdyNuQGkjeQ==", "w6Oq2FnK"));
        kotlin.jvm.internal.g.e(str, ea.a.p("P2FCcw5vRWQ=", "KfCTIReb"));
        kotlin.jvm.internal.g.e(str2, ea.a.p("IWVGUBh0aA==", "6JNnzIFQ"));
        this.pdfPreviewEntity = pdfPreviewEntity;
        this.password = str;
        this.newPath = str2;
    }

    public static /* synthetic */ DecryptContainer copy$default(DecryptContainer decryptContainer, PdfPreviewEntity pdfPreviewEntity, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pdfPreviewEntity = decryptContainer.pdfPreviewEntity;
        }
        if ((i10 & 2) != 0) {
            str = decryptContainer.password;
        }
        if ((i10 & 4) != 0) {
            str2 = decryptContainer.newPath;
        }
        return decryptContainer.copy(pdfPreviewEntity, str, str2);
    }

    public final PdfPreviewEntity component1() {
        return this.pdfPreviewEntity;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.newPath;
    }

    public final DecryptContainer copy(PdfPreviewEntity pdfPreviewEntity, String password, String newPath) {
        kotlin.jvm.internal.g.e(pdfPreviewEntity, "pdfPreviewEntity");
        kotlin.jvm.internal.g.e(password, "password");
        kotlin.jvm.internal.g.e(newPath, "newPath");
        return new DecryptContainer(pdfPreviewEntity, password, newPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecryptContainer)) {
            return false;
        }
        DecryptContainer decryptContainer = (DecryptContainer) obj;
        if (kotlin.jvm.internal.g.a(this.pdfPreviewEntity, decryptContainer.pdfPreviewEntity) && kotlin.jvm.internal.g.a(this.password, decryptContainer.password) && kotlin.jvm.internal.g.a(this.newPath, decryptContainer.newPath)) {
            return true;
        }
        return false;
    }

    public final String getNewPath() {
        return this.newPath;
    }

    public final String getPassword() {
        return this.password;
    }

    public final PdfPreviewEntity getPdfPreviewEntity() {
        return this.pdfPreviewEntity;
    }

    public int hashCode() {
        return this.newPath.hashCode() + androidx.activity.f.h(this.password, this.pdfPreviewEntity.hashCode() * 31, 31);
    }

    public final void setNewPath(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
        this.newPath = str;
    }

    public final void setPassword(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
        this.password = str;
    }

    public String toString() {
        PdfPreviewEntity pdfPreviewEntity = this.pdfPreviewEntity;
        String str = this.password;
        String str2 = this.newPath;
        StringBuilder sb2 = new StringBuilder("DecryptContainer(pdfPreviewEntity=");
        sb2.append(pdfPreviewEntity);
        sb2.append(", password=");
        sb2.append(str);
        sb2.append(", newPath=");
        return r.g(sb2, str2, ")");
    }

    public /* synthetic */ DecryptContainer(PdfPreviewEntity pdfPreviewEntity, String str, String str2, int i10, kotlin.jvm.internal.d dVar) {
        this(pdfPreviewEntity, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
