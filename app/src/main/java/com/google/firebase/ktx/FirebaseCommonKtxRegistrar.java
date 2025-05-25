package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ga.e;
import ga.k;
import ga.q;
import ga.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.CoroutineDispatcher;
import lb.f;

/* compiled from: Firebase.kt */
@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final a<T> f13630a = new a<>();

        @Override // ga.e
        public final Object a(r rVar) {
            Object f10 = rVar.f(new q<>(fa.a.class, Executor.class));
            g.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return com.google.android.play.core.assetpacks.c.v((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final b<T> f13631a = new b<>();

        @Override // ga.e
        public final Object a(r rVar) {
            Object f10 = rVar.f(new q<>(fa.c.class, Executor.class));
            g.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return com.google.android.play.core.assetpacks.c.v((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final c<T> f13632a = new c<>();

        @Override // ga.e
        public final Object a(r rVar) {
            Object f10 = rVar.f(new q<>(fa.b.class, Executor.class));
            g.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return com.google.android.play.core.assetpacks.c.v((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final d<T> f13633a = new d<>();

        @Override // ga.e
        public final Object a(r rVar) {
            Object f10 = rVar.f(new q<>(fa.d.class, Executor.class));
            g.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return com.google.android.play.core.assetpacks.c.v((Executor) f10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ga.b<?>> getComponents() {
        ga.b[] bVarArr = new ga.b[5];
        bVarArr[0] = f.a("fire-core-ktx", "20.3.2");
        q qVar = new q(fa.a.class, CoroutineDispatcher.class);
        q[] qVarArr = new q[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            if (qVar2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, qVarArr);
        k kVar = new k(new q(fa.a.class, Executor.class), 1, 0);
        if (!hashSet.contains(kVar.f17729a)) {
            hashSet2.add(kVar);
            bVarArr[1] = new ga.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, a.f13630a, hashSet3);
            q qVar3 = new q(fa.c.class, CoroutineDispatcher.class);
            q[] qVarArr2 = new q[0];
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            HashSet hashSet6 = new HashSet();
            hashSet4.add(qVar3);
            for (q qVar4 : qVarArr2) {
                if (qVar4 == null) {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(hashSet4, qVarArr2);
            k kVar2 = new k(new q(fa.c.class, Executor.class), 1, 0);
            if (!hashSet4.contains(kVar2.f17729a)) {
                hashSet5.add(kVar2);
                bVarArr[2] = new ga.b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, b.f13631a, hashSet6);
                q qVar5 = new q(fa.b.class, CoroutineDispatcher.class);
                q[] qVarArr3 = new q[0];
                HashSet hashSet7 = new HashSet();
                HashSet hashSet8 = new HashSet();
                HashSet hashSet9 = new HashSet();
                hashSet7.add(qVar5);
                for (q qVar6 : qVarArr3) {
                    if (qVar6 == null) {
                        throw new NullPointerException("Null interface");
                    }
                }
                Collections.addAll(hashSet7, qVarArr3);
                k kVar3 = new k(new q(fa.b.class, Executor.class), 1, 0);
                if (!hashSet7.contains(kVar3.f17729a)) {
                    hashSet8.add(kVar3);
                    bVarArr[3] = new ga.b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, c.f13632a, hashSet9);
                    q qVar7 = new q(fa.d.class, CoroutineDispatcher.class);
                    q[] qVarArr4 = new q[0];
                    HashSet hashSet10 = new HashSet();
                    HashSet hashSet11 = new HashSet();
                    HashSet hashSet12 = new HashSet();
                    hashSet10.add(qVar7);
                    for (q qVar8 : qVarArr4) {
                        if (qVar8 == null) {
                            throw new NullPointerException("Null interface");
                        }
                    }
                    Collections.addAll(hashSet10, qVarArr4);
                    k kVar4 = new k(new q(fa.d.class, Executor.class), 1, 0);
                    if (!hashSet10.contains(kVar4.f17729a)) {
                        hashSet11.add(kVar4);
                        bVarArr[4] = new ga.b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, d.f13633a, hashSet12);
                        return ge.a.I(bVarArr);
                    }
                    throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
                }
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
