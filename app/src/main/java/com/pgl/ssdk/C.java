package com.pgl.ssdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lib.zj.office.fc.hpsf.Constants;
import org.json.JSONArray;

/* compiled from: SDKBatteryCollector.java */
/* loaded from: classes2.dex */
public class C {
    private static C c;

    /* renamed from: a  reason: collision with root package name */
    private Context f15750a;

    /* renamed from: b  reason: collision with root package name */
    private List<Integer> f15751b = new ArrayList();

    private C(Context context) {
        this.f15750a = null;
        this.f15750a = context;
    }

    public static C a(Context context) {
        if (c == null) {
            synchronized (C.class) {
                if (c == null) {
                    c = new C(context);
                }
            }
        }
        return c;
    }

    public synchronized String b() {
        if (this.f15751b.size() <= 0) {
            return "-1";
        }
        List<Integer> list = this.f15751b;
        return String.valueOf(list.get(list.size() - 1).intValue() % Constants.CP_MAC_ROMAN);
    }

    public synchronized String c() {
        return new JSONArray((Collection) this.f15751b).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        r1 = (r1 * lib.zj.office.fc.hpsf.Constants.CP_MAC_ROMAN) + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r6 = this;
            r0 = 0
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            android.content.Context r1 = r6.f15750a     // Catch: java.lang.Throwable -> L4c
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            r3 = 0
            android.content.Intent r1 = r1.registerReceiver(r3, r2)     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L14
            r1 = r0
            goto L1a
        L14:
            java.lang.String r2 = "plugged"
            int r1 = r1.getIntExtra(r2, r0)     // Catch: java.lang.Throwable -> L4c
        L1a:
            android.content.Context r2 = r6.f15750a     // Catch: java.lang.Throwable -> L4a
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            android.content.Intent r2 = r2.registerReceiver(r3, r4)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L2a
            goto L45
        L2a:
            java.lang.String r3 = "level"
            int r3 = r2.getIntExtra(r3, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "scale"
            int r2 = r2.getIntExtra(r4, r0)     // Catch: java.lang.Throwable -> L4a
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L4a
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L4a
            float r3 = r3 / r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r2
            r2 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L4a
            int r0 = r2 / 10
        L45:
            monitor-exit(r6)
            int r1 = r1 * 10000
            int r1 = r1 + r0
            goto L56
        L4a:
            r2 = move-exception
            goto L4e
        L4c:
            r2 = move-exception
            r1 = r0
        L4e:
            monitor-exit(r6)
            throw r2     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
        L50:
            r0 = move-exception
            throw r0
        L52:
            r1 = r0
        L53:
            int r1 = r1 * 10000
            int r1 = r1 + r0
        L56:
            r0 = -1
            if (r1 != r0) goto L5a
            return
        L5a:
            java.util.List<java.lang.Integer> r0 = r6.f15751b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = r6.f15751b     // Catch: java.lang.Throwable -> L81
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L81
            r1 = 20
            if (r0 <= r1) goto L81
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
            java.util.List<java.lang.Integer> r2 = r6.f15751b     // Catch: java.lang.Throwable -> L81
            int r3 = r0 + (-10)
            java.util.List r0 = r2.subList(r3, r0)     // Catch: java.lang.Throwable -> L81
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L81
            java.util.List<java.lang.Integer> r0 = r6.f15751b     // Catch: java.lang.Throwable -> L81
            r0.clear()     // Catch: java.lang.Throwable -> L81
            r6.f15751b = r1     // Catch: java.lang.Throwable -> L81
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.C.a():void");
    }
}
