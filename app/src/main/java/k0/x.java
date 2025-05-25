package k0;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.tom_roush.fontbox.ttf.NamingTable;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f19543a;

    /* renamed from: b  reason: collision with root package name */
    public final IconCompat f19544b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19545d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19546e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19547f;

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class a {
        public static x a(PersistableBundle persistableBundle) {
            c cVar = new c();
            cVar.f19548a = persistableBundle.getString(NamingTable.TAG);
            cVar.c = persistableBundle.getString("uri");
            cVar.f19550d = persistableBundle.getString("key");
            cVar.f19551e = persistableBundle.getBoolean("isBot");
            cVar.f19552f = persistableBundle.getBoolean("isImportant");
            return new x(cVar);
        }

        public static PersistableBundle b(x xVar) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = xVar.f19543a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString(NamingTable.TAG, str);
            persistableBundle.putString("uri", xVar.c);
            persistableBundle.putString("key", xVar.f19545d);
            persistableBundle.putBoolean("isBot", xVar.f19546e);
            persistableBundle.putBoolean("isImportant", xVar.f19547f);
            return persistableBundle;
        }
    }

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class b {
        public static x a(Person person) {
            IconCompat iconCompat;
            c cVar = new c();
            cVar.f19548a = person.getName();
            IconCompat iconCompat2 = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f3530k;
                icon.getClass();
                int c = IconCompat.a.c(icon);
                if (c != 2) {
                    if (c != 4) {
                        if (c != 6) {
                            iconCompat2 = new IconCompat(-1);
                            iconCompat2.f3532b = icon;
                        } else {
                            Uri d10 = IconCompat.a.d(icon);
                            d10.getClass();
                            String uri = d10.toString();
                            uri.getClass();
                            iconCompat = new IconCompat(6);
                            iconCompat.f3532b = uri;
                        }
                    } else {
                        Uri d11 = IconCompat.a.d(icon);
                        d11.getClass();
                        String uri2 = d11.toString();
                        uri2.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f3532b = uri2;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.c(null, IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            }
            cVar.f19549b = iconCompat2;
            cVar.c = person.getUri();
            cVar.f19550d = person.getKey();
            cVar.f19551e = person.isBot();
            cVar.f19552f = person.isImportant();
            return new x(cVar);
        }

        public static Person b(x xVar) {
            Person.Builder name = new Person.Builder().setName(xVar.f19543a);
            Icon icon = null;
            IconCompat iconCompat = xVar.f19544b;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(icon).setUri(xVar.c).setKey(xVar.f19545d).setBot(xVar.f19546e).setImportant(xVar.f19547f).build();
        }
    }

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f19548a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f19549b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f19550d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f19551e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19552f;
    }

    public x(c cVar) {
        this.f19543a = cVar.f19548a;
        this.f19544b = cVar.f19549b;
        this.c = cVar.c;
        this.f19545d = cVar.f19550d;
        this.f19546e = cVar.f19551e;
        this.f19547f = cVar.f19552f;
    }
}
