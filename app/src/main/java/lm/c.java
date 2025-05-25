package lm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AIHelper.kt */
/* loaded from: classes3.dex */
public final class c extends m4.c<Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f21768d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ cg.a<tf.d> f21769e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ cg.a<tf.d> f21770f;

    public c(Context context, cg.a<tf.d> aVar, cg.a<tf.d> aVar2) {
        this.f21768d = context;
        this.f21769e = aVar;
        this.f21770f = aVar2;
    }

    @Override // m4.g
    public final void c(Object obj, n4.d dVar) {
        t0.V().execute(new b(this.f21768d, (Bitmap) obj, this, this.f21769e, this.f21770f, 0));
    }

    @Override // m4.c, m4.g
    public final void f(Drawable drawable) {
        cg.a<tf.d> aVar = this.f21770f;
        if (aVar != null) {
            aVar.invoke();
        }
        cg.a<tf.d> aVar2 = this.f21769e;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    @Override // m4.g
    public final void i(Drawable drawable) {
    }
}
