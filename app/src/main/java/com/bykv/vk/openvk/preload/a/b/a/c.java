package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: DateTypeAdapter.java */
/* loaded from: classes.dex */
public final class c extends t<Date> {

    /* renamed from: a  reason: collision with root package name */
    public static final u f7193a = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.c.1
        @Override // com.bykv.vk.openvk.preload.a.u
        public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.f7360b == Date.class) {
                return new c();
            }
            return null;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f7194b;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f7194b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.bykv.vk.openvk.preload.a.b.e.b()) {
            arrayList.add(com.bykv.vk.openvk.preload.a.b.j.a(2, 2));
        }
    }

    private synchronized Date a(String str) {
        for (DateFormat dateFormat : this.f7194b) {
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.t
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, Date date) {
        if (date == null) {
            cVar.e();
        } else {
            cVar.b(this.f7194b.get(0).format(date));
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final /* synthetic */ Date a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.k();
            return null;
        }
        return a(aVar.i());
    }
}
