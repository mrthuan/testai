package pdf.pdfreader.viewer.editor.free.ui.widget.adapter;

import android.view.View;
import cg.p;
import pdf.pdfreader.viewer.editor.free.ui.widget.adapter.f;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: SignAdapter.kt */
/* loaded from: classes3.dex */
public final class g extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f28373b;
    public final /* synthetic */ f.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SignPathActionInfo f28374d;

    public g(f fVar, f.a aVar, SignPathActionInfo signPathActionInfo) {
        this.f28373b = fVar;
        this.c = aVar;
        this.f28374d = signPathActionInfo;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View v10) {
        kotlin.jvm.internal.g.e(v10, "v");
        p<Integer, SignPathActionInfo, tf.d> pVar = this.f28373b.f28369d;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(this.c.getAdapterPosition()), this.f28374d);
        }
    }
}
