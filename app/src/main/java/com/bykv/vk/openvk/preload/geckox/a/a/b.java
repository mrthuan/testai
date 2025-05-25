package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* compiled from: CachePolicy.java */
@SuppressLint({"CI_StaticFieldLeak"})
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f7499a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final b f7500b = new f();
    public static final b c = new e();

    /* renamed from: d  reason: collision with root package name */
    protected a f7501d;

    /* renamed from: e  reason: collision with root package name */
    protected File f7502e;

    /* renamed from: f  reason: collision with root package name */
    protected List<String> f7503f;

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f7501d = aVar;
        this.f7502e = file;
        this.f7503f = list;
    }
}
