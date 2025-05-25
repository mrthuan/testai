package com.google.android.gms.measurement.internal;

import a8.l0;
import android.accounts.AccountManager;
import androidx.activity.f;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzaq extends l0 {
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public String f11536d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f11537e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f11538f;

    /* renamed from: g  reason: collision with root package name */
    public long f11539g;

    @Override // a8.l0
    public final boolean n() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f11536d = f.m(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long q() {
        m();
        return this.f11539g;
    }

    public final long r() {
        o();
        return this.c;
    }

    public final String s() {
        o();
        return this.f11536d;
    }
}
