package f9;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes2.dex */
public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f17209a;

    public k(float f10) {
        this.f17209a = f10;
    }

    @Override // f9.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f17209a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && this.f17209a == ((k) obj).f17209a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17209a)});
    }
}
