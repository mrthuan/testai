package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh;

import am.f3;
import cg.l;
import cg.p;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIQuickTagView;

/* compiled from: AIChatQuickTagViewHolder.kt */
/* loaded from: classes3.dex */
public final class e extends g<km.a, f3> {

    /* renamed from: d  reason: collision with root package name */
    public p<? super Integer, ? super AIQuickTag, tf.d> f24723d;

    /* renamed from: e  reason: collision with root package name */
    public p<? super Integer, ? super List<AIQuickTag>, tf.d> f24724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f3 f3Var) {
        super(f3Var);
        ea.a.p("UWklZBpuZw==", "0ZwB1739");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, km.a aVar) {
        final km.a aVar2 = aVar;
        f3 f3Var = (f3) this.f24704b;
        f3Var.f903b.setVisibility(0);
        l<Integer, tf.d> lVar = new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatQuickTagViewHolder$onBindView$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                invoke(num.intValue());
                return tf.d.f30009a;
            }

            public final void invoke(int i11) {
                km.a.this.f19882l = i11;
            }
        };
        AIQuickTagView aIQuickTagView = f3Var.f903b;
        aIQuickTagView.setCurrentPageListener(lVar);
        aIQuickTagView.setShowDataCallback(this.f24724e);
        im.b.f18555a.getClass();
        aIQuickTagView.c(aVar2.f19882l, im.b.g(this.c), null);
        aIQuickTagView.setOnItemClickListener(new p<Integer, AIQuickTag, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatQuickTagViewHolder$onBindView$2
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(Integer num, AIQuickTag aIQuickTag) {
                invoke(num.intValue(), aIQuickTag);
                return tf.d.f30009a;
            }

            public final void invoke(int i11, AIQuickTag aiQuickTag) {
                kotlin.jvm.internal.g.e(aiQuickTag, "aiQuickTag");
                p<? super Integer, ? super AIQuickTag, tf.d> pVar = e.this.f24723d;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(i11), aiQuickTag);
                }
            }
        });
    }
}
