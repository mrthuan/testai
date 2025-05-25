package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: RecentAddedActivity.kt */
/* loaded from: classes3.dex */
public final class h1 extends androidx.privacysandbox.ads.adservices.topics.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecentAddedActivity f26940a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PdfPreviewEntity f26941b;

    public h1(RecentAddedActivity recentAddedActivity, PdfPreviewEntity pdfPreviewEntity) {
        this.f26940a = recentAddedActivity;
        this.f26941b = pdfPreviewEntity;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
    public final void b() {
        PdfPreviewEntity pdfPreviewEntity = this.f26941b;
        pdfPreviewEntity.setRecent(1);
        pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
        kotlin.jvm.internal.g.d(pdfPreviewEntity, ea.a.p("M25FaUN5", "lhV17Qf6"));
        FileRepository.I(pdfPreviewEntity);
        bm.c.b(this.f26940a).i(pdfPreviewEntity);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
    public final void c() {
        this.f26940a.I1();
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d, pdf.pdfreader.viewer.editor.free.utils.h0
    public final void d() {
        this.f26940a.V1();
    }
}
