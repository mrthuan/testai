package com.google.android.gms.signin;

import b8.a;
import b8.b;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes2.dex */
public final class zad {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11959a;

    /* renamed from: b  reason: collision with root package name */
    public static final Api f11960b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        new Api.ClientKey();
        a aVar = new a();
        f11959a = aVar;
        new b();
        new Scope(1, "profile");
        new Scope(1, "email");
        f11960b = new Api("SignIn.API", aVar, clientKey);
    }
}
