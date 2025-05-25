package mj;

import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class x extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22138b;
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a c;

    public x(lib.zj.pdfeditor.text.editor.a aVar, int i10) {
        this.c = aVar;
        this.f22138b = i10;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 100;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lib.zj.pdfeditor.text.editor.a aVar = this.c;
        if (aVar.f21683d != null && this.f22138b == aVar.f21685e) {
            ArrayList arrayList = new ArrayList();
            this.c.f21683d.initTextEditorHandle(this.f22138b);
            lib.zj.pdfeditor.text.editor.a aVar2 = this.c;
            aVar2.f21691i = aVar2.f21683d.editorPageEditable(this.f22138b);
            int editorGetBlockLen = this.c.f21683d.editorGetBlockLen(this.f22138b);
            if (editorGetBlockLen > 0) {
                for (int i10 = 0; i10 < editorGetBlockLen; i10++) {
                    RectF editorGetBlockBox = this.c.f21683d.editorGetBlockBox(this.f22138b, i10);
                    if (editorGetBlockBox != null) {
                        arrayList.add(new a(i10, editorGetBlockBox, this.c.f21683d.editorIsBlockVertical(this.f22138b, i10)));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.c.f21678a.post(new androidx.fragment.app.g(13, this, arrayList));
                    return;
                }
                return;
            }
            this.c.f21678a.post(new androidx.activity.i(this, 23));
            return;
        }
        int i11 = this.c.f21685e;
    }
}
