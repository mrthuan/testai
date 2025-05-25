package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class c implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f11423a = iVersions.b(context, str);
        int i10 = 1;
        int a10 = iVersions.a(context, str, true);
        selectionResult.f11424b = a10;
        int i11 = selectionResult.f11423a;
        if (i11 == 0) {
            i11 = 0;
            if (a10 == 0) {
                i10 = 0;
                selectionResult.c = i10;
                return selectionResult;
            }
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        selectionResult.c = i10;
        return selectionResult;
    }
}
