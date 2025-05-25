package mj;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class s extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22132b;

    public s(lib.zj.pdfeditor.text.editor.a aVar) {
        this.f22132b = aVar;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 90;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String editorSelectToString;
        lib.zj.pdfeditor.text.editor.a aVar = this.f22132b;
        if (aVar.f21683d != null && aVar.f21698p != null && (editorSelectToString = this.f22132b.f21683d.editorSelectToString()) != null && !editorSelectToString.isEmpty()) {
            this.f22132b.f21678a.post(new l.r(19, this, editorSelectToString));
        }
    }
}
