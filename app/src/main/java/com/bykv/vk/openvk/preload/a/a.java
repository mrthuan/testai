package com.bykv.vk.openvk.preload.a;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: DefaultDateTypeAdapter.java */
/* loaded from: classes.dex */
public final class a extends t<Date> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Date> f7185a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f7186b;

    public a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f7186b = arrayList;
        this.f7185a = a(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Date date) {
        Date date2 = date;
        if (date2 == null) {
            cVar.e();
            return;
        }
        synchronized (this.f7186b) {
            cVar.b(this.f7186b.get(0).format(date2));
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.f7186b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public a(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f7186b = arrayList;
        this.f7185a = a(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (com.bykv.vk.openvk.preload.a.b.e.b()) {
            arrayList.add(com.bykv.vk.openvk.preload.a.b.j.a(i10, i11));
        }
    }

    private static Class<? extends Date> a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    private Date a(String str) {
        synchronized (this.f7186b) {
            for (DateFormat dateFormat : this.f7186b) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return com.bykv.vk.openvk.preload.a.b.a.a.a.a(str, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new r(str, e10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final /* synthetic */ Date a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.k();
            return null;
        }
        Date a10 = a(aVar.i());
        Class<? extends Date> cls = this.f7185a;
        if (cls == Date.class) {
            return a10;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a10.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a10.getTime());
        }
        throw new AssertionError();
    }
}
