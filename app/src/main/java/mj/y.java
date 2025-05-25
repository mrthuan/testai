package mj;

import java.util.ArrayList;
import lib.zj.pdfeditor.Annotation;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class y extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22139b;
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a c;

    public y(lib.zj.pdfeditor.text.editor.a aVar, int i10) {
        this.c = aVar;
        this.f22139b = i10;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 99;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lib.zj.pdfeditor.text.editor.a aVar = this.c;
        if (aVar.f21683d != null && this.f22139b == aVar.f21685e) {
            ArrayList arrayList = new ArrayList();
            Annotation[] pageImageInfo = this.c.f21683d.getPageImageInfo(this.f22139b);
            if (pageImageInfo != null && pageImageInfo.length > 0) {
                for (Annotation annotation : pageImageInfo) {
                    arrayList.add(new e(annotation));
                }
                this.c.f21678a.post(new l.r(20, this, arrayList));
                return;
            }
            this.c.f21678a.post(new androidx.activity.k(this, 19));
            return;
        }
        int i10 = this.c.f21685e;
    }
}
