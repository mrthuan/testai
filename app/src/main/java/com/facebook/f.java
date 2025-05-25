package com.facebook;

import com.facebook.e;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: GraphRequest.kt */
/* loaded from: classes.dex */
public final class f implements e.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f9719a;

    public f(ArrayList<String> arrayList) {
        this.f9719a = arrayList;
    }

    @Override // com.facebook.e.d
    public final void a(String str, String value) {
        kotlin.jvm.internal.g.e(value, "value");
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(value, "UTF-8")}, 2));
        kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
        this.f9719a.add(format);
    }
}
