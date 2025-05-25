package o0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.android.gms.common.api.Api;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import n0.d;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class l {

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        int a(T t4);

        boolean b(T t4);
    }

    public l() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i10, a<T> aVar) {
        int i11;
        boolean z10;
        int i12;
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        T t4 = null;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t10 : tArr) {
            int abs = Math.abs(aVar.a(t10) - i11) * 2;
            if (aVar.b(t10) == z10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i14 = abs + i12;
            if (t4 == null || i13 > i14) {
                t4 = t10;
                i13 = i14;
            }
        }
        return t4;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, t0.m[] mVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d10 = m.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!m.c(d10, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(d10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d10 = m.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!m.b(d10, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(d10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public t0.m f(int i10, t0.m[] mVarArr) {
        return (t0.m) e(mVarArr, i10, new k());
    }
}
