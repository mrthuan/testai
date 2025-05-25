package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.h0;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class h implements q0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f2050y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f2051a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f2052b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2053d;

    /* renamed from: e  reason: collision with root package name */
    public a f2054e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<j> f2055f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<j> f2056g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2057h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<j> f2058i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<j> f2059j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2060k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2062m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f2063n;

    /* renamed from: o  reason: collision with root package name */
    public View f2064o;

    /* renamed from: v  reason: collision with root package name */
    public j f2071v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2073x;

    /* renamed from: l  reason: collision with root package name */
    public int f2061l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2065p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2066q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2067r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2068s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<j> f2069t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<n>> f2070u = new CopyOnWriteArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public boolean f2072w = false;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(h hVar, MenuItem menuItem);

        void b(h hVar);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(j jVar);
    }

    public h(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f2051a = context;
        Resources resources = context.getResources();
        this.f2052b = resources;
        this.f2055f = new ArrayList<>();
        this.f2056g = new ArrayList<>();
        this.f2057h = true;
        this.f2058i = new ArrayList<>();
        this.f2059j = new ArrayList<>();
        this.f2060k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = h0.f31454a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = h0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f2053d = z11;
    }

    public j a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f2050y[i14] << 16) | (65535 & i12);
            j jVar = new j(this, i10, i11, i12, i15, charSequence, this.f2061l);
            ArrayList<j> arrayList = this.f2055f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (arrayList.get(size).f2078d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, jVar);
            p(true);
            return jVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f2051a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j a10 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f2081g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a10;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(n nVar, Context context) {
        this.f2070u.add(new WeakReference<>(nVar));
        nVar.g(context, this);
        this.f2060k = true;
    }

    public final void c(boolean z10) {
        if (this.f2068s) {
            return;
        }
        this.f2068s = true;
        CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
        Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                nVar.b(this, z10);
            }
        }
        this.f2068s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f2071v;
        if (jVar != null) {
            d(jVar);
        }
        this.f2055f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2063n = null;
        this.f2062m = null;
        this.f2064o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2071v == jVar) {
            y();
            Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 = nVar.f(jVar);
                    if (z10) {
                        break;
                    }
                }
            }
            x();
            if (z10) {
                this.f2071v = null;
            }
        }
        return z10;
    }

    public boolean e(h hVar, MenuItem menuItem) {
        a aVar = this.f2054e;
        if (aVar != null && aVar.a(hVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z10 = nVar.l(jVar);
                if (z10) {
                    break;
                }
            }
        }
        x();
        if (z10) {
            this.f2071v = jVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = this.f2055f.get(i11);
            if (jVar.f2076a == i10) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.f2089o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final j g(int i10, KeyEvent keyEvent) {
        char c;
        ArrayList<j> arrayList = this.f2069t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = arrayList.get(i11);
            if (n10) {
                c = jVar.f2084j;
            } else {
                c = jVar.f2082h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n10 && c == '\b' && i10 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f2055f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c;
        int i11;
        boolean z10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        ArrayList<j> arrayList2 = this.f2055f;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = arrayList2.get(i12);
            if (jVar.hasSubMenu()) {
                jVar.f2089o.h(arrayList, i10, keyEvent);
            }
            if (n10) {
                c = jVar.f2084j;
            } else {
                c = jVar.f2082h;
            }
            if (n10) {
                i11 = jVar.f2085k;
            } else {
                i11 = jVar.f2083i;
            }
            if ((modifiers & 69647) == (i11 & 69647)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (n10 && c == '\b') {
                        if (i10 != 67) {
                        }
                    }
                }
                if (jVar.isEnabled()) {
                    arrayList.add(jVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2073x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2055f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z10;
        ArrayList<j> l10 = l();
        if (!this.f2060k) {
            return;
        }
        CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
        Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z11 |= nVar.d();
            }
        }
        ArrayList<j> arrayList = this.f2058i;
        ArrayList<j> arrayList2 = this.f2059j;
        if (z11) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar = l10.get(i10);
                if ((jVar.f2098x & 32) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(jVar);
                } else {
                    arrayList2.add(jVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f2060k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (g(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList<j> l() {
        boolean z10 = this.f2057h;
        ArrayList<j> arrayList = this.f2056g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<j> arrayList2 = this.f2055f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            j jVar = arrayList2.get(i10);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f2057h = false;
        this.f2060k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2072w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f2053d;
    }

    public void p(boolean z10) {
        if (!this.f2065p) {
            if (z10) {
                this.f2057h = true;
                this.f2060k = true;
            }
            CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
            if (!copyOnWriteArrayList.isEmpty()) {
                y();
                Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<n> next = it.next();
                    n nVar = next.get();
                    if (nVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        nVar.c(z10);
                    }
                }
                x();
                return;
            }
            return;
        }
        this.f2066q = true;
        if (z10) {
            this.f2067r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        j g10 = g(i10, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.n r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.j r7 = (androidx.appcompat.view.menu.j) r7
            r0 = 0
            if (r7 == 0) goto Lc4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lc4
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f2090p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L36
        L19:
            androidx.appcompat.view.menu.h r1 = r7.f2088n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L22
            goto L36
        L22:
            android.content.Intent r3 = r7.f2081g
            if (r3 == 0) goto L2c
            android.content.Context r1 = r1.f2051a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L36
        L2c:
            x0.b r1 = r7.A
            if (r1 == 0) goto L38
            boolean r1 = r1.e()
            if (r1 == 0) goto L38
        L36:
            r1 = r2
            goto L39
        L38:
            r1 = r0
        L39:
            x0.b r3 = r7.A
            if (r3 == 0) goto L45
            boolean r4 = r3.a()
            if (r4 == 0) goto L45
            r4 = r2
            goto L46
        L45:
            r4 = r0
        L46:
            boolean r5 = r7.e()
            if (r5 == 0) goto L58
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lc3
            r6.c(r2)
            goto Lc3
        L58:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L69
            if (r4 == 0) goto L61
            goto L69
        L61:
            r7 = r9 & 1
            if (r7 != 0) goto Lc3
            r6.c(r2)
            goto Lc3
        L69:
            r9 = r9 & 4
            if (r9 != 0) goto L70
            r6.c(r0)
        L70:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L84
            androidx.appcompat.view.menu.s r9 = new androidx.appcompat.view.menu.s
            android.content.Context r5 = r6.f2051a
            r9.<init>(r5, r6, r7)
            r7.f2089o = r9
            java.lang.CharSequence r5 = r7.f2079e
            r9.setHeaderTitle(r5)
        L84:
            androidx.appcompat.view.menu.s r7 = r7.f2089o
            if (r4 == 0) goto L8b
            r3.f(r7)
        L8b:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.n>> r9 = r6.f2070u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L94
            goto Lbd
        L94:
            if (r8 == 0) goto L9a
            boolean r0 = r8.j(r7)
        L9a:
            java.util.Iterator r8 = r9.iterator()
        L9e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.n r4 = (androidx.appcompat.view.menu.n) r4
            if (r4 != 0) goto Lb6
            r9.remove(r3)
            goto L9e
        Lb6:
            if (r0 != 0) goto L9e
            boolean r0 = r4.j(r7)
            goto L9e
        Lbd:
            r1 = r1 | r0
            if (r1 != 0) goto Lc3
            r6.c(r2)
        Lc3:
            return r1
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.q(android.view.MenuItem, androidx.appcompat.view.menu.n, int):boolean");
    }

    public final void r(n nVar) {
        CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
        Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null || nVar2 == nVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList<j> arrayList;
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f2055f;
            if (i12 < size) {
                if (arrayList.get(i12).f2077b == i10) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || arrayList.get(i12).f2077b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList<j> arrayList;
        int size = size();
        int i11 = 0;
        while (true) {
            arrayList = this.f2055f;
            if (i11 < size) {
                if (arrayList.get(i11).f2076a == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 > 0 && (findItem = findItem(i11)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList<j> arrayList = this.f2055f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = arrayList.get(i11);
            if (jVar.f2077b == i10) {
                jVar.f(z11);
                jVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f2072w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList<j> arrayList = this.f2055f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = arrayList.get(i11);
            if (jVar.f2077b == i10) {
                jVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        boolean z11;
        ArrayList<j> arrayList = this.f2055f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            j jVar = arrayList.get(i12);
            if (jVar.f2077b == i10) {
                int i13 = jVar.f2098x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                jVar.f2098x = i15;
                if (i13 != i15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2055f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<n> next = it.next();
                    n nVar = next.get();
                    if (nVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        int id2 = nVar.getId();
                        if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                            nVar.h(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable k10;
        CopyOnWriteArrayList<WeakReference<n>> copyOnWriteArrayList = this.f2070u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<n>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id2 = nVar.getId();
                    if (id2 > 0 && (k10 = nVar.k()) != null) {
                        sparseArray.put(id2, k10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public final void w(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f2064o = view;
            this.f2062m = null;
            this.f2063n = null;
        } else {
            if (i10 > 0) {
                this.f2062m = this.f2052b.getText(i10);
            } else if (charSequence != null) {
                this.f2062m = charSequence;
            }
            if (i11 > 0) {
                this.f2063n = androidx.core.content.a.getDrawable(this.f2051a, i11);
            } else if (drawable != null) {
                this.f2063n = drawable;
            }
            this.f2064o = null;
        }
        p(false);
    }

    public final void x() {
        this.f2065p = false;
        if (this.f2066q) {
            this.f2066q = false;
            p(this.f2067r);
        }
    }

    public final void y() {
        if (!this.f2065p) {
            this.f2065p = true;
            this.f2066q = false;
            this.f2067r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f2052b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f2052b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        j a10 = a(i10, i11, i12, charSequence);
        s sVar = new s(this.f2051a, this, a10);
        a10.f2089o = sVar;
        sVar.setHeaderTitle(a10.f2079e);
        return sVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f2052b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f2052b.getString(i13));
    }

    public h k() {
        return this;
    }
}
