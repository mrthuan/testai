package e4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import n0.f;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f16450a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f16450a) {
                if (theme != null) {
                    context3 = new q.c(context2, theme);
                } else {
                    context3 = context2;
                }
                return m.a.a(context3, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return androidx.core.content.a.getDrawable(context2, i10);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f16450a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f22291a;
        return f.a.a(resources, i10, theme);
    }
}
