package f9;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f17157a;

    public a(float f10) {
        this.f17157a = f10;
    }

    @Override // f9.d
    public final float a(RectF rectF) {
        return this.f17157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f17157a == ((a) obj).f17157a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17157a)});
    }
}
