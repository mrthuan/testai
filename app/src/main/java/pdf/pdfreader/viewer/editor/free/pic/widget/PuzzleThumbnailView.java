package pdf.pdfreader.viewer.editor.free.pic.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public class PuzzleThumbnailView extends View {

    /* renamed from: a  reason: collision with root package name */
    public ActionMode f26493a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f26494b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f26495d;

    /* renamed from: e  reason: collision with root package name */
    public int f26496e;

    /* renamed from: f  reason: collision with root package name */
    public co.b f26497f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f26498g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f26499h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f26500i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f26501j;

    /* renamed from: k  reason: collision with root package name */
    public float f26502k;

    /* renamed from: l  reason: collision with root package name */
    public float f26503l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f26504m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f26505n;

    /* renamed from: o  reason: collision with root package name */
    public int f26506o;

    /* renamed from: p  reason: collision with root package name */
    public int f26507p;

    /* renamed from: q  reason: collision with root package name */
    public int f26508q;

    /* renamed from: r  reason: collision with root package name */
    public float f26509r;

    /* renamed from: s  reason: collision with root package name */
    public final a f26510s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f26511t;

    /* loaded from: classes3.dex */
    public enum ActionMode {
        NONE,
        DRAG,
        ZOOM,
        MOVE,
        SWAP
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMode actionMode = ActionMode.SWAP;
            PuzzleThumbnailView puzzleThumbnailView = PuzzleThumbnailView.this;
            puzzleThumbnailView.f26493a = actionMode;
            puzzleThumbnailView.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26514a;

        static {
            int[] iArr = new int[ActionMode.values().length];
            f26514a = iArr;
            try {
                iArr[ActionMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26514a[ActionMode.DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26514a[ActionMode.ZOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26514a[ActionMode.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26514a[ActionMode.SWAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    static {
        ea.a.p("JXVNeiBlPWg9bQRuVWk7VlFldw==", "mYu7Li7J");
    }

    public PuzzleThumbnailView(Context context) {
        this(context, null);
    }

    public static float a(MotionEvent motionEvent) {
        float x4 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x4 * x4));
    }

    public final void b(MotionEvent motionEvent) {
        Iterator it = this.f26494b.iterator();
        if (!it.hasNext()) {
            if (motionEvent.getPointerCount() != 1) {
                motionEvent.getPointerCount();
                return;
            }
            throw null;
        }
        ((co.b) it.next()).getClass();
        throw null;
    }

    public int getHandleBarColor() {
        return this.f26508q;
    }

    public int getLineColor() {
        return this.f26506o;
    }

    public int getLineSize() {
        return this.f26496e;
    }

    public int getSelectedLineColor() {
        return this.f26507p;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f26511t;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int width = getWidth();
        int height = getHeight();
        this.f26495d.left = getPaddingLeft() + this.f26509r;
        this.f26495d.top = getPaddingTop() + this.f26509r;
        this.f26495d.right = (width - getPaddingRight()) - this.f26509r;
        this.f26495d.bottom = (height - getPaddingBottom()) - this.f26509r;
        ArrayList arrayList = this.f26494b;
        if (arrayList.size() != 0 && arrayList.size() > 0) {
            co.b bVar = (co.b) arrayList.get(0);
            throw null;
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f26495d.left = getPaddingLeft() + this.f26509r;
        this.f26495d.top = getPaddingTop() + this.f26509r;
        this.f26495d.right = (i10 - getPaddingRight()) - this.f26509r;
        this.f26495d.bottom = (i11 - getPaddingBottom()) - this.f26509r;
        ArrayList arrayList = this.f26494b;
        if (arrayList.size() != 0 && arrayList.size() > 0) {
            co.b bVar = (co.b) arrayList.get(0);
            throw null;
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26505n) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        if (action != 0) {
            a aVar = this.f26510s;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            a(motionEvent);
                            PointF pointF = this.f26504m;
                            pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                            pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                            b(motionEvent);
                        }
                    }
                } else {
                    if (b.f26514a[this.f26493a.ordinal()] == 5) {
                        Iterator it = this.f26494b.iterator();
                        if (it.hasNext()) {
                            motionEvent.getX();
                            motionEvent.getY();
                            ((co.b) it.next()).getClass();
                            throw null;
                        }
                    }
                    if ((Math.abs(motionEvent.getX() - this.f26502k) > 10.0f || Math.abs(motionEvent.getY() - this.f26503l) > 10.0f) && this.f26493a != ActionMode.SWAP) {
                        removeCallbacks(aVar);
                    }
                }
            }
            int i10 = b.f26514a[this.f26493a.ordinal()];
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f26497f = null;
                }
            } else {
                if (this.f26497f == null && Math.abs(this.f26502k - motionEvent.getX()) < 3.0f) {
                    Math.abs(this.f26503l - motionEvent.getY());
                }
                this.f26497f = null;
            }
            this.c.clear();
            this.f26493a = ActionMode.NONE;
            removeCallbacks(aVar);
        } else {
            this.f26502k = motionEvent.getX();
            this.f26503l = motionEvent.getY();
            b(motionEvent);
            int i11 = b.f26514a[this.f26493a.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        invalidate();
        return true;
    }

    public void setAnimateDuration(int i10) {
        Iterator it = this.f26494b.iterator();
        while (it.hasNext()) {
            ((co.b) it.next()).getClass();
        }
    }

    public void setHandleBarColor(int i10) {
        this.f26508q = i10;
        this.f26500i.setColor(i10);
        invalidate();
    }

    public void setLineColor(int i10) {
        this.f26506o = i10;
        this.f26498g.setColor(i10);
        invalidate();
    }

    public void setLineSize(int i10) {
        this.f26496e = i10;
        invalidate();
    }

    public void setNeedDrawLine(boolean z10) {
        this.f26497f = null;
        invalidate();
    }

    public void setNeedDrawOuterLine(boolean z10) {
        invalidate();
    }

    public void setPiecePadding(float f10) {
        this.f26509r = f10;
        Iterator it = this.f26494b.iterator();
        if (!it.hasNext()) {
            return;
        }
        ((co.b) it.next()).getClass();
        throw null;
    }

    public void setPuzzleLayout(co.a aVar) {
        this.c.clear();
        this.f26494b.clear();
        throw null;
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        int parseColor;
        this.f26511t = z10;
        Paint paint = this.f26498g;
        if (z10) {
            parseColor = -1;
        } else {
            parseColor = Color.parseColor(ea.a.p("bDYJN0A4RA==", "C2rPxsrf"));
        }
        paint.setColor(parseColor);
        ArrayList arrayList = this.f26494b;
        if (arrayList.size() != 0 && arrayList.size() > 0) {
            co.b bVar = (co.b) arrayList.get(0);
            throw null;
        } else {
            invalidate();
        }
    }

    public void setSelectedLineColor(int i10) {
        this.f26507p = i10;
        this.f26499h.setColor(i10);
        invalidate();
    }

    public void setTouchEnable(boolean z10) {
        this.f26505n = z10;
    }

    public PuzzleThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PuzzleThumbnailView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26493a = ActionMode.NONE;
        this.f26494b = new ArrayList();
        this.c = new ArrayList();
        this.f26496e = 4;
        this.f26505n = true;
        this.f26506o = -1;
        int parseColor = Color.parseColor(ea.a.p("FzljQjFGQg==", "rO4ZsCg9"));
        this.f26507p = parseColor;
        this.f26508q = parseColor;
        this.f26510s = new a();
        this.f26511t = false;
        this.f26495d = new RectF();
        Paint paint = new Paint();
        this.f26498g = paint;
        paint.setAntiAlias(true);
        this.f26498g.setColor(this.f26506o);
        this.f26498g.setStrokeWidth(this.f26496e);
        this.f26498g.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f26499h = paint2;
        paint2.setAntiAlias(true);
        this.f26499h.setStyle(Paint.Style.STROKE);
        this.f26499h.setColor(this.f26507p);
        this.f26499h.setStrokeWidth(this.f26496e);
        Paint paint3 = new Paint();
        this.f26500i = paint3;
        paint3.setAntiAlias(true);
        this.f26500i.setStyle(Paint.Style.FILL);
        this.f26500i.setColor(this.f26508q);
        this.f26500i.setStrokeWidth(this.f26496e * 3);
        Paint paint4 = new Paint();
        this.f26501j = paint4;
        paint4.setColor(-1);
        this.f26501j.setStyle(Paint.Style.FILL);
        this.f26504m = new PointF();
    }

    public void setOnPieceSelectedListener(c cVar) {
    }
}
