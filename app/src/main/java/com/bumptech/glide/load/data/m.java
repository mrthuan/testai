package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: classes.dex */
public final class m extends b<InputStream> {
    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
