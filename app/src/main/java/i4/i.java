package i4;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes.dex */
public final class i extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final i4.a f18443a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18444b;
    public final HashSet c;

    /* renamed from: d  reason: collision with root package name */
    public com.bumptech.glide.f f18445d;

    /* renamed from: e  reason: collision with root package name */
    public i f18446e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f18447f;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements k {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + i.this + "}";
        }
    }

    public i() {
        i4.a aVar = new i4.a();
        this.f18444b = new a();
        this.c = new HashSet();
        this.f18443a = aVar;
    }

    public final void a(Activity activity) {
        i iVar = this.f18446e;
        if (iVar != null) {
            iVar.c.remove(this);
            this.f18446e = null;
        }
        j jVar = com.bumptech.glide.b.b(activity).f6837f;
        jVar.getClass();
        i i10 = jVar.i(activity.getFragmentManager(), null, j.k(activity));
        this.f18446e = i10;
        if (!equals(i10)) {
            this.f18446e.c.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f18443a.a();
        i iVar = this.f18446e;
        if (iVar != null) {
            iVar.c.remove(this);
            this.f18446e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        i iVar = this.f18446e;
        if (iVar != null) {
            iVar.c.remove(this);
            this.f18446e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f18443a.c();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f18443a.d();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f18447f;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
