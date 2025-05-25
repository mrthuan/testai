package lib.zj.office.system;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import l.t;

/* compiled from: SysKit.java */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: l  reason: collision with root package name */
    public static ShapeDrawable f21068l;

    /* renamed from: a  reason: collision with root package name */
    public d f21069a;

    /* renamed from: b  reason: collision with root package name */
    public jh.e f21070b;
    public o7.a c;

    /* renamed from: d  reason: collision with root package name */
    public a2.a f21071d;

    /* renamed from: e  reason: collision with root package name */
    public m7.g f21072e;

    /* renamed from: f  reason: collision with root package name */
    public t f21073f;

    /* renamed from: g  reason: collision with root package name */
    public a2.a f21074g;

    /* renamed from: h  reason: collision with root package name */
    public jf.o f21075h;

    /* renamed from: i  reason: collision with root package name */
    public f f21076i;

    /* renamed from: j  reason: collision with root package name */
    public lib.zj.office.java.awt.geom.d f21077j;

    /* renamed from: k  reason: collision with root package name */
    public qi.a f21078k;

    public r(f fVar) {
        this.f21076i = fVar;
    }

    public static ShapeDrawable f() {
        if (f21068l == null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f, 6.0f}, null, null));
            f21068l = shapeDrawable;
            shapeDrawable.getPaint().setColor(-1996519356);
        }
        return f21068l;
    }

    public static void i(Activity activity, String str) {
        String str2 = "";
        if (!"".equals(str)) {
            StringBuffer stringBuffer = new StringBuffer("");
            try {
                for (byte b10 : str.getBytes("utf-8")) {
                    String hexString = Integer.toHexString(b10 & 255);
                    if (hexString.length() == 1) {
                        stringBuffer.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                        stringBuffer.append(hexString);
                    } else {
                        stringBuffer.append(hexString);
                    }
                }
                char[] charArray = stringBuffer.toString().toCharArray();
                stringBuffer.delete(0, stringBuffer.length());
                for (int i10 = 0; i10 < charArray.length; i10 += 2) {
                    stringBuffer.append("%");
                    stringBuffer.append(charArray[i10]);
                    stringBuffer.append(charArray[i10 + 1]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            str2 = stringBuffer.toString();
        }
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com.hk/#hl=en&newwindow=1&safe=strict&site=&q=a-a-a-a&oq=a-a-a-a&aq=f&aqi=&aql=&gs_sm=3&gs_upl=1075l1602l0l1935l3l3l0l0l0l0l0l0ll0l0&gs_l=hp.3...1075l1602l0l1935l3l3l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.,cf.osb&fp=207f1fbbc21b7536&biw=1280&bih=876".replaceAll("a-a-a-a", str2))));
    }

    public final lib.zj.office.java.awt.geom.d a() {
        if (this.f21077j == null) {
            this.f21077j = new lib.zj.office.java.awt.geom.d(this.f21076i);
        }
        return this.f21077j;
    }

    public final qi.a b() {
        if (this.f21078k == null) {
            this.f21078k = new qi.a(this.f21076i);
        }
        return this.f21078k;
    }

    public final d c() {
        if (this.f21069a == null) {
            this.f21069a = new d(this);
        }
        return this.f21069a;
    }

    public final o7.a d() {
        if (this.c == null) {
            this.c = new o7.a();
        }
        return this.c;
    }

    public final a2.a e() {
        if (this.f21071d == null) {
            this.f21071d = new a2.a(7);
        }
        return this.f21071d;
    }

    public final jh.e g() {
        if (this.f21070b == null) {
            this.f21070b = new jh.e(this.f21076i);
        }
        return this.f21070b;
    }

    public final a2.a h() {
        if (this.f21074g == null) {
            this.f21074g = new a2.a(9);
        }
        return this.f21074g;
    }
}
