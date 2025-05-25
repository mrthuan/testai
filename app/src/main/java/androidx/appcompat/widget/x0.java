package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: TooltipCompat.java */
/* loaded from: classes.dex */
public final class x0 {

    /* compiled from: TooltipCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        a1 a1Var = a1.f2495k;
        if (a1Var != null && a1Var.f2497a == view) {
            a1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var2 = a1.f2496l;
            if (a1Var2 != null && a1Var2.f2497a == view) {
                a1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new a1(view, charSequence);
    }
}
