package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2524a;

    /* renamed from: b  reason: collision with root package name */
    public final View f2525b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f2526d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f2527e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2528f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2529g;

    public b1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2526d = layoutParams;
        this.f2527e = new Rect();
        this.f2528f = new int[2];
        this.f2529g = new int[2];
        this.f2524a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2525b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(b1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = com.google.ads.mediation.pangle.R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
