package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e2 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return f2.f13232a.matcher(str).matches();
    }
}
