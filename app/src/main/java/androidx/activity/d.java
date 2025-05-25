package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.g0;
import androidx.lifecycle.e0;
import androidx.savedstate.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1804b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f1803a = i10;
        this.f1804b = obj;
    }

    @Override // androidx.savedstate.a.b
    public final Bundle a() {
        Bundle lambda$new$1;
        int i10 = this.f1803a;
        Object obj = this.f1804b;
        switch (i10) {
            case 0:
                lambda$new$1 = ((ComponentActivity) obj).lambda$new$1();
                return lambda$new$1;
            case 1:
                return ((g0) obj).X();
            default:
                return e0.a((e0) obj);
        }
    }
}
