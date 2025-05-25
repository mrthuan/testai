package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N5 extends Gb {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14526d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14527e;

    /* renamed from: f  reason: collision with root package name */
    public final A4 f14528f;

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference f14529g;

    /* renamed from: h  reason: collision with root package name */
    public short f14530h;

    /* renamed from: i  reason: collision with root package name */
    public String f14531i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N5(AbstractC1846w0 adUnit, R8 oAManager, byte[] response, long j10, A4 a42) {
        super(adUnit, (byte) 3);
        kotlin.jvm.internal.g.e(adUnit, "adUnit");
        kotlin.jvm.internal.g.e(oAManager, "oAManager");
        kotlin.jvm.internal.g.e(response, "response");
        this.f14526d = response;
        this.f14527e = j10;
        this.f14528f = a42;
        this.f14529g = new WeakReference(oAManager);
    }

    @Override // com.inmobi.media.Gb
    public final void a(Object obj) {
        C1577c0 c1577c0 = (C1577c0) obj;
        A4 a42 = this.f14528f;
        if (a42 != null) {
            ((B4) a42).c("LoadWithResponseWorker", "onComplete");
        }
        R8 r82 = (R8) this.f14529g.get();
        if (r82 == null) {
            A4 a43 = this.f14528f;
            if (a43 != null) {
                ((B4) a43).b("LoadWithResponseWorker", "oAManager is null");
            }
        } else if (c1577c0 == null) {
            short s4 = this.f14530h;
            if (s4 != 0) {
                HashMap z02 = kotlin.collections.q.z0(new Pair("errorCode", Short.valueOf(s4)));
                String str = this.f14531i;
                if (str != null) {
                    z02.put("reason", str);
                }
                r82.f14617a.b((Map<String, Object>) z02);
            }
            r82.f14617a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
            A4 a44 = this.f14528f;
            if (a44 != null) {
                ((B4) a44).b("LoadWithResponseWorker", "adSet null. fail with error code - " + ((int) this.f14530h));
            }
        } else {
            A4 a45 = this.f14528f;
            if (a45 != null) {
                ((B4) a45).c("LoadWithResponseWorker", "loading response");
            }
            r82.f14617a.b(c1577c0);
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void c() {
        AbstractC1846w0 abstractC1846w0;
        super.c();
        A4 a42 = this.f14528f;
        if (a42 != null) {
            ((B4) a42).b("LoadWithResponseWorker", "Encountered OOM");
        }
        R8 r82 = (R8) this.f14529g.get();
        if (r82 != null && (abstractC1846w0 = r82.f14617a) != null) {
            abstractC1846w0.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2146);
        }
    }

    @Override // com.inmobi.media.AbstractRunnableC1690k1
    public final void a() {
        A4 a42 = this.f14528f;
        if (a42 != null) {
            ((B4) a42).c("LoadWithResponseWorker", "execute task start");
        }
        R8 r82 = (R8) this.f14529g.get();
        if (r82 == null) {
            A4 a43 = this.f14528f;
            if (a43 != null) {
                ((B4) a43).b("LoadWithResponseWorker", "OAManager null. failing.");
            }
            this.f14530h = (short) 2142;
            b(null);
            return;
        }
        A4 a44 = this.f14528f;
        if (a44 != null) {
            ((B4) a44).a("LoadWithResponseWorker", "getting network response from byte array");
        }
        byte[] response = this.f14526d;
        kotlin.jvm.internal.g.e(response, "response");
        H8 h82 = new H8();
        if (response.length == 0) {
            h82.f14321b = new byte[0];
        } else {
            byte[] bArr = new byte[response.length];
            h82.f14321b = bArr;
            System.arraycopy(response, 0, bArr, 0, response.length);
        }
        D8 d82 = h82.c;
        if (d82 != null) {
            EnumC1849w3 enumC1849w3 = d82.f14201a;
            switch (enumC1849w3 == null ? -1 : E.f14208a[enumC1849w3.ordinal()]) {
                case 1:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    break;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    D8 d83 = h82.c;
                    String str = d83 != null ? d83.f14202b : null;
                    if (str != null) {
                        inMobiAdRequestStatus.setCustomMessage(str);
                        break;
                    }
                    break;
                case 3:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    break;
                case 9:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    break;
                default:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    break;
            }
        }
        try {
            A4 a45 = this.f14528f;
            if (a45 != null) {
                ((B4) a45).a("LoadWithResponseWorker", "start parsing response");
            }
            JSONObject jSONObject = new JSONObject(h82.a());
            long j10 = jSONObject.getLong("placementId");
            if (this.f14527e == j10) {
                A4 a46 = this.f14528f;
                if (a46 != null) {
                    ((B4) a46).e("placementID", String.valueOf(j10));
                }
                A4 a47 = this.f14528f;
                if (a47 != null) {
                    ((B4) a47).a("LoadWithResponseWorker", "placement id match - success");
                }
                C1633g0 p10 = r82.f14617a.p();
                p10.getClass();
                b(p10.a(jSONObject));
                return;
            }
            A4 a48 = this.f14528f;
            if (a48 != null) {
                ((B4) a48).b("LoadWithResponseWorker", "Placement Id of Request and response doesn't match");
            }
            this.f14530h = (short) 2144;
            throw new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.f14530h);
        } catch (C1845w e10) {
            this.f14530h = e10.f15522b;
            A4 a49 = this.f14528f;
            if (a49 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a49).a(e11, "Exception while parsing OAResponse", e10);
            }
            b(null);
        } catch (JSONException e12) {
            this.f14530h = (short) 2145;
            this.f14531i = e12.getMessage();
            A4 a410 = this.f14528f;
            if (a410 != null) {
                String e13 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e13, "<get-TAG>(...)");
                ((B4) a410).a(e13, "Exception while parsing OAResponse", e12);
            }
            b(null);
        }
    }
}
