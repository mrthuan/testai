package yd;

import android.text.TextUtils;
import j3.h;

/* compiled from: ADRequest.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f32117a;

    /* renamed from: b  reason: collision with root package name */
    public final h f32118b;
    public final String c;

    public c(String str, String str2, h hVar) {
        if (!TextUtils.isEmpty(str2)) {
            this.f32117a = str;
            this.f32118b = hVar;
            this.c = str2;
            return;
        }
        throw new IllegalArgumentException("Please set ADRequestList.ORDER_NULL as param.");
    }
}
