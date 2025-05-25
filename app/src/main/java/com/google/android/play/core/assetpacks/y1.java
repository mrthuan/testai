package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class y1 {
    public static final q9.y c = new q9.y("PatchSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13448a;

    /* renamed from: b  reason: collision with root package name */
    public final q9.k f13449b;

    public y1(d0 d0Var, q9.k kVar) {
        this.f13448a = d0Var;
        this.f13449b = kVar;
    }

    public final void a(x1 x1Var) {
        InputStream gZIPInputStream;
        q9.y yVar = c;
        int i10 = x1Var.f13248a;
        d0 d0Var = this.f13448a;
        int i11 = x1Var.c;
        long j10 = x1Var.f13433d;
        String str = x1Var.f13249b;
        File l10 = d0Var.l(i11, j10, str);
        File file = new File(d0Var.l(i11, j10, str), "_metadata");
        String str2 = x1Var.f13437h;
        File file2 = new File(file, str2);
        try {
            int i12 = x1Var.f13436g;
            InputStream inputStream = x1Var.f13439j;
            if (i12 != 2) {
                gZIPInputStream = inputStream;
            } else {
                gZIPInputStream = new GZIPInputStream(inputStream, 8192);
            }
            g0 g0Var = new g0(l10, file2);
            File m10 = this.f13448a.m(x1Var.f13434e, x1Var.f13249b, x1Var.f13437h, x1Var.f13435f);
            if (!m10.exists()) {
                m10.mkdirs();
            }
            d2 d2Var = new d2(this.f13448a, x1Var.f13249b, x1Var.f13434e, x1Var.f13435f, x1Var.f13437h);
            q9.h.a(g0Var, gZIPInputStream, new x0(m10, d2Var), x1Var.f13438i);
            d2Var.h(0);
            gZIPInputStream.close();
            yVar.d("Patching and extraction finished for slice %s of pack %s.", str2, str);
            ((t2) this.f13449b.a()).e(i10, 0, str, str2);
            try {
                inputStream.close();
            } catch (IOException unused) {
                yVar.e("Could not close file for slice %s of pack %s.", str2, str);
            }
        } catch (IOException e10) {
            yVar.b("IOException during patching %s.", e10.getMessage());
            throw new ck(String.format("Error patching slice %s of pack %s.", str2, str), e10, i10);
        }
    }
}
