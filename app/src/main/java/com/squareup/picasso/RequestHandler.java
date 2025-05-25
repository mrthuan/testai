package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import kk.y;

/* loaded from: classes2.dex */
public abstract class RequestHandler {

    /* loaded from: classes2.dex */
    public static final class Result {
        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final y source;

        public Result(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) Utils.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getExifOrientation() {
            return this.exifOrientation;
        }

        public Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        public y getSource() {
            return this.source;
        }

        public Result(y yVar, Picasso.LoadedFrom loadedFrom) {
            this(null, (y) Utils.checkNotNull(yVar, "source == null"), loadedFrom, 0);
        }

        public Result(Bitmap bitmap, y yVar, Picasso.LoadedFrom loadedFrom, int i10) {
            if ((bitmap != null) != (yVar != null)) {
                this.bitmap = bitmap;
                this.source = yVar;
                this.loadedFrom = (Picasso.LoadedFrom) Utils.checkNotNull(loadedFrom, "loadedFrom == null");
                this.exifOrientation = i10;
                return;
            }
            throw new AssertionError();
        }
    }

    public static void calculateInSampleSize(int i10, int i11, BitmapFactory.Options options, Request request) {
        calculateInSampleSize(i10, i11, options.outWidth, options.outHeight, options, request);
    }

    public static BitmapFactory.Options createBitmapOptions(Request request) {
        boolean z10;
        boolean hasSize = request.hasSize();
        if (request.config != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!hasSize && !z10 && !request.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = hasSize;
        boolean z11 = request.purgeable;
        options.inInputShareable = z11;
        options.inPurgeable = z11;
        if (z10) {
            options.inPreferredConfig = request.config;
        }
        return options;
    }

    public static boolean requiresInSampleSize(BitmapFactory.Options options) {
        if (options != null && options.inJustDecodeBounds) {
            return true;
        }
        return false;
    }

    public abstract boolean canHandleRequest(Request request);

    public int getRetryCount() {
        return 0;
    }

    public abstract Result load(Request request, int i10);

    public boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    public boolean supportsReplay() {
        return false;
    }

    public static void calculateInSampleSize(int i10, int i11, int i12, int i13, BitmapFactory.Options options, Request request) {
        int min;
        double floor;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                floor = Math.floor(i12 / i10);
            } else if (i10 == 0) {
                floor = Math.floor(i13 / i11);
            } else {
                int floor2 = (int) Math.floor(i13 / i11);
                int floor3 = (int) Math.floor(i12 / i10);
                if (request.centerInside) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }
}
