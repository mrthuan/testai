package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* renamed from: com.inmobi.media.l9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1712l9 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile Picasso f15291b;

    /* renamed from: a  reason: collision with root package name */
    public static final C1712l9 f15290a = new C1712l9();
    public static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f15292d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public static final C1698k9 f15293e = new C1698k9();

    public static final /* synthetic */ String d() {
        return "l9";
    }

    public static final WeakReference a(C1712l9 c1712l9, Context context) {
        c1712l9.getClass();
        int size = f15292d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = f15292d;
            Context context2 = (Context) ((WeakReference) arrayList.get(i10)).get();
            if (context2 != null && kotlin.jvm.internal.g.a(context2, context)) {
                return (WeakReference) arrayList.get(i10);
            }
        }
        return null;
    }

    public final Picasso a(Context context) {
        WeakReference weakReference;
        Picasso picasso;
        kotlin.jvm.internal.g.e(context, "context");
        synchronized (c) {
            int size = f15292d.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = f15292d;
                Context context2 = (Context) ((WeakReference) arrayList.get(i10)).get();
                if (context2 != null && kotlin.jvm.internal.g.a(context2, context)) {
                    weakReference = (WeakReference) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            if (weakReference == null) {
                f15292d.add(new WeakReference(context));
            }
            picasso = f15291b;
            if (picasso == null) {
                picasso = new Picasso.Builder(context).build();
                f15291b = picasso;
                Ha.a(context, f15293e);
            }
        }
        kotlin.jvm.internal.g.d(picasso, "synchronized(...)");
        return picasso;
    }

    public final Object a(InvocationHandler connectionCallbackHandler) {
        kotlin.jvm.internal.g.e(connectionCallbackHandler, "connectionCallbackHandler");
        try {
            return Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, connectionCallbackHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
