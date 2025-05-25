package kotlinx.coroutines.sync;

import androidx.activity.s;
import cg.l;
import com.android.billingclient.api.a0;
import com.google.android.play.core.assetpacks.b1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.g;
import kotlinx.coroutines.h;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.y;

/* compiled from: Mutex.kt */
/* loaded from: classes.dex */
public final class MutexImpl extends b implements kotlinx.coroutines.sync.a {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20253h = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner");
    private volatile Object owner;

    /* compiled from: Mutex.kt */
    /* loaded from: classes.dex */
    public final class a implements g<tf.d>, s1 {

        /* renamed from: a  reason: collision with root package name */
        public final h<tf.d> f20254a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f20255b = null;

        public a(h hVar) {
            this.f20254a = hVar;
        }

        @Override // kotlinx.coroutines.g
        public final void A(Object obj) {
            this.f20254a.A(obj);
        }

        @Override // kotlinx.coroutines.g
        public final boolean a() {
            return this.f20254a.a();
        }

        @Override // kotlinx.coroutines.s1
        public final void b(q<?> qVar, int i10) {
            this.f20254a.b(qVar, i10);
        }

        @Override // kotlinx.coroutines.g
        public final a0 g(Object obj, l lVar) {
            final MutexImpl mutexImpl = MutexImpl.this;
            l<Throwable, tf.d> lVar2 = new l<Throwable, tf.d>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
                    invoke2(th2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    MutexImpl.f20253h.set(MutexImpl.this, this.f20255b);
                    MutexImpl.this.b(this.f20255b);
                }
            };
            a0 g10 = this.f20254a.g((tf.d) obj, lVar2);
            if (g10 != null) {
                MutexImpl.f20253h.set(mutexImpl, this.f20255b);
            }
            return g10;
        }

        @Override // kotlin.coroutines.c
        public final CoroutineContext getContext() {
            return this.f20254a.f20159e;
        }

        @Override // kotlinx.coroutines.g
        public final void o(l lVar, Object obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.f20253h;
            Object obj2 = this.f20255b;
            final MutexImpl mutexImpl = MutexImpl.this;
            atomicReferenceFieldUpdater.set(mutexImpl, obj2);
            l<Throwable, tf.d> lVar2 = new l<Throwable, tf.d>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
                    invoke2(th2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    MutexImpl.this.b(this.f20255b);
                }
            };
            this.f20254a.o(lVar2, (tf.d) obj);
        }

        @Override // kotlin.coroutines.c
        public final void resumeWith(Object obj) {
            this.f20254a.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.g
        public final void z(CoroutineDispatcher coroutineDispatcher, tf.d dVar) {
            this.f20254a.z(coroutineDispatcher, dVar);
        }
    }

    public MutexImpl(boolean z10) {
        super(z10 ? 1 : 0);
        a0 a0Var;
        if (z10) {
            a0Var = null;
        } else {
            a0Var = s.f1851f;
        }
        this.owner = a0Var;
        new cg.q<mg.b<?>, Object, Object, l<? super Throwable, ? extends tf.d>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // cg.q
            public final l<Throwable, tf.d> invoke(mg.b<?> bVar, final Object obj, Object obj2) {
                final MutexImpl mutexImpl = MutexImpl.this;
                return new l<Throwable, tf.d>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
                        invoke2(th2);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        MutexImpl.this.b(obj);
                    }
                };
            }
        };
    }

    @Override // kotlinx.coroutines.sync.a
    public final Object a(kotlin.coroutines.c cVar) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b.f20259g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f20260a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                z10 = false;
                if (i11 <= 0) {
                    z11 = false;
                    break;
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            f20253h.set(this, null);
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            if (!z12) {
                if (!z12) {
                    throw new IllegalStateException("unexpected".toString());
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
        } else {
            z10 = true;
        }
        if (z10) {
            return tf.d.f30009a;
        }
        h v10 = aj.b.v(b1.L(cVar));
        try {
            c(new a(v10));
            Object r4 = v10.r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (r4 != coroutineSingletons) {
                r4 = tf.d.f30009a;
            }
            if (r4 != coroutineSingletons) {
                return tf.d.f30009a;
            }
            return r4;
        } catch (Throwable th2) {
            v10.y();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.sync.a
    public final void b(Object obj) {
        boolean z10;
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20253h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            a0 a0Var = s.f1851f;
            if (obj2 != a0Var) {
                boolean z11 = false;
                if (obj2 != obj && obj != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a0Var)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        d();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final boolean e() {
        if (Math.max(b.f20259g.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Mutex@" + y.b(this) + "[isLocked=" + e() + ",owner=" + f20253h.get(this) + ']';
    }
}
