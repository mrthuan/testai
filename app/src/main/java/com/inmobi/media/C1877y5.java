package com.inmobi.media;

import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.y5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1877y5 implements InterfaceC1670i9 {

    /* renamed from: a  reason: collision with root package name */
    public CrashConfig f15675a;

    /* renamed from: b  reason: collision with root package name */
    public A3 f15676b;
    public final S4 c;

    /* renamed from: d  reason: collision with root package name */
    public final C1864x5 f15677d;

    public C1877y5(CrashConfig crashConfig) {
        kotlin.jvm.internal.g.e(crashConfig, "crashConfig");
        this.f15675a = crashConfig;
        this.c = new S4(crashConfig);
        this.f15677d = new C1864x5(this);
        Vb.f14759a.execute(new androidx.activity.k(this, 12));
    }

    public static final void a(C1877y5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15676b = new A3(AbstractC1882ya.c(), this$0, this$0.f15675a.getEventConfig(), null);
    }

    public static final void c(C1877y5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.b();
    }

    public final void b(R4 incident) {
        kotlin.jvm.internal.g.e(incident, "incident");
        CrashConfig.ANRConfig aNRConfig = this.f15675a.getANRConfig();
        if (Vb.a(incident)) {
            if ((incident instanceof H0) && C1566b3.f14952a.E() && aNRConfig.getAppExitReason().getUseForReporting() && this.c.f14634d.a()) {
                incident.f15672a = "ANREvent";
                a(incident);
            } else if ((incident instanceof xc) && aNRConfig.getWatchdog().getUseForReporting() && this.c.c.a()) {
                a(incident);
            } else if (!(incident instanceof I2)) {
                return;
            } else {
                if (this.f15675a.getCrashConfig().getEnabled() && this.c.f14632a.a()) {
                    a(incident);
                }
            }
            Vb.f14759a.execute(new androidx.appcompat.widget.z0(this, 13));
        }
    }

    public final void c() {
        Vb.f14759a.execute(new androidx.activity.i(this, 16));
    }

    public final void a(R4 r4) {
        O4 c = AbstractC1882ya.c();
        long eventTTL = this.f15675a.getEventTTL();
        c.getClass();
        c.a("ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (eventTTL * 1000))});
        O4 c10 = AbstractC1882ya.c();
        c10.getClass();
        int a10 = (AbstractC1860x1.a((AbstractC1860x1) c10) + 1) - this.f15675a.getMaxEventsToPersist();
        if (a10 > 0) {
            AbstractC1882ya.c().a(a10);
        }
        AbstractC1882ya.c().a(r4);
    }

    public final void a(J1 incident) {
        kotlin.jvm.internal.g.e(incident, "incident");
        if (this.f15675a.getCatchConfig().getEnabled() && this.c.f14633b.a()) {
            Vb.f14759a.execute(new l.r(15, this, incident));
        }
    }

    public static final void a(C1877y5 this$0, J1 incident) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(incident, "$incident");
        this$0.a((R4) incident);
        this$0.b();
    }

    @Override // com.inmobi.media.InterfaceC1670i9
    public final C1888z3 a() {
        int a10;
        String str;
        int p10 = C1566b3.f14952a.p();
        int i10 = 1;
        if (p10 == 0) {
            a10 = this.f15675a.getMobileConfig().a();
        } else if (p10 != 1) {
            a10 = this.f15675a.getMobileConfig().a();
        } else {
            a10 = this.f15675a.getWifiConfig().a();
        }
        ArrayList b10 = AbstractC1882ya.c().b(a10);
        if (!b10.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((R4) it.next()).c));
            }
            try {
                HashMap hashMap = new HashMap(C1566b3.f14952a.a(false));
                hashMap.put("im-accid", Ha.b());
                hashMap.put("version", "2.0.0");
                hashMap.put("component", "crash");
                hashMap.put("mk-version", Ia.a());
                hashMap.putAll(I0.f14337e);
                JSONObject jSONObject = new JSONObject(hashMap);
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = b10.iterator();
                while (it2.hasNext()) {
                    R4 r4 = (R4) it2.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", r4.f14609e);
                    jSONObject2.put("eventType", r4.f15672a);
                    String a11 = r4.a();
                    int length = a11.length() - i10;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = kotlin.jvm.internal.g.f(a11.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (a11.subSequence(i11, length + 1).toString().length() > 0) {
                        jSONObject2.put("crash_report", r4.a());
                    }
                    jSONObject2.put("ts", r4.f15673b);
                    jSONArray.put(jSONObject2);
                    i10 = 1;
                }
                jSONObject.put("crash", jSONArray);
                str = jSONObject.toString();
            } catch (JSONException unused) {
                str = null;
            }
            if (str != null) {
                return new C1888z3(arrayList, str);
            }
            return null;
        }
        return null;
    }

    public static final void b(C1877y5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        O4 c = AbstractC1882ya.c();
        c.getClass();
        if (AbstractC1860x1.a((AbstractC1860x1) c) > 0) {
            this$0.b();
        }
    }

    public final void b() {
        tf.d dVar;
        C1862x3 eventConfig = this.f15675a.getEventConfig();
        eventConfig.f15632k = this.f15675a.getUrl();
        A3 a32 = this.f15676b;
        if (a32 != null) {
            a32.f14123i = eventConfig;
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            this.f15676b = new A3(AbstractC1882ya.c(), this, eventConfig, null);
        }
        A3 a33 = this.f15676b;
        if (a33 != null) {
            C1862x3 c1862x3 = a33.f14123i;
            if (a33.f14120f.get() || c1862x3 == null) {
                return;
            }
            a33.a(c1862x3.c, false);
        }
    }
}
