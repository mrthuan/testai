package pdf.pdfreader.viewer.editor.free.convert.opt;

import androidx.viewpager2.widget.ViewPager2;
import java.util.Vector;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24142a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24143b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f24144d;

    public /* synthetic */ c(Object obj, int i10, Object obj2, int i11) {
        this.f24142a = i11;
        this.c = obj;
        this.f24143b = i10;
        this.f24144d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24142a;
        int i11 = this.f24143b;
        Object obj = this.f24144d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                h.a((a) obj2, i11, (Vector) obj);
                return;
            case 1:
                BaseUserGuideTestFragment baseUserGuideTestFragment = (BaseUserGuideTestFragment) obj2;
                ViewPager2 viewPager2 = (ViewPager2) obj;
                BaseUserGuideTestFragment.a aVar = BaseUserGuideTestFragment.f24996h0;
                kotlin.jvm.internal.g.e(baseUserGuideTestFragment, ea.a.p("VXQGaUdfPHVu", "xhqn4NyX"));
                kotlin.jvm.internal.g.e(viewPager2, ea.a.p("a3ZYZQ5QVmc_cg==", "hXwnCcgf"));
                baseUserGuideTestFragment.F0(i11, viewPager2, true);
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.feature.ocr.helper.h.a((k) obj2, i11, (Vector) obj);
                return;
            default:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) obj2;
                Exception exc = (Exception) obj;
                ReaderMergeChooserActivity.a aVar2 = ReaderMergeChooserActivity.f26759n0;
                kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("O2hYc10w", "MhsAsvmK"));
                kotlin.jvm.internal.g.e(exc, ea.a.p("cWU=", "GpU94KZL"));
                readerMergeChooserActivity.I1();
                j1.e(readerMergeChooserActivity, readerMergeChooserActivity.getString(R.string.arg_res_0x7f130409), true, null, -1);
                exc.printStackTrace();
                readerMergeChooserActivity.a(readerMergeChooserActivity.q2().f27263h.size());
                readerMergeChooserActivity.q2().notifyItemChanged(i11, ge.a.H(""));
                return;
        }
    }

    public /* synthetic */ c(ReaderMergeChooserActivity readerMergeChooserActivity, Exception exc, int i10) {
        this.f24142a = 3;
        this.c = readerMergeChooserActivity;
        this.f24144d = exc;
        this.f24143b = i10;
    }
}
