package o0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n0.d;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f22648a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<?> f22649b = null;
    public static Method c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f22650d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f22651e = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        h();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f22651e) {
            return;
        }
        f22651e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f22649b = constructor;
        f22648a = cls;
        c = method2;
        f22650d = method;
    }

    @Override // o0.l
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        d.C0296d[] c0296dArr;
        h();
        try {
            Object newInstance = f22649b.newInstance(new Object[0]);
            for (d.C0296d c0296d : cVar.f22280a) {
                File d10 = m.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!m.b(d10, resources, c0296d.f22285f)) {
                        return null;
                    }
                    if (!g(newInstance, d10.getPath(), c0296d.f22282b, c0296d.c)) {
                        return null;
                    }
                    d10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f22648a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f22650d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // o0.l
    public Typeface b(Context context, t0.m[] mVarArr, int i10) {
        File file;
        String readlink;
        if (mVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i10, mVarArr).f29896a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c10 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c10;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c102 = c(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return c102;
        } catch (IOException unused2) {
            return null;
        }
    }
}
