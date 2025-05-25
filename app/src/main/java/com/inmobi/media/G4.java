package com.inmobi.media;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class G4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final B8 f14270a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1740na f14271b;

    public G4(Mb mb2, Pb request) {
        kotlin.jvm.internal.g.e(request, "request");
        this.f14270a = mb2;
        this.f14271b = request;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        while (true) {
            AbstractC1740na abstractC1740na = this.f14271b;
            if (i10 <= abstractC1740na.f15350y) {
                H8 b10 = abstractC1740na.b();
                if (this.f14271b.B.get()) {
                    return;
                }
                if (b10.b()) {
                    D8 d82 = b10.c;
                    if (i10 == this.f14271b.f15350y) {
                        B8 b82 = this.f14270a;
                        if (b82 != null) {
                            ((Mb) b82).a(d82);
                            return;
                        }
                        return;
                    }
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(b10.a());
                        if (kotlin.jvm.internal.g.a(JSONObject.class, JSONObject.class)) {
                            B8 b83 = this.f14270a;
                            if (b83 != null) {
                                ((Mb) b83).a(jSONObject);
                                return;
                            }
                            return;
                        }
                        Object a10 = new C1722m5().a(jSONObject, JSONObject.class);
                        B8 b84 = this.f14270a;
                        if (b84 != null) {
                            ((Mb) b84).a(a10);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        if (i10 == this.f14271b.f15350y) {
                            B8 b85 = this.f14270a;
                            if (b85 != null) {
                                EnumC1849w3 enumC1849w3 = EnumC1849w3.f15561l;
                                String message = e10.getMessage();
                                if (message == null) {
                                    message = "Exception while parsing the response";
                                }
                                ((Mb) b85).a(new D8(enumC1849w3, message));
                                return;
                            }
                            return;
                        }
                    }
                }
                try {
                    Thread.sleep(this.f14271b.f15351z * 1000);
                } catch (InterruptedException unused) {
                }
                if (this.f14271b.B.get()) {
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
