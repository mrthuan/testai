package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import java.util.ArrayList;
import jm.c;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AIChatActivity f24641b;
    public final /* synthetic */ km.a c;

    public /* synthetic */ q(AIChatActivity aIChatActivity, km.a aVar, int i10) {
        this.f24640a = i10;
        this.f24641b = aIChatActivity;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24640a;
        final km.a aVar = this.c;
        final AIChatActivity aIChatActivity = this.f24641b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("R2gic1cw", "7G5lfZv1"));
                kotlin.jvm.internal.g.e(aVar, ea.a.p("HXM9bhRDAWE8SQhmbw==", "p89XpiEA"));
                if (!aIChatActivity.isFinishing()) {
                    im.a.b(false);
                    ArrayList arrayList = jm.c.f19315a;
                    Integer num = null;
                    c.a.a(false, null, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$requestSendMsg$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return tf.d.f30009a;
                        }

                        public final void invoke(boolean z10) {
                            km.a aVar2 = km.a.this;
                            aVar2.B = z10;
                            AIChatActivity aIChatActivity2 = aIChatActivity;
                            aIChatActivity2.X.post(new l(aIChatActivity2, aVar2, 1));
                            AIChatActivity.D2(aIChatActivity, km.a.this);
                        }
                    }, 5);
                    c.a.b(Boolean.FALSE, Boolean.TRUE);
                    aVar.f19889s = 201;
                    pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = aIChatActivity.C;
                    if (aVar2 != null) {
                        aVar2.l(aVar);
                    }
                    pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar3 = aIChatActivity.C;
                    if (aVar3 != null) {
                        num = Integer.valueOf(aVar3.i(aVar));
                    }
                    if (num != null) {
                        final int intValue = num.intValue();
                        final AIChatRecyclerView aIChatRecyclerView = aIChatActivity.B;
                        if (aIChatRecyclerView != null) {
                            aIChatRecyclerView.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String p10 = ea.a.p("UnZQZXc=", "Onv9Bmde");
                                    AIChatRecyclerView aIChatRecyclerView2 = aIChatRecyclerView;
                                    kotlin.jvm.internal.g.e(aIChatRecyclerView2, p10);
                                    aIChatRecyclerView2.C0(intValue);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("Rmghc2kw", "TR2HMZZ8"));
                kotlin.jvm.internal.g.e(aVar, ea.a.p("a2NZYQ1JWWZv", "OhnZPQmW"));
                if (!aIChatActivity.isFinishing()) {
                    ea.a.p("GFBiRQFwWHIuZXI=", "1clrxilr");
                    ea.a.p("IG5ybxd2UnIuRCNzBW8bZQ8g", "R23w1GbO");
                    String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    AIChatActivity.p2(aIChatActivity, aVar);
                    return;
                }
                return;
        }
    }
}
