package a9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.s;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f397a;

    /* renamed from: b  reason: collision with root package name */
    public int f398b;
    public int[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f399d;

    /* renamed from: e  reason: collision with root package name */
    public int f400e;

    /* renamed from: f  reason: collision with root package name */
    public int f401f;

    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray d10 = s.d(context, attributeSet, e8.a.f16478d, i10, i11, new int[0]);
        this.f397a = b9.c.c(context, d10, 8, dimensionPixelSize);
        this.f398b = Math.min(b9.c.c(context, d10, 7, 0), this.f397a / 2);
        this.f400e = d10.getInt(4, 0);
        this.f401f = d10.getInt(1, 0);
        if (!d10.hasValue(2)) {
            this.c = new int[]{t0.J(context, R.attr.colorPrimary, -1)};
        } else if (d10.peekValue(2).type != 1) {
            this.c = new int[]{d10.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(d10.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (d10.hasValue(6)) {
            this.f399d = d10.getColor(6, -1);
        } else {
            this.f399d = this.c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.f399d = t0.x(this.f399d, (int) (f10 * 255.0f));
        }
        d10.recycle();
    }

    public abstract void a();
}
