package mj;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class a0 extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22047b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f22048d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22049e;

    public a0(lib.zj.pdfeditor.text.editor.a aVar, int i10, a aVar2, boolean z10) {
        this.f22049e = aVar;
        this.f22047b = i10;
        this.c = aVar2;
        this.f22048d = z10;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 93;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        lib.zj.pdfeditor.text.editor.a aVar2 = this.f22049e;
        if (aVar2.f21683d != null && this.f22047b == aVar2.f21685e && (aVar = this.c) != null) {
            lib.zj.pdfeditor.text.editor.a aVar3 = this.f22049e;
            aVar3.f21678a.post(new l1.a(12, aVar3, aVar3.f21683d.editorSelectBlock(this.f22047b, aVar.f22044a, this.f22048d)));
            lib.zj.pdfeditor.text.editor.a aVar4 = this.f22049e;
            aVar4.f21678a.post(new androidx.fragment.app.g(11, aVar4, aVar4.f21683d.editorGetSelectInfo()));
            return;
        }
        int i10 = this.f22049e.f21685e;
    }
}
