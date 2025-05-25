package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.inmobi.media.k8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1697k8 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final W6 f15267a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f15268b;
    public final WeakReference c;

    public C1697k8(Context context, ImageView imageView, W6 imageAsset) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(imageView, "imageView");
        kotlin.jvm.internal.g.e(imageAsset, "imageAsset");
        this.f15267a = imageAsset;
        this.f15268b = new WeakReference(context);
        this.c = new WeakReference(imageView);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        String str2;
        int i10;
        boolean z10;
        HashMap hashMap = C1867x8.c;
        Objects.toString(method);
        if (method != null) {
            str = method.getName();
        } else {
            str = null;
        }
        if (kotlin.text.j.G("onError", str, true)) {
            Context context = (Context) this.f15268b.get();
            ImageView imageView = (ImageView) this.c.get();
            W6 w62 = this.f15267a;
            if (context != null && imageView != null) {
                String str3 = w62.f14800p;
                if (kotlin.text.j.G("cross_button", w62.f14787b, true)) {
                    if (str3 != null) {
                        int length = str3.length() - 1;
                        int i11 = 0;
                        boolean z11 = false;
                        while (i11 <= length) {
                            if (!z11) {
                                i10 = i11;
                            } else {
                                i10 = length;
                            }
                            if (kotlin.jvm.internal.g.f(str3.charAt(i10), 32) <= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z11) {
                                if (!z10) {
                                    z11 = true;
                                } else {
                                    i11++;
                                }
                            } else if (!z10) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        str2 = C6.a(length, 1, str3, i11);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null || str2.length() == 0) {
                        C1655h8.a(context, imageView);
                    }
                }
            }
            w62.a("error", a6.h.h("[ERRORCODE]", "603"), (F6) null, (A4) null);
        }
        return null;
    }
}
