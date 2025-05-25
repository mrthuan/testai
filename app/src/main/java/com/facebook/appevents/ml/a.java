package com.facebook.appevents.ml;

import a6.h;
import com.facebook.appevents.ml.ModelManager;
import d6.c;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.jvm.internal.g;

/* compiled from: Model.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static final HashMap f9632m = q.z0(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* renamed from: a  reason: collision with root package name */
    public final d6.a f9633a;

    /* renamed from: b  reason: collision with root package name */
    public final d6.a f9634b;
    public final d6.a c;

    /* renamed from: d  reason: collision with root package name */
    public final d6.a f9635d;

    /* renamed from: e  reason: collision with root package name */
    public final d6.a f9636e;

    /* renamed from: f  reason: collision with root package name */
    public final d6.a f9637f;

    /* renamed from: g  reason: collision with root package name */
    public final d6.a f9638g;

    /* renamed from: h  reason: collision with root package name */
    public final d6.a f9639h;

    /* renamed from: i  reason: collision with root package name */
    public final d6.a f9640i;

    /* renamed from: j  reason: collision with root package name */
    public final d6.a f9641j;

    /* renamed from: k  reason: collision with root package name */
    public final d6.a f9642k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f9643l;

    public a() {
        throw null;
    }

    public a(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj != null) {
            this.f9633a = (d6.a) obj;
            Object obj2 = hashMap.get("convs.0.weight");
            if (obj2 != null) {
                this.f9634b = c.l((d6.a) obj2);
                Object obj3 = hashMap.get("convs.1.weight");
                if (obj3 != null) {
                    this.c = c.l((d6.a) obj3);
                    Object obj4 = hashMap.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f9635d = c.l((d6.a) obj4);
                        Object obj5 = hashMap.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f9636e = (d6.a) obj5;
                            Object obj6 = hashMap.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f9637f = (d6.a) obj6;
                                Object obj7 = hashMap.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f9638g = (d6.a) obj7;
                                    Object obj8 = hashMap.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f9639h = c.k((d6.a) obj8);
                                        Object obj9 = hashMap.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f9640i = c.k((d6.a) obj9);
                                            Object obj10 = hashMap.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f9641j = (d6.a) obj10;
                                                Object obj11 = hashMap.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f9642k = (d6.a) obj11;
                                                    this.f9643l = new HashMap();
                                                    for (String str : ea.a.z(ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey())) {
                                                        String c = h.c(str, ".weight");
                                                        String c10 = h.c(str, ".bias");
                                                        d6.a aVar = (d6.a) hashMap.get(c);
                                                        d6.a aVar2 = (d6.a) hashMap.get(c10);
                                                        if (aVar != null) {
                                                            this.f9643l.put(c, c.k(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.f9643l.put(c10, aVar2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final d6.a a(d6.a aVar, String[] strArr, String task) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            g.e(task, "task");
            d6.a c = c.c(c.e(strArr, this.f9633a), this.f9634b);
            c.a(c, this.f9636e);
            c.i(c);
            d6.a c10 = c.c(c, this.c);
            c.a(c10, this.f9637f);
            c.i(c10);
            d6.a g10 = c.g(c10, 2);
            d6.a c11 = c.c(g10, this.f9635d);
            c.a(c11, this.f9638g);
            c.i(c11);
            d6.a g11 = c.g(c, c.f16118a[1]);
            d6.a g12 = c.g(g10, g10.f16118a[1]);
            d6.a g13 = c.g(c11, c11.f16118a[1]);
            c.f(g11);
            c.f(g12);
            c.f(g13);
            d6.a d10 = c.d(c.b(new d6.a[]{g11, g12, g13, aVar}), this.f9639h, this.f9641j);
            c.i(d10);
            d6.a d11 = c.d(d10, this.f9640i, this.f9642k);
            c.i(d11);
            HashMap hashMap = this.f9643l;
            d6.a aVar2 = (d6.a) hashMap.get(task.concat(".weight"));
            d6.a aVar3 = (d6.a) hashMap.get(task.concat(".bias"));
            if (aVar2 != null && aVar3 != null) {
                d6.a d12 = c.d(d11, aVar2, aVar3);
                c.j(d12);
                return d12;
            }
            return null;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
