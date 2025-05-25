package mj;

import android.graphics.RectF;

/* compiled from: BlockEntity.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f22044a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f22045b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22046d = false;

    public a(int i10, RectF rectF, boolean z10) {
        this.f22044a = i10;
        this.f22045b = rectF;
        this.c = z10;
    }

    public final String toString() {
        return "BlockEntity{index=" + this.f22044a + ", rectF=" + this.f22045b + ", isVertical=" + this.c + ", isSelected=" + this.f22046d + '}';
    }
}
