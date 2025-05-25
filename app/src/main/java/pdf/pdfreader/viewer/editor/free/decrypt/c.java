package pdf.pdfreader.viewer.editor.free.decrypt;

import android.content.Context;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: DecryptAndCopyUIHelper2.kt */
/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f24250a;

    public c(d dVar) {
        this.f24250a = dVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
    public final void a(DecryptContainer data) {
        kotlin.jvm.internal.g.e(data, "data");
        this.f24250a.f24253d.dismiss();
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
    public final void b(int i10, int i11) {
        this.f24250a.f24253d.c(i10, i11);
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
    public final void c(ArrayList result) {
        kotlin.jvm.internal.g.e(result, "result");
        d dVar = this.f24250a;
        dVar.f24253d.dismiss();
        dVar.c.a(result);
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
    public final void d() {
        this.f24250a.f24253d.show();
    }

    @Override // pdf.pdfreader.viewer.editor.free.decrypt.a
    public final void onError(Throwable th2) {
        d dVar = this.f24250a;
        dVar.f24253d.dismiss();
        dp.a.a().getClass();
        Context context = dVar.f24251a;
        dp.a.d(context, th2);
        j1.e(context, ea.a.p("K2VScgBwQyA8YSNsAHJl", "1m4vOnos"), true, null, -1);
        th2.printStackTrace();
    }
}
