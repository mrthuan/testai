package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.inmobi.media.g8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1641g8 extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final String f15097a;

    /* renamed from: b  reason: collision with root package name */
    public C1627f8 f15098b;
    public ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressBar f15099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1641g8(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
        this.f15097a = "g8";
        Context context2 = getContext();
        kotlin.jvm.internal.g.d(context2, "getContext(...)");
        setVideoView(new C1627f8(context2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(getVideoView(), layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setVisibility(8);
        setPosterImage(imageView);
        addView(getPosterImage(), layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setVisibility(8);
        setProgressBar(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(getProgressBar(), layoutParams2);
        Context context3 = getContext();
        kotlin.jvm.internal.g.d(context3, "getContext(...)");
        Y7 y72 = new Y7(context3, null, 0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        getVideoView().setMediaController(y72);
        addView(y72, layoutParams3);
    }

    public final ImageView getPosterImage() {
        ImageView imageView = this.c;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.g.i("posterImage");
        throw null;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.f15099d;
        if (progressBar != null) {
            return progressBar;
        }
        kotlin.jvm.internal.g.i("progressBar");
        throw null;
    }

    public final C1627f8 getVideoView() {
        C1627f8 c1627f8 = this.f15098b;
        if (c1627f8 != null) {
            return c1627f8;
        }
        kotlin.jvm.internal.g.i("videoView");
        throw null;
    }

    public final void setPosterImage(ImageView imageView) {
        kotlin.jvm.internal.g.e(imageView, "<set-?>");
        this.c = imageView;
    }

    public final void setProgressBar(ProgressBar progressBar) {
        kotlin.jvm.internal.g.e(progressBar, "<set-?>");
        this.f15099d = progressBar;
    }

    public final void setVideoView(C1627f8 c1627f8) {
        kotlin.jvm.internal.g.e(c1627f8, "<set-?>");
        this.f15098b = c1627f8;
    }

    public final void setPosterImage(Bitmap bitmap) {
        getPosterImage().setImageBitmap(bitmap);
    }
}
