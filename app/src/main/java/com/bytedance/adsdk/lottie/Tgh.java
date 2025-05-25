package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.os.Trace;
import androidx.activity.r;
import b.a;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.File;

/* compiled from: L.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class Tgh {
    private static boolean CJ = true;
    private static volatile com.bytedance.adsdk.lottie.CJ.Gm Gm = null;
    public static boolean Qhi = false;
    private static int ROR = 0;
    private static int Sf = 0;
    private static long[] Tgh = null;
    private static com.bytedance.adsdk.lottie.CJ.Sf WAv = null;

    /* renamed from: ac  reason: collision with root package name */
    private static boolean f7765ac = true;
    private static boolean cJ = false;

    /* renamed from: fl  reason: collision with root package name */
    private static String[] f7766fl;

    /* renamed from: hm  reason: collision with root package name */
    private static com.bytedance.adsdk.lottie.CJ.hm f7767hm;

    /* renamed from: zc  reason: collision with root package name */
    private static volatile com.bytedance.adsdk.lottie.CJ.WAv f7768zc;

    public static void Qhi(String str) {
        if (cJ) {
            int i10 = ROR;
            if (i10 == 20) {
                Sf++;
                return;
            }
            f7766fl[i10] = str;
            Tgh[i10] = System.nanoTime();
            Trace.beginSection(str);
            ROR++;
        }
    }

    public static float cJ(String str) {
        int i10 = Sf;
        if (i10 > 0) {
            Sf = i10 - 1;
            return 0.0f;
        } else if (cJ) {
            int i11 = ROR - 1;
            ROR = i11;
            if (i11 != -1) {
                if (str.equals(f7766fl[i11])) {
                    Trace.endSection();
                    return ((float) (System.nanoTime() - Tgh[ROR])) / 1000000.0f;
                }
                throw new IllegalStateException(r.g(a.g("Unbalanced trace call ", str, ". Expected "), f7766fl[ROR], "."));
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return 0.0f;
        }
    }

    public static com.bytedance.adsdk.lottie.CJ.Gm Qhi(Context context) {
        com.bytedance.adsdk.lottie.CJ.Gm gm2;
        com.bytedance.adsdk.lottie.CJ.Gm gm3 = Gm;
        if (gm3 == null) {
            synchronized (com.bytedance.adsdk.lottie.CJ.Gm.class) {
                gm2 = Gm;
                if (gm2 == null) {
                    com.bytedance.adsdk.lottie.CJ.WAv cJ2 = cJ(context);
                    com.bytedance.adsdk.lottie.CJ.hm hmVar = f7767hm;
                    if (hmVar == null) {
                        hmVar = new com.bytedance.adsdk.lottie.CJ.fl();
                    }
                    gm2 = new com.bytedance.adsdk.lottie.CJ.Gm(cJ2, hmVar);
                    Gm = gm2;
                }
            }
            return gm2;
        }
        return gm3;
    }

    public static boolean Qhi() {
        return CJ;
    }

    public static com.bytedance.adsdk.lottie.CJ.WAv cJ(Context context) {
        com.bytedance.adsdk.lottie.CJ.WAv wAv;
        if (f7765ac) {
            final Context applicationContext = context.getApplicationContext();
            com.bytedance.adsdk.lottie.CJ.WAv wAv2 = f7768zc;
            if (wAv2 == null) {
                synchronized (com.bytedance.adsdk.lottie.CJ.WAv.class) {
                    wAv = f7768zc;
                    if (wAv == null) {
                        com.bytedance.adsdk.lottie.CJ.Sf sf2 = WAv;
                        if (sf2 == null) {
                            sf2 = new com.bytedance.adsdk.lottie.CJ.Sf() { // from class: com.bytedance.adsdk.lottie.Tgh.1
                                @Override // com.bytedance.adsdk.lottie.CJ.Sf
                                public File Qhi() {
                                    return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                                }
                            };
                        }
                        wAv = new com.bytedance.adsdk.lottie.CJ.WAv(sf2);
                        f7768zc = wAv;
                    }
                }
                return wAv;
            }
            return wAv2;
        }
        return null;
    }
}
