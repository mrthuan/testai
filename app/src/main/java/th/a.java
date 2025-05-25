package th;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import lib.zj.office.java.awt.Rectangle;
import zh.f;

/* compiled from: PGLayout.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public eh.b f30014a;

    /* renamed from: d  reason: collision with root package name */
    public HashMap f30016d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap f30017e;

    /* renamed from: f  reason: collision with root package name */
    public int f30018f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30019g = true;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f30015b = new HashMap();
    public final HashMap c = new HashMap();

    public final Rectangle a(int i10, String str) {
        boolean z10;
        e eVar;
        if (!InMobiNetworkValues.TITLE.equals(str) && !"ctrTitle".equals(str) && !"dt".equals(str) && !"ftr".equals(str) && !"sldNum".equals(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            e eVar2 = (e) this.f30015b.get(str);
            if (eVar2 != null) {
                return eVar2.f30047a;
            }
            return null;
        } else if (i10 >= -1 && (eVar = (e) this.c.get(Integer.valueOf(i10))) != null) {
            return eVar.f30047a;
        } else {
            return null;
        }
    }

    public final f b(int i10, String str) {
        boolean z10;
        e eVar;
        if (!InMobiNetworkValues.TITLE.equals(str) && !"ctrTitle".equals(str) && !"dt".equals(str) && !"ftr".equals(str) && !"sldNum".equals(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            e eVar2 = (e) this.f30015b.get(str);
            if (eVar2 != null) {
                return eVar2.f30048b;
            }
            return null;
        } else if (i10 >= -1 && (eVar = (e) this.c.get(Integer.valueOf(i10))) != null) {
            return eVar.f30048b;
        } else {
            return null;
        }
    }
}
