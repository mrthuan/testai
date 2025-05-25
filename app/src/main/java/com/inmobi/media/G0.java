package com.inmobi.media;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class G0 extends W2 {

    /* renamed from: b  reason: collision with root package name */
    public final Context f14263b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14264d;

    /* renamed from: e  reason: collision with root package name */
    public final ActivityManager f14265e;

    /* renamed from: f  reason: collision with root package name */
    public final C1851w5 f14266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(Context context, V2 listener, long j10, int i10) {
        super(listener);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(listener, "listener");
        this.f14263b = context;
        this.c = j10;
        this.f14264d = i10;
        Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f14265e = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        this.f14266f = AbstractC1838v5.a(context, "appClose");
    }

    public static final void a(G0 this$0, ApplicationExitInfo applicationExitInfo) {
        int reason;
        String description;
        InputStream traceInputStream;
        String sb2;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        V2 v22 = this$0.f14771a;
        reason = applicationExitInfo.getReason();
        description = applicationExitInfo.getDescription();
        traceInputStream = applicationExitInfo.getTraceInputStream();
        int i10 = this$0.f14264d;
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        if (traceInputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                boolean z10 = false;
                int i11 = i10;
                boolean z11 = false;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (i10 > 0 && !z11) {
                            sb4.append(readLine);
                            sb4.append("\n");
                            i10--;
                        }
                        if (kotlin.text.j.M(readLine, "\"main\"", z10)) {
                            sb4.setLength(0);
                            z11 = true;
                        }
                        if (z11) {
                            i11--;
                            sb3.append(readLine);
                            sb3.append("\n");
                        }
                        if (kotlin.text.k.O(readLine, "ZygoteInit.java", false) || i11 <= 0) {
                            break;
                        }
                        z10 = false;
                    } else {
                        break;
                    }
                }
                bufferedReader.close();
            } catch (IOException unused) {
            }
        }
        if (sb3.length() == 0) {
            sb2 = sb4.toString();
            kotlin.jvm.internal.g.d(sb2, "toString(...)");
        } else {
            sb2 = sb3.toString();
            kotlin.jvm.internal.g.d(sb2, "toString(...)");
        }
        ((X2) v22).a(new H0(description, reason, sb2));
    }

    @Override // com.inmobi.media.W2
    public final void b() {
    }

    @Override // com.inmobi.media.W2
    public final void a() {
        Vb.f14759a.execute(new androidx.appcompat.widget.z0(this, 4));
    }

    public static final void a(G0 this$0) {
        List<Object> historicalProcessExitReasons;
        long timestamp;
        long timestamp2;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        historicalProcessExitReasons = this$0.f14265e.getHistoricalProcessExitReasons(this$0.f14263b.getPackageName(), 0, 10);
        kotlin.jvm.internal.g.d(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        C1851w5 c1851w5 = this$0.f14266f;
        c1851w5.getClass();
        long j10 = c1851w5.f15579a.getLong("exitReasonTimestamp", 0L);
        long j11 = j10;
        for (Object obj : historicalProcessExitReasons) {
            ApplicationExitInfo d10 = androidx.window.layout.b.d(obj);
            timestamp = d10.getTimestamp();
            if (timestamp > j10) {
                long j12 = this$0.c;
                Vb.f14759a.schedule(new l1.a(6, this$0, d10), j12, TimeUnit.MILLISECONDS);
                timestamp2 = d10.getTimestamp();
                if (timestamp2 > j11) {
                    j11 = d10.getTimestamp();
                }
            }
        }
        C1851w5 c1851w52 = this$0.f14266f;
        c1851w52.getClass();
        SharedPreferences.Editor edit = c1851w52.f15579a.edit();
        edit.putLong("exitReasonTimestamp", j11);
        edit.apply();
    }
}
