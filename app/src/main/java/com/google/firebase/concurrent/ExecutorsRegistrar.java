package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import fa.a;
import fa.c;
import fa.d;
import ga.b;
import ga.m;
import ga.q;
import ha.i;
import ha.j;
import ha.k;
import ha.l;
import ha.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final m<ScheduledExecutorService> f13493a = new m<>(new i());

    /* renamed from: b  reason: collision with root package name */
    public static final m<ScheduledExecutorService> f13494b = new m<>(new j());
    public static final m<ScheduledExecutorService> c = new m<>(new k());

    /* renamed from: d  reason: collision with root package name */
    public static final m<ScheduledExecutorService> f13495d = new m<>(new l(0));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        b[] bVarArr = new b[4];
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
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
        bVarArr[0] = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b.a(), hashSet3);
        q qVar3 = new q(fa.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(fa.b.class, ExecutorService.class), new q(fa.b.class, Executor.class)};
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
        bVarArr[1] = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new ha.m(), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
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
        bVarArr[2] = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new com.facebook.appevents.m(0), hashSet9);
        q qVar7 = new q(d.class, Executor.class);
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
        bVarArr[3] = new b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new n(0), hashSet12);
        return Arrays.asList(bVarArr);
    }
}
