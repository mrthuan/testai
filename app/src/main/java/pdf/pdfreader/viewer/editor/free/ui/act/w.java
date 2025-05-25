package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderViewPager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f27080b;

    public /* synthetic */ w(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f27079a = i10;
        this.f27080b = readerHomeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27079a;
        ReaderHomeActivity readerHomeActivity = this.f27080b;
        switch (i10) {
            case 0:
                ReaderViewPager readerViewPager = readerHomeActivity.H;
                if (readerViewPager != null) {
                    readerViewPager.w(0, false);
                    readerHomeActivity.N2(0);
                    pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = readerHomeActivity.M;
                    if (aVar != null && aVar.f28000f0 != null && 1 < aVar.f28008n0.getCount()) {
                        aVar.f28000f0.setCurrentItem(1);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.S2();
                return;
            default:
                String str2 = ReaderHomeActivity.Y1;
                readerHomeActivity.x2();
                return;
        }
    }
}
