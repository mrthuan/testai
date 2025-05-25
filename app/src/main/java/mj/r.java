package mj;

import android.graphics.RectF;
import androidx.appcompat.widget.z0;
import java.util.ArrayList;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class r extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22130b;
    public final /* synthetic */ a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22131d;

    public r(lib.zj.pdfeditor.text.editor.a aVar, int i10, a aVar2) {
        this.f22131d = aVar;
        this.f22130b = i10;
        this.c = aVar2;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 90;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        lib.zj.pdfeditor.text.editor.a aVar2 = this.f22131d;
        if (aVar2.f21683d != null && this.f22130b == aVar2.f21685e && (aVar = this.c) != null) {
            this.f22131d.f21683d.editorDeleteBlockAndSave(this.f22130b, aVar.f22044a);
            this.f22131d.f21683d.recordEditorTextOrImageAction(this.f22130b);
            b0 b0Var = this.f22131d.f21689g;
            if (b0Var != null) {
                b0Var.F();
            }
            lib.zj.pdfeditor.text.editor.a.f(this.f22131d);
            ArrayList arrayList = new ArrayList();
            int editorGetBlockLen = this.f22131d.f21683d.editorGetBlockLen(this.f22130b);
            if (editorGetBlockLen > 0) {
                for (int i10 = 0; i10 < editorGetBlockLen; i10++) {
                    RectF editorGetBlockBox = this.f22131d.f21683d.editorGetBlockBox(this.f22130b, i10);
                    if (editorGetBlockBox != null) {
                        arrayList.add(new a(i10, editorGetBlockBox, this.f22131d.f21683d.editorIsBlockVertical(this.f22130b, i10)));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f22131d.f21678a.post(new n0.g(23, this, arrayList));
                    return;
                }
                return;
            }
            this.f22131d.f21678a.post(new z0(this, 18));
        }
    }
}
