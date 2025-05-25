package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: b  reason: collision with root package name */
    public static final q9.y f13250b = new q9.y("VerifySliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13251a;

    public h2(d0 d0Var) {
        this.f13251a = d0Var;
    }

    public final void a(g2 g2Var) {
        String str = g2Var.f13249b;
        File m10 = this.f13251a.m(g2Var.c, g2Var.f13249b, g2Var.f13242e, g2Var.f13241d);
        boolean exists = m10.exists();
        int i10 = g2Var.f13248a;
        String str2 = g2Var.f13242e;
        if (exists) {
            try {
                d0 d0Var = this.f13251a;
                int i11 = g2Var.c;
                long j10 = g2Var.f13241d;
                d0Var.getClass();
                File file = new File(new File(new File(d0Var.d(i11, j10, str), "_slices"), "_metadata"), str2);
                if (file.exists()) {
                    try {
                        if (b.b.e(f2.a(m10, file)).equals(g2Var.f13243f)) {
                            f13250b.d("Verification of slice %s of pack %s successful.", str2, str);
                            File n10 = this.f13251a.n(g2Var.c, g2Var.f13249b, g2Var.f13242e, g2Var.f13241d);
                            if (!n10.exists()) {
                                n10.mkdirs();
                            }
                            if (m10.renameTo(n10)) {
                                return;
                            }
                            throw new ck(String.format("Failed to move slice %s after verification.", str2), i10);
                        }
                        throw new ck(String.format("Verification failed for slice %s.", str2), i10);
                    } catch (IOException e10) {
                        throw new ck(String.format("Could not digest file during verification for slice %s.", str2), e10, i10);
                    } catch (NoSuchAlgorithmException e11) {
                        throw new ck("SHA256 algorithm not supported.", e11, i10);
                    }
                }
                throw new ck(String.format("Cannot find metadata files for slice %s.", str2), i10);
            } catch (IOException e12) {
                throw new ck(String.format("Could not reconstruct slice archive during verification for slice %s.", str2), e12, i10);
            }
        }
        throw new ck(String.format("Cannot find unverified files for slice %s.", str2), i10);
    }
}
