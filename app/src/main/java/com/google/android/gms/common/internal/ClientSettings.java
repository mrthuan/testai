package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ClientSettings {

    /* renamed from: a  reason: collision with root package name */
    public final Account f11181a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f11182b;
    public final Set c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f11183d;

    /* renamed from: e  reason: collision with root package name */
    public final View f11184e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11185f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11186g;

    /* renamed from: h  reason: collision with root package name */
    public final SignInOptions f11187h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f11188i;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Account f11189a;

        /* renamed from: b  reason: collision with root package name */
        public y.d f11190b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f11191d;

        /* renamed from: e  reason: collision with root package name */
        public final SignInOptions f11192e = SignInOptions.f11946a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Map] */
    public ClientSettings(Account account, Set set, y.b bVar, String str, String str2, SignInOptions signInOptions) {
        Set unmodifiableSet;
        this.f11181a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f11182b = unmodifiableSet;
        y.b emptyMap = bVar == null ? Collections.emptyMap() : bVar;
        this.f11183d = emptyMap;
        this.f11184e = null;
        this.f11185f = str;
        this.f11186g = str2;
        this.f11187h = signInOptions == null ? SignInOptions.f11946a : signInOptions;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (zab zabVar : emptyMap.values()) {
            zabVar.getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
