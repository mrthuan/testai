package ao;

import lib.zj.pdfeditor.ReaderView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class s1 implements cg.l<Boolean, tf.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5131a;

    public s1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5131a = readerPreviewActivity;
    }

    @Override // cg.l
    public final tf.d invoke(Boolean bool) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool2 = bool;
        StringBuilder sb2 = new StringBuilder();
        ReaderPreviewActivity readerPreviewActivity = this.f5131a;
        sb2.append(pdf.pdfreader.viewer.editor.free.utils.p.d(readerPreviewActivity.f26245r1));
        sb2.append(ea.a.p("Xw==", "Wawrlcod"));
        if (readerPreviewActivity.M) {
            str = "EWVVbDl3";
            str2 = "xFc3VCqi";
        } else {
            str = "XW84bQhs";
            str2 = "UK3JiLHY";
        }
        sb2.append(ea.a.p(str, str2));
        sb2.append(ea.a.p("Xw==", "t3cobByy"));
        if (bool2.booleanValue()) {
            str3 = "W24=";
            str4 = "qh46bF3V";
        } else {
            str3 = "XGZm";
            str4 = "uOQEYB8a";
        }
        sb2.append(ea.a.p(str3, str4));
        pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("OWlUdw==", "ILz8emNs"), ea.a.p("RWkudyxjDWwdcmtjBWk1aw==", "KWuxm0os"), sb2.toString());
        boolean booleanValue = bool2.booleanValue();
        boolean z10 = !readerPreviewActivity.e3();
        ReaderView.A0 = z10;
        ThumbnailAdapter thumbnailAdapter = readerPreviewActivity.D2;
        if (thumbnailAdapter != null) {
            thumbnailAdapter.f26593r = z10;
            thumbnailAdapter.notifyDataSetChanged();
        }
        ReaderPreviewActivity.b0 b0Var = readerPreviewActivity.f26276w1;
        if (b0Var != null) {
            b0Var.d0();
        }
        if (booleanValue) {
            readerPreviewActivity.Q4(readerPreviewActivity.getString(R.string.arg_res_0x7f13031e, readerPreviewActivity.getString(R.string.arg_res_0x7f130443)), false, androidx.core.content.a.getDrawable(readerPreviewActivity, R.drawable.ic_preview_inversion_night));
            return null;
        }
        readerPreviewActivity.Q4(readerPreviewActivity.getString(R.string.arg_res_0x7f13031e, readerPreviewActivity.getString(R.string.arg_res_0x7f130442)), true, androidx.core.content.a.getDrawable(readerPreviewActivity, R.drawable.ic_preview_inversion_day));
        return null;
    }
}
