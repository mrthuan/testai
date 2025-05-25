package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Method;

/* compiled from: TTCrashHandler.java */
/* loaded from: classes.dex */
public class NFd implements Thread.UncaughtExceptionHandler {
    public static volatile boolean Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private String f9366ac;
    private final Thread.UncaughtExceptionHandler cJ = Thread.getDefaultUncaughtExceptionHandler();

    private NFd() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        cJ();
    }

    public static NFd Qhi() {
        return new NFd();
    }

    private void ac() {
        try {
            Method Qhi2 = com.bytedance.sdk.component.utils.Dww.Qhi("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", Context.class);
            if (Qhi2 != null) {
                Qhi2.invoke(null, com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            }
        } catch (Throwable unused) {
        }
        try {
            Method Qhi3 = com.bytedance.sdk.component.utils.Dww.Qhi("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", Context.class);
            if (Qhi3 != null) {
                Qhi3.invoke(null, com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            }
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.cJ();
        } catch (Throwable unused4) {
        }
    }

    private void cJ() {
        Context Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        if (Qhi2 == null) {
            return;
        }
        try {
            File file = new File(Qhi2.getFilesDir(), "TTCache");
            file.mkdirs();
            this.f9366ac = file.getPath();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        Qhi = true;
        boolean z10 = false;
        com.bytedance.sdk.component.Sf.ROR.Qhi(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2 != null) {
                z10 = stringWriter2.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (z10) {
            Qhi(thread, th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.cJ;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Properties] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(java.lang.Thread r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.NFd.Qhi(java.lang.Thread, java.lang.Throwable):void");
    }
}
