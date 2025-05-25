package x0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f31421a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f31422a;

        public a(ClipData clipData, int i10) {
            this.f31422a = com.google.android.gms.internal.ads.d.f(clipData, i10);
        }

        @Override // x0.c.b
        public final void a(Uri uri) {
            this.f31422a.setLinkUri(uri);
        }

        @Override // x0.c.b
        public final void b(int i10) {
            this.f31422a.setFlags(i10);
        }

        @Override // x0.c.b
        public final c build() {
            ContentInfo build;
            build = this.f31422a.build();
            return new c(new d(build));
        }

        @Override // x0.c.b
        public final void setExtras(Bundle bundle) {
            this.f31422a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: x0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0401c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f31423a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31424b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f31425d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f31426e;

        public C0401c(ClipData clipData, int i10) {
            this.f31423a = clipData;
            this.f31424b = i10;
        }

        @Override // x0.c.b
        public final void a(Uri uri) {
            this.f31425d = uri;
        }

        @Override // x0.c.b
        public final void b(int i10) {
            this.c = i10;
        }

        @Override // x0.c.b
        public final c build() {
            return new c(new f(this));
        }

        @Override // x0.c.b
        public final void setExtras(Bundle bundle) {
            this.f31426e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f31427a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f31427a = com.google.android.gms.internal.ads.m.d(contentInfo);
        }

        @Override // x0.c.e
        public final ClipData a() {
            ClipData clip;
            clip = this.f31427a.getClip();
            return clip;
        }

        @Override // x0.c.e
        public final int b() {
            int flags;
            flags = this.f31427a.getFlags();
            return flags;
        }

        @Override // x0.c.e
        public final ContentInfo c() {
            return this.f31427a;
        }

        @Override // x0.c.e
        public final int d() {
            int source;
            source = this.f31427a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f31427a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f31428a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31429b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f31430d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f31431e;

        public f(C0401c c0401c) {
            ClipData clipData = c0401c.f31423a;
            clipData.getClass();
            this.f31428a = clipData;
            int i10 = c0401c.f31424b;
            if (i10 >= 0) {
                if (i10 <= 5) {
                    this.f31429b = i10;
                    int i11 = c0401c.c;
                    if ((i11 & 1) == i11) {
                        this.c = i11;
                        this.f31430d = c0401c.f31425d;
                        this.f31431e = c0401c.f31426e;
                        return;
                    }
                    throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }

        @Override // x0.c.e
        public final ClipData a() {
            return this.f31428a;
        }

        @Override // x0.c.e
        public final int b() {
            return this.c;
        }

        @Override // x0.c.e
        public final ContentInfo c() {
            return null;
        }

        @Override // x0.c.e
        public final int d() {
            return this.f31429b;
        }

        public final String toString() {
            String str;
            String valueOf;
            Uri uri;
            String str2;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f31428a.getDescription());
            sb2.append(", source=");
            int i10 = this.f31429b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    str = String.valueOf(i10);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            sb2.append(str);
            sb2.append(", flags=");
            int i11 = this.c;
            if ((i11 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i11);
            }
            sb2.append(valueOf);
            String str3 = "";
            if (this.f31430d == null) {
                str2 = "";
            } else {
                str2 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str2);
            if (this.f31431e != null) {
                str3 = ", hasExtras";
            }
            return androidx.activity.r.g(sb2, str3, "}");
        }
    }

    public c(e eVar) {
        this.f31421a = eVar;
    }

    public final String toString() {
        return this.f31421a.toString();
    }
}
