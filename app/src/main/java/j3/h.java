package j3;

import a8.p;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzfa;
import com.google.android.gms.measurement.internal.zzff;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzko;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.play.core.assetpacks.d0;
import com.google.android.play.core.assetpacks.d1;
import com.google.android.play.core.assetpacks.f1;
import com.google.android.play.core.assetpacks.g1;
import com.google.android.play.core.assetpacks.v1;
import com.google.android.play.core.assetpacks.w1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q9.l;
import q9.m;

/* compiled from: MutablePair.java */
/* loaded from: classes.dex */
public final class h implements p, f1, l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19038a;

    /* renamed from: b  reason: collision with root package name */
    public Object f19039b;
    public Object c;

    public h() {
        this.f19038a = 0;
    }

    @Override // com.google.android.play.core.assetpacks.f1
    public final Object a() {
        int i10;
        switch (this.f19038a) {
            case 4:
                g1 g1Var = (g1) this.f19039b;
                List list = (List) this.c;
                g1Var.getClass();
                HashMap hashMap = new HashMap();
                for (d1 d1Var : g1Var.c.values()) {
                    String str = d1Var.c.f13199a;
                    if (list.contains(str)) {
                        d1 d1Var2 = (d1) hashMap.get(str);
                        if (d1Var2 == null) {
                            i10 = -1;
                        } else {
                            i10 = d1Var2.f13209a;
                        }
                        if (i10 < d1Var.f13209a) {
                            hashMap.put(str, d1Var);
                        }
                    }
                }
                return hashMap;
            default:
                return new v1((d0) ((m) this.f19039b).a(), (w1) ((m) this.c).a());
        }
    }

    @Override // a8.p
    public final void b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        a8.e eVar;
        long longValue;
        zzlg zzlgVar = (zzlg) this.c;
        zzlgVar.zzaB().m();
        zzlgVar.b();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                zzlgVar.f11901t = false;
                zzlgVar.v();
            }
        }
        ArrayList arrayList = zzlgVar.f11905x;
        Preconditions.j(arrayList);
        zzlgVar.f11905x = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            zzlgVar.zzaA().f11720n.c(Integer.valueOf(i10), "Network upload failed. Will retry later. code, error", th2);
            zzff zzffVar = zzlgVar.f11890i.f11868h;
            ((DefaultClock) zzlgVar.zzax()).getClass();
            zzffVar.b(System.currentTimeMillis());
            if (i10 != 503 || i10 == 429) {
                zzff zzffVar2 = zzlgVar.f11890i.f11866f;
                ((DefaultClock) zzlgVar.zzax()).getClass();
                zzffVar2.b(System.currentTimeMillis());
            }
            a8.e eVar2 = zzlgVar.c;
            zzlg.C(eVar2);
            eVar2.U(arrayList);
            zzlgVar.x();
        }
        if (th2 == null) {
            try {
                zzff zzffVar3 = zzlgVar.f11890i.f11867g;
                ((DefaultClock) zzlgVar.zzax()).getClass();
                zzffVar3.b(System.currentTimeMillis());
                zzlgVar.f11890i.f11868h.b(0L);
                zzlgVar.x();
                zzlgVar.zzaA().f11720n.c(Integer.valueOf(i10), "Successful upload. Got network response. code, size", Integer.valueOf(bArr.length));
                a8.e eVar3 = zzlgVar.c;
                zzlg.C(eVar3);
                eVar3.S();
            } catch (SQLiteException e10) {
                zzlgVar.zzaA().f11712f.b(e10, "Database error while trying to delete uploaded bundles");
                ((DefaultClock) zzlgVar.zzax()).getClass();
                zzlgVar.f11896o = SystemClock.elapsedRealtime();
                zzlgVar.zzaA().f11720n.b(Long.valueOf(zzlgVar.f11896o), "Disable upload, time");
            }
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    try {
                        eVar = zzlgVar.c;
                        zzlg.C(eVar);
                        longValue = l10.longValue();
                        eVar.m();
                        eVar.n();
                        try {
                        } catch (SQLiteException e11) {
                            zzeu zzeuVar = ((zzge) eVar.f3529a).f11780i;
                            zzge.f(zzeuVar);
                            zzeuVar.f11712f.b(e11, "Failed to delete a bundle in a queue table");
                            throw e11;
                            break;
                        }
                    } catch (SQLiteException e12) {
                        ArrayList arrayList2 = zzlgVar.f11906y;
                        if (arrayList2 == null || !arrayList2.contains(l10)) {
                            throw e12;
                        }
                    }
                    if (eVar.F().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                        break;
                    }
                }
                a8.e eVar4 = zzlgVar.c;
                zzlg.C(eVar4);
                eVar4.r();
                a8.e eVar5 = zzlgVar.c;
                zzlg.C(eVar5);
                eVar5.T();
                zzlgVar.f11906y = null;
                zzfa zzfaVar = zzlgVar.f11884b;
                zzlg.C(zzfaVar);
                if (zzfaVar.q() && zzlgVar.z()) {
                    zzlgVar.o();
                } else {
                    zzlgVar.f11907z = -1L;
                    zzlgVar.x();
                }
                zzlgVar.f11896o = 0L;
            } catch (Throwable th3) {
                a8.e eVar6 = zzlgVar.c;
                zzlg.C(eVar6);
                eVar6.T();
                throw th3;
            }
        }
        zzlgVar.zzaA().f11720n.c(Integer.valueOf(i10), "Network upload failed. Will retry later. code, error", th2);
        zzff zzffVar4 = zzlgVar.f11890i.f11868h;
        ((DefaultClock) zzlgVar.zzax()).getClass();
        zzffVar4.b(System.currentTimeMillis());
        if (i10 != 503) {
        }
        zzff zzffVar22 = zzlgVar.f11890i.f11866f;
        ((DefaultClock) zzlgVar.zzax()).getClass();
        zzffVar22.b(System.currentTimeMillis());
        a8.e eVar22 = zzlgVar.c;
        zzlg.C(eVar22);
        eVar22.U(arrayList);
        zzlgVar.x();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f19038a) {
            case 0:
                if (!(obj instanceof w0.c)) {
                    return false;
                }
                w0.c cVar = (w0.c) obj;
                Object obj2 = cVar.f30902a;
                Object obj3 = this.f19039b;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
                Object obj4 = this.c;
                Object obj5 = cVar.f30903b;
                if (obj5 != obj4 && (obj5 == null || !obj5.equals(obj4))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        int hashCode;
        switch (this.f19038a) {
            case 0:
                Object obj = this.f19039b;
                int i10 = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                return hashCode ^ i10;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.f19038a) {
            case 0:
                return "Pair{" + String.valueOf(this.f19039b) + " " + String.valueOf(this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h(int i10, Object obj, Serializable serializable) {
        this.f19038a = i10;
        this.f19039b = serializable;
        this.c = obj;
    }

    public h(zzko zzkoVar) {
        this.f19038a = 2;
        this.c = zzkoVar;
    }

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f19038a = i10;
        this.f19039b = obj;
        this.c = obj2;
    }

    public h(String str) {
        this.f19038a = 7;
        this.c = null;
        this.f19039b = str;
        this.c = new Bundle();
    }

    public h(db.b bVar) {
        this.f19038a = 6;
        this.c = Collections.synchronizedMap(new HashMap());
        this.f19039b = bVar;
    }
}
