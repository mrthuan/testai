package lm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import mj.k;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AIHelper.kt */
/* loaded from: classes3.dex */
public final class a extends m4.c<Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ cg.a<tf.d> f21760d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ cg.a<tf.d> f21761e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f21762f;

    public a(Context context, cg.a aVar, cg.a aVar2) {
        this.f21760d = aVar;
        this.f21761e = aVar2;
        this.f21762f = context;
    }

    @Override // m4.g
    public final void c(Object obj, n4.d dVar) {
        t0.V().execute(new k(1, this.f21760d, (Bitmap) obj, this.f21761e, this.f21762f));
    }

    @Override // m4.c, m4.g
    public final void f(Drawable drawable) {
        cg.a<tf.d> aVar = this.f21760d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // m4.g
    public final void i(Drawable drawable) {
    }
}
