package com.bytedance.sdk.component.Qhi;

import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.Qhi.EBS;
import com.bytedance.sdk.component.Qhi.MQ;
import com.bytedance.sdk.component.Qhi.bxS;
import com.bytedance.sdk.component.Qhi.fl;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CallHandler.java */
/* loaded from: classes.dex */
public class Sf implements bxS.Qhi {
    private final hm Qhi;
    private final iMK ROR;
    private final boolean Sf;
    private final com.bytedance.sdk.component.Qhi.Qhi WAv;
    private final qMt cJ;

    /* renamed from: hm  reason: collision with root package name */
    private final boolean f7990hm;

    /* renamed from: ac  reason: collision with root package name */
    private final Map<String, cJ> f7988ac = new HashMap();
    private final Map<String, fl.cJ> CJ = new HashMap();

    /* renamed from: fl  reason: collision with root package name */
    private final List<HzH> f7989fl = new ArrayList();
    private final Set<fl> Tgh = new HashSet();

    /* compiled from: CallHandler.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        boolean Qhi;
        String cJ;

        private Qhi(boolean z10, String str) {
            this.Qhi = z10;
            this.cJ = str;
        }
    }

    public Sf(Gm gm2, com.bytedance.sdk.component.Qhi.Qhi qhi, EBS ebs) {
        this.WAv = qhi;
        this.Qhi = gm2.CJ;
        qMt qmt = new qMt(ebs, gm2.f7979zc, gm2.ABk);
        this.cJ = qmt;
        qmt.Qhi(this);
        qmt.Qhi(gm2.hpZ);
        this.ROR = gm2.f7978hm;
        this.Sf = gm2.Sf;
        this.f7990hm = gm2.pA;
    }

    private Dww cJ(String str, cJ cJVar) {
        if (this.f7990hm) {
            return Dww.PRIVATE;
        }
        return this.cJ.Qhi(this.Sf, str, cJVar);
    }

    @MainThread
    public Qhi Qhi(HzH hzH, ROR ror) {
        cJ cJVar = this.f7988ac.get(hzH.CJ);
        if (cJVar != null) {
            try {
                Dww cJ = cJ(ror.cJ, cJVar);
                ror.CJ = cJ;
                if (cJ != null) {
                    if (cJVar instanceof Tgh) {
                        hzH.toString();
                        return Qhi(hzH, (Tgh) cJVar, ror);
                    } else if (cJVar instanceof ac) {
                        hzH.toString();
                        return Qhi(hzH, (ac) cJVar, cJ);
                    }
                } else {
                    hzH.toString();
                    throw new tP(-1);
                }
            } catch (EBS.Qhi unused) {
                hzH.toString();
                this.f7989fl.add(hzH);
                return new Qhi(false, CQU.Qhi());
            }
        }
        fl.cJ cJVar2 = this.CJ.get(hzH.CJ);
        if (cJVar2 != null) {
            fl Qhi2 = cJVar2.Qhi();
            Qhi2.Qhi(hzH.CJ);
            Dww cJ2 = cJ(ror.cJ, Qhi2);
            ror.CJ = cJ2;
            if (cJ2 != null) {
                hzH.toString();
                return Qhi(hzH, Qhi2, ror);
            }
            hzH.toString();
            Qhi2.CJ();
            throw new tP(-1);
        }
        hzH.toString();
        return null;
    }

    public void Qhi(String str, Tgh<?, ?> tgh) {
        tgh.Qhi(str);
        this.f7988ac.put(str, tgh);
    }

    public void Qhi(String str, fl.cJ cJVar) {
        this.CJ.put(str, cJVar);
    }

    public void Qhi() {
        for (fl flVar : this.Tgh) {
            flVar.fl();
        }
        this.Tgh.clear();
        this.f7988ac.clear();
        this.CJ.clear();
        this.cJ.cJ(this);
    }

    @MainThread
    private Qhi Qhi(HzH hzH, Tgh tgh, ROR ror) {
        return new Qhi(true, CQU.Qhi(this.Qhi.Qhi((hm) tgh.Qhi(Qhi(hzH.f7981fl, (cJ) tgh), ror))));
    }

    @MainThread
    private Qhi Qhi(final HzH hzH, final fl flVar, ROR ror) {
        this.Tgh.add(flVar);
        flVar.Qhi(Qhi(hzH.f7981fl, flVar), ror, new fl.Qhi() { // from class: com.bytedance.sdk.component.Qhi.Sf.1
            @Override // com.bytedance.sdk.component.Qhi.fl.Qhi
            public void Qhi(Object obj) {
                if (Sf.this.WAv == null) {
                    return;
                }
                Sf.this.WAv.cJ(CQU.Qhi(Sf.this.Qhi.Qhi((hm) obj)), hzH);
                Sf.this.Tgh.remove(flVar);
            }

            @Override // com.bytedance.sdk.component.Qhi.fl.Qhi
            public void Qhi(Throwable th2) {
                if (Sf.this.WAv == null) {
                    return;
                }
                Sf.this.WAv.cJ(CQU.Qhi(th2), hzH);
                Sf.this.Tgh.remove(flVar);
            }
        });
        return new Qhi(false, CQU.Qhi());
    }

    @MainThread
    private Qhi Qhi(final HzH hzH, ac acVar, Dww dww) {
        new MQ(hzH.CJ, dww, new MQ.Qhi() { // from class: com.bytedance.sdk.component.Qhi.Sf.2
        });
        return new Qhi(false, CQU.Qhi());
    }

    private Object Qhi(String str, cJ cJVar) {
        return this.Qhi.Qhi(str, Qhi(cJVar)[0]);
    }

    private static Type[] Qhi(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
