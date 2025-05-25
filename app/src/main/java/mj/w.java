package mj;

import androidx.appcompat.widget.y0;
import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class w extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22137b;
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a c;

    public w(lib.zj.pdfeditor.text.editor.a aVar, int i10) {
        this.c = aVar;
        this.f22137b = i10;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 97;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lib.zj.pdfeditor.text.editor.a aVar = this.c;
        if (aVar.f21683d != null && aVar.f21685e >= 0 && this.f22137b == this.c.f21685e) {
            TextEditorState textEditorState = this.c.f21680b;
            TextEditorState textEditorState2 = TextEditorState.EDIT_TEXT;
            if (textEditorState == textEditorState2 || this.c.f21680b == TextEditorState.SELECT_TEXT) {
                TextEditorState textEditorState3 = this.c.f21680b;
                TextEditorState textEditorState4 = TextEditorState.SELECT_TEXT;
                if (textEditorState3 == textEditorState4) {
                    this.c.f21683d.editorDeleteSelectCharsAndSave(this.f22137b);
                }
                if (this.c.f21680b == textEditorState2) {
                    this.c.f21683d.editorDeleteCharAndSave(this.f22137b);
                }
                this.c.f21683d.recordEditorTextOrImageAction(this.f22137b);
                lib.zj.pdfeditor.text.editor.a.f(this.c);
                if (this.c.f21680b == textEditorState4) {
                    this.c.f21678a.post(new y0(this, 19));
                }
                lib.zj.pdfeditor.text.editor.a.e(this.c, this.f22137b);
                return;
            }
        }
        int i10 = this.c.f21685e;
    }
}
