package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import s.b;
import z1.c;

/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f4661b;
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4662d;

    /* renamed from: e  reason: collision with root package name */
    public Recreator.a f4663e;

    /* renamed from: a  reason: collision with root package name */
    public final s.b<String, b> f4660a = new s.b<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f4664f = true;

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0024a {
        void a(c cVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        boolean z10;
        if (this.f4662d) {
            Bundle bundle = this.c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b() {
        Map.Entry components;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f4660a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                components = (Map.Entry) eVar.next();
                g.d(components, "components");
                bVar = (b) components.getValue();
            } else {
                return null;
            }
        } while (!g.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String key, b provider) {
        boolean z10;
        g.e(key, "key");
        g.e(provider, "provider");
        if (this.f4660a.b(key, provider) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void d() {
        if (this.f4664f) {
            Recreator.a aVar = this.f4663e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f4663e = aVar;
            try {
                k.a.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f4663e;
                if (aVar2 != null) {
                    aVar2.f4659a.add(k.a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + k.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
