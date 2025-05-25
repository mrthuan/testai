package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class b implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int a10 = iVersions.a(context, str, true);
        selectionResult.f11424b = a10;
        if (a10 != 0) {
            selectionResult.c = 1;
        } else {
            int b10 = iVersions.b(context, str);
            selectionResult.f11423a = b10;
            if (b10 != 0) {
                selectionResult.c = -1;
            }
        }
        return selectionResult;
    }
}
