package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class d implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int a10;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int b10 = iVersions.b(context, str);
        selectionResult.f11423a = b10;
        int i10 = 1;
        int i11 = 0;
        if (b10 != 0) {
            a10 = iVersions.a(context, str, false);
            selectionResult.f11424b = a10;
        } else {
            a10 = iVersions.a(context, str, true);
            selectionResult.f11424b = a10;
        }
        int i12 = selectionResult.f11423a;
        if (i12 == 0) {
            if (a10 == 0) {
                i10 = 0;
                selectionResult.c = i10;
                return selectionResult;
            }
        } else {
            i11 = i12;
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        selectionResult.c = i10;
        return selectionResult;
    }
}
