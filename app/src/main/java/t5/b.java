package t5;

import com.facebook.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29928b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f29927a = i10;
        this.f29928b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[Catch: JSONException -> 0x0065, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0065, blocks: (B:13:0x004d, B:16:0x0053, B:21:0x0060), top: B:24:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.facebook.i r6) {
        /*
            r5 = this;
            org.json.JSONObject r0 = r6.f9729d
            int r1 = r5.f29927a
            java.lang.Object r2 = r5.f29928b
            switch(r1) {
                case 0: goto Le;
                case 1: goto La;
                default: goto L9;
            }
        L9:
            goto L46
        La:
            b.a.i(r2)
            return
        Le:
            com.facebook.c$d r2 = (com.facebook.c.d) r2
            java.lang.String r6 = "$refreshResult"
            kotlin.jvm.internal.g.e(r2, r6)
            if (r0 != 0) goto L18
            goto L45
        L18:
            java.lang.String r6 = "access_token"
            java.lang.String r6 = r0.optString(r6)
            r2.f9681a = r6
            java.lang.String r6 = "expires_at"
            int r6 = r0.optInt(r6)
            r2.f9682b = r6
            java.lang.String r6 = "expires_in"
            int r6 = r0.optInt(r6)
            r2.c = r6
            java.lang.String r6 = "data_access_expiration_time"
            long r3 = r0.optLong(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r2.f9683d = r6
            java.lang.String r6 = "graph_domain"
            r1 = 0
            java.lang.String r6 = r0.optString(r6, r1)
            r2.f9684e = r6
        L45:
            return
        L46:
            com.facebook.internal.instrument.InstrumentData r2 = (com.facebook.internal.instrument.InstrumentData) r2
            java.lang.String r1 = "$instrumentData"
            kotlin.jvm.internal.g.e(r2, r1)
            com.facebook.FacebookRequestError r6 = r6.c     // Catch: org.json.JSONException -> L65
            if (r6 != 0) goto L65
            if (r0 == 0) goto L5d
            java.lang.String r6 = "success"
            boolean r6 = r0.getBoolean(r6)     // Catch: org.json.JSONException -> L65
            r0 = 1
            if (r6 != r0) goto L5d
            goto L5e
        L5d:
            r0 = 0
        L5e:
            if (r0 == 0) goto L65
            java.lang.String r6 = r2.f9794a     // Catch: org.json.JSONException -> L65
            h6.d.a(r6)     // Catch: org.json.JSONException -> L65
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.b.b(com.facebook.i):void");
    }
}
