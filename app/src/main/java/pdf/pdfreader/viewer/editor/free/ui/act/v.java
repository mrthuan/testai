package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderViewPager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f27076b;

    public /* synthetic */ v(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f27075a = i10;
        this.f27076b = readerHomeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27075a;
        ReaderHomeActivity readerHomeActivity = this.f27076b;
        switch (i10) {
            case 0:
                ReaderViewPager readerViewPager = readerHomeActivity.H;
                if (readerViewPager != null) {
                    readerViewPager.w(0, false);
                    readerHomeActivity.N2(0);
                    readerHomeActivity.O.post(new n(readerHomeActivity, 0));
                    return;
                }
                return;
            default:
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.x2();
                return;
        }
    }
}
