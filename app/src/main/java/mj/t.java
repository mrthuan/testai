package mj;

import lib.zj.pdfeditor.text.editor.TextEditorState;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class t extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22133b;

    public t(lib.zj.pdfeditor.text.editor.a aVar) {
        this.f22133b = aVar;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 80;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String editorSelectToString;
        lib.zj.pdfeditor.text.editor.a aVar = this.f22133b;
        if (aVar.f21683d != null && aVar.f21680b == TextEditorState.SELECT_TEXT && !this.f22133b.V.isEmpty() && (editorSelectToString = this.f22133b.f21683d.editorSelectToString()) != null && !editorSelectToString.isEmpty()) {
            this.f22133b.f21678a.post(new com.facebook.appevents.g(12, this, editorSelectToString));
        }
    }
}
