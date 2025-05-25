package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class U4 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V4 f14730a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f14731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(V4 v42, ArrayList arrayList) {
        super(1);
        this.f14730a = v42;
        this.f14731b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    @Override // cg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            com.inmobi.media.Q5 r5 = (com.inmobi.media.Q5) r5
            java.lang.String r0 = "dbData"
            kotlin.jvm.internal.g.e(r5, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = com.inmobi.media.AbstractC1569b6.f14964a
            java.lang.String r0 = r5.f14592a
            java.lang.String r1 = "fileName"
            kotlin.jvm.internal.g.e(r0, r1)
            r1 = 0
            java.util.concurrent.CopyOnWriteArrayList r2 = com.inmobi.media.AbstractC1569b6.f14964a     // Catch: java.lang.Exception -> L36
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L36
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L36
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Exception -> L36
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> L36
            com.inmobi.media.C9 r3 = (com.inmobi.media.C9) r3     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L2e
            java.lang.String r3 = r3.f14172j     // Catch: java.lang.Exception -> L36
            goto L2f
        L2e:
            r3 = r1
        L2f:
            boolean r3 = kotlin.jvm.internal.g.a(r3, r0)     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L17
            goto L8e
        L36:
            r0 = move-exception
            com.inmobi.media.Q4 r2 = com.inmobi.media.Q4.f14590a
            java.lang.String r2 = "event"
            com.inmobi.media.J1 r0 = com.inmobi.media.AbstractC1863x4.a(r0, r2)
            com.inmobi.media.y5 r2 = com.inmobi.media.Q4.c
            r2.a(r0)
        L44:
            com.inmobi.media.V4 r0 = r4.f14730a
            r0.getClass()
            java.lang.String r0 = r5.f14592a
            java.lang.String r2 = "filePath"
            kotlin.jvm.internal.g.e(r0, r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L67
            boolean r0 = r2.isFile()
            if (r0 != 0) goto L62
            goto L67
        L62:
            java.lang.String r0 = pdf.pdfreader.viewer.editor.free.utils.t0.m0(r2)     // Catch: java.lang.Exception -> L67
            goto L68
        L67:
            r0 = r1
        L68:
            if (r0 == 0) goto L87
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "vitals"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            java.lang.String r2 = "log"
            org.json.JSONArray r1 = r1.getJSONArray(r2)
            com.inmobi.media.W4 r2 = new com.inmobi.media.W4
            kotlin.jvm.internal.g.b(r0)
            kotlin.jvm.internal.g.b(r1)
            r2.<init>(r0, r1, r5)
            r1 = r2
        L87:
            if (r1 == 0) goto L8e
            java.util.List r5 = r4.f14731b
            r5.add(r1)
        L8e:
            tf.d r5 = tf.d.f30009a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U4.invoke(java.lang.Object):java.lang.Object");
    }
}
