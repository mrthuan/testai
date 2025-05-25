package com.facebook.internal;

import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;

/* compiled from: Validate.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9824a = 0;

    static {
        new q();
    }

    public static final void a(String arg, String str) {
        boolean z10;
        kotlin.jvm.internal.g.e(arg, "arg");
        if (arg.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(a6.h.d("Argument '", str, "' cannot be empty").toString());
    }

    public static final void b(Collection container) {
        kotlin.jvm.internal.g.e(container, "container");
        for (Object obj : container) {
            if (obj == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (!container.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
    }

    public static final void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(a6.h.d("Argument '", str, "' cannot be null"));
    }

    public static final void d(String str, String str2) {
        boolean z10;
        boolean z11 = false;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(a6.h.d("Argument '", str2, "' cannot be null or empty").toString());
    }

    public static final void e() {
        if (com.facebook.d.g()) {
            return;
        }
        throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
    }
}
