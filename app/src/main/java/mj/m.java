package mj;

import android.graphics.PointF;
import android.graphics.RectF;
import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class m extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22114b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PointF f22115d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22116e;

    public m(lib.zj.pdfeditor.text.editor.a aVar, int i10, a aVar2, PointF pointF) {
        this.f22116e = aVar;
        this.f22114b = i10;
        this.c = aVar2;
        this.f22115d = pointF;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 80;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        lib.zj.pdfeditor.text.editor.a aVar2 = this.f22116e;
        if (aVar2.f21683d != null && this.f22114b == aVar2.f21685e && this.f22116e.f21680b != TextEditorState.NONE && (aVar = this.c) != null && aVar == this.f22116e.f21698p) {
            RectF locateCharFromPoint = this.f22116e.f21683d.locateCharFromPoint(this.f22114b, this.f22115d, this.c.f22044a);
            if (locateCharFromPoint != null) {
                this.f22116e.f21678a.post(new n0.g(22, this, locateCharFromPoint));
                return;
            }
            return;
        }
        int i10 = this.f22116e.f21685e;
    }
}
