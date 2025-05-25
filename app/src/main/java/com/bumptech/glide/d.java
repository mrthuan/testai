package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.y;

/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final a f6840k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final w3.b f6841a;

    /* renamed from: b  reason: collision with root package name */
    public final Registry f6842b;
    public final y c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f6843d;

    /* renamed from: e  reason: collision with root package name */
    public final List<l4.d<Object>> f6844e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, g<?, ?>> f6845f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.load.engine.e f6846g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6847h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6848i;

    /* renamed from: j  reason: collision with root package name */
    public l4.e f6849j;

    public d(Context context, w3.b bVar, Registry registry, y yVar, c cVar, y.b bVar2, List list, com.bumptech.glide.load.engine.e eVar, int i10) {
        super(context.getApplicationContext());
        this.f6841a = bVar;
        this.f6842b = registry;
        this.c = yVar;
        this.f6843d = cVar;
        this.f6844e = list;
        this.f6845f = bVar2;
        this.f6846g = eVar;
        this.f6847h = false;
        this.f6848i = i10;
    }
}
