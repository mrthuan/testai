package o0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n0.d;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f22655f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f22656g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f22657h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f22658i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f22659j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f22660k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f22661l;

    public h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = l(cls);
            method3 = m(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = n(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f22655f = cls;
        this.f22656g = constructor;
        this.f22657h = method2;
        this.f22658i = method3;
        this.f22659j = method4;
        this.f22660k = method;
        this.f22661l = method5;
    }

    public static Method l(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // o0.f, o0.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        boolean z10;
        Object obj;
        d.C0296d[] c0296dArr;
        if (this.f22657h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return super.a(context, cVar, resources, i10);
        }
        try {
            obj = this.f22656g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0296d c0296d : cVar.f22280a) {
            if (!i(context, obj, c0296d.f22281a, c0296d.f22284e, c0296d.f22282b, c0296d.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0296d.f22283d))) {
                try {
                    this.f22660k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    @Override // o0.f, o0.l
    public final Typeface b(Context context, t0.m[] mVarArr, int i10) {
        boolean z10;
        Object obj;
        Typeface j10;
        boolean z11;
        if (mVarArr.length < 1) {
            return null;
        }
        if (this.f22657h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            t0.m f10 = f(i10, mVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.f29896a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.c).setItalic(f10.f29898d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (t0.m mVar : mVarArr) {
            if (mVar.f29899e == 0) {
                Uri uri = mVar.f29896a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, m.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f22656g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = mVarArr.length;
        int i11 = 0;
        boolean z12 = false;
        while (true) {
            Method method = this.f22660k;
            if (i11 < length) {
                t0.m mVar2 = mVarArr[i11];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f29896a);
                if (byteBuffer != null) {
                    try {
                        z11 = ((Boolean) this.f22658i.invoke(obj, byteBuffer, Integer.valueOf(mVar2.f29897b), null, Integer.valueOf(mVar2.c), Integer.valueOf(mVar2.f29898d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z11 = false;
                    }
                    if (!z11) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z12 = true;
                }
                i11++;
                z12 = z12;
            } else if (!z12) {
                try {
                    method.invoke(obj, new Object[0]);
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                    return null;
                }
            } else if (!k(obj) || (j10 = j(obj)) == null) {
                return null;
            } else {
                return Typeface.create(j10, i10);
            }
        }
    }

    @Override // o0.l
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        boolean z10;
        Object obj;
        if (this.f22657h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f22656g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f22660k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f22657h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f22655f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f22661l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f22659j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method n(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
