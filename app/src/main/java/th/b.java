package th;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.Iterator;
import lib.zj.office.java.awt.Rectangle;
import zh.f;

/* compiled from: PGMaster.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public eh.b f30020a;

    /* renamed from: e  reason: collision with root package name */
    public HashMap f30023e;

    /* renamed from: f  reason: collision with root package name */
    public e f30024f;

    /* renamed from: g  reason: collision with root package name */
    public e f30025g;

    /* renamed from: h  reason: collision with root package name */
    public e f30026h;

    /* renamed from: i  reason: collision with root package name */
    public int f30027i = -1;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f30021b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f30022d = new HashMap();

    public final Rectangle a(int i10, String str) {
        boolean z10;
        if ("ctrTitle".equals(str)) {
            str = InMobiNetworkValues.TITLE;
        }
        if (!InMobiNetworkValues.TITLE.equals(str) && !"ctrTitle".equals(str) && !"dt".equals(str) && !"ftr".equals(str) && !"sldNum".equals(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            e eVar = (e) this.c.get(str);
            if (eVar != null) {
                return eVar.f30047a;
            }
            return null;
        } else if (i10 >= -1) {
            HashMap hashMap = this.f30022d;
            e eVar2 = (e) hashMap.get(Integer.valueOf(i10));
            if (eVar2 == null) {
                Iterator it = hashMap.keySet().iterator();
                if (it.hasNext()) {
                    eVar2 = (e) hashMap.get(it.next());
                }
            }
            if (eVar2 != null) {
                return eVar2.f30047a;
            }
            return null;
        } else {
            return null;
        }
    }

    public final f b(int i10, String str) {
        boolean z10;
        if ("ctrTitle".equals(str)) {
            str = InMobiNetworkValues.TITLE;
        }
        if (!InMobiNetworkValues.TITLE.equals(str) && !"ctrTitle".equals(str) && !"dt".equals(str) && !"ftr".equals(str) && !"sldNum".equals(str)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            e eVar = (e) this.c.get(str);
            if (eVar != null) {
                return eVar.f30048b;
            }
            return null;
        } else if (i10 > 0) {
            HashMap hashMap = this.f30022d;
            e eVar2 = (e) hashMap.get(Integer.valueOf(i10));
            if (eVar2 == null) {
                Iterator it = hashMap.keySet().iterator();
                if (it.hasNext()) {
                    eVar2 = (e) hashMap.get(it.next());
                }
            }
            if (eVar2 != null) {
                return eVar2.f30048b;
            }
            return null;
        } else {
            return null;
        }
    }
}
