package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Stats {
    private static final int BITMAP_DECODE_FINISHED = 2;
    private static final int BITMAP_TRANSFORMED_FINISHED = 3;
    private static final int CACHE_HIT = 0;
    private static final int CACHE_MISS = 1;
    private static final int DOWNLOAD_FINISHED = 4;
    private static final String STATS_THREAD_NAME = "Picasso-Stats";
    long averageDownloadSize;
    long averageOriginalBitmapSize;
    long averageTransformedBitmapSize;
    final Cache cache;
    long cacheHits;
    long cacheMisses;
    int downloadCount;
    final Handler handler;
    int originalBitmapCount;
    final HandlerThread statsThread;
    long totalDownloadSize;
    long totalOriginalBitmapSize;
    long totalTransformedBitmapSize;
    int transformedBitmapCount;

    /* loaded from: classes2.dex */
    public static class StatsHandler extends Handler {
        private final Stats stats;

        public StatsHandler(Looper looper, Stats stats) {
            super(looper);
            this.stats = stats;
        }

        @Override // android.os.Handler
        public void handleMessage(final Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.Stats.StatsHandler.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        throw new AssertionError("Unhandled stats message." + message.what);
                                    }
                                });
                                return;
                            } else {
                                this.stats.performDownloadFinished((Long) message.obj);
                                return;
                            }
                        }
                        this.stats.performBitmapTransformed(message.arg1);
                        return;
                    }
                    this.stats.performBitmapDecoded(message.arg1);
                    return;
                }
                this.stats.performCacheMiss();
                return;
            }
            this.stats.performCacheHit();
        }
    }

    public Stats(Cache cache) {
        this.cache = cache;
        HandlerThread handlerThread = new HandlerThread(STATS_THREAD_NAME, 10);
        this.statsThread = handlerThread;
        handlerThread.start();
        Utils.flushStackLocalLeaks(handlerThread.getLooper());
        this.handler = new StatsHandler(handlerThread.getLooper(), this);
    }

    private static long getAverage(int i10, long j10) {
        return j10 / i10;
    }

    private void processBitmap(Bitmap bitmap, int i10) {
        int bitmapBytes = Utils.getBitmapBytes(bitmap);
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(i10, bitmapBytes, 0));
    }

    public StatsSnapshot createSnapshot() {
        return new StatsSnapshot(this.cache.maxSize(), this.cache.size(), this.cacheHits, this.cacheMisses, this.totalDownloadSize, this.totalOriginalBitmapSize, this.totalTransformedBitmapSize, this.averageDownloadSize, this.averageOriginalBitmapSize, this.averageTransformedBitmapSize, this.downloadCount, this.originalBitmapCount, this.transformedBitmapCount, System.currentTimeMillis());
    }

    public void dispatchBitmapDecoded(Bitmap bitmap) {
        processBitmap(bitmap, 2);
    }

    public void dispatchBitmapTransformed(Bitmap bitmap) {
        processBitmap(bitmap, 3);
    }

    public void dispatchCacheHit() {
        this.handler.sendEmptyMessage(0);
    }

    public void dispatchCacheMiss() {
        this.handler.sendEmptyMessage(1);
    }

    public void dispatchDownloadFinished(long j10) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j10)));
    }

    public void performBitmapDecoded(long j10) {
        int i10 = this.originalBitmapCount + 1;
        this.originalBitmapCount = i10;
        long j11 = this.totalOriginalBitmapSize + j10;
        this.totalOriginalBitmapSize = j11;
        this.averageOriginalBitmapSize = getAverage(i10, j11);
    }

    public void performBitmapTransformed(long j10) {
        this.transformedBitmapCount++;
        long j11 = this.totalTransformedBitmapSize + j10;
        this.totalTransformedBitmapSize = j11;
        this.averageTransformedBitmapSize = getAverage(this.originalBitmapCount, j11);
    }

    public void performCacheHit() {
        this.cacheHits++;
    }

    public void performCacheMiss() {
        this.cacheMisses++;
    }

    public void performDownloadFinished(Long l10) {
        this.downloadCount++;
        long longValue = l10.longValue() + this.totalDownloadSize;
        this.totalDownloadSize = longValue;
        this.averageDownloadSize = getAverage(this.downloadCount, longValue);
    }

    public void shutdown() {
        this.statsThread.quit();
    }
}
