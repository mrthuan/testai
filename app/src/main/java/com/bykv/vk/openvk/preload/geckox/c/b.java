package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.a.b.a.n;
import com.bykv.vk.openvk.preload.a.f;
import com.bykv.vk.openvk.preload.a.g;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/* compiled from: GsonUtil.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f7554b = new b();

    /* renamed from: a  reason: collision with root package name */
    public f f7555a;

    private b() {
        com.bykv.vk.openvk.preload.a.a aVar;
        com.bykv.vk.openvk.preload.a.a aVar2;
        com.bykv.vk.openvk.preload.a.a aVar3;
        g gVar = new g();
        gVar.a(Boolean.class, new a());
        gVar.a(Boolean.TYPE, new a());
        ArrayList arrayList = new ArrayList(gVar.f7432f.size() + gVar.f7431e.size() + 3);
        arrayList.addAll(gVar.f7431e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(gVar.f7432f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = gVar.f7434h;
        int i10 = gVar.f7435i;
        int i11 = gVar.f7436j;
        if (str != null && !"".equals(str.trim())) {
            aVar = new com.bykv.vk.openvk.preload.a.a(Date.class, str);
            aVar2 = new com.bykv.vk.openvk.preload.a.a(Timestamp.class, str);
            aVar3 = new com.bykv.vk.openvk.preload.a.a(java.sql.Date.class, str);
        } else {
            if (i10 != 2 && i11 != 2) {
                com.bykv.vk.openvk.preload.a.a aVar4 = new com.bykv.vk.openvk.preload.a.a(Date.class, i10, i11);
                com.bykv.vk.openvk.preload.a.a aVar5 = new com.bykv.vk.openvk.preload.a.a(Timestamp.class, i10, i11);
                com.bykv.vk.openvk.preload.a.a aVar6 = new com.bykv.vk.openvk.preload.a.a(java.sql.Date.class, i10, i11);
                aVar = aVar4;
                aVar2 = aVar5;
                aVar3 = aVar6;
            }
            this.f7555a = new f(gVar.f7428a, gVar.c, gVar.f7430d, gVar.f7433g, gVar.f7437k, gVar.f7441o, gVar.f7439m, gVar.f7440n, gVar.f7442p, gVar.f7438l, gVar.f7429b, gVar.f7434h, gVar.f7435i, gVar.f7436j, gVar.f7431e, gVar.f7432f, arrayList);
        }
        arrayList.add(n.a(Date.class, aVar));
        arrayList.add(n.a(Timestamp.class, aVar2));
        arrayList.add(n.a(java.sql.Date.class, aVar3));
        this.f7555a = new f(gVar.f7428a, gVar.c, gVar.f7430d, gVar.f7433g, gVar.f7437k, gVar.f7441o, gVar.f7439m, gVar.f7440n, gVar.f7442p, gVar.f7438l, gVar.f7429b, gVar.f7434h, gVar.f7435i, gVar.f7436j, gVar.f7431e, gVar.f7432f, arrayList);
    }

    public static b a() {
        return f7554b;
    }
}
