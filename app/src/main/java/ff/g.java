package ff;

import gf.h;
import gf.k;
import java.util.HashMap;

/* compiled from: RestorationChannel.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17282a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f17283b;

    /* compiled from: RestorationChannel.java */
    /* loaded from: classes.dex */
    public class a implements h.b {
        public a() {
        }

        @Override // gf.h.b
        public final void a(wk.g gVar, gf.g gVar2) {
            String str = (String) gVar.f31333a;
            str.getClass();
            boolean equals = str.equals("get");
            g gVar3 = g.this;
            if (!equals) {
                if (!str.equals("put")) {
                    gVar2.b();
                    return;
                }
                gVar3.f17283b = (byte[]) gVar.f31334b;
                gVar2.c(null);
                return;
            }
            gVar3.getClass();
            if (!gVar3.f17282a) {
                byte[] bArr = gVar3.f17283b;
                HashMap hashMap = new HashMap();
                hashMap.put("enabled", Boolean.TRUE);
                hashMap.put("data", bArr);
                gVar2.c(hashMap);
            }
        }
    }

    public g(we.a aVar) {
        gf.h hVar = new gf.h(aVar, "flutter/restoration", k.f17803b);
        a aVar2 = new a();
        this.f17282a = false;
        hVar.b(aVar2);
    }
}
