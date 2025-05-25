package kj;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.Objects;
import java.util.UUID;

/* compiled from: StampAnnotData.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public long f19799a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f19800b;
    public Integer c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f19801d;

    /* renamed from: e  reason: collision with root package name */
    public String f19802e;

    /* renamed from: f  reason: collision with root package name */
    public RectF f19803f;

    /* renamed from: g  reason: collision with root package name */
    public int f19804g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f19805h;

    /* renamed from: i  reason: collision with root package name */
    public final a f19806i;

    /* compiled from: StampAnnotData.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float f19807a;

        /* renamed from: b  reason: collision with root package name */
        public float f19808b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public int f19809d;

        /* renamed from: e  reason: collision with root package name */
        public int f19810e;
    }

    public b() {
        this.f19799a = UUID.randomUUID().hashCode();
        this.f19804g = -1;
        this.f19806i = new a();
    }

    public final void a() {
        RectF rectF = this.f19803f;
        a aVar = this.f19806i;
        if (rectF != null) {
            aVar.f19807a = rectF.centerX();
        }
        RectF rectF2 = this.f19803f;
        if (rectF2 != null) {
            aVar.f19808b = rectF2.centerY();
        }
        Matrix matrix = new Matrix();
        Integer num = this.c;
        if (num != null) {
            matrix.setRotate(num.intValue());
        }
        Bitmap bitmap = this.f19800b;
        if (bitmap != null) {
            aVar.f19809d = bitmap.getWidth();
            aVar.f19810e = this.f19800b.getHeight();
        } else {
            aVar.f19809d = 190;
            aVar.f19810e = 50;
        }
        RectF rectF3 = new RectF(0.0f, 0.0f, aVar.f19809d, aVar.f19810e);
        matrix.mapRect(rectF3);
        aVar.c = this.f19803f.width() / rectF3.width();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f19799a != bVar.f19799a || !TextUtils.equals(this.f19802e, bVar.f19802e) || !Objects.equals(this.f19801d, bVar.f19801d) || !Objects.equals(this.c, bVar.c) || !Objects.equals(this.f19803f, bVar.f19803f) || this.f19800b != bVar.f19800b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f19799a), this.f19800b, this.c, this.f19801d, this.f19802e, this.f19803f, Integer.valueOf(this.f19804g), Boolean.valueOf(this.f19805h), this.f19806i);
    }

    public final String toString() {
        return "StampAnnotData{id=" + this.f19799a + ", bmp=" + this.f19800b + ", rotate=" + this.c + ", color=" + this.f19801d + ", name='" + this.f19802e + "', rect=" + this.f19803f + ", pageNumber=" + this.f19804g + ", newCreate=" + this.f19805h + ", helper=" + this.f19806i + '}';
    }

    public b(b bVar) {
        this.f19799a = UUID.randomUUID().hashCode();
        this.f19804g = -1;
        this.f19799a = bVar.f19799a;
        this.f19800b = bVar.f19800b;
        this.c = bVar.c;
        this.f19801d = bVar.f19801d;
        this.f19802e = bVar.f19802e;
        this.f19803f = new RectF(bVar.f19803f);
        this.f19806i = new a();
        this.f19804g = bVar.f19804g;
        this.f19805h = bVar.f19805h;
        a();
    }
}
