package com.bykv.vk.openvk.component.video.Qhi.cJ;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac;
import java.util.Set;

/* compiled from: Proxy.java */
/* loaded from: classes.dex */
public class Tgh {
    public static volatile boolean CJ;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context Gm;
    static volatile com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.cJ Qhi;
    static volatile boolean Tgh;
    private static volatile com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac WAv;
    static volatile com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac cJ;

    /* renamed from: hm  reason: collision with root package name */
    public static volatile Integer f7145hm;

    /* renamed from: ac  reason: collision with root package name */
    public static final boolean f7143ac = com.bytedance.sdk.component.utils.ABk.CJ();

    /* renamed from: fl  reason: collision with root package name */
    static volatile boolean f7144fl = true;
    static volatile int ROR = 0;
    public static volatile int Sf = 3;

    public static Context Qhi() {
        return Gm;
    }

    public static com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.cJ ac() {
        return Qhi;
    }

    public static void cJ(boolean z10) {
        Tgh = z10;
    }

    public static void Qhi(boolean z10) {
        f7144fl = z10;
    }

    public static com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac cJ() {
        return cJ;
    }

    public static void Qhi(int i10) {
        ROR = i10;
    }

    public static void Qhi(com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac acVar, Context context) {
        if (acVar != null && context != null) {
            Gm = context.getApplicationContext();
            if (cJ != null) {
                return;
            }
            if (Qhi == null) {
                cJ = acVar;
                WAv = com.bykv.vk.openvk.component.video.Qhi.cJ.cJ.ac.Qhi(context);
                cJ.Qhi(new ac.Qhi() { // from class: com.bykv.vk.openvk.component.video.Qhi.cJ.Tgh.1
                    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.Qhi
                    public void Qhi(String str) {
                        if (Tgh.f7143ac) {
                            "new cache created: ".concat(String.valueOf(str));
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.Qhi.ac.Qhi
                    public void Qhi(Set<String> set) {
                        Tgh.WAv.Qhi(set, 0);
                        if (Tgh.f7143ac) {
                            "cache file removed, ".concat(String.valueOf(set));
                        }
                    }
                });
                ROR Qhi2 = ROR.Qhi();
                Qhi2.Qhi(acVar);
                Qhi2.Qhi(WAv);
                fl ac2 = fl.ac();
                ac2.Qhi(acVar);
                ac2.Qhi(WAv);
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
    }
}
