package i4;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import java.util.HashSet;

/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes.dex */
public class m extends Fragment {
    public final i4.a Y;
    public final a Z;

    /* renamed from: a0  reason: collision with root package name */
    public final HashSet f18459a0;

    /* renamed from: b0  reason: collision with root package name */
    public m f18460b0;

    /* renamed from: c0  reason: collision with root package name */
    public com.bumptech.glide.f f18461c0;

    /* renamed from: d0  reason: collision with root package name */
    public Fragment f18462d0;

    /* compiled from: SupportRequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements k {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + m.this + "}";
        }
    }

    public m() {
        i4.a aVar = new i4.a();
        this.Z = new a();
        this.f18459a0 = new HashSet();
        this.Y = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment] */
    @Override // androidx.fragment.app.Fragment
    public final void L(Context context) {
        super.L(context);
        m mVar = this;
        while (true) {
            ?? r02 = mVar.f3689v;
            if (r02 == 0) {
                break;
            }
            mVar = r02;
        }
        g0 g0Var = mVar.f3686s;
        if (g0Var == null) {
            Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            p0(r(), g0Var);
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void O() {
        this.F = true;
        this.Y.a();
        m mVar = this.f18460b0;
        if (mVar != null) {
            mVar.f18459a0.remove(this);
            this.f18460b0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Q() {
        this.F = true;
        this.f18462d0 = null;
        m mVar = this.f18460b0;
        if (mVar != null) {
            mVar.f18459a0.remove(this);
            this.f18460b0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.F = true;
        this.Y.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Z() {
        this.F = true;
        this.Y.d();
    }

    public final void p0(Context context, g0 g0Var) {
        m mVar = this.f18460b0;
        if (mVar != null) {
            mVar.f18459a0.remove(this);
            this.f18460b0 = null;
        }
        j jVar = com.bumptech.glide.b.b(context).f6837f;
        jVar.getClass();
        m j10 = jVar.j(g0Var, null, j.k(context));
        this.f18460b0 = j10;
        if (!equals(j10)) {
            this.f18460b0.f18459a0.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment fragment = this.f3689v;
        if (fragment == null) {
            fragment = this.f18462d0;
        }
        sb2.append(fragment);
        sb2.append("}");
        return sb2.toString();
    }
}
