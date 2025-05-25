package pdf.pdfreader.viewer.editor.free.ui.act;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26956a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26957b;

    public /* synthetic */ m(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f26956a = i10;
        this.f26957b = readerHomeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26956a;
        ReaderHomeActivity readerHomeActivity = this.f26957b;
        switch (i10) {
            case 0:
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                float a10 = pdf.pdfreader.viewer.editor.free.utils.f0.a();
                int b10 = pdf.pdfreader.viewer.editor.free.utils.g0.b(readerHomeActivity);
                ea.a.p("H28YZWttH20nch8tWWk5TV1tPXIwOiA=", "lHwuKzBk");
                ea.a.p("by0g", "Az6boRC2");
                if (a10 < b10) {
                    readerHomeActivity.N.sendEmptyMessage(20);
                    return;
                }
                return;
            default:
                ReaderHomeActivity.b2(readerHomeActivity);
                return;
        }
    }
}
