package p001if;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewUtils.java */
/* renamed from: if.b  reason: invalid package */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ViewUtils.java */
    /* renamed from: if.b$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean b(View view);
    }

    public static Activity a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return a(((ContextWrapper) context).getBaseContext());
    }

    public static boolean b(View view, a aVar) {
        if (view == null) {
            return false;
        }
        if (aVar.b(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (b(viewGroup.getChildAt(i10), aVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
