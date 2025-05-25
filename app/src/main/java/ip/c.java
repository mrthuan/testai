package ip;

import android.net.Uri;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;

/* compiled from: ThirdOpenResult.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f18969a;

    /* renamed from: b  reason: collision with root package name */
    public final ThirdOpenStatus f18970b;
    public final PdfPreviewEntity c;

    public c(Uri uri, ThirdOpenStatus thirdOpenStatus, PdfPreviewEntity pdfPreviewEntity) {
        g.e(uri, ea.a.p("RnJp", "YkPuh5s8"));
        g.e(thirdOpenStatus, ea.a.p("PHRQdAxz", "jNIRv1IF"));
        this.f18969a = uri;
        this.f18970b = thirdOpenStatus;
        this.c = pdfPreviewEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (g.a(this.f18969a, cVar.f18969a) && this.f18970b == cVar.f18970b && g.a(this.c, cVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f18970b.hashCode() + (this.f18969a.hashCode() * 31)) * 31;
        PdfPreviewEntity pdfPreviewEntity = this.c;
        if (pdfPreviewEntity == null) {
            hashCode = 0;
        } else {
            hashCode = pdfPreviewEntity.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ThirdOpenResult(uri=" + this.f18969a + ", status=" + this.f18970b + ", entity=" + this.c + ")";
    }
}
