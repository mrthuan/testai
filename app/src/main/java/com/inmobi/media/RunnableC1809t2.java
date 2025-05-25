package com.inmobi.media;

import android.os.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.t2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1809t2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1796s2 f15457a;

    /* renamed from: b  reason: collision with root package name */
    public final C1822u2 f15458b;
    public final C1822u2 c;

    public RunnableC1809t2(InterfaceC1796s2 callback, C1822u2 request, C1822u2 c1822u2) {
        kotlin.jvm.internal.g.e(callback, "callback");
        kotlin.jvm.internal.g.e(request, "request");
        this.f15457a = callback;
        this.f15458b = request;
        this.c = c1822u2;
    }

    public final boolean a(C1822u2 c1822u2, int i10, LinkedHashMap linkedHashMap) {
        if (i10 > c1822u2.f15488z) {
            for (Map.Entry entry : c1822u2.f15487y.entrySet()) {
                C1848w2 c1848w2 = (C1848w2) linkedHashMap.get((String) entry.getKey());
                if (c1848w2 != null) {
                    HandlerC1649h2 handlerC1649h2 = (HandlerC1649h2) this.f15457a;
                    handlerC1649h2.getClass();
                    Message obtain = Message.obtain();
                    obtain.what = 6;
                    obtain.obj = c1848w2;
                    handlerC1649h2.sendMessage(obtain);
                }
            }
            return true;
        }
        Thread.sleep(c1822u2.A * 1000);
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        C1822u2 c1822u2;
        int i10 = 0;
        int i11 = 0;
        do {
            C1822u2 c1822u22 = this.f15458b;
            if (i11 > c1822u22.f15488z) {
                break;
            }
            C1861x2 c1861x2 = new C1861x2(c1822u22, c1822u22.b());
            linkedHashMap = c1861x2.c;
            if (c1861x2.a() && (c1822u2 = this.c) != null) {
                while (i10 <= c1822u2.f15488z) {
                    C1861x2 c1861x22 = new C1861x2(c1822u2, c1822u2.b());
                    LinkedHashMap linkedHashMap2 = c1861x22.c;
                    if (!c1861x22.a()) {
                        a(c1822u2, linkedHashMap2);
                        if (!(!c1822u2.f15487y.isEmpty())) {
                            break;
                        }
                        i10++;
                        if (a(c1822u2, i10, linkedHashMap2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                InterfaceC1796s2 interfaceC1796s2 = this.f15457a;
                String accountId = c1822u2.B;
                HandlerC1649h2 handlerC1649h2 = (HandlerC1649h2) interfaceC1796s2;
                handlerC1649h2.getClass();
                kotlin.jvm.internal.g.e(accountId, "accountId");
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = accountId;
                handlerC1649h2.sendMessage(obtain);
                return;
            }
            a(this.f15458b, linkedHashMap);
            if (!(!this.f15458b.f15487y.isEmpty())) {
                break;
            }
            i11++;
        } while (!a(this.f15458b, i11, linkedHashMap));
        InterfaceC1796s2 interfaceC1796s22 = this.f15457a;
        String accountId2 = this.f15458b.B;
        HandlerC1649h2 handlerC1649h22 = (HandlerC1649h2) interfaceC1796s22;
        handlerC1649h22.getClass();
        kotlin.jvm.internal.g.e(accountId2, "accountId");
        Message obtain2 = Message.obtain();
        obtain2.what = 4;
        obtain2.obj = accountId2;
        handlerC1649h22.sendMessage(obtain2);
    }

    public final void a(C1822u2 c1822u2, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C1848w2 c1848w2 = (C1848w2) entry.getValue();
            String configType = (String) entry.getKey();
            if (c1848w2.c == null) {
                HandlerC1649h2 handlerC1649h2 = (HandlerC1649h2) this.f15457a;
                handlerC1649h2.getClass();
                Message obtain = Message.obtain();
                obtain.what = 6;
                obtain.obj = c1848w2;
                handlerC1649h2.sendMessage(obtain);
                c1822u2.getClass();
                kotlin.jvm.internal.g.e(configType, "configType");
                c1822u2.f15487y.remove(configType);
            }
        }
    }
}
