package nl;

import pdf.pdfreader.viewer.editor.free.bean.ColorType;

/* compiled from: SignColor.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f22603a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorType f22604b;

    public f(int i10, ColorType colorType) {
        kotlin.jvm.internal.g.e(colorType, ea.a.p("O3lBZQ==", "zUiphllG"));
        this.f22603a = i10;
        this.f22604b = colorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f22603a == fVar.f22603a && this.f22604b == fVar.f22604b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22604b.hashCode() + (this.f22603a * 31);
    }

    public final String toString() {
        return "SignColor(color=" + this.f22603a + ", type=" + this.f22604b + ")";
    }

    public f(int i10) {
        this(i10, ColorType.Other);
    }
}
