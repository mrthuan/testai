package com.google.ads.mediation.inmobi;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes.dex */
class InMobiNativeMappedImage extends NativeAd.Image {
    private final Drawable inMobiDrawable;
    private final Uri inMobiImageUri;
    private final double inMobiScale;

    public InMobiNativeMappedImage(Drawable drawable, Uri uri, double d10) {
        this.inMobiDrawable = drawable;
        this.inMobiImageUri = uri;
        this.inMobiScale = d10;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Drawable getDrawable() {
        return this.inMobiDrawable;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public double getScale() {
        return this.inMobiScale;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Uri getUri() {
        return this.inMobiImageUri;
    }
}
