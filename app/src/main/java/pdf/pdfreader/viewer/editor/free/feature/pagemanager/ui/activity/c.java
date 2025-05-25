package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25303a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f25304b;

    public /* synthetic */ c(f fVar, int i10) {
        this.f25303a = i10;
        this.f25304b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25303a;
        f fVar = this.f25304b;
        switch (i10) {
            case 0:
                f.a2(fVar);
                return;
            default:
                kotlin.jvm.internal.g.e(fVar, ea.a.p("EWgTc0Aw", "HuezdEu6"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(fVar)) {
                    fVar.f2();
                    return;
                }
                return;
        }
    }
}
