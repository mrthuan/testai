package mj;

import java.util.ArrayList;
import lib.zj.pdfeditor.Annotation;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class p extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22125b;
    public final /* synthetic */ e c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22126d;

    public p(lib.zj.pdfeditor.text.editor.a aVar, int i10, e eVar) {
        this.f22126d = aVar;
        this.f22125b = i10;
        this.c = eVar;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 90;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        lib.zj.pdfeditor.text.editor.a aVar = this.f22126d;
        if (aVar.f21683d != null && this.f22125b == aVar.f21685e && (eVar = this.c) != null && this.f22126d.f21683d.delPageImageInfo(this.f22125b, eVar.f22052a)) {
            b0 b0Var = this.f22126d.f21689g;
            if (b0Var != null) {
                b0Var.i();
            }
            this.f22126d.f21683d.recordEditorTextOrImageAction(this.f22125b);
            lib.zj.pdfeditor.text.editor.a.f(this.f22126d);
            ArrayList arrayList = new ArrayList();
            Annotation[] pageImageInfo = this.f22126d.f21683d.getPageImageInfo(this.f22125b);
            if (pageImageInfo != null && pageImageInfo.length > 0) {
                for (Annotation annotation : pageImageInfo) {
                    arrayList.add(new e(annotation));
                }
                this.f22126d.f21678a.post(new com.facebook.appevents.g(11, this, arrayList));
                return;
            }
            this.f22126d.f21678a.post(new androidx.activity.b(this, 20));
        }
    }
}
