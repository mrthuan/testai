package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates.java */
/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<c0> f12422a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar e10 = e(null);
        e10.setTimeInMillis(j10);
        return c(e10).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        timeZone = TimeZone.getTimeZone("UTC");
        instanceForSkeleton.setTimeZone(timeZone);
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }

    public static Calendar c(Calendar calendar) {
        Calendar e10 = e(calendar);
        Calendar e11 = e(null);
        e11.set(e10.get(1), e10.get(2), e10.get(5));
        return e11;
    }

    public static Calendar d() {
        Calendar calendar;
        c0 c0Var = f12422a.get();
        if (c0Var == null) {
            c0Var = c0.c;
        }
        java.util.TimeZone timeZone = c0Var.f12421b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l10 = c0Var.f12420a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar e(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
