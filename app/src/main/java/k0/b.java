package k0;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public final class b extends androidx.core.content.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f19457a = 0;

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* renamed from: k0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0261b {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class e extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f19458a;

        public e(a0 a0Var) {
            this.f19458a = a0Var;
        }

        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap bitmap;
            Bitmap bitmap2;
            a0 a0Var = this.f19458a;
            a0Var.getClass();
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                            bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            int i10 = (int) (intrinsicWidth * min);
                            int i11 = (int) (intrinsicHeight * min);
                            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i12 = bounds.left;
                            int i13 = bounds.top;
                            int i14 = bounds.right;
                            int i15 = bounds.bottom;
                            drawable.setBounds(0, 0, i10, i11);
                            drawable.draw(canvas);
                            drawable.setBounds(i12, i13, i14, i15);
                            bitmap2 = createBitmap;
                        }
                    } else {
                        bitmap2 = null;
                    }
                    if (bitmap2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap2);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                            return bundle;
                        }
                        return bundle;
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round > 0 && round2 > 0) {
                float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
                int i16 = (int) (round * min2);
                int i17 = (int) (round2 * min2);
                if (a0Var.f19456a == null) {
                    a0Var.f19456a = new Matrix();
                }
                a0Var.f19456a.set(matrix);
                a0Var.f19456a.postTranslate(-rectF.left, -rectF.top);
                a0Var.f19456a.postScale(min2, min2);
                bitmap = Bitmap.createBitmap(i16, i17, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.concat(a0Var.f19456a);
                view.draw(canvas2);
            } else {
                bitmap = null;
            }
            return bitmap;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            this.f19458a.getClass();
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (bitmap == null) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix matrix = new Matrix();
                    matrix.setValues(floatArray);
                    imageView.setImageMatrix(matrix);
                    return imageView;
                }
                return imageView;
            } else if (!(parcelable instanceof Bitmap)) {
                return null;
            } else {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageBitmap((Bitmap) parcelable);
                return imageView2;
            }
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f19458a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
            this.f19458a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f19458a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f19458a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f19458a.getClass();
            c.a(onSharedElementsReadyListener);
        }
    }

    public static void a(Activity activity, String[] strArr, int i10) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (!TextUtils.isEmpty(strArr[i11])) {
                if (!s0.a.b() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            } else {
                throw new IllegalArgumentException(androidx.activity.r.g(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof d) {
            ((d) activity).validateRequestPermissionsRequestCode(i10);
        }
        c.b(activity, strArr, i10);
    }

    public static boolean b(Activity activity, String str) {
        if (!s0.a.b() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        return c.c(activity, str);
    }
}
