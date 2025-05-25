package b9;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: TextAppearance.java */
/* loaded from: classes2.dex */
public final class e extends r.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextPaint f5391b;
    public final /* synthetic */ r.d c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f5392d;

    public e(d dVar, Context context, TextPaint textPaint, r.d dVar2) {
        this.f5392d = dVar;
        this.f5390a = context;
        this.f5391b = textPaint;
        this.c = dVar2;
    }

    @Override // r.d
    public final void f(int i10) {
        this.c.f(i10);
    }

    @Override // r.d
    public final void j(Typeface typeface, boolean z10) {
        this.f5392d.g(this.f5390a, this.f5391b, typeface);
        this.c.j(typeface, z10);
    }
}
