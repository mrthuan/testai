package pdf.pdfreader.viewer.editor.free.ui.act;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f26973b;

    public /* synthetic */ r(jl.a aVar, int i10) {
        this.f26972a = i10;
        this.f26973b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26972a;
        jl.a aVar = this.f26973b;
        switch (i10) {
            case 0:
                String str = ReaderHomeActivity.Y1;
                ((ReaderHomeActivity) aVar).Z2(1);
                return;
            default:
                RecentAddedActivity.l2((RecentAddedActivity) aVar);
                return;
        }
    }
}
