package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.annotation.KeepForSdk;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class StringResourceValueReader {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f11232a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11233b;

    public StringResourceValueReader(Context context) {
        Preconditions.j(context);
        Resources resources = context.getResources();
        this.f11232a = resources;
        this.f11233b = resources.getResourcePackageName(R.string.arg_res_0x7f1300be);
    }

    @KeepForSdk
    public final String a(String str) {
        String str2 = this.f11233b;
        Resources resources = this.f11232a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
