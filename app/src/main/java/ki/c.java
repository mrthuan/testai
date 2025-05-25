package ki;

import android.graphics.Rect;

/* compiled from: FocusCell.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public short f19771a;

    /* renamed from: b  reason: collision with root package name */
    public int f19772b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f19773d;

    public c() {
        this.f19771a = (short) 0;
    }

    public final Object clone() {
        return new c(this.f19771a, new Rect(this.f19773d), this.f19772b, this.c);
    }

    public c(short s4, Rect rect, int i10, int i11) {
        this.f19771a = s4;
        this.f19773d = rect;
        if (s4 == 1) {
            this.f19772b = i10;
        } else if (s4 == 2) {
            this.c = i11;
        }
    }
}
