package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import ge.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MediaStoreRequestHandler extends ContentStreamRequestHandler {
    private static final String[] CONTENT_ORIENTATION = {"orientation"};

    /* loaded from: classes2.dex */
    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i10, int i11, int i12) {
            this.androidKind = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    public MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getExifOrientation(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.MediaStoreRequestHandler.CONTENT_ORIENTATION     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            if (r1 == 0) goto L1e
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            if (r8 != 0) goto L16
            goto L1e
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            r1.close()
            return r8
        L1e:
            if (r1 == 0) goto L23
            r1.close()
        L23:
            return r0
        L24:
            r8 = move-exception
            if (r1 == 0) goto L2a
            r1.close()
        L2a:
            throw r8
        L2b:
            if (r1 == 0) goto L30
            r1.close()
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.getExifOrientation(android.content.ContentResolver, android.net.Uri):int");
    }

    public static PicassoKind getPicassoKind(int i10, int i11) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i10 <= picassoKind.width && i11 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        if (i10 <= picassoKind2.width && i11 <= picassoKind2.height) {
            return picassoKind2;
        }
        return PicassoKind.FULL;
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) {
        boolean z10;
        Bitmap thumbnail;
        int i11;
        ContentResolver contentResolver = this.context.getContentResolver();
        int exifOrientation = getExifOrientation(contentResolver, request.uri);
        String type = contentResolver.getType(request.uri);
        if (type != null && type.startsWith("video/")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (request.hasSize()) {
            PicassoKind picassoKind = getPicassoKind(request.targetWidth, request.targetHeight);
            if (!z10 && picassoKind == PicassoKind.FULL) {
                return new RequestHandler.Result(null, a.Z(getInputStream(request)), Picasso.LoadedFrom.DISK, exifOrientation);
            }
            long parseId = ContentUris.parseId(request.uri);
            BitmapFactory.Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
            createBitmapOptions.inJustDecodeBounds = true;
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, picassoKind.width, picassoKind.height, createBitmapOptions, request);
            if (z10) {
                if (picassoKind == PicassoKind.FULL) {
                    i11 = 1;
                } else {
                    i11 = picassoKind.androidKind;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i11, createBitmapOptions);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, picassoKind.androidKind, createBitmapOptions);
            }
            if (thumbnail != null) {
                return new RequestHandler.Result(thumbnail, null, Picasso.LoadedFrom.DISK, exifOrientation);
            }
        }
        return new RequestHandler.Result(null, a.Z(getInputStream(request)), Picasso.LoadedFrom.DISK, exifOrientation);
    }
}
