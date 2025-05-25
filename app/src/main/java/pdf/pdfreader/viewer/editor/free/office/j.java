package pdf.pdfreader.viewer.editor.free.office;

import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26111b;

    public /* synthetic */ j(OfficeReaderActivity officeReaderActivity, int i10) {
        this.f26110a = i10;
        this.f26111b = officeReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26110a;
        OfficeReaderActivity officeReaderActivity = this.f26111b;
        switch (i10) {
            case 0:
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "rYrdwSZM"));
                return;
            case 1:
                String str2 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "zAGRkxeS"));
                officeReaderActivity.s2();
                return;
            case 2:
                String str3 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("TWgRcxww", "ww9x8Bdh"));
                officeReaderActivity.s2();
                return;
            case 3:
                String str4 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "62YSrrkv"));
                officeReaderActivity.f25916a2 = !FullScreenManage.d(officeReaderActivity, null, 3, true);
                return;
            case 4:
                String str5 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "EOsgmSBZ"));
                lo.d.a(officeReaderActivity.B1);
                officeReaderActivity.E2().b().set(false);
                officeReaderActivity.runOnUiThread(new z(officeReaderActivity, 5));
                return;
            default:
                String str6 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "i0ij4V7e"));
                ThumbnailAdapter thumbnailAdapter = officeReaderActivity.f25982x1;
                if (thumbnailAdapter != null) {
                    thumbnailAdapter.f26593r = true ^ rg.c.c;
                }
                if (thumbnailAdapter != null) {
                    thumbnailAdapter.notifyDataSetChanged();
                    return;
                }
                return;
        }
    }
}
