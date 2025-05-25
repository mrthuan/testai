package o0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import n0.d;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f22652a;

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<?> f22653b;
    public static final Method c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f22654d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f22653b = constructor;
        f22652a = cls;
        c = method2;
        f22654d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // o0.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        d.C0296d[] c0296dArr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f22653b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0296d c0296d : cVar.f22280a) {
            int i11 = c0296d.f22285f;
            File d10 = m.d(context);
            if (d10 != null) {
                try {
                    if (m.b(d10, resources, i11)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(d10);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, c0296d.f22284e, c0296d.f22282b, c0296d.c)) {
                            return null;
                        }
                    }
                } finally {
                    d10.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f22652a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f22654d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // o0.l
    public final Typeface b(Context context, t0.m[] mVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f22653b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        y.i iVar = new y.i();
        for (t0.m mVar : mVarArr) {
            Uri uri = mVar.f29896a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = m.e(context, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, mVar.f29897b, mVar.c, mVar.f29898d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f22652a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f22654d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}
