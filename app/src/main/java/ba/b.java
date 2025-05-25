package ba;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import ga.e;
import ga.r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5395a;

    public /* synthetic */ b(int i10) {
        this.f5395a = i10;
    }

    @Override // ga.e
    public final Object a(r rVar) {
        a lambda$getComponents$0;
        switch (this.f5395a) {
            case 0:
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(rVar);
                return lambda$getComponents$0;
            default:
                return FirebaseMessagingRegistrar.a(rVar);
        }
    }
}
