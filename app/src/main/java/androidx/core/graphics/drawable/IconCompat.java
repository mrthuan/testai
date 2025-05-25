package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionURI;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f3530k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f3531a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3532b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f3533d;

    /* renamed from: e  reason: collision with root package name */
    public int f3534e;

    /* renamed from: f  reason: collision with root package name */
    public int f3535f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3536g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f3537h;

    /* renamed from: i  reason: collision with root package name */
    public String f3538i;

    /* renamed from: j  reason: collision with root package name */
    public String f3539j;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                Objects.toString(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                Objects.toString(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                Objects.toString(obj);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r6, android.content.Context r7) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3531a = -1;
        this.c = null;
        this.f3533d = null;
        this.f3534e = 0;
        this.f3535f = 0;
        this.f3536g = null;
        this.f3537h = f3530k;
        this.f3538i = null;
    }

    public static Bitmap b(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat c(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3534e = i10;
            if (resources != null) {
                try {
                    iconCompat.f3532b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3532b = str;
            }
            iconCompat.f3539j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static Resources f(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", str);
            return null;
        }
    }

    public final void a(Context context) {
        Object obj;
        int identifier;
        if (this.f3531a == 2 && (obj = this.f3532b) != null) {
            String str = (String) obj;
            if (!str.contains(":")) {
                return;
            }
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split(PackagingURIHelper.FORWARD_SLASH_STRING, -1)[0];
            String str4 = str2.split(PackagingURIHelper.FORWARD_SLASH_STRING, -1)[1];
            String str5 = str.split(":", -1)[0];
            if (!"0_resource_name_obfuscated".equals(str4) && this.f3534e != (identifier = f(context, e()).getIdentifier(str4, str3, str5))) {
                this.f3534e = identifier;
            }
        }
    }

    public final int d() {
        int i10 = this.f3531a;
        if (i10 == -1) {
            return a.a(this.f3532b);
        }
        if (i10 == 2) {
            return this.f3534e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String e() {
        int i10 = this.f3531a;
        if (i10 == -1) {
            return a.b(this.f3532b);
        }
        if (i10 == 2) {
            String str = this.f3539j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f3539j;
            }
            return ((String) this.f3532b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final Uri g() {
        int i10 = this.f3531a;
        if (i10 == -1) {
            return a.d(this.f3532b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f3532b);
    }

    public final String toString() {
        String str;
        if (this.f3531a == -1) {
            return String.valueOf(this.f3532b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f3531a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = PDActionURI.SUB_TYPE;
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f3531a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3532b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f3532b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3539j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3534e);
                if (this.f3535f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f3535f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3532b);
                break;
        }
        if (this.f3536g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3536g);
        }
        if (this.f3537h != f3530k) {
            sb2.append(" mode=");
            sb2.append(this.f3537h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.c = null;
        this.f3533d = null;
        this.f3534e = 0;
        this.f3535f = 0;
        this.f3536g = null;
        this.f3537h = f3530k;
        this.f3538i = null;
        this.f3531a = i10;
    }
}
