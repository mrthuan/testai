package mj;

import android.graphics.RectF;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class z extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22140b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ RectF f22141d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22142e;

    public z(lib.zj.pdfeditor.text.editor.a aVar, int i10, int i11, RectF rectF) {
        this.f22142e = aVar;
        this.f22140b = i10;
        this.c = i11;
        this.f22141d = rectF;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 90;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lib.zj.pdfeditor.text.editor.a aVar = this.f22142e;
        if (aVar.f21683d != null && this.f22140b == aVar.f21685e && this.f22142e.f21680b == TextEditorState.ADJUST_TEXT_BLOCK && this.f22142e.f21698p != null) {
            int i10 = this.f22142e.f21698p.f22044a;
            int i11 = this.c;
            if (i10 == i11) {
                ReaderPDFCore readerPDFCore = this.f22142e.f21683d;
                int i12 = this.f22140b;
                RectF rectF = this.f22141d;
                readerPDFCore.editorAdjustBlockBoundsAndSave(i12, i11, rectF.left, rectF.top, rectF.right);
                this.f22142e.f21683d.recordEditorTextOrImageAction(this.f22140b);
                lib.zj.pdfeditor.text.editor.a.f(this.f22142e);
                lib.zj.pdfeditor.text.editor.a.d(this.f22142e, this.c);
                b0 b0Var = this.f22142e.f21689g;
                if (b0Var != null) {
                    b0Var.C();
                }
            }
        }
    }
}
