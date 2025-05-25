package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Regex;

/* compiled from: UserDataStore.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences f9667b;

    /* renamed from: a  reason: collision with root package name */
    public static final u f9666a = new u();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f9668d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f9669e = new ConcurrentHashMap<>();

    public final HashMap a() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = u5.d.f30223d;
            HashSet hashSet = new HashSet();
            Iterator it = u5.d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((u5.d) it.next()).b());
            }
            ConcurrentHashMap<String, String> concurrentHashMap = f9669e;
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final synchronized void b() {
        if (k6.a.b(this)) {
            return;
        }
        AtomicBoolean atomicBoolean = c;
        if (atomicBoolean.get()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a());
        kotlin.jvm.internal.g.d(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
        f9667b = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
        if (string == null) {
            string = "";
        }
        SharedPreferences sharedPreferences = f9667b;
        if (sharedPreferences != null) {
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f9668d.putAll(com.facebook.internal.p.x(string));
            f9669e.putAll(com.facebook.internal.p.x(string2));
            atomicBoolean.set(true);
            return;
        }
        kotlin.jvm.internal.g.i("sharedPreferences");
        throw null;
    }

    public final String c(String str, String str2) {
        boolean z10;
        String str3;
        int i10;
        boolean z11;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                if (!z12) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (kotlin.jvm.internal.g.f(str2.charAt(i10), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String lowerCase = str2.subSequence(i11, length + 1).toString().toLowerCase();
            kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase()");
            if (kotlin.jvm.internal.g.a("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return "";
                }
                return lowerCase;
            } else if (kotlin.jvm.internal.g.a("ph", str)) {
                return new Regex("[^0-9]").replace(lowerCase, "");
            } else {
                if (kotlin.jvm.internal.g.a("ge", str)) {
                    if (lowerCase.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        str3 = "";
                    } else {
                        str3 = lowerCase.substring(0, 1);
                        kotlin.jvm.internal.g.d(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    if (!kotlin.jvm.internal.g.a("f", str3) && !kotlin.jvm.internal.g.a("m", str3)) {
                        return "";
                    }
                    return str3;
                }
                return lowerCase;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
