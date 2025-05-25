package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ImageViewAction extends Action<ImageView> {
    Callback callback;

    public ImageViewAction(Picasso picasso, ImageView imageView, Request request, int i10, int i11, int i12, Drawable drawable, String str, Object obj, Callback callback, boolean z10) {
        super(picasso, imageView, request, i10, i11, i12, drawable, str, obj, z10);
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    public void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.target.get();
            if (imageView == null) {
                return;
            }
            Picasso picasso = this.picasso;
            PicassoDrawable.setBitmap(imageView, picasso.context, bitmap, loadedFrom, this.noFade, picasso.indicatorsEnabled);
            Callback callback = this.callback;
            if (callback != null) {
                callback.onSuccess();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
        ImageView imageView = (ImageView) this.target.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i10 = this.errorResId;
        if (i10 != 0) {
            imageView.setImageResource(i10);
        } else {
            Drawable drawable2 = this.errorDrawable;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }
}
