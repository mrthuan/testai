package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AIChatActivity f24585b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(AIChatActivity aIChatActivity, Object obj, int i10) {
        this.f24584a = i10;
        this.f24585b = aIChatActivity;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24584a;
        AIChatActivity aIChatActivity = this.f24585b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("R2gic1cw", "aUDGWoDk"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIChatActivity)) {
                    if (num != null) {
                        num.intValue();
                        AIChatRecyclerView aIChatRecyclerView = aIChatActivity.B;
                        if (aIChatRecyclerView != null) {
                            int intValue = num.intValue();
                            ea.a.p("UnVDb2BjP28kbDJhZw==", "eQ373MwP");
                            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                            if (intValue > 0 && !aIChatRecyclerView.D0) {
                                aIChatRecyclerView.post(new vl.a(aIChatRecyclerView, intValue, 1));
                            }
                        }
                    }
                    aIChatActivity.X.postDelayed(new h(aIChatActivity, 0), 200L);
                    return;
                }
                return;
            default:
                km.a aVar = (km.a) obj;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("O2hYc10w", "oE3AkRhA"));
                kotlin.jvm.internal.g.e(aVar, ea.a.p("a2NZYQ1JWWZv", "UpcyhriA"));
                if (!aIChatActivity.isFinishing()) {
                    AIChatActivity.p2(aIChatActivity, aVar);
                    return;
                }
                return;
        }
    }
}
