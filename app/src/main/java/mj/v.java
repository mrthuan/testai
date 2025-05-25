package mj;

import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class v extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22135b;
    public final /* synthetic */ int[] c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22136d;

    public v(lib.zj.pdfeditor.text.editor.a aVar, int i10, int[] iArr) {
        this.f22136d = aVar;
        this.f22135b = i10;
        this.c = iArr;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 97;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        lib.zj.pdfeditor.text.editor.a aVar = this.f22136d;
        if (aVar.f21683d != null && aVar.f21685e >= 0 && this.f22135b == this.f22136d.f21685e && (this.f22136d.f21680b == TextEditorState.EDIT_TEXT || this.f22136d.f21680b == TextEditorState.SELECT_TEXT)) {
            if (this.c.length == 0) {
                return;
            }
            if (this.f22136d.f21680b == TextEditorState.SELECT_TEXT) {
                this.f22136d.f21683d.editorDeleteSelectCharsAndSave(this.f22135b);
            }
            int i10 = 0;
            for (int i11 : this.c) {
                if (i11 == 10) {
                    if (lib.zj.pdfeditor.text.editor.a.a(this.f22136d, this.f22135b, i10)) {
                        ReaderPDFCore.FontInfo fontInfo = this.f22136d.F;
                        if (fontInfo != null) {
                            this.f22136d.f21683d.editorSetFont(fontInfo);
                        }
                        i10 = 0;
                    }
                    this.f22136d.f21683d.editorNewline(this.f22135b);
                } else if (i11 == -1 && this.f22136d.f21680b == TextEditorState.EDIT_TEXT) {
                    i10++;
                } else {
                    if (lib.zj.pdfeditor.text.editor.a.a(this.f22136d, this.f22135b, i10)) {
                        ReaderPDFCore.FontInfo fontInfo2 = this.f22136d.F;
                        if (fontInfo2 != null) {
                            this.f22136d.f21683d.editorSetFont(fontInfo2);
                        }
                        i10 = 0;
                    }
                    this.f22136d.f21683d.editorInsertChar(this.f22135b, i11);
                }
            }
            if (i10 > 0) {
                lib.zj.pdfeditor.text.editor.a.a(this.f22136d, this.f22135b, i10);
            }
            this.f22136d.f21683d.editorSaveContent(this.f22135b);
            this.f22136d.f21683d.recordEditorTextOrImageAction(this.f22135b);
            lib.zj.pdfeditor.text.editor.a.f(this.f22136d);
            if (this.f22136d.f21680b == TextEditorState.SELECT_TEXT) {
                this.f22136d.f21678a.post(new androidx.activity.i(this, 22));
            }
            lib.zj.pdfeditor.text.editor.a.e(this.f22136d, this.f22135b);
            return;
        }
        int i12 = this.f22136d.f21685e;
    }
}
