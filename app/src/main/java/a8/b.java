package a8;

import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class b extends c2 {

    /* renamed from: d  reason: collision with root package name */
    public String f109d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet f110e;

    /* renamed from: f  reason: collision with root package name */
    public y.b f111f;

    /* renamed from: g  reason: collision with root package name */
    public Long f112g;

    /* renamed from: h  reason: collision with root package name */
    public Long f113h;

    public final m2 q(Integer num) {
        if (this.f111f.containsKey(num)) {
            return (m2) this.f111f.getOrDefault(num, null);
        }
        m2 m2Var = new m2(this, this.f109d);
        this.f111f.put(num, m2Var);
        return m2Var;
    }

    @Override // a8.c2
    public final void p() {
    }
}
