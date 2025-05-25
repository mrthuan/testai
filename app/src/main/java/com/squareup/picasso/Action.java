package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class Action<T> {
    boolean cancelled;
    final Drawable errorDrawable;
    final int errorResId;
    final String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final Picasso picasso;
    final Request request;
    final Object tag;
    final WeakReference<T> target;
    boolean willReplay;

    /* loaded from: classes2.dex */
    public static class RequestWeakReference<M> extends WeakReference<M> {
        final Action action;

        public RequestWeakReference(Action action, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.action = action;
        }
    }

    public Action(Picasso picasso, T t4, Request request, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        RequestWeakReference requestWeakReference;
        this.picasso = picasso;
        this.request = request;
        if (t4 == null) {
            requestWeakReference = null;
        } else {
            requestWeakReference = new RequestWeakReference(this, t4, picasso.referenceQueue);
        }
        this.target = requestWeakReference;
        this.memoryPolicy = i10;
        this.networkPolicy = i11;
        this.noFade = z10;
        this.errorResId = i12;
        this.errorDrawable = drawable;
        this.key = str;
        this.tag = obj == null ? this : obj;
    }

    public void cancel() {
        this.cancelled = true;
    }

    public abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void error(Exception exc);

    public String getKey() {
        return this.key;
    }

    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    public int getNetworkPolicy() {
        return this.networkPolicy;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    public Picasso.Priority getPriority() {
        return this.request.priority;
    }

    public Request getRequest() {
        return this.request;
    }

    public Object getTag() {
        return this.tag;
    }

    public T getTarget() {
        WeakReference<T> weakReference = this.target;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean willReplay() {
        return this.willReplay;
    }
}
