package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o2.e;
import o2.k;
import o2.n;
import o2.o;
import y2.p;
import y2.r;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f4891a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4892b;
    public final HashSet c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4893d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4894e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f4895f;

    /* renamed from: g  reason: collision with root package name */
    public final z2.a f4896g;

    /* renamed from: h  reason: collision with root package name */
    public final o f4897h;

    /* renamed from: i  reason: collision with root package name */
    public final k f4898i;

    /* renamed from: j  reason: collision with root package name */
    public final e f4899j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f4900a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f4901b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, b bVar, List list, a aVar, int i10, ExecutorService executorService, z2.a aVar2, n nVar, r rVar, p pVar) {
        this.f4891a = uuid;
        this.f4892b = bVar;
        this.c = new HashSet(list);
        this.f4893d = aVar;
        this.f4894e = i10;
        this.f4895f = executorService;
        this.f4896g = aVar2;
        this.f4897h = nVar;
        this.f4898i = rVar;
        this.f4899j = pVar;
    }
}
