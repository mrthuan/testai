package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
public final class o0 extends ResourceCursorAdapter implements View.OnClickListener {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f2627n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final SearchView f2628a;

    /* renamed from: b  reason: collision with root package name */
    public final SearchableInfo f2629b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f2630d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2631e;

    /* renamed from: f  reason: collision with root package name */
    public int f2632f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2633g;

    /* renamed from: h  reason: collision with root package name */
    public int f2634h;

    /* renamed from: i  reason: collision with root package name */
    public int f2635i;

    /* renamed from: j  reason: collision with root package name */
    public int f2636j;

    /* renamed from: k  reason: collision with root package name */
    public int f2637k;

    /* renamed from: l  reason: collision with root package name */
    public int f2638l;

    /* renamed from: m  reason: collision with root package name */
    public int f2639m;

    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f2640a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f2641b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f2642d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f2643e;

        public a(View view) {
            this.f2640a = (TextView) view.findViewById(16908308);
            this.f2641b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.f2642d = (ImageView) view.findViewById(16908296);
            this.f2643e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2632f = 1;
        this.f2634h = -1;
        this.f2635i = -1;
        this.f2636j = -1;
        this.f2637k = -1;
        this.f2638l = -1;
        this.f2639m = -1;
        this.f2628a = searchView;
        this.f2629b = searchableInfo;
        this.f2631e = searchView.getSuggestionCommitIconResId();
        this.c = context;
        this.f2630d = weakHashMap;
    }

    public static String e(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Drawable b(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.c.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    @Override // androidx.cursoradapter.widget.CursorAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bindView(android.view.View r22, android.content.Context r23, android.database.Cursor r24) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(java.lang.String r9) {
        /*
            r8 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r8.f2630d
            android.content.Context r1 = r8.c
            java.lang.String r2 = "android.resource://"
            r3 = 0
            if (r9 == 0) goto Ld4
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto Ld4
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L19
            goto Ld4
        L19:
            int r4 = java.lang.Integer.parseInt(r9)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r1.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r5.toString()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.Object r5 = r0.get(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r5 != 0) goto L3f
            r5 = r3
            goto L43
        L3f:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            android.graphics.drawable.Drawable r4 = androidx.core.content.a.getDrawable(r1, r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r4 == 0) goto L53
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r0.put(r2, r5)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L53:
            return r4
        L54:
            return r3
        L55:
            java.lang.Object r2 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L5f
            r2 = r3
            goto L63
        L5f:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L63:
            if (r2 == 0) goto L66
            return r2
        L66:
            android.net.Uri r2 = android.net.Uri.parse(r9)
            java.lang.String r4 = "Failed to open "
            java.lang.String r5 = "Resource does not exist: "
            java.lang.String r6 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r7 = "android.resource"
            boolean r6 = r7.equals(r6)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r6 == 0) goto L92
            android.graphics.drawable.Drawable r1 = r8.b(r2)     // Catch: android.content.res.Resources.NotFoundException -> L80 java.io.FileNotFoundException -> Lc4
            r3 = r1
            goto Lcb
        L80:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc4
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> Lc4
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> Lc4
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            throw r1     // Catch: java.io.FileNotFoundException -> Lc4
        L92:
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> Lc4
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r1 == 0) goto Lb2
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r1, r3)     // Catch: java.lang.Throwable -> La9
            r1.close()     // Catch: java.io.IOException -> La4
            goto La7
        La4:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc4
        La7:
            r3 = r4
            goto Lcb
        La9:
            r4 = move-exception
            r1.close()     // Catch: java.io.IOException -> Lae
            goto Lb1
        Lae:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc4
        Lb1:
            throw r4     // Catch: java.io.FileNotFoundException -> Lc4
        Lb2:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc4
            r5.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            r5.append(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r4 = r5.toString()     // Catch: java.io.FileNotFoundException -> Lc4
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            throw r1     // Catch: java.io.FileNotFoundException -> Lc4
        Lc4:
            r1 = move-exception
            java.util.Objects.toString(r2)
            r1.getMessage()
        Lcb:
            if (r3 == 0) goto Ld4
            android.graphics.drawable.Drawable$ConstantState r1 = r3.getConstantState()
            r0.put(r9, r1)
        Ld4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.c(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.a.InterfaceC0015a
    public final void changeCursor(Cursor cursor) {
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f2634h = cursor.getColumnIndex("suggest_text_1");
                this.f2635i = cursor.getColumnIndex("suggest_text_2");
                this.f2636j = cursor.getColumnIndex("suggest_text_2_url");
                this.f2637k = cursor.getColumnIndex("suggest_icon_1");
                this.f2638l = cursor.getColumnIndex("suggest_icon_2");
                this.f2639m = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.a.InterfaceC0015a
    public final CharSequence convertToString(Cursor cursor) {
        String e10;
        String e11;
        if (cursor == null) {
            return null;
        }
        String e12 = e(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (e12 != null) {
            return e12;
        }
        SearchableInfo searchableInfo = this.f2629b;
        if (searchableInfo.shouldRewriteQueryFromData() && (e11 = e(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return e11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (e10 = e(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return e10;
    }

    public final Cursor d(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.c.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View newDropDownView = newDropDownView(this.c, getCursor(), viewGroup);
            if (newDropDownView != null) {
                ((a) newDropDownView.getTag()).f2640a.setText(e10.toString());
            }
            return newDropDownView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View newView = newView(this.c, getCursor(), viewGroup);
            ((a) newView.getTag()).f2640a.setText(e10.toString());
            return newView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new a(newView));
        ((ImageView) newView.findViewById(R.id.edit_query)).setImageResource(this.f2631e);
        return newView;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = getCursor();
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = getCursor();
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2628a.r((CharSequence) tag);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.a.InterfaceC0015a
    public final Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = this.f2628a;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                Cursor d10 = d(this.f2629b, charSequence2);
                if (d10 != null) {
                    d10.getCount();
                    return d10;
                }
                return null;
            } catch (RuntimeException unused) {
                return null;
            }
        }
        return null;
    }
}
