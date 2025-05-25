package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes.dex */
public class o extends RecyclerView.l {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4506d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public Drawable f4507a;

    /* renamed from: b  reason: collision with root package name */
    public int f4508b;
    public final Rect c = new Rect();

    public o(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4506d);
        this.f4507a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f4508b = 1;
    }
}
