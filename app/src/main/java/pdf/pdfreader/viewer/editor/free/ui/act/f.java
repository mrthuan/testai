package pdf.pdfreader.viewer.editor.free.ui.act;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LanguageChooseActivity f26926b;

    public /* synthetic */ f(LanguageChooseActivity languageChooseActivity, int i10) {
        this.f26925a = i10;
        this.f26926b = languageChooseActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26925a;
        LanguageChooseActivity languageChooseActivity = this.f26926b;
        switch (i10) {
            case 0:
                int i11 = LanguageChooseActivity.H;
                kotlin.jvm.internal.g.e(languageChooseActivity, ea.a.p("R2gic1cw", "quzyr0rO"));
                try {
                    k0.b.a(languageChooseActivity, new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFAKUzFfJk8zSSpJGkEbSX5OUw==", "8YA8hglY")}, 100);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                int i12 = LanguageChooseActivity.H;
                kotlin.jvm.internal.g.e(languageChooseActivity, ea.a.p("R2gic1cw", "nFlmvMG0"));
                languageChooseActivity.b2().f941b.requestLayout();
                return;
        }
    }
}
