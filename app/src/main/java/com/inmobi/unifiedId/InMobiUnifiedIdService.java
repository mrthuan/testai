package com.inmobi.unifiedId;

import android.content.Context;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import com.facebook.appevents.a;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC1773q4;
import com.inmobi.media.AbstractC1838v5;
import com.inmobi.media.AbstractC1855w9;
import com.inmobi.media.C1616eb;
import com.inmobi.media.C1732n2;
import com.inmobi.media.C1851w5;
import com.inmobi.media.EnumC1686jb;
import com.inmobi.media.Ha;
import com.inmobi.media.Hb;
import com.inmobi.media.Lb;
import com.inmobi.media.N4;
import com.inmobi.media.Nb;
import com.inmobi.media.S3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import tf.d;

/* loaded from: classes2.dex */
public final class InMobiUnifiedIdService {
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15716a = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.inmobi.unifiedId.InMobiUnifiedIdInterface r14) {
        /*
            org.json.JSONObject r0 = com.inmobi.media.N4.b()
            r1 = 0
            java.lang.String r2 = "ufids"
            if (r0 != 0) goto Lb
            goto L6d
        Lb:
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L6d
            if (r3 == 0) goto L16
            org.json.JSONArray r3 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L6d
            goto L17
        L16:
            r3 = r1
        L17:
            if (r3 == 0) goto L6d
            int r3 = r3.length()
            if (r3 != 0) goto L20
            goto L6d
        L20:
            r3 = 1
            boolean r4 = r0.has(r2)     // Catch: org.json.JSONException -> L4f
            if (r4 == 0) goto L4d
            org.json.JSONArray r4 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L4f
            int r5 = r4.length()     // Catch: org.json.JSONException -> L4f
            r6 = 0
            r8 = r3
            r7 = r6
        L32:
            if (r7 >= r5) goto L53
            org.json.JSONObject r9 = r4.getJSONObject(r7)     // Catch: org.json.JSONException -> L50
            long r10 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L50
            java.lang.String r12 = "expiry"
            long r12 = r9.getLong(r12)     // Catch: org.json.JSONException -> L50
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 > 0) goto L48
            r9 = r3
            goto L49
        L48:
            r9 = r6
        L49:
            r8 = r8 & r9
            int r7 = r7 + 1
            goto L32
        L4d:
            r8 = r3
            goto L53
        L4f:
            r8 = r3
        L50:
            java.util.Objects.toString(r0)
        L53:
            r3 = r3 ^ r8
            if (r3 == 0) goto L6d
            org.json.JSONObject r0 = com.inmobi.media.Lb.f14437a
            if (r14 == 0) goto L5f
            java.util.LinkedHashSet r0 = com.inmobi.media.Lb.f14438b
            r0.add(r14)
        L5f:
            boolean r0 = com.inmobi.media.Lb.b()
            if (r0 == 0) goto L69
            java.util.Objects.toString(r14)
            goto Lb0
        L69:
            com.inmobi.media.Lb.d()
            goto Lb0
        L6d:
            if (r14 == 0) goto Lb0
            if (r0 != 0) goto L72
            goto L8b
        L72:
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L8b
            if (r3 == 0) goto L7d
            org.json.JSONArray r2 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L8b
            goto L7e
        L7d:
            r2 = r1
        L7e:
            if (r2 == 0) goto L8b
            int r2 = r2.length()
            if (r2 != 0) goto L87
            goto L8b
        L87:
            com.inmobi.media.Nb.a(r14, r0, r1)
            goto Lb0
        L8b:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.unifiedId.InMobiUnifiedIdService.f15716a
            boolean r0 = r0.get()
            if (r0 == 0) goto La6
            java.util.LinkedHashSet r0 = com.inmobi.media.Lb.f14438b
            r0.add(r14)
            boolean r0 = com.inmobi.media.Lb.b()
            if (r0 == 0) goto La2
            java.util.Objects.toString(r14)
            goto Lb0
        La2:
            com.inmobi.media.Lb.d()
            goto Lb0
        La6:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r2 = "Push api needs to called prior to fetch"
            r0.<init>(r2)
            com.inmobi.media.Nb.a(r14, r1, r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.a(com.inmobi.unifiedId.InMobiUnifiedIdInterface):void");
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface);
    }

    public static final void fetchUnifiedIds(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (Ha.q()) {
            Ha.a(new z0(inMobiUnifiedIdInterface, 14));
            return;
        }
        throw new SdkNotInitializedException("InMobiUnifiedIdService");
    }

    public static final void fetchUnifiedIdsInternal$media_release(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        boolean z10;
        HashMap hashMap = new HashMap();
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("FetchApiInvoked", hashMap, EnumC1686jb.f15238a);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        boolean z11 = true;
        boolean z12 = !((SignalsConfig) AbstractC1773q4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (z12) {
            reset();
        }
        if (z12) {
            Nb.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
            return;
        }
        Boolean c = Hb.f14332a.c();
        if (c != null) {
            z11 = c.booleanValue();
        }
        if (z11) {
            reset();
        }
        if (z11) {
            Nb.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
            return;
        }
        Boolean bool = AbstractC1855w9.f15587b;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            Context d10 = Ha.d();
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1855w9.f15587b = Boolean.valueOf(AbstractC1838v5.a(d10, "user_info_store").f15579a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC1855w9.f15587b;
            if (bool2 != null) {
                z10 = bool2.booleanValue();
            } else {
                z10 = false;
            }
        }
        if (z10) {
            Nb.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
            return;
        }
        synchronized (Lb.class) {
            if (Lb.b()) {
                if (inMobiUnifiedIdInterface != null) {
                    Lb.f14438b.add(inMobiUnifiedIdInterface);
                }
                if (Lb.b()) {
                    Objects.toString(inMobiUnifiedIdInterface);
                } else {
                    Lb.d();
                }
            } else {
                a(inMobiUnifiedIdInterface);
            }
            d dVar = d.f30009a;
        }
    }

    public static final void push(InMobiUserDataModel inMobiUserDataModel) {
        Objects.toString(inMobiUserDataModel);
        if (Ha.q()) {
            Ha.a(new y0(inMobiUserDataModel, 14));
            return;
        }
        throw new SdkNotInitializedException("InMobiUnifiedIdService");
    }

    public static final void reset() {
        if (Ha.q()) {
            Ha.a(new a(7));
            return;
        }
        throw new SdkNotInitializedException("InMobiUnifiedIdService");
    }

    public final AtomicBoolean isPushCalled() {
        return f15716a;
    }

    public static /* synthetic */ void isPushCalled$annotations() {
    }

    public static final void a(InMobiUserDataModel inMobiUserDataModel) {
        boolean booleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        Objects.toString(inMobiUserDataModel);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        boolean z10 = !((SignalsConfig) AbstractC1773q4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (z10) {
            reset();
        }
        if (z10) {
            return;
        }
        Boolean c = Hb.f14332a.c();
        boolean booleanValue2 = c != null ? c.booleanValue() : true;
        if (booleanValue2) {
            reset();
        }
        if (booleanValue2) {
            return;
        }
        Boolean bool = AbstractC1855w9.f15587b;
        boolean z11 = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context d10 = Ha.d();
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                AbstractC1855w9.f15587b = Boolean.valueOf(AbstractC1838v5.a(d10, "user_info_store").f15579a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC1855w9.f15587b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (booleanValue) {
            return;
        }
        if (inMobiUserDataModel == null && S3.f14631a == null) {
            z11 = true;
        } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = S3.f14631a) != null) {
            z11 = g.a(inMobiUserDataModel, inMobiUserDataModel2);
        }
        if (z11 && f15716a.get()) {
            return;
        }
        synchronized (S3.class) {
            Objects.toString(S3.f14631a);
            Objects.toString(inMobiUserDataModel);
            S3.f14631a = inMobiUserDataModel;
        }
        f15716a.set(true);
        Lb.c();
    }

    public static final void a() {
        f15716a.set(false);
        synchronized (S3.class) {
            Objects.toString(S3.f14631a);
            S3.f14631a = null;
        }
        Lb.e();
        N4.b(null);
        N4.a(null);
        N4.f14523d = false;
        N4.c = false;
    }
}
