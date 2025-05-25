package q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.u0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import lib.zj.office.fc.hpsf.Variant;
import org.xmlpull.v1.XmlPullParserException;
import x0.m;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f29011e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f29012f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f29013a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f29014b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public Object f29015d;

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public final Object f29016a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f29017b;

        public a(Object obj, String str) {
            this.f29016a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f29017b = cls.getMethod(str, c);
            } catch (Exception e10) {
                StringBuilder g10 = b.a.g("Couldn't resolve menu item onClick handler ", str, " in class ");
                g10.append(cls.getName());
                InflateException inflateException = new InflateException(g10.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f29017b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f29016a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a  reason: collision with root package name */
        public final Menu f29018a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f29024h;

        /* renamed from: i  reason: collision with root package name */
        public int f29025i;

        /* renamed from: j  reason: collision with root package name */
        public int f29026j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f29027k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f29028l;

        /* renamed from: m  reason: collision with root package name */
        public int f29029m;

        /* renamed from: n  reason: collision with root package name */
        public char f29030n;

        /* renamed from: o  reason: collision with root package name */
        public int f29031o;

        /* renamed from: p  reason: collision with root package name */
        public char f29032p;

        /* renamed from: q  reason: collision with root package name */
        public int f29033q;

        /* renamed from: r  reason: collision with root package name */
        public int f29034r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f29035s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f29036t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f29037u;

        /* renamed from: v  reason: collision with root package name */
        public int f29038v;

        /* renamed from: w  reason: collision with root package name */
        public int f29039w;

        /* renamed from: x  reason: collision with root package name */
        public String f29040x;

        /* renamed from: y  reason: collision with root package name */
        public String f29041y;

        /* renamed from: z  reason: collision with root package name */
        public x0.b f29042z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b  reason: collision with root package name */
        public int f29019b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f29020d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f29021e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f29022f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f29023g = true;

        public b(Menu menu) {
            this.f29018a = menu;
        }

        public final void a(MenuItem menuItem) {
            boolean z10;
            Object obj;
            MenuItem enabled = menuItem.setChecked(this.f29035s).setVisible(this.f29036t).setEnabled(this.f29037u);
            boolean z11 = false;
            if (this.f29034r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f29028l).setIcon(this.f29029m);
            int i10 = this.f29038v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.f29041y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.c.isRestricted()) {
                    if (fVar.f29015d == null) {
                        fVar.f29015d = f.a(fVar.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f29015d, this.f29041y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f29034r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).f(true);
                } else if (menuItem instanceof k) {
                    k kVar = (k) menuItem;
                    try {
                        Method method = kVar.f2103e;
                        q0.b bVar = kVar.f2102d;
                        if (method == null) {
                            kVar.f2103e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        kVar.f2103e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
            String str2 = this.f29040x;
            if (str2 != null) {
                Class<?>[] clsArr = f.f29011e;
                Object[] objArr = fVar.f29013a;
                try {
                    Constructor<?> constructor = Class.forName(str2, false, fVar.c.getClassLoader()).getConstructor(clsArr);
                    constructor.setAccessible(true);
                    obj = constructor.newInstance(objArr);
                } catch (Exception unused2) {
                    obj = null;
                }
                menuItem.setActionView((View) obj);
                z11 = true;
            }
            int i11 = this.f29039w;
            if (i11 > 0 && !z11) {
                menuItem.setActionView(i11);
            }
            x0.b bVar2 = this.f29042z;
            if (bVar2 != null && (menuItem instanceof q0.b)) {
                ((q0.b) menuItem).a(bVar2);
            }
            CharSequence charSequence = this.A;
            boolean z12 = menuItem instanceof q0.b;
            if (z12) {
                ((q0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z12) {
                ((q0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.m(menuItem, charSequence2);
            }
            char c = this.f29030n;
            int i12 = this.f29031o;
            if (z12) {
                ((q0.b) menuItem).setAlphabeticShortcut(c, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.g(menuItem, c, i12);
            }
            char c10 = this.f29032p;
            int i13 = this.f29033q;
            if (z12) {
                ((q0.b) menuItem).setNumericShortcut(c10, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.k(menuItem, c10, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z12) {
                    ((q0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    m.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z12) {
                    ((q0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    m.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f29011e = clsArr;
        f29012f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f29013a = objArr;
        this.f29014b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        Object obj;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                Menu menu2 = bVar.f29018a;
                z11 = z11;
                z11 = z11;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.f29019b = 0;
                            bVar.c = 0;
                            bVar.f29020d = 0;
                            bVar.f29021e = 0;
                            bVar.f29022f = true;
                            bVar.f29023g = true;
                            z11 = z11;
                        } else if (name2.equals("item")) {
                            z11 = z11;
                            if (!bVar.f29024h) {
                                x0.b bVar2 = bVar.f29042z;
                                if (bVar2 != null && bVar2.a()) {
                                    bVar.f29024h = true;
                                    bVar.a(menu2.addSubMenu(bVar.f29019b, bVar.f29025i, bVar.f29026j, bVar.f29027k).getItem());
                                    z11 = z11;
                                } else {
                                    bVar.f29024h = true;
                                    bVar.a(menu2.add(bVar.f29019b, bVar.f29025i, bVar.f29026j, bVar.f29027k));
                                    z11 = z11;
                                }
                            }
                        } else {
                            z11 = z11;
                            if (name2.equals("menu")) {
                                z11 = true;
                            }
                        }
                    }
                } else if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.c.obtainStyledAttributes(attributeSet, k.a.f19445r);
                        bVar.f29019b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f29020d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f29021e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f29022f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f29023g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z11 = z11;
                    } else if (name3.equals("item")) {
                        Context context = fVar.c;
                        u0 u0Var = new u0(context, context.obtainStyledAttributes(attributeSet, k.a.f19446s));
                        bVar.f29025i = u0Var.i(2, 0);
                        bVar.f29026j = (u0Var.h(5, bVar.c) & (-65536)) | (u0Var.h(6, bVar.f29020d) & Variant.VT_ILLEGAL);
                        bVar.f29027k = u0Var.k(7);
                        bVar.f29028l = u0Var.k(8);
                        bVar.f29029m = u0Var.i(0, 0);
                        String j10 = u0Var.j(9);
                        if (j10 == null) {
                            charAt = 0;
                        } else {
                            charAt = j10.charAt(0);
                        }
                        bVar.f29030n = charAt;
                        bVar.f29031o = u0Var.h(16, 4096);
                        String j11 = u0Var.j(10);
                        if (j11 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j11.charAt(0);
                        }
                        bVar.f29032p = charAt2;
                        bVar.f29033q = u0Var.h(20, 4096);
                        if (u0Var.l(11)) {
                            bVar.f29034r = u0Var.a(11, false) ? 1 : 0;
                        } else {
                            bVar.f29034r = bVar.f29021e;
                        }
                        bVar.f29035s = u0Var.a(3, false);
                        bVar.f29036t = u0Var.a(4, bVar.f29022f);
                        bVar.f29037u = u0Var.a(1, bVar.f29023g);
                        bVar.f29038v = u0Var.h(21, -1);
                        bVar.f29041y = u0Var.j(12);
                        bVar.f29039w = u0Var.i(13, 0);
                        bVar.f29040x = u0Var.j(15);
                        String j12 = u0Var.j(14);
                        if (j12 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && bVar.f29039w == 0 && bVar.f29040x == null) {
                            Class<?>[] clsArr = f29012f;
                            Object[] objArr = fVar.f29014b;
                            try {
                                Constructor<?> constructor = Class.forName(j12, false, fVar.c.getClassLoader()).getConstructor(clsArr);
                                constructor.setAccessible(true);
                                obj = constructor.newInstance(objArr);
                            } catch (Exception unused) {
                                obj = null;
                            }
                            bVar.f29042z = (x0.b) obj;
                        } else {
                            bVar.f29042z = null;
                        }
                        bVar.A = u0Var.k(17);
                        bVar.B = u0Var.k(22);
                        if (u0Var.l(19)) {
                            bVar.D = a0.c(u0Var.h(19, -1), bVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.D = null;
                        }
                        if (u0Var.l(18)) {
                            bVar.C = u0Var.b(18);
                        } else {
                            bVar.C = colorStateList;
                        }
                        u0Var.n();
                        bVar.f29024h = false;
                    } else if (name3.equals("menu")) {
                        bVar.f29024h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(bVar.f29019b, bVar.f29025i, bVar.f29026j, bVar.f29027k);
                        bVar.a(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z12 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i10 = 2;
                z11 = z11;
                z12 = z12;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof q0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
