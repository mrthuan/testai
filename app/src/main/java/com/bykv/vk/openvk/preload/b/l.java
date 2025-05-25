package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SubBranchInterceptor.java */
/* loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: g  reason: collision with root package name */
    Map<String, a> f7472g;

    /* compiled from: SubBranchInterceptor.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        List<h> f7473a = new ArrayList();

        public final a a(h hVar) {
            this.f7473a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f7473a.addAll(list);
            return this;
        }
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f7463a == f.class;
    }

    /* compiled from: SubBranchInterceptor.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, a> f7474a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private com.bykv.vk.openvk.preload.b.b.a f7475b;

        public final a a(String str) {
            if (!this.f7474a.containsKey(str)) {
                a aVar = new a();
                this.f7474a.put(str, aVar);
                return aVar;
            }
            throw new IllegalArgumentException("duplicated branch name");
        }

        public final h a(Class<? extends l> cls) {
            h.a a10 = new h.a().a(cls);
            a10.c = new Object[]{this.f7474a};
            a10.f7466b = this.f7475b;
            return a10.a();
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f7472g = (Map) obj;
                return;
            } catch (ClassCastException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        throw new IllegalStateException("args error");
    }
}
