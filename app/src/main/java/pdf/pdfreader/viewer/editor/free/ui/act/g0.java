package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OperatePDFWatcherActivity f26935b;

    public /* synthetic */ g0(OperatePDFWatcherActivity operatePDFWatcherActivity, int i10) {
        this.f26934a = i10;
        this.f26935b = operatePDFWatcherActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26934a;
        OperatePDFWatcherActivity operatePDFWatcherActivity = this.f26935b;
        switch (i10) {
            case 0:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) operatePDFWatcherActivity;
                ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("R2gic1cw", "2RBit6Q5"));
                readerMergeChooserActivity.finish();
                return;
            case 1:
                ReaderSplitPdfActivity readerSplitPdfActivity = (ReaderSplitPdfActivity) operatePDFWatcherActivity;
                ReaderSplitPdfActivity.a aVar2 = ReaderSplitPdfActivity.f26822q0;
                kotlin.jvm.internal.g.e(readerSplitPdfActivity, ea.a.p("R2gic1cw", "tuKjS2lD"));
                Intent intent = new Intent(readerSplitPdfActivity, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("B2UTXzxkFV8ncANyVXQyX0plIXUldA==", "dqljLsXA"), true);
                readerSplitPdfActivity.startActivity(intent);
                readerSplitPdfActivity.finish();
                return;
            default:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) operatePDFWatcherActivity;
                RecentAddedActivity.a aVar3 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("R2gic1cw", "Z9Lk4S0d"));
                recentAddedActivity.t2();
                return;
        }
    }
}
