package com.google.ads.mediation.inmobi;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class ImageDownloaderAsyncTask extends AsyncTask<Object, Void, HashMap<String, Drawable>> {
    static final String KEY_ICON = "icon_key";
    static final String KEY_IMAGE = "image_key";
    private final long drawableFutureTimeoutSeconds;
    private final DrawableDownloadListener listener;
    final InMobiMemoryCache memoryCache;

    /* loaded from: classes.dex */
    public interface DrawableDownloadListener {
        void onDownloadFailure();

        void onDownloadSuccess(HashMap<String, Drawable> hashMap);
    }

    public ImageDownloaderAsyncTask(DrawableDownloadListener drawableDownloadListener) {
        this.memoryCache = new InMobiMemoryCache();
        this.listener = drawableDownloadListener;
        this.drawableFutureTimeoutSeconds = 10L;
    }

    private Future<Drawable> getDrawableFuture(final URL url, ExecutorService executorService) {
        return executorService.submit(new Callable<Drawable>() { // from class: com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() {
                Bitmap decodeStream = BitmapFactory.decodeStream(url.openStream());
                decodeStream.setDensity(160);
                return new BitmapDrawable(Resources.getSystem(), decodeStream);
            }
        });
    }

    @Override // android.os.AsyncTask
    public HashMap<String, Drawable> doInBackground(Object... objArr) {
        Drawable drawable;
        HashMap hashMap = (HashMap) objArr[0];
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        try {
            if (this.memoryCache.get(String.valueOf(hashMap.get(KEY_ICON))) != null) {
                drawable = this.memoryCache.get(String.valueOf(hashMap.get(KEY_ICON)));
            } else {
                Drawable drawable2 = getDrawableFuture((URL) hashMap.get(KEY_ICON), newCachedThreadPool).get(this.drawableFutureTimeoutSeconds, TimeUnit.SECONDS);
                this.memoryCache.put(String.valueOf(hashMap.get(KEY_ICON)), drawable2);
                drawable = drawable2;
            }
            HashMap<String, Drawable> hashMap2 = new HashMap<>();
            hashMap2.put(KEY_ICON, drawable);
            return hashMap2;
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(HashMap<String, Drawable> hashMap) {
        super.onPostExecute((ImageDownloaderAsyncTask) hashMap);
        if (hashMap != null) {
            this.listener.onDownloadSuccess(hashMap);
        } else {
            this.listener.onDownloadFailure();
        }
    }

    public ImageDownloaderAsyncTask(DrawableDownloadListener drawableDownloadListener, Long l10) {
        this.memoryCache = new InMobiMemoryCache();
        this.listener = drawableDownloadListener;
        this.drawableFutureTimeoutSeconds = l10.longValue();
    }
}
