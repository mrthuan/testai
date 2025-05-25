package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
public final class a extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0015a f3570a;

    /* compiled from: CursorFilter.java */
    /* renamed from: androidx.cursoradapter.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0015a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    public a(InterfaceC0015a interfaceC0015a) {
        this.f3570a = interfaceC0015a;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f3570a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f3570a.runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filterResults.count = runQueryOnBackgroundThread.getCount();
            filterResults.values = runQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        InterfaceC0015a interfaceC0015a = this.f3570a;
        Cursor cursor = interfaceC0015a.getCursor();
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            interfaceC0015a.changeCursor((Cursor) obj);
        }
    }
}
