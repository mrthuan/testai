package com.google.android.tools;

import android.net.Uri;
import com.facebook.applinks.b;
import kotlin.Result;

/* compiled from: AttrsHandler.kt */
/* loaded from: classes2.dex */
public final class b implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.g<String> f13482a;

    public b(kotlinx.coroutines.h hVar) {
        this.f13482a = hVar;
    }

    @Override // com.facebook.applinks.b.a
    public final void a(com.facebook.applinks.b bVar) {
        Uri uri;
        if (bVar != null) {
            uri = bVar.f9672a;
        } else {
            uri = null;
        }
        kotlinx.coroutines.g<String> gVar = this.f13482a;
        if (uri != null) {
            gVar.resumeWith(Result.m13constructorimpl(uri.toString()));
        } else {
            gVar.resumeWith(Result.m13constructorimpl(null));
        }
    }
}
