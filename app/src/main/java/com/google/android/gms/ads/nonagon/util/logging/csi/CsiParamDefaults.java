package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public class CsiParamDefaults {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10761a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10762b;
    public final String c;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.f10761a = context;
        this.f10762b = context.getPackageName();
        this.c = versionInfoParcel.f10345a;
    }
}
