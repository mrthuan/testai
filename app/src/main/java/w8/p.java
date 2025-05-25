package w8;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes2.dex */
public final class p {
    public float c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f31050e;

    /* renamed from: f  reason: collision with root package name */
    public b9.d f31051f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f31047a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f31048b = new a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f31049d = true;

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes2.dex */
    public class a extends r.d {
        public a() {
        }

        @Override // r.d
        public final void f(int i10) {
            p pVar = p.this;
            pVar.f31049d = true;
            b bVar = pVar.f31050e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // r.d
        public final void j(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            p pVar = p.this;
            pVar.f31049d = true;
            b bVar = pVar.f31050e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public p(b bVar) {
        this.f31050e = new WeakReference<>(null);
        this.f31050e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f31049d) {
            return this.c;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.f31047a.measureText((CharSequence) str, 0, str.length());
        }
        this.c = measureText;
        this.f31049d = false;
        return measureText;
    }

    public final void b(b9.d dVar, Context context) {
        if (this.f31051f != dVar) {
            this.f31051f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f31047a;
                a aVar = this.f31048b;
                dVar.f(context, textPaint, aVar);
                b bVar = this.f31050e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f31049d = true;
            }
            b bVar2 = this.f31050e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
