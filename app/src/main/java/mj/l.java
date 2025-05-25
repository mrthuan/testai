package mj;

import android.graphics.PointF;
import android.graphics.RectF;
import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class l extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22109b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f22110d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ float f22111e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RectF f22112f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22113g;

    public l(lib.zj.pdfeditor.text.editor.a aVar, int i10, a aVar2, float f10, float f11, RectF rectF) {
        this.f22113g = aVar;
        this.f22109b = i10;
        this.c = aVar2;
        this.f22110d = f10;
        this.f22111e = f11;
        this.f22112f = rectF;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 94;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        lib.zj.pdfeditor.text.editor.a aVar2 = this.f22113g;
        if (aVar2.f21683d != null && this.f22109b == aVar2.f21685e && this.f22113g.f21680b != TextEditorState.NONE && (aVar = this.c) != null && aVar == this.f22113g.f21698p) {
            RectF locateCharFromPoint = this.f22113g.f21683d.locateCharFromPoint(this.f22109b, new PointF(this.f22110d, this.f22111e), this.c.f22044a);
            if (locateCharFromPoint == null) {
                locateCharFromPoint = this.f22113g.f21683d.locateCharFromPoint(this.f22109b, new PointF(this.f22112f.centerX(), this.f22112f.centerY()), this.c.f22044a);
            }
            if (locateCharFromPoint != null) {
                this.f22113g.f21678a.post(new b7.g(this, 13));
                lib.zj.pdfeditor.text.editor.a.b(this.f22113g);
                return;
            }
            return;
        }
        int i10 = this.f22113g.f21685e;
    }
}
