package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadPoolExecutor f10349a = new ThreadPoolExecutor(2, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new a("ClientDefault"));

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f10350b = Executors.newSingleThreadExecutor(new a("ClientSingle"));
}
