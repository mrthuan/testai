package pdf.pdfreader.viewer.editor.free.pic.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public class PuzzleView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public ActionMode f26515a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f26516b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f26517d;

    /* renamed from: e  reason: collision with root package name */
    public int f26518e;

    /* renamed from: f  reason: collision with root package name */
    public co.b f26519f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f26520g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f26521h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f26522i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f26523j;

    /* renamed from: k  reason: collision with root package name */
    public float f26524k;

    /* renamed from: l  reason: collision with root package name */
    public float f26525l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f26526m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f26527n;

    /* renamed from: o  reason: collision with root package name */
    public int f26528o;

    /* renamed from: p  reason: collision with root package name */
    public int f26529p;

    /* renamed from: q  reason: collision with root package name */
    public int f26530q;

    /* renamed from: r  reason: collision with root package name */
    public float f26531r;

    /* renamed from: s  reason: collision with root package name */
    public final a f26532s;

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
            PuzzleView puzzleView = PuzzleView.this;
            puzzleView.f26515a = actionMode;
            puzzleView.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26535a;

        static {
            int[] iArr = new int[ActionMode.values().length];
            f26535a = iArr;
            try {
                iArr[ActionMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26535a[ActionMode.DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26535a[ActionMode.ZOOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26535a[ActionMode.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26535a[ActionMode.SWAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    static {
        ea.a.p("J2wFbgVQD3oybANWXWV3", "gFtdqzT2");
    }

    public PuzzleView(Context context) {
        this(context, null);
    }

    public final void a(MotionEvent motionEvent) {
        Iterator it = this.f26516b.iterator();
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
        return this.f26530q;
    }

    public int getLineColor() {
        return this.f26528o;
    }

    public int getLineSize() {
        return this.f26518e;
    }

    public List<co.b> getPuzzlePieces() {
        return this.f26516b;
    }

    public int getSelectedLineColor() {
        return this.f26529p;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f26517d.left = getPaddingLeft() + this.f26531r;
        this.f26517d.top = getPaddingTop() + this.f26531r;
        this.f26517d.right = (i10 - getPaddingRight()) - this.f26531r;
        this.f26517d.bottom = (i11 - getPaddingBottom()) - this.f26531r;
        ArrayList arrayList = this.f26516b;
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
        if (!this.f26527n) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        if (action != 0) {
            a aVar = this.f26532s;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            float x4 = motionEvent.getX(0) - motionEvent.getX(1);
                            float y10 = motionEvent.getY(0) - motionEvent.getY(1);
                            Math.sqrt((y10 * y10) + (x4 * x4));
                            PointF pointF = this.f26526m;
                            pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                            pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                            a(motionEvent);
                        }
                    }
                } else {
                    int i10 = b.f26535a[this.f26515a.ordinal()];
                    if (i10 != 2 && i10 != 3 && i10 == 5) {
                        Iterator it = this.f26516b.iterator();
                        if (it.hasNext()) {
                            motionEvent.getX();
                            motionEvent.getY();
                            ((co.b) it.next()).getClass();
                            throw null;
                        }
                    }
                    if ((Math.abs(motionEvent.getX() - this.f26524k) > 10.0f || Math.abs(motionEvent.getY() - this.f26525l) > 10.0f) && this.f26515a != ActionMode.SWAP) {
                        removeCallbacks(aVar);
                    }
                }
            }
            int i11 = b.f26535a[this.f26515a.ordinal()];
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f26519f = null;
                }
            } else {
                if (this.f26519f == null && Math.abs(this.f26524k - motionEvent.getX()) < 3.0f) {
                    Math.abs(this.f26525l - motionEvent.getY());
                }
                this.f26519f = null;
            }
            this.c.clear();
            this.f26515a = ActionMode.NONE;
            removeCallbacks(aVar);
        } else {
            this.f26524k = motionEvent.getX();
            this.f26525l = motionEvent.getY();
            a(motionEvent);
            int i12 = b.f26535a[this.f26515a.ordinal()];
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
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
        Iterator it = this.f26516b.iterator();
        while (it.hasNext()) {
            ((co.b) it.next()).getClass();
        }
    }

    public void setHandleBarColor(int i10) {
        this.f26530q = i10;
        this.f26522i.setColor(i10);
        invalidate();
    }

    public void setLineColor(int i10) {
        this.f26528o = i10;
        this.f26520g.setColor(i10);
        invalidate();
    }

    public void setLineSize(int i10) {
        this.f26518e = i10;
        invalidate();
    }

    public void setNeedDrawLine(boolean z10) {
        this.f26519f = null;
        invalidate();
    }

    public void setNeedDrawOuterLine(boolean z10) {
        invalidate();
    }

    public void setPiecePadding(float f10) {
        this.f26531r = f10;
        Iterator it = this.f26516b.iterator();
        if (!it.hasNext()) {
            return;
        }
        ((co.b) it.next()).getClass();
        throw null;
    }

    public void setPuzzleLayout(co.a aVar) {
        this.c.clear();
        this.f26516b.clear();
        throw null;
    }

    public void setSelectedLineColor(int i10) {
        this.f26529p = i10;
        this.f26521h.setColor(i10);
        invalidate();
    }

    public void setTouchEnable(boolean z10) {
        this.f26527n = z10;
    }

    public PuzzleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PuzzleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26515a = ActionMode.NONE;
        this.f26516b = new ArrayList();
        this.c = new ArrayList();
        this.f26518e = 4;
        this.f26527n = true;
        this.f26528o = -7829368;
        this.f26529p = -16711936;
        this.f26530q = -16711936;
        this.f26532s = new a();
        setWillNotDraw(false);
        this.f26517d = new RectF();
        Paint paint = new Paint();
        this.f26520g = paint;
        paint.setAntiAlias(true);
        this.f26520g.setColor(this.f26528o);
        this.f26520g.setStrokeWidth(this.f26518e);
        this.f26520g.setPathEffect(new DashPathEffect(new float[]{15.0f, 10.0f}, 0.0f));
        Paint paint2 = new Paint();
        this.f26521h = paint2;
        paint2.setAntiAlias(true);
        this.f26521h.setStyle(Paint.Style.STROKE);
        this.f26521h.setColor(this.f26529p);
        this.f26521h.setStrokeWidth(this.f26518e);
        Paint paint3 = new Paint();
        this.f26522i = paint3;
        paint3.setAntiAlias(true);
        this.f26522i.setStyle(Paint.Style.FILL);
        this.f26522i.setColor(this.f26530q);
        this.f26522i.setStrokeWidth(this.f26518e * 3);
        Paint paint4 = new Paint();
        this.f26523j = paint4;
        paint4.setColor(-16711936);
        this.f26523j.setStyle(Paint.Style.FILL);
        this.f26526m = new PointF();
    }

    public void setOnPieceSelectedListener(c cVar) {
    }
}
