package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class LruCache implements Cache {
    final android.util.LruCache<String, BitmapAndSize> cache;

    /* loaded from: classes2.dex */
    public static final class BitmapAndSize {
        final Bitmap bitmap;
        final int byteCount;

        public BitmapAndSize(Bitmap bitmap, int i10) {
            this.bitmap = bitmap;
            this.byteCount = i10;
        }
    }

    public LruCache(Context context) {
        this(Utils.calculateMemoryCacheSize(context));
    }

    @Override // com.squareup.picasso.Cache
    public void clear() {
        this.cache.evictAll();
    }

    @Override // com.squareup.picasso.Cache
    public void clearKeyUri(String str) {
        for (String str2 : this.cache.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.cache.remove(str2);
            }
        }
    }

    public int evictionCount() {
        return this.cache.evictionCount();
    }

    @Override // com.squareup.picasso.Cache
    public Bitmap get(String str) {
        BitmapAndSize bitmapAndSize = this.cache.get(str);
        if (bitmapAndSize != null) {
            return bitmapAndSize.bitmap;
        }
        return null;
    }

    public int hitCount() {
        return this.cache.hitCount();
    }

    @Override // com.squareup.picasso.Cache
    public int maxSize() {
        return this.cache.maxSize();
    }

    public int missCount() {
        return this.cache.missCount();
    }

    public int putCount() {
        return this.cache.putCount();
    }

    @Override // com.squareup.picasso.Cache
    public void set(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int bitmapBytes = Utils.getBitmapBytes(bitmap);
            if (bitmapBytes > maxSize()) {
                this.cache.remove(str);
                return;
            } else {
                this.cache.put(str, new BitmapAndSize(bitmap, bitmapBytes));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // com.squareup.picasso.Cache
    public int size() {
        return this.cache.size();
    }

    public LruCache(int i10) {
        this.cache = new android.util.LruCache<String, BitmapAndSize>(i10) { // from class: com.squareup.picasso.LruCache.1
            @Override // android.util.LruCache
            public int sizeOf(String str, BitmapAndSize bitmapAndSize) {
                return bitmapAndSize.byteCount;
            }
        };
    }
}
