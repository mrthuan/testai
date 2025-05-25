package c5;

import android.app.Activity;
import androidx.activity.s;
import cg.l;
import cg.p;
import h5.c;
import j5.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: MainUpgradeChecker.kt */
@wf.c(c = "com.drojian.upgradelib.MainUpgradeChecker$tryShowUpgradeDialog$1", f = "MainUpgradeChecker.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f5568a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f5569b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f5570d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f5.c f5571e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l<Boolean, tf.d> f5572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Activity activity, int i10, d dVar, f5.c cVar, l<? super Boolean, tf.d> lVar, kotlin.coroutines.c<? super c> cVar2) {
        super(2, cVar2);
        this.f5569b = activity;
        this.c = i10;
        this.f5570d = dVar;
        this.f5571e = cVar;
        this.f5572f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new c(this.f5569b, this.c, this.f5570d, this.f5571e, this.f5572f, cVar);
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((c) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f5568a;
        Activity activity = this.f5569b;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            String valueOf = String.valueOf(this.c);
            this.f5568a = 1;
            obj = t0.w0(j0.f20207b, new e5.f(activity, valueOf, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        e5.d dVar = (e5.d) obj;
        l<Boolean, tf.d> lVar = this.f5572f;
        if (dVar != null) {
            a b10 = a.b();
            b10.a();
            b10.c.f5583e.e(this.f5569b, this.f5570d.d(), dVar, this.f5571e, this.f5570d).show();
            kotlin.jvm.internal.g.e(activity, "activity");
            c.a aVar = h5.c.f18014h;
            if (aVar.a(activity).c() == 0) {
                aVar.a(activity).g(1);
            }
            h5.c a10 = aVar.a(activity);
            int c = aVar.a(activity).c();
            a10.f18021g = Integer.valueOf(c);
            a.C0258a c0258a = j5.a.f19040b;
            j5.a.b(c0258a.a(a10.f18016a), "pi_lmdsooat", c);
            if (!aVar.a(activity).e()) {
                h5.c a11 = aVar.a(activity);
                int a12 = aVar.a(activity).a() + 1;
                a11.c = Integer.valueOf(a12);
                j5.a.b(c0258a.a(a11.f18016a), "pi_mdit", a12);
            } else {
                aVar.a(activity).f(false);
            }
            h5.c a13 = aVar.a(activity);
            int b11 = aVar.a(activity).b() + 1;
            a13.f18019e = Integer.valueOf(b11);
            j5.a.b(c0258a.a(a13.f18016a), "pi_mdstt", b11);
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
        return tf.d.f30009a;
    }
}
