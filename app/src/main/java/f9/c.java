package f9;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: ClampedCornerSize.java */
/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f17160a;

    public c(float f10) {
        this.f17160a = f10;
    }

    @Override // f9.d
    public final float a(RectF rectF) {
        return Math.min(this.f17160a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f17160a == ((c) obj).f17160a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17160a)});
    }
}
