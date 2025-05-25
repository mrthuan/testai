package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter.java */
/* loaded from: classes.dex */
public final class j extends t<Date> {

    /* renamed from: a  reason: collision with root package name */
    public static final u f7229a = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.j.1
        @Override // com.bykv.vk.openvk.preload.a.u
        public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.f7360b == Date.class) {
                return new j();
            }
            return null;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final DateFormat f7230b = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.t
    /* renamed from: b */
    public synchronized Date a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.k();
            return null;
        }
        try {
            return new Date(this.f7230b.parse(aVar.i()).getTime());
        } catch (ParseException e10) {
            throw new r(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.t
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, Date date) {
        cVar.b(date == null ? null : this.f7230b.format((java.util.Date) date));
    }
}
