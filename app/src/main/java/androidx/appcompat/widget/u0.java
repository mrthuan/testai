package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.r;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2687a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f2688b;
    public TypedValue c;

    public u0(Context context, TypedArray typedArray) {
        this.f2687a = context;
        this.f2688b = typedArray;
    }

    public static u0 m(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public final boolean a(int i10, boolean z10) {
        return this.f2688b.getBoolean(i10, z10);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f2688b;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (colorStateList = androidx.core.content.a.getColorStateList(this.f2687a, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i10);
    }

    public final int c(int i10, int i11) {
        return this.f2688b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f2688b.getDimensionPixelSize(i10, i11);
    }

    public final Drawable e(int i10) {
        int resourceId;
        TypedArray typedArray = this.f2688b;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return m.a.a(this.f2687a, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable g10;
        if (this.f2688b.hasValue(i10) && (resourceId = this.f2688b.getResourceId(i10, 0)) != 0) {
            h a10 = h.a();
            Context context = this.f2687a;
            synchronized (a10) {
                g10 = a10.f2594a.g(context, true, resourceId);
            }
            return g10;
        }
        return null;
    }

    public final Typeface g(int i10, int i11, r.a aVar) {
        int resourceId = this.f2688b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal<TypedValue> threadLocal = n0.f.f22291a;
        Context context = this.f2687a;
        if (context.isRestricted()) {
            return null;
        }
        return n0.f.b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final int h(int i10, int i11) {
        return this.f2688b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f2688b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f2688b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f2688b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f2688b.hasValue(i10);
    }

    public final void n() {
        this.f2688b.recycle();
    }
}
