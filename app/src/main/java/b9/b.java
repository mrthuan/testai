package b9;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: MaterialAttributes.java */
/* loaded from: classes2.dex */
public final class b {
    public static TypedValue a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, boolean z10, int i10) {
        TypedValue a10 = a(context, i10);
        if (a10 != null && a10.type == 18) {
            if (a10.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static TypedValue c(Context context, int i10, String str) {
        TypedValue a10 = a(context, i10);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }
}
