package mj;

import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class u extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22134b;
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a c;

    public u(lib.zj.pdfeditor.text.editor.a aVar, int i10) {
        this.c = aVar;
        this.f22134b = i10;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 80;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lib.zj.pdfeditor.text.editor.a aVar = this.c;
        if (aVar.f21683d != null && this.f22134b == aVar.f21685e && this.c.f21680b == TextEditorState.SELECT_TEXT && !this.c.V.isEmpty()) {
            this.c.f21683d.editorDeleteSelectCharsAndSave(this.f22134b);
            this.c.f21683d.recordEditorTextOrImageAction(this.f22134b);
            lib.zj.pdfeditor.text.editor.a.f(this.c);
            this.c.f21678a.post(new androidx.activity.b(this, 21));
            lib.zj.pdfeditor.text.editor.a.e(this.c, this.f22134b);
        }
    }
}
