package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: d  reason: collision with root package name */
    public static final q9.y f13264d = new q9.y("ExtractorTaskFinder");

    /* renamed from: a  reason: collision with root package name */
    public final g1 f13265a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f13266b;
    public final m0 c;

    public i1(g1 g1Var, d0 d0Var, m0 m0Var) {
        this.f13265a = g1Var;
        this.f13266b = d0Var;
        this.c = m0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x03a0, code lost:
        r5 = new java.lang.Object[4];
        r5[0] = java.lang.Integer.valueOf(r6.f13226f);
        r5[1] = java.lang.Integer.valueOf(r4);
        r10 = r3.f13199a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03b7, code lost:
        r11 = r3.f13199a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03ba, code lost:
        r5[2] = r10;
        r5[3] = r9;
        r8.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", r5);
        r38 = r7.a(r4, 0, r11, r9);
        r4 = r2.f13209a;
        r5 = r3.f13199a;
        r9 = r21;
        r0 = new com.google.android.play.core.assetpacks.x1(r4, r5, (int) com.google.android.play.core.assetpacks.d0.b(r9.c(r5), true), r9.j(r11), r2.f13210b, r3.f13200b, r6.f13226f, r6.f13222a, r6.c, r38);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.play.core.assetpacks.h1 a() {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.i1.a():com.google.android.play.core.assetpacks.h1");
    }

    public final boolean b(d1 d1Var, e1 e1Var) {
        c1 c1Var = d1Var.c;
        String str = c1Var.f13199a;
        String str2 = e1Var.f13222a;
        q9.y yVar = d2.f13211h;
        d0 d0Var = this.f13266b;
        d0Var.getClass();
        File file = new File(new File(new File(new File(d0Var.d(d1Var.f13210b, c1Var.f13200b, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null) {
                yVar.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } else if (Integer.parseInt(properties.getProperty("fileStatus")) != 4) {
                return false;
            } else {
                return true;
            }
        } catch (IOException e10) {
            yVar.b("Could not read checkpoint while checking if extraction finished. %s", e10);
            return false;
        }
    }
}
