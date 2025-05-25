package xo;

import android.graphics.Path;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathAction;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;

/* compiled from: SignPath.java */
/* loaded from: classes3.dex */
public final class f extends Path {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f31900a = new ArrayList();

    @Override // android.graphics.Path
    public final void lineTo(float f10, float f11) {
        if (f10 >= 0.0f && f11 >= 0.0f) {
            SignPathActionInfo.a aVar = new SignPathActionInfo.a();
            aVar.f28500a = SignPathAction.LineTo.getType();
            aVar.f28501b = f10;
            aVar.c = f11;
            this.f31900a.add(aVar);
        }
        super.lineTo(f10, f11);
    }

    @Override // android.graphics.Path
    public final void moveTo(float f10, float f11) {
        if (f10 >= 0.0f && f11 >= 0.0f) {
            SignPathActionInfo.a aVar = new SignPathActionInfo.a();
            aVar.f28500a = SignPathAction.MoveTo.getType();
            aVar.f28501b = f10;
            aVar.c = f11;
            this.f31900a.add(aVar);
        }
        super.moveTo(f10, f11);
    }

    @Override // android.graphics.Path
    public final void quadTo(float f10, float f11, float f12, float f13) {
        if (f10 >= 0.0f && f11 >= 0.0f && f12 >= 0.0f && f13 >= 0.0f) {
            SignPathActionInfo.a aVar = new SignPathActionInfo.a();
            aVar.f28500a = SignPathAction.QuadTo.getType();
            aVar.f28501b = f10;
            aVar.c = f11;
            aVar.f28502d = f12;
            aVar.f28503e = f13;
            this.f31900a.add(aVar);
        }
        super.quadTo(f10, f11, f12, f13);
    }
}
