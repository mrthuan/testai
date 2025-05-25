package mj;

import android.graphics.PointF;
import android.graphics.RectF;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class n extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22117b;
    public final /* synthetic */ ReaderPDFCore.SelectInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f22118d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ PointF f22119e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.libconvert.a f22120f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RectF f22121g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22122h;

    public n(lib.zj.pdfeditor.text.editor.a aVar, int i10, ReaderPDFCore.SelectInfo selectInfo, a aVar2, PointF pointF, androidx.appcompat.libconvert.a aVar3, RectF rectF) {
        this.f22122h = aVar;
        this.f22117b = i10;
        this.c = selectInfo;
        this.f22118d = aVar2;
        this.f22119e = pointF;
        this.f22120f = aVar3;
        this.f22121g = rectF;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 80;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        lib.zj.pdfeditor.text.editor.a aVar2 = this.f22122h;
        if (aVar2.f21683d != null && this.f22117b == aVar2.f21685e && this.f22122h.f21680b != TextEditorState.NONE && this.c != null && (aVar = this.f22118d) != null && aVar == this.f22122h.f21698p) {
            RectF locateCharFromPoint = this.f22122h.f21683d.locateCharFromPoint(this.f22117b, this.f22119e, this.f22118d.f22044a);
            if (locateCharFromPoint != null) {
                RectF editorSelectWord = this.f22122h.f21683d.editorSelectWord();
                if (editorSelectWord != null) {
                    RectF locateCharFromPoint2 = this.f22122h.f21683d.locateCharFromPoint(this.f22117b, new PointF(editorSelectWord.left - (this.c.minSize * 0.1f), editorSelectWord.centerY()), this.f22118d.f22044a);
                    RectF locateCharFromPoint3 = this.f22122h.f21683d.locateCharFromPoint(this.f22117b, new PointF(editorSelectWord.right - (this.c.minSize * 0.1f), editorSelectWord.centerY()), this.f22118d.f22044a);
                    if (locateCharFromPoint2 != null && locateCharFromPoint3 != null) {
                        this.f22122h.f21678a.post(new qb.w(1, this, locateCharFromPoint2, locateCharFromPoint3, editorSelectWord, this.f22120f));
                        return;
                    }
                }
                this.f22122h.f21678a.post(new androidx.emoji2.text.h(6, this, locateCharFromPoint, this.f22120f));
                return;
            } else if (this.f22122h.f21680b == TextEditorState.EDIT_TEXT && !this.f22121g.isEmpty()) {
                this.f22122h.f21683d.locateCharFromPoint(this.f22117b, new PointF(this.f22121g.centerX(), this.f22121g.centerY()), this.f22118d.f22044a);
                return;
            } else {
                return;
            }
        }
        int i10 = this.f22122h.f21685e;
    }
}
