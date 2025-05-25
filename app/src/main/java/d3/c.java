package d3;

import android.content.Context;
import android.graphics.Typeface;
import y.i;

/* compiled from: TypefaceHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final i<String, Typeface> f16115a = new i<>();

    public static Typeface a(Context context, String str) {
        i<String, Typeface> iVar = f16115a;
        synchronized (iVar) {
            if (!iVar.containsKey(str)) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", str));
                    iVar.put(str, createFromAsset);
                    return createFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            }
            return iVar.getOrDefault(str, null);
        }
    }
}
