package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {
    private a mCursorToStringConverter;
    protected int[] mFrom;
    String[] mOriginalFrom;
    private int mStringConversionColumn;
    protected int[] mTo;
    private b mViewBinder;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    @Deprecated
    public SimpleCursorAdapter(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i10, cursor);
        this.mStringConversionColumn = -1;
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }

    private void findColumns(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.mFrom;
            if (iArr == null || iArr.length != length) {
                this.mFrom = new int[length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.mFrom[i10] = cursor.getColumnIndexOrThrow(strArr[i10]);
            }
            return;
        }
        this.mFrom = null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        int[] iArr = this.mTo;
        int length = iArr.length;
        int[] iArr2 = this.mFrom;
        for (int i10 = 0; i10 < length; i10++) {
            View findViewById = view.findViewById(iArr[i10]);
            if (findViewById != null) {
                String string = cursor.getString(iArr2[i10]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof TextView) {
                    setViewText((TextView) findViewById, string);
                } else if (findViewById instanceof ImageView) {
                    setViewImage((ImageView) findViewById, string);
                } else {
                    throw new IllegalStateException(findViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                }
            }
        }
    }

    public void changeCursorAndColumns(Cursor cursor, String[] strArr, int[] iArr) {
        this.mOriginalFrom = strArr;
        this.mTo = iArr;
        findColumns(cursor, strArr);
        super.changeCursor(cursor);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.a.InterfaceC0015a
    public CharSequence convertToString(Cursor cursor) {
        int i10 = this.mStringConversionColumn;
        if (i10 > -1) {
            return cursor.getString(i10);
        }
        return super.convertToString(cursor);
    }

    public a getCursorToStringConverter() {
        return null;
    }

    public int getStringConversionColumn() {
        return this.mStringConversionColumn;
    }

    public b getViewBinder() {
        return null;
    }

    public void setStringConversionColumn(int i10) {
        this.mStringConversionColumn = i10;
    }

    public void setViewImage(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void setViewText(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor) {
        findColumns(cursor, this.mOriginalFrom);
        return super.swapCursor(cursor);
    }

    public SimpleCursorAdapter(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr, int i11) {
        super(context, i10, cursor, i11);
        this.mStringConversionColumn = -1;
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }

    public void setCursorToStringConverter(a aVar) {
    }

    public void setViewBinder(b bVar) {
    }
}
