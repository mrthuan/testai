package com.bytedance.sdk.openadsdk.core.cJ;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.js;
import java.lang.ref.WeakReference;

/* compiled from: ClickCreativeListener.java */
/* loaded from: classes.dex */
public class Qhi extends cJ {
    private boolean Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f9018ac;
    private boolean cJ;
    private WeakReference<InterfaceC0120Qhi> js;

    /* renamed from: zn  reason: collision with root package name */
    private int f9019zn;

    /* compiled from: ClickCreativeListener.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.cJ.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0120Qhi {
        long getVideoProgress();
    }

    public Qhi(Context context, tP tPVar, String str, int i10) {
        super(context, tPVar, str, i10);
        this.Qhi = true;
        this.cJ = false;
        this.f9018ac = false;
    }

    private boolean CJ(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof NativeVideoTsView) || view.getId() == iMK.Px || view.getId() == iMK.PAe || view.getId() == iMK.f9381ip || view.getId() == iMK.xyz || view.getId() == iMK.jPH || view.getId() == 520093726 || view.getId() == iMK.Ug) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return false;
            }
            if (CJ(viewGroup.getChildAt(i10))) {
                return true;
            }
            i10++;
        }
    }

    private boolean Sf() {
        if (tP.fl(((cJ) this).Tgh) && ((cJ) this).Tgh.Dww() == 1) {
            return true;
        }
        return false;
    }

    private boolean WAv() {
        if (((cJ) this).Tgh == null || hm()) {
            return false;
        }
        if (((cJ) this).Tgh.gga() != 5 && ((cJ) this).Tgh.gga() != 15) {
            return false;
        }
        if (this.f9019zn == 0) {
            this.f9019zn = ((cJ) this).Tgh.sqa();
        }
        cJ();
        Qhi();
        ac();
        if (this.f9019zn == 5 && Sf() && Qhi() && !cJ() && !ac()) {
            return false;
        }
        int i10 = this.f9019zn;
        if (i10 != 1 && i10 != 2 && i10 != 5) {
            return false;
        }
        return true;
    }

    private boolean hm() {
        return this instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.ROR;
    }

    public void Qhi(boolean z10) {
        this.Qhi = z10;
    }

    public boolean ac() {
        return false;
    }

    public boolean cJ() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a3, code lost:
        if ((r4 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b2, code lost:
        if (((java.lang.Boolean) r4.getTag(520093762)).booleanValue() != false) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ, com.bytedance.sdk.openadsdk.core.cJ.ac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(android.view.View r31, float r32, float r33, float r34, float r35, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.cJ.ac.Qhi> r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cJ.Qhi.Qhi(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    public void ac(boolean z10) {
        this.f9018ac = z10;
    }

    public void cJ(boolean z10) {
        this.cJ = z10;
    }

    private String cJ(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c = 0;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c = 1;
                    break;
                }
                break;
            case -712491894:
                if (str.equals("embeded_ad")) {
                    c = 2;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c = 3;
                    break;
                }
                break;
            case 2091589896:
                if (str.equals("slide_banner_ad")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "banner_call";
            case 1:
                return "open_ad";
            case 2:
                return "feed_call";
            case 3:
                return "interaction_call";
            case 4:
                return "banner_call";
            default:
                return "";
        }
    }

    public boolean Qhi() {
        tP tPVar = ((cJ) this).Tgh;
        if (tPVar == null) {
            return true;
        }
        int cJ = HzH.CJ().cJ(tPVar.Hy());
        int ac2 = hpZ.ac(HzH.Qhi());
        if (cJ != 1) {
            if (cJ == 2) {
                return js.fl(ac2) || js.CJ(ac2) || js.Tgh(ac2);
            } else if (cJ != 3) {
                return cJ != 5 || js.CJ(ac2) || js.Tgh(ac2);
            } else {
                return false;
            }
        }
        return js.CJ(ac2);
    }

    public void Qhi(InterfaceC0120Qhi interfaceC0120Qhi) {
        this.js = new WeakReference<>(interfaceC0120Qhi);
    }
}
