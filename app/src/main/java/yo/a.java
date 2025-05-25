package yo;

import android.util.Pair;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignActionInfo;
import yo.c;

/* compiled from: SignActionManager.java */
/* loaded from: classes3.dex */
public final class a implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f32206a;

    public a(c cVar) {
        this.f32206a = cVar;
    }

    @Override // yo.c.b
    public final void a(SignActionInfo signActionInfo, SignActionInfo signActionInfo2) {
        c cVar = this.f32206a;
        if (signActionInfo != null && signActionInfo2 != null) {
            cVar.c.offer(new Pair<>(signActionInfo, signActionInfo2));
            cVar.b();
            return;
        }
        cVar.b();
    }
}
